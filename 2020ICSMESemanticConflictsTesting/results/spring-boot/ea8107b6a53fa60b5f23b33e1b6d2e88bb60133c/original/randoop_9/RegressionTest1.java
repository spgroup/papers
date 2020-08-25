import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray7 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray7);
        java.io.File file9 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file9);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
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
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
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
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray7 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray7);
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.lang.String str12 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory5.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet8 = undertowEmbeddedServletContainerFactory5.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet8);
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file10);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.Compression compression14 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet8);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        java.lang.String str11 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(0);
        java.lang.String str14 = undertowEmbeddedServletContainerFactory1.getContextPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
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
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
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
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory18.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory18.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection23 = undertowEmbeddedServletContainerFactory18.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory18.setDisplayName("");
        undertowEmbeddedServletContainerFactory18.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.JspServlet jspServlet28 = undertowEmbeddedServletContainerFactory18.getJspServlet();
        undertowEmbeddedServletContainerFactory18.setWorkerThreads((java.lang.Integer) 100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet31 = undertowEmbeddedServletContainerFactory18.getErrorPages();
        undertowEmbeddedServletContainerFactory18.setUseForwardHeaders(false);
        org.springframework.core.io.ResourceLoader resourceLoader34 = null;
        undertowEmbeddedServletContainerFactory18.setResourceLoader(resourceLoader34);
        java.io.File file36 = null;
        undertowEmbeddedServletContainerFactory18.setAccessLogDirectory(file36);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory39.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory39.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection44 = undertowEmbeddedServletContainerFactory39.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray45 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory39.addInitializers(servletContextInitializerArray45);
        java.io.File file47 = null;
        undertowEmbeddedServletContainerFactory39.setDocumentRoot(file47);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory50 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray51 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet52 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet52, errorPageArray51);
        undertowEmbeddedServletContainerFactory50.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet52);
        undertowEmbeddedServletContainerFactory39.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet52);
        undertowEmbeddedServletContainerFactory18.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet52);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet52);
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
        org.junit.Assert.assertNotNull(jspServlet28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
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
        undertowEmbeddedServletContainerFactory1.setPersistSession(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory30.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory30.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection35 = undertowEmbeddedServletContainerFactory30.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory30.setDisplayName("");
        int int38 = undertowEmbeddedServletContainerFactory30.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection39 = undertowEmbeddedServletContainerFactory30.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory41.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory41.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection46 = undertowEmbeddedServletContainerFactory41.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray47 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory41.addInitializers(servletContextInitializerArray47);
        java.io.File file49 = null;
        undertowEmbeddedServletContainerFactory41.setDocumentRoot(file49);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray53 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet54 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet54, errorPageArray53);
        undertowEmbeddedServletContainerFactory52.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet54);
        undertowEmbeddedServletContainerFactory41.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet54);
        undertowEmbeddedServletContainerFactory30.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet54);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory60 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray61 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet62 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet62, errorPageArray61);
        undertowEmbeddedServletContainerFactory60.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet62);
        int int65 = undertowEmbeddedServletContainerFactory60.getSessionTimeout();
        undertowEmbeddedServletContainerFactory60.setDisplayName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory69 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory69.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory69.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection74 = undertowEmbeddedServletContainerFactory69.getBuilderCustomizers();
        java.io.File file75 = null;
        undertowEmbeddedServletContainerFactory69.setDocumentRoot(file75);
        boolean boolean77 = undertowEmbeddedServletContainerFactory69.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet78 = undertowEmbeddedServletContainerFactory69.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection79 = undertowEmbeddedServletContainerFactory69.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory81 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory81.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory81.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection86 = undertowEmbeddedServletContainerFactory81.getBuilderCustomizers();
        java.io.File file87 = null;
        undertowEmbeddedServletContainerFactory81.setDocumentRoot(file87);
        boolean boolean89 = undertowEmbeddedServletContainerFactory81.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet90 = undertowEmbeddedServletContainerFactory81.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection91 = undertowEmbeddedServletContainerFactory81.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings92 = undertowEmbeddedServletContainerFactory81.getMimeMappings();
        undertowEmbeddedServletContainerFactory69.setMimeMappings(mimeMappings92);
        undertowEmbeddedServletContainerFactory60.setMimeMappings(mimeMappings92);
        undertowEmbeddedServletContainerFactory30.setMimeMappings(mimeMappings92);
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings92);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet97 = undertowEmbeddedServletContainerFactory1.getErrorPages();
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
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1800 + "'", int65 == 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet97);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
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
        java.io.File file52 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
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
        org.junit.Assert.assertNull(file52);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(0);
        org.springframework.boot.context.embedded.JspServlet jspServlet14 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) (-1));
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet14);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
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
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory14.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection19 = undertowEmbeddedServletContainerFactory14.getBuilderCustomizers();
        java.io.File file20 = null;
        undertowEmbeddedServletContainerFactory14.setDocumentRoot(file20);
        boolean boolean22 = undertowEmbeddedServletContainerFactory14.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet23 = undertowEmbeddedServletContainerFactory14.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection24 = undertowEmbeddedServletContainerFactory14.getBuilderCustomizers();
        java.net.InetAddress inetAddress25 = undertowEmbeddedServletContainerFactory14.getAddress();
        org.springframework.boot.context.embedded.Compression compression26 = null;
        undertowEmbeddedServletContainerFactory14.setCompression(compression26);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray28 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory14.addBuilderCustomizers(undertowBuilderCustomizerArray28);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray28);
        boolean boolean31 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray32 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray32);
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
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray32);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
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
        java.io.File file17 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.io.File file18 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(1);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings23 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
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
        org.junit.Assert.assertNull(file17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings23);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.io.File file12 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        boolean boolean13 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1800);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet16 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet16);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file7);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) -1);
        java.lang.String str13 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.JspServlet jspServlet14 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet14);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings15 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings15);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
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
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file8);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
        java.net.InetAddress inetAddress12 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1800);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 35);
        java.net.InetAddress inetAddress19 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress12);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
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
        org.springframework.boot.context.embedded.Ssl ssl18 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
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
        org.junit.Assert.assertNull(ssl18);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ContextPath must start with '/' and not end with '/'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1);
        undertowEmbeddedServletContainerFactory1.setPort(1800);
        boolean boolean4 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.springframework.boot.context.embedded.Ssl ssl5 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
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
        int int33 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        org.springframework.core.io.ResourceLoader resourceLoader6 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader6);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
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
        java.lang.String str15 = undertowEmbeddedServletContainerFactory1.getDisplayName();
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
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray7 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray7);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 1);
        org.springframework.boot.context.embedded.Compression compression11 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression11);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory14.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection19 = undertowEmbeddedServletContainerFactory14.getBuilderCustomizers();
        java.lang.String str20 = undertowEmbeddedServletContainerFactory14.getDisplayName();
        int int21 = undertowEmbeddedServletContainerFactory14.getPort();
        java.io.File file22 = null;
        undertowEmbeddedServletContainerFactory14.setDocumentRoot(file22);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory25.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory25.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection30 = undertowEmbeddedServletContainerFactory25.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory25.setDisplayName("");
        int int33 = undertowEmbeddedServletContainerFactory25.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection34 = undertowEmbeddedServletContainerFactory25.getDeploymentInfoCustomizers();
        java.io.File file35 = undertowEmbeddedServletContainerFactory25.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray36 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer37 = undertowEmbeddedServletContainerFactory25.getEmbeddedServletContainer(servletContextInitializerArray36);
        boolean boolean38 = undertowEmbeddedServletContainerFactory25.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray41 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet42 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet42, errorPageArray41);
        undertowEmbeddedServletContainerFactory40.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet42);
        org.springframework.boot.context.embedded.Compression compression45 = null;
        undertowEmbeddedServletContainerFactory40.setCompression(compression45);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage48 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray49 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage48 };
        undertowEmbeddedServletContainerFactory47.addErrorPages(errorPageArray49);
        undertowEmbeddedServletContainerFactory40.addErrorPages(errorPageArray49);
        undertowEmbeddedServletContainerFactory25.addErrorPages(errorPageArray49);
        undertowEmbeddedServletContainerFactory14.addErrorPages(errorPageArray49);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray49);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
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
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray27);
        org.springframework.boot.context.embedded.Ssl ssl30 = undertowEmbeddedServletContainerFactory1.getSsl();
        boolean boolean31 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.Ssl ssl32 = undertowEmbeddedServletContainerFactory1.getSsl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray10);
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
        org.junit.Assert.assertNull(ssl30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl32);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
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
        boolean boolean18 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.net.InetAddress inetAddress19 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress19);
        java.net.InetAddress inetAddress21 = undertowEmbeddedServletContainerFactory1.getAddress();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress21);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
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
        java.io.File file17 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        boolean boolean18 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
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
        org.junit.Assert.assertNull(file17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        boolean boolean4 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        boolean boolean5 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        boolean boolean4 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        int int5 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        int int6 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection8 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1800 + "'", int5 == 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1800 + "'", int6 == 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection8);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file7);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings11 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory13.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory17.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet20 = undertowEmbeddedServletContainerFactory17.getJspServlet();
        undertowEmbeddedServletContainerFactory13.setJspServlet(jspServlet20);
        undertowEmbeddedServletContainerFactory13.setIoThreads((java.lang.Integer) 35);
        java.io.File file24 = undertowEmbeddedServletContainerFactory13.getDocumentRoot();
        org.springframework.boot.context.embedded.JspServlet jspServlet25 = undertowEmbeddedServletContainerFactory13.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet25);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
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
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection17 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection17);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader11);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.core.io.ResourceLoader resourceLoader14 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader14);
        java.io.File file16 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file16);
        java.net.InetAddress inetAddress18 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.JspServlet jspServlet19 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet19);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
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
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory14.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection19 = undertowEmbeddedServletContainerFactory14.getBuilderCustomizers();
        java.io.File file20 = null;
        undertowEmbeddedServletContainerFactory14.setDocumentRoot(file20);
        boolean boolean22 = undertowEmbeddedServletContainerFactory14.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet23 = undertowEmbeddedServletContainerFactory14.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection24 = undertowEmbeddedServletContainerFactory14.getBuilderCustomizers();
        java.net.InetAddress inetAddress25 = undertowEmbeddedServletContainerFactory14.getAddress();
        org.springframework.boot.context.embedded.Compression compression26 = null;
        undertowEmbeddedServletContainerFactory14.setCompression(compression26);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray28 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory14.addBuilderCustomizers(undertowBuilderCustomizerArray28);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray28);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) (-1));
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
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray28);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.lang.String str9 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray10 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray10);
        int int12 = undertowEmbeddedServletContainerFactory1.getPort();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory14.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection19 = undertowEmbeddedServletContainerFactory14.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory14.setDisplayName("");
        java.lang.String str22 = undertowEmbeddedServletContainerFactory14.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray23 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory14.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray23);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory26.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory26.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection31 = undertowEmbeddedServletContainerFactory26.getBuilderCustomizers();
        java.io.File file32 = null;
        undertowEmbeddedServletContainerFactory26.setDocumentRoot(file32);
        boolean boolean34 = undertowEmbeddedServletContainerFactory26.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet35 = undertowEmbeddedServletContainerFactory26.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection36 = undertowEmbeddedServletContainerFactory26.getBuilderCustomizers();
        java.net.InetAddress inetAddress37 = undertowEmbeddedServletContainerFactory26.getAddress();
        org.springframework.boot.context.embedded.Compression compression38 = null;
        undertowEmbeddedServletContainerFactory26.setCompression(compression38);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray40 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory26.addBuilderCustomizers(undertowBuilderCustomizerArray40);
        undertowEmbeddedServletContainerFactory14.addBuilderCustomizers(undertowBuilderCustomizerArray40);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray40);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "" + "'", str22.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray40);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file10);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file2);
        org.springframework.boot.context.embedded.Ssl ssl4 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("hi!");
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setSessionTimeout(0, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: TimeUnit must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl4);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file11);
        java.io.File file13 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file13);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection15 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
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
        java.net.InetAddress inetAddress30 = undertowEmbeddedServletContainerFactory17.getAddress();
        undertowEmbeddedServletContainerFactory17.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory34.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory34.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection39 = undertowEmbeddedServletContainerFactory34.getBuilderCustomizers();
        java.io.File file40 = null;
        undertowEmbeddedServletContainerFactory34.setDocumentRoot(file40);
        boolean boolean42 = undertowEmbeddedServletContainerFactory34.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet43 = undertowEmbeddedServletContainerFactory34.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection44 = undertowEmbeddedServletContainerFactory34.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings45 = undertowEmbeddedServletContainerFactory34.getMimeMappings();
        undertowEmbeddedServletContainerFactory34.setBuffersPerRegion((java.lang.Integer) 100);
        java.io.File file48 = null;
        undertowEmbeddedServletContainerFactory34.setDocumentRoot(file48);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory51 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory53 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory53.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory53.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection58 = undertowEmbeddedServletContainerFactory53.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray59 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory53.addInitializers(servletContextInitializerArray59);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer61 = undertowEmbeddedServletContainerFactory51.getEmbeddedServletContainer(servletContextInitializerArray59);
        undertowEmbeddedServletContainerFactory34.addInitializers(servletContextInitializerArray59);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer63 = undertowEmbeddedServletContainerFactory17.getEmbeddedServletContainer(servletContextInitializerArray59);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer64 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray59);
        org.springframework.boot.context.embedded.JspServlet jspServlet65 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
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
        org.junit.Assert.assertNotNull(servletContextInitializerArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet65);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer10 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray11 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer10 };
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray11);
        org.springframework.boot.context.embedded.Ssl ssl13 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl13);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection15 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet16 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet16);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
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
        java.io.File file17 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.io.File file18 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(1);
        java.io.File file21 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file21);
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
        org.junit.Assert.assertNull(file17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file18);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet4 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray9 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet10, errorPageArray9);
        undertowEmbeddedServletContainerFactory8.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet10);
        org.springframework.boot.context.embedded.Compression compression13 = null;
        undertowEmbeddedServletContainerFactory8.setCompression(compression13);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage16 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray17 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage16 };
        undertowEmbeddedServletContainerFactory15.addErrorPages(errorPageArray17);
        undertowEmbeddedServletContainerFactory8.addErrorPages(errorPageArray17);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory21.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory21.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection26 = undertowEmbeddedServletContainerFactory21.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory21.setDisplayName("");
        int int29 = undertowEmbeddedServletContainerFactory21.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection30 = undertowEmbeddedServletContainerFactory21.getDeploymentInfoCustomizers();
        java.io.File file31 = undertowEmbeddedServletContainerFactory21.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray32 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer33 = undertowEmbeddedServletContainerFactory21.getEmbeddedServletContainer(servletContextInitializerArray32);
        undertowEmbeddedServletContainerFactory8.addInitializers(servletContextInitializerArray32);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory36.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory36.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection41 = undertowEmbeddedServletContainerFactory36.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory36.setDisplayName("");
        undertowEmbeddedServletContainerFactory36.setSessionTimeout((int) (byte) 1);
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
        java.net.InetAddress inetAddress60 = undertowEmbeddedServletContainerFactory47.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory61 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage62 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray63 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage62 };
        undertowEmbeddedServletContainerFactory61.addErrorPages(errorPageArray63);
        undertowEmbeddedServletContainerFactory47.addErrorPages(errorPageArray63);
        undertowEmbeddedServletContainerFactory36.addErrorPages(errorPageArray63);
        undertowEmbeddedServletContainerFactory8.addErrorPages(errorPageArray63);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection41);
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
        org.junit.Assert.assertNull(inetAddress60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray63);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory5.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet8 = undertowEmbeddedServletContainerFactory5.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet8);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 35);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings12 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings12);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray13 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet14 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet14, errorPageArray13);
        undertowEmbeddedServletContainerFactory12.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet14);
        org.springframework.boot.context.embedded.Compression compression17 = null;
        undertowEmbeddedServletContainerFactory12.setCompression(compression17);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage20 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray21 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage20 };
        undertowEmbeddedServletContainerFactory19.addErrorPages(errorPageArray21);
        undertowEmbeddedServletContainerFactory12.addErrorPages(errorPageArray21);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray21);
        boolean boolean25 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        java.net.InetAddress inetAddress9 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) 10);
        undertowEmbeddedServletContainerFactory2.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory2.setAccessLogEnabled(true);
        undertowEmbeddedServletContainerFactory2.setAccessLogEnabled(false);
        java.net.InetAddress inetAddress9 = undertowEmbeddedServletContainerFactory2.getAddress();
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory2.setSessionStoreDir(file10);
        java.net.InetAddress inetAddress12 = undertowEmbeddedServletContainerFactory2.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress12);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
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
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1);
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
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file2);
        org.springframework.boot.context.embedded.Ssl ssl4 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.core.io.ResourceLoader resourceLoader5 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader5);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
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
        undertowEmbeddedServletContainerFactory10.setBuffersPerRegion((java.lang.Integer) 100);
        java.io.File file24 = null;
        undertowEmbeddedServletContainerFactory10.setDocumentRoot(file24);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory29.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory29.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection34 = undertowEmbeddedServletContainerFactory29.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray35 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory29.addInitializers(servletContextInitializerArray35);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer37 = undertowEmbeddedServletContainerFactory27.getEmbeddedServletContainer(servletContextInitializerArray35);
        undertowEmbeddedServletContainerFactory10.addInitializers(servletContextInitializerArray35);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer39 = undertowEmbeddedServletContainerFactory8.getEmbeddedServletContainer(servletContextInitializerArray35);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray35);
        java.util.concurrent.TimeUnit timeUnit42 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setSessionTimeout(35, timeUnit42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: TimeUnit must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl4);
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
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer39);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray7 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray7);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 1);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 10);
        java.io.File file13 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file13);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.Ssl ssl12 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings13 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings13);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
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
        org.springframework.boot.context.embedded.MimeMappings mimeMappings17 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
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
        org.junit.Assert.assertNotNull(mimeMappings17);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.io.File file2 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file2);
        org.springframework.boot.context.embedded.Ssl ssl4 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.core.io.ResourceLoader resourceLoader5 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader5);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
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
        undertowEmbeddedServletContainerFactory10.setBuffersPerRegion((java.lang.Integer) 100);
        java.io.File file24 = null;
        undertowEmbeddedServletContainerFactory10.setDocumentRoot(file24);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory29.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory29.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection34 = undertowEmbeddedServletContainerFactory29.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray35 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory29.addInitializers(servletContextInitializerArray35);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer37 = undertowEmbeddedServletContainerFactory27.getEmbeddedServletContainer(servletContextInitializerArray35);
        undertowEmbeddedServletContainerFactory10.addInitializers(servletContextInitializerArray35);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer39 = undertowEmbeddedServletContainerFactory8.getEmbeddedServletContainer(servletContextInitializerArray35);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray35);
        org.springframework.boot.context.embedded.Compression compression41 = undertowEmbeddedServletContainerFactory1.getCompression();
        java.lang.String str42 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.lang.String str43 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl4);
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
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "" + "'", str42.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(0);
        org.springframework.boot.context.embedded.JspServlet jspServlet14 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection15 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl16 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection15);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        boolean boolean4 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        int int7 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet8);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
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
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection14);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection7 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.String str8 = undertowEmbeddedServletContainerFactory1.getContextPath();
        int int9 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file10);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1800 + "'", int9 == 1800);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        org.springframework.boot.context.embedded.Compression compression8 = null;
        undertowEmbeddedServletContainerFactory1.setCompression(compression8);
        org.springframework.boot.context.embedded.JspServlet jspServlet10 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        java.io.File file13 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet10);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory12.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory12.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection17 = undertowEmbeddedServletContainerFactory12.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory12.setDisplayName("");
        int int20 = undertowEmbeddedServletContainerFactory12.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection21 = undertowEmbeddedServletContainerFactory12.getDeploymentInfoCustomizers();
        java.io.File file22 = undertowEmbeddedServletContainerFactory12.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray23 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer24 = undertowEmbeddedServletContainerFactory12.getEmbeddedServletContainer(servletContextInitializerArray23);
        java.net.InetAddress inetAddress25 = undertowEmbeddedServletContainerFactory12.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage27 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray28 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage27 };
        undertowEmbeddedServletContainerFactory26.addErrorPages(errorPageArray28);
        undertowEmbeddedServletContainerFactory12.addErrorPages(errorPageArray28);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray28);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory33.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory33.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection38 = undertowEmbeddedServletContainerFactory33.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory33.setDisplayName("");
        int int41 = undertowEmbeddedServletContainerFactory33.getPort();
        undertowEmbeddedServletContainerFactory33.setRegisterJspServlet(true);
        undertowEmbeddedServletContainerFactory33.setSessionTimeout(0);
        org.springframework.boot.context.embedded.JspServlet jspServlet46 = undertowEmbeddedServletContainerFactory33.getJspServlet();
        java.net.InetAddress inetAddress47 = undertowEmbeddedServletContainerFactory33.getAddress();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings48 = undertowEmbeddedServletContainerFactory33.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings48);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1800);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings48);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        org.springframework.boot.context.embedded.Compression compression10 = undertowEmbeddedServletContainerFactory1.getCompression();
        java.lang.String str11 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
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
        boolean boolean18 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
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
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet14);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        boolean boolean4 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory1.setPort((int) (byte) 100);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.io.File file12 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        boolean boolean13 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.io.File file14 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file14);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 0);
        java.net.InetAddress inetAddress18 = undertowEmbeddedServletContainerFactory1.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress18);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings4);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
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
        undertowEmbeddedServletContainerFactory13.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory13.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection18 = undertowEmbeddedServletContainerFactory13.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory13.setDisplayName("");
        int int21 = undertowEmbeddedServletContainerFactory13.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection22 = undertowEmbeddedServletContainerFactory13.getDeploymentInfoCustomizers();
        java.io.File file23 = undertowEmbeddedServletContainerFactory13.getDocumentRoot();
        undertowEmbeddedServletContainerFactory13.setDirectBuffers((java.lang.Boolean) true);
        undertowEmbeddedServletContainerFactory13.setBufferSize((java.lang.Integer) 1800);
        java.lang.String str28 = undertowEmbeddedServletContainerFactory13.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory32.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet35 = undertowEmbeddedServletContainerFactory32.getJspServlet();
        undertowEmbeddedServletContainerFactory30.setJspServlet(jspServlet35);
        java.io.File file37 = null;
        undertowEmbeddedServletContainerFactory30.setAccessLogDirectory(file37);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet39 = undertowEmbeddedServletContainerFactory30.getErrorPages();
        undertowEmbeddedServletContainerFactory13.setErrorPages(errorPageSet39);
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "" + "'", str28.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet39);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.springframework.boot.context.embedded.Ssl ssl5 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.Compression compression6 = undertowEmbeddedServletContainerFactory1.getCompression();
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        java.lang.String str9 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file8);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection12 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection12);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.springframework.boot.context.embedded.Ssl ssl5 = undertowEmbeddedServletContainerFactory1.getSsl();
        org.springframework.boot.context.embedded.Compression compression6 = undertowEmbeddedServletContainerFactory1.getCompression();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory8.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory8.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection13 = undertowEmbeddedServletContainerFactory8.getBuilderCustomizers();
        java.io.File file14 = null;
        undertowEmbeddedServletContainerFactory8.setDocumentRoot(file14);
        boolean boolean16 = undertowEmbeddedServletContainerFactory8.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet17 = undertowEmbeddedServletContainerFactory8.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection18 = undertowEmbeddedServletContainerFactory8.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings19 = undertowEmbeddedServletContainerFactory8.getMimeMappings();
        undertowEmbeddedServletContainerFactory8.setBuffersPerRegion((java.lang.Integer) 100);
        java.io.File file22 = null;
        undertowEmbeddedServletContainerFactory8.setDocumentRoot(file22);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory27.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory27.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection32 = undertowEmbeddedServletContainerFactory27.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray33 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory27.addInitializers(servletContextInitializerArray33);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer35 = undertowEmbeddedServletContainerFactory25.getEmbeddedServletContainer(servletContextInitializerArray33);
        undertowEmbeddedServletContainerFactory8.addInitializers(servletContextInitializerArray33);
        undertowEmbeddedServletContainerFactory8.setAccessLogEnabled(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray41 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet42 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet42, errorPageArray41);
        undertowEmbeddedServletContainerFactory40.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet42);
        int int45 = undertowEmbeddedServletContainerFactory40.getSessionTimeout();
        org.springframework.boot.context.embedded.JspServlet jspServlet46 = null;
        undertowEmbeddedServletContainerFactory40.setJspServlet(jspServlet46);
        java.io.File file48 = undertowEmbeddedServletContainerFactory40.getDocumentRoot();
        java.net.InetAddress inetAddress49 = null;
        undertowEmbeddedServletContainerFactory40.setAddress(inetAddress49);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory52.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory52.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection57 = undertowEmbeddedServletContainerFactory52.getBuilderCustomizers();
        java.io.File file58 = null;
        undertowEmbeddedServletContainerFactory52.setDocumentRoot(file58);
        boolean boolean60 = undertowEmbeddedServletContainerFactory52.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet61 = undertowEmbeddedServletContainerFactory52.getErrorPages();
        boolean boolean62 = undertowEmbeddedServletContainerFactory52.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory64 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory64.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory64.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection69 = undertowEmbeddedServletContainerFactory64.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory64.setDisplayName("");
        int int72 = undertowEmbeddedServletContainerFactory64.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection73 = undertowEmbeddedServletContainerFactory64.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray74 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory64.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray74);
        undertowEmbeddedServletContainerFactory52.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray74);
        undertowEmbeddedServletContainerFactory40.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray74);
        undertowEmbeddedServletContainerFactory8.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray74);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1800 + "'", int45 == 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray74);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) 10);
        undertowEmbeddedServletContainerFactory2.setDirectBuffers((java.lang.Boolean) false);
        boolean boolean5 = undertowEmbeddedServletContainerFactory2.isPersistSession();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection6 = undertowEmbeddedServletContainerFactory2.getDeploymentInfoCustomizers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection6);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
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
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory22.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory22.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory22.setAccessLogEnabled(false);
        int int29 = undertowEmbeddedServletContainerFactory22.getPort();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory31.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory31.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection36 = undertowEmbeddedServletContainerFactory31.getBuilderCustomizers();
        java.io.File file37 = null;
        undertowEmbeddedServletContainerFactory31.setDocumentRoot(file37);
        boolean boolean39 = undertowEmbeddedServletContainerFactory31.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet40 = undertowEmbeddedServletContainerFactory31.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory42.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory42.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection47 = undertowEmbeddedServletContainerFactory42.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory42.setDisplayName("");
        java.io.File file50 = null;
        undertowEmbeddedServletContainerFactory42.setDocumentRoot(file50);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer52 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray53 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer52 };
        undertowEmbeddedServletContainerFactory42.addBuilderCustomizers(undertowBuilderCustomizerArray53);
        undertowEmbeddedServletContainerFactory31.addBuilderCustomizers(undertowBuilderCustomizerArray53);
        undertowEmbeddedServletContainerFactory22.addBuilderCustomizers(undertowBuilderCustomizerArray53);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray53);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
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
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray12);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory2.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory2.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection7 = undertowEmbeddedServletContainerFactory2.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory2.setDisplayName("");
        int int10 = undertowEmbeddedServletContainerFactory2.getPort();
        undertowEmbeddedServletContainerFactory2.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.Ssl ssl13 = undertowEmbeddedServletContainerFactory2.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory15.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory15.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection20 = undertowEmbeddedServletContainerFactory15.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory15.setDisplayName("");
        java.lang.String str23 = undertowEmbeddedServletContainerFactory15.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray24 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory15.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray24);
        undertowEmbeddedServletContainerFactory2.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray24);
        undertowEmbeddedServletContainerFactory0.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray24);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
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
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        java.net.InetAddress inetAddress19 = undertowEmbeddedServletContainerFactory1.getAddress();
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
        org.junit.Assert.assertNull(inetAddress19);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file7);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection11 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory13.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory13.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection18 = undertowEmbeddedServletContainerFactory13.getBuilderCustomizers();
        java.io.File file19 = null;
        undertowEmbeddedServletContainerFactory13.setDocumentRoot(file19);
        boolean boolean21 = undertowEmbeddedServletContainerFactory13.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet22 = undertowEmbeddedServletContainerFactory13.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet22);
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet22);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
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
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory26.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet29 = undertowEmbeddedServletContainerFactory26.getJspServlet();
        undertowEmbeddedServletContainerFactory24.setJspServlet(jspServlet29);
        java.io.File file31 = null;
        undertowEmbeddedServletContainerFactory24.setAccessLogDirectory(file31);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray35 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet36 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet36, errorPageArray35);
        undertowEmbeddedServletContainerFactory34.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet36);
        org.springframework.boot.context.embedded.Compression compression39 = null;
        undertowEmbeddedServletContainerFactory34.setCompression(compression39);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage42 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray43 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage42 };
        undertowEmbeddedServletContainerFactory41.addErrorPages(errorPageArray43);
        undertowEmbeddedServletContainerFactory34.addErrorPages(errorPageArray43);
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
        undertowEmbeddedServletContainerFactory34.addInitializers(servletContextInitializerArray58);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer61 = undertowEmbeddedServletContainerFactory24.getEmbeddedServletContainer(servletContextInitializerArray58);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer62 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray58);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
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
        org.junit.Assert.assertNotNull(jspServlet29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray43);
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
        org.junit.Assert.assertNotNull(embeddedServletContainer61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer62);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
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
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(false);
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
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
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
        org.springframework.core.io.ResourceLoader resourceLoader17 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader17);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file10);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory5.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet8 = undertowEmbeddedServletContainerFactory5.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet8);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 35);
        java.io.File file12 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        org.springframework.boot.context.embedded.JspServlet jspServlet13 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet13);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
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
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray27);
        java.net.InetAddress inetAddress30 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress30);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray10);
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
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(1800);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
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
        boolean boolean18 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.JspServlet jspServlet19 = null;
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet19);
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(false);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file11);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory16.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory16.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection21 = undertowEmbeddedServletContainerFactory16.getBuilderCustomizers();
        java.io.File file22 = null;
        undertowEmbeddedServletContainerFactory16.setDocumentRoot(file22);
        boolean boolean24 = undertowEmbeddedServletContainerFactory16.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet25 = undertowEmbeddedServletContainerFactory16.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection26 = undertowEmbeddedServletContainerFactory16.getBuilderCustomizers();
        java.net.InetAddress inetAddress27 = undertowEmbeddedServletContainerFactory16.getAddress();
        org.springframework.boot.context.embedded.Compression compression28 = null;
        undertowEmbeddedServletContainerFactory16.setCompression(compression28);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray30 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory16.addBuilderCustomizers(undertowBuilderCustomizerArray30);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray30);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
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
        boolean boolean26 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory30.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory30.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection35 = undertowEmbeddedServletContainerFactory30.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory30.setDisplayName("");
        undertowEmbeddedServletContainerFactory30.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.JspServlet jspServlet40 = undertowEmbeddedServletContainerFactory30.getJspServlet();
        undertowEmbeddedServletContainerFactory30.setWorkerThreads((java.lang.Integer) 100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet43 = undertowEmbeddedServletContainerFactory30.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet43);
        java.util.concurrent.TimeUnit timeUnit46 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setSessionTimeout(0, timeUnit46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: TimeUnit must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet43);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray13 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet14 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet14, errorPageArray13);
        undertowEmbeddedServletContainerFactory12.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet14);
        org.springframework.boot.context.embedded.Compression compression17 = null;
        undertowEmbeddedServletContainerFactory12.setCompression(compression17);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage20 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray21 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage20 };
        undertowEmbeddedServletContainerFactory19.addErrorPages(errorPageArray21);
        undertowEmbeddedServletContainerFactory12.addErrorPages(errorPageArray21);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray21);
        org.springframework.boot.context.embedded.Ssl ssl25 = undertowEmbeddedServletContainerFactory1.getSsl();
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl25);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
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
        java.io.File file21 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file21);
        java.lang.String str23 = undertowEmbeddedServletContainerFactory1.getDisplayName();
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
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        int int6 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        org.springframework.boot.context.embedded.JspServlet jspServlet7 = null;
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet7);
        java.io.File file9 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.net.InetAddress inetAddress10 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress10);
        java.io.File file12 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.Compression compression13 = undertowEmbeddedServletContainerFactory1.getCompression();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1800 + "'", int6 == 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression13);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection7 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.String str8 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 0);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection11 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection11);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.net.InetAddress inetAddress7 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress7);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.JspServlet jspServlet11 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        java.io.File file12 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
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
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings27);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (short) 100);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.io.File file3 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        int int4 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1800 + "'", int4 == 1800);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray7 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray7);
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory13.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory13.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection18 = undertowEmbeddedServletContainerFactory13.getBuilderCustomizers();
        java.io.File file19 = null;
        undertowEmbeddedServletContainerFactory13.setDocumentRoot(file19);
        boolean boolean21 = undertowEmbeddedServletContainerFactory13.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet22 = undertowEmbeddedServletContainerFactory13.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection23 = undertowEmbeddedServletContainerFactory13.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory25.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory25.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection30 = undertowEmbeddedServletContainerFactory25.getBuilderCustomizers();
        java.io.File file31 = null;
        undertowEmbeddedServletContainerFactory25.setDocumentRoot(file31);
        boolean boolean33 = undertowEmbeddedServletContainerFactory25.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet34 = undertowEmbeddedServletContainerFactory25.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection35 = undertowEmbeddedServletContainerFactory25.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings36 = undertowEmbeddedServletContainerFactory25.getMimeMappings();
        undertowEmbeddedServletContainerFactory13.setMimeMappings(mimeMappings36);
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings36);
        org.springframework.boot.context.embedded.Ssl ssl39 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl39);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) (-1));
        java.lang.String str43 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.io.File file44 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
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
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(true);
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
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        undertowEmbeddedServletContainerFactory1.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 1);
        java.net.InetAddress inetAddress15 = undertowEmbeddedServletContainerFactory1.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress15);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
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
        boolean boolean18 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.net.InetAddress inetAddress19 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress19);
        undertowEmbeddedServletContainerFactory1.setContextPath("");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
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
        int int20 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
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
        boolean boolean20 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray7 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray7);
        undertowEmbeddedServletContainerFactory1.setPort((int) (short) 1);
        undertowEmbeddedServletContainerFactory1.setWorkerThreads((java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray7);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
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
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        undertowEmbeddedServletContainerFactory1.setPort(0);
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
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        boolean boolean4 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        int int5 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        int int6 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file7);
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1800 + "'", int5 == 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1800 + "'", int6 == 1800);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
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
        org.springframework.core.io.ResourceLoader resourceLoader16 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.io.File file12 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray15 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet16 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet16, errorPageArray15);
        undertowEmbeddedServletContainerFactory14.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet16);
        int int19 = undertowEmbeddedServletContainerFactory14.getSessionTimeout();
        org.springframework.boot.context.embedded.JspServlet jspServlet20 = null;
        undertowEmbeddedServletContainerFactory14.setJspServlet(jspServlet20);
        java.io.File file22 = undertowEmbeddedServletContainerFactory14.getDocumentRoot();
        java.net.InetAddress inetAddress23 = null;
        undertowEmbeddedServletContainerFactory14.setAddress(inetAddress23);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory26.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory26.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection31 = undertowEmbeddedServletContainerFactory26.getBuilderCustomizers();
        java.io.File file32 = null;
        undertowEmbeddedServletContainerFactory26.setDocumentRoot(file32);
        boolean boolean34 = undertowEmbeddedServletContainerFactory26.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet35 = undertowEmbeddedServletContainerFactory26.getErrorPages();
        boolean boolean36 = undertowEmbeddedServletContainerFactory26.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory38.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory38.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection43 = undertowEmbeddedServletContainerFactory38.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory38.setDisplayName("");
        int int46 = undertowEmbeddedServletContainerFactory38.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection47 = undertowEmbeddedServletContainerFactory38.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray48 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory38.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray48);
        undertowEmbeddedServletContainerFactory26.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray48);
        undertowEmbeddedServletContainerFactory14.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray48);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1800 + "'", int19 == 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray48);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
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
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        org.springframework.boot.context.embedded.Compression compression12 = undertowEmbeddedServletContainerFactory1.getCompression();
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
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file7);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory13.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory13.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection18 = undertowEmbeddedServletContainerFactory13.getBuilderCustomizers();
        java.io.File file19 = null;
        undertowEmbeddedServletContainerFactory13.setDocumentRoot(file19);
        boolean boolean21 = undertowEmbeddedServletContainerFactory13.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet22 = undertowEmbeddedServletContainerFactory13.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection23 = undertowEmbeddedServletContainerFactory13.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings24 = undertowEmbeddedServletContainerFactory13.getMimeMappings();
        undertowEmbeddedServletContainerFactory13.setBuffersPerRegion((java.lang.Integer) 100);
        java.io.File file27 = null;
        undertowEmbeddedServletContainerFactory13.setDocumentRoot(file27);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory32.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory32.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection37 = undertowEmbeddedServletContainerFactory32.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray38 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory32.addInitializers(servletContextInitializerArray38);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer40 = undertowEmbeddedServletContainerFactory30.getEmbeddedServletContainer(servletContextInitializerArray38);
        undertowEmbeddedServletContainerFactory13.addInitializers(servletContextInitializerArray38);
        java.io.File file42 = null;
        undertowEmbeddedServletContainerFactory13.setSessionStoreDir(file42);
        org.springframework.core.io.ResourceLoader resourceLoader44 = null;
        undertowEmbeddedServletContainerFactory13.setResourceLoader(resourceLoader44);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory47.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory47.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection52 = undertowEmbeddedServletContainerFactory47.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory47.setDisplayName("");
        undertowEmbeddedServletContainerFactory47.setSessionTimeout((int) (byte) 1);
        java.io.File file57 = null;
        undertowEmbeddedServletContainerFactory47.setDocumentRoot(file57);
        int int59 = undertowEmbeddedServletContainerFactory47.getPort();
        undertowEmbeddedServletContainerFactory47.setBufferSize((java.lang.Integer) 1800);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory63 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory63.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory63.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection68 = undertowEmbeddedServletContainerFactory63.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory63.setDisplayName("");
        int int71 = undertowEmbeddedServletContainerFactory63.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection72 = undertowEmbeddedServletContainerFactory63.getDeploymentInfoCustomizers();
        java.io.File file73 = undertowEmbeddedServletContainerFactory63.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray74 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer75 = undertowEmbeddedServletContainerFactory63.getEmbeddedServletContainer(servletContextInitializerArray74);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer76 = undertowEmbeddedServletContainerFactory47.getEmbeddedServletContainer(servletContextInitializerArray74);
        undertowEmbeddedServletContainerFactory13.addInitializers(servletContextInitializerArray74);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer78 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray74);
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
        org.junit.Assert.assertNotNull(mimeMappings24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 100 + "'", int71 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer78);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) (byte) -1);
        boolean boolean2 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
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
        java.io.File file17 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.io.File file18 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(1);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setSessionTimeout((-1), timeUnit24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: TimeUnit must not be null");
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
        org.junit.Assert.assertNull(file17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file18);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        org.springframework.boot.context.embedded.Ssl ssl8 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl8);
        int int10 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1800 + "'", int10 == 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray2 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet3 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3, errorPageArray2);
        undertowEmbeddedServletContainerFactory1.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet3);
        int int6 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection9 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory11.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory11.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection16 = undertowEmbeddedServletContainerFactory11.getBuilderCustomizers();
        java.lang.String str17 = undertowEmbeddedServletContainerFactory11.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory21.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory21.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection26 = undertowEmbeddedServletContainerFactory21.getBuilderCustomizers();
        java.io.File file27 = null;
        undertowEmbeddedServletContainerFactory21.setDocumentRoot(file27);
        boolean boolean29 = undertowEmbeddedServletContainerFactory21.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet30 = undertowEmbeddedServletContainerFactory21.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection31 = undertowEmbeddedServletContainerFactory21.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings32 = undertowEmbeddedServletContainerFactory21.getMimeMappings();
        undertowEmbeddedServletContainerFactory21.setBuffersPerRegion((java.lang.Integer) 100);
        java.io.File file35 = null;
        undertowEmbeddedServletContainerFactory21.setDocumentRoot(file35);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory38 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory40.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory40.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection45 = undertowEmbeddedServletContainerFactory40.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray46 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory40.addInitializers(servletContextInitializerArray46);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer48 = undertowEmbeddedServletContainerFactory38.getEmbeddedServletContainer(servletContextInitializerArray46);
        undertowEmbeddedServletContainerFactory21.addInitializers(servletContextInitializerArray46);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer50 = undertowEmbeddedServletContainerFactory19.getEmbeddedServletContainer(servletContextInitializerArray46);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer51 = undertowEmbeddedServletContainerFactory11.getEmbeddedServletContainer(servletContextInitializerArray46);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet53 = undertowEmbeddedServletContainerFactory52.getErrorPages();
        undertowEmbeddedServletContainerFactory11.setErrorPages(errorPageSet53);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet55 = undertowEmbeddedServletContainerFactory11.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1800 + "'", int6 == 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet55);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory3.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet6 = undertowEmbeddedServletContainerFactory3.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet6);
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file8);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        java.lang.String str11 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file7);
        boolean boolean9 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet10 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        int int11 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection12 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setAccessLogEnabled(true);
        boolean boolean15 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
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
        java.io.File file14 = undertowEmbeddedServletContainerFactory1.getSessionStoreDir();
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) -1, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: TimeUnit must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file14);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.JspServlet jspServlet11 = undertowEmbeddedServletContainerFactory1.getJspServlet();
        undertowEmbeddedServletContainerFactory1.setPersistSession(true);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection14 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection14);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 1800);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) -1);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
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
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 100);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet4 = undertowEmbeddedServletContainerFactory1.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet6 = undertowEmbeddedServletContainerFactory5.getErrorPages();
        undertowEmbeddedServletContainerFactory1.setErrorPages(errorPageSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet6);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.net.InetAddress inetAddress11 = undertowEmbeddedServletContainerFactory1.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory13.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory13.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection18 = undertowEmbeddedServletContainerFactory13.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory13.setDisplayName("");
        int int21 = undertowEmbeddedServletContainerFactory13.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection22 = undertowEmbeddedServletContainerFactory13.getDeploymentInfoCustomizers();
        java.io.File file23 = undertowEmbeddedServletContainerFactory13.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray24 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer25 = undertowEmbeddedServletContainerFactory13.getEmbeddedServletContainer(servletContextInitializerArray24);
        java.net.InetAddress inetAddress26 = undertowEmbeddedServletContainerFactory13.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage28 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray29 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage28 };
        undertowEmbeddedServletContainerFactory27.addErrorPages(errorPageArray29);
        undertowEmbeddedServletContainerFactory13.addErrorPages(errorPageArray29);
        java.io.File file32 = null;
        undertowEmbeddedServletContainerFactory13.setDocumentRoot(file32);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory35.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory35.setAccessLogPattern("");
        undertowEmbeddedServletContainerFactory35.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory35.setBufferSize((java.lang.Integer) (-1));
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer44 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray45 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer44 };
        undertowEmbeddedServletContainerFactory35.addBuilderCustomizers(undertowBuilderCustomizerArray45);
        undertowEmbeddedServletContainerFactory13.addBuilderCustomizers(undertowBuilderCustomizerArray45);
        org.springframework.boot.context.embedded.Compression compression48 = undertowEmbeddedServletContainerFactory13.getCompression();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet49 = undertowEmbeddedServletContainerFactory13.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory51 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory51.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory51.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection56 = undertowEmbeddedServletContainerFactory51.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray57 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory51.addInitializers(servletContextInitializerArray57);
        org.springframework.boot.context.embedded.Ssl ssl59 = null;
        undertowEmbeddedServletContainerFactory51.setSsl(ssl59);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory62 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory62.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory62.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection67 = undertowEmbeddedServletContainerFactory62.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory62.setDisplayName("");
        int int70 = undertowEmbeddedServletContainerFactory62.getPort();
        undertowEmbeddedServletContainerFactory62.setRegisterJspServlet(true);
        undertowEmbeddedServletContainerFactory62.setSessionTimeout(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory75 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage76 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray77 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage76 };
        undertowEmbeddedServletContainerFactory75.addErrorPages(errorPageArray77);
        undertowEmbeddedServletContainerFactory62.addErrorPages(errorPageArray77);
        undertowEmbeddedServletContainerFactory51.addErrorPages(errorPageArray77);
        undertowEmbeddedServletContainerFactory13.addErrorPages(errorPageArray77);
        undertowEmbeddedServletContainerFactory1.addErrorPages(errorPageArray77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray77);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
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
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(35);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings18 = undertowEmbeddedServletContainerFactory17.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory20.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory20.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection25 = undertowEmbeddedServletContainerFactory20.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray26 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory20.addInitializers(servletContextInitializerArray26);
        org.springframework.boot.context.embedded.Ssl ssl28 = null;
        undertowEmbeddedServletContainerFactory20.setSsl(ssl28);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory33.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet36 = undertowEmbeddedServletContainerFactory33.getJspServlet();
        undertowEmbeddedServletContainerFactory31.setJspServlet(jspServlet36);
        java.io.File file38 = null;
        undertowEmbeddedServletContainerFactory31.setAccessLogDirectory(file38);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray42 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage> errorPageSet43 = new java.util.LinkedHashSet<org.springframework.boot.context.embedded.ErrorPage>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet43, errorPageArray42);
        undertowEmbeddedServletContainerFactory41.setErrorPages((java.util.Set<org.springframework.boot.context.embedded.ErrorPage>) errorPageSet43);
        org.springframework.boot.context.embedded.Compression compression46 = null;
        undertowEmbeddedServletContainerFactory41.setCompression(compression46);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory48 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        org.springframework.boot.context.embedded.ErrorPage errorPage49 = null;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray50 = new org.springframework.boot.context.embedded.ErrorPage[] { errorPage49 };
        undertowEmbeddedServletContainerFactory48.addErrorPages(errorPageArray50);
        undertowEmbeddedServletContainerFactory41.addErrorPages(errorPageArray50);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory54 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory54.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory54.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection59 = undertowEmbeddedServletContainerFactory54.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory54.setDisplayName("");
        int int62 = undertowEmbeddedServletContainerFactory54.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection63 = undertowEmbeddedServletContainerFactory54.getDeploymentInfoCustomizers();
        java.io.File file64 = undertowEmbeddedServletContainerFactory54.getSessionStoreDir();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray65 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer66 = undertowEmbeddedServletContainerFactory54.getEmbeddedServletContainer(servletContextInitializerArray65);
        undertowEmbeddedServletContainerFactory41.addInitializers(servletContextInitializerArray65);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer68 = undertowEmbeddedServletContainerFactory31.getEmbeddedServletContainer(servletContextInitializerArray65);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer69 = undertowEmbeddedServletContainerFactory20.getEmbeddedServletContainer(servletContextInitializerArray65);
        undertowEmbeddedServletContainerFactory17.addInitializers(servletContextInitializerArray65);
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer69);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        org.springframework.boot.context.embedded.Ssl ssl7 = undertowEmbeddedServletContainerFactory1.getSsl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl7);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        boolean boolean11 = undertowEmbeddedServletContainerFactory1.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (short) 0);
        org.springframework.boot.context.embedded.Compression compression14 = undertowEmbeddedServletContainerFactory1.getCompression();
        org.springframework.core.io.ResourceLoader resourceLoader15 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression14);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
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
        java.io.File file16 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file16);
        undertowEmbeddedServletContainerFactory1.setJspServletClassName("");
        org.springframework.boot.context.embedded.MimeMappings mimeMappings20 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings20);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
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
        boolean boolean18 = undertowEmbeddedServletContainerFactory1.isAccessLogEnabled();
        java.net.InetAddress inetAddress19 = null;
        undertowEmbeddedServletContainerFactory1.setAddress(inetAddress19);
        java.lang.String str21 = undertowEmbeddedServletContainerFactory1.getDisplayName();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "" + "'", str21.equals(""));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        java.lang.String str14 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.io.File file15 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file15);
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file17);
        int int19 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection10 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        java.io.File file11 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.core.io.ResourceLoader resourceLoader14 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader14);
        java.io.File file16 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file16);
        java.net.InetAddress inetAddress18 = undertowEmbeddedServletContainerFactory1.getAddress();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress18);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.String str7 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        int int8 = undertowEmbeddedServletContainerFactory1.getPort();
        java.lang.String str9 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        undertowEmbeddedServletContainerFactory1.setPort((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        java.lang.String str2 = undertowEmbeddedServletContainerFactory1.getDisplayName();
        java.io.File file3 = undertowEmbeddedServletContainerFactory1.getDocumentRoot();
        java.net.InetAddress inetAddress4 = undertowEmbeddedServletContainerFactory1.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress4);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) (byte) 1);
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        undertowEmbeddedServletContainerFactory1.setResourceLoader(resourceLoader11);
        org.springframework.boot.context.embedded.Compression compression13 = undertowEmbeddedServletContainerFactory1.getCompression();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression13);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory6.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory10.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet13 = undertowEmbeddedServletContainerFactory10.getJspServlet();
        undertowEmbeddedServletContainerFactory6.setJspServlet(jspServlet13);
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet13);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet13);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
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
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 0);
        int int32 = undertowEmbeddedServletContainerFactory1.getPort();
        java.lang.String str33 = undertowEmbeddedServletContainerFactory1.getDisplayName();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "" + "'", str33.equals(""));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1800);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file9);
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory1.setDocumentRoot(file11);
        undertowEmbeddedServletContainerFactory1.setBufferSize((java.lang.Integer) 1);
        java.lang.String str15 = undertowEmbeddedServletContainerFactory1.getContextPath();
        java.io.File file16 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
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
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
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
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        java.lang.String str4 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection7 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        java.lang.String str8 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setPersistSession(false);
        org.springframework.boot.context.embedded.Compression compression11 = undertowEmbeddedServletContainerFactory1.getCompression();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression11);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
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
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory14.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory14.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection19 = undertowEmbeddedServletContainerFactory14.getBuilderCustomizers();
        java.io.File file20 = null;
        undertowEmbeddedServletContainerFactory14.setDocumentRoot(file20);
        boolean boolean22 = undertowEmbeddedServletContainerFactory14.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet23 = undertowEmbeddedServletContainerFactory14.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection24 = undertowEmbeddedServletContainerFactory14.getBuilderCustomizers();
        java.net.InetAddress inetAddress25 = undertowEmbeddedServletContainerFactory14.getAddress();
        org.springframework.boot.context.embedded.Compression compression26 = null;
        undertowEmbeddedServletContainerFactory14.setCompression(compression26);
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray28 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        undertowEmbeddedServletContainerFactory14.addBuilderCustomizers(undertowBuilderCustomizerArray28);
        undertowEmbeddedServletContainerFactory1.addBuilderCustomizers(undertowBuilderCustomizerArray28);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory34.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory34.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection39 = undertowEmbeddedServletContainerFactory34.getBuilderCustomizers();
        java.io.File file40 = null;
        undertowEmbeddedServletContainerFactory34.setDocumentRoot(file40);
        boolean boolean42 = undertowEmbeddedServletContainerFactory34.isPersistSession();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet43 = undertowEmbeddedServletContainerFactory34.getErrorPages();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection44 = undertowEmbeddedServletContainerFactory34.getBuilderCustomizers();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings45 = undertowEmbeddedServletContainerFactory34.getMimeMappings();
        undertowEmbeddedServletContainerFactory34.setBuffersPerRegion((java.lang.Integer) 100);
        java.io.File file48 = null;
        undertowEmbeddedServletContainerFactory34.setDocumentRoot(file48);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory51 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory53 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory53.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory53.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection58 = undertowEmbeddedServletContainerFactory53.getBuilderCustomizers();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray59 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory53.addInitializers(servletContextInitializerArray59);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer61 = undertowEmbeddedServletContainerFactory51.getEmbeddedServletContainer(servletContextInitializerArray59);
        undertowEmbeddedServletContainerFactory34.addInitializers(servletContextInitializerArray59);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer63 = undertowEmbeddedServletContainerFactory32.getEmbeddedServletContainer(servletContextInitializerArray59);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer64 = undertowEmbeddedServletContainerFactory1.getEmbeddedServletContainer(servletContextInitializerArray59);
        java.io.File file65 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file65);
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
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer64);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
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
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory15.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory15.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection20 = undertowEmbeddedServletContainerFactory15.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory15.setDisplayName("");
        int int23 = undertowEmbeddedServletContainerFactory15.getPort();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection24 = undertowEmbeddedServletContainerFactory15.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray25 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory15.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray25);
        undertowEmbeddedServletContainerFactory1.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray25);
        java.io.File file28 = null;
        undertowEmbeddedServletContainerFactory1.setSessionStoreDir(file28);
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
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray25);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
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
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        undertowEmbeddedServletContainerFactory1.setAccessLogPattern("");
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
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
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
        java.lang.String str14 = undertowEmbeddedServletContainerFactory1.getContextPath();
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 35);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection17 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection17);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory1.setUseForwardHeaders(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout(0);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(false);
        undertowEmbeddedServletContainerFactory1.setSessionTimeout((int) '#');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection6 = undertowEmbeddedServletContainerFactory1.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory1.setDisplayName("");
        int int9 = undertowEmbeddedServletContainerFactory1.getPort();
        undertowEmbeddedServletContainerFactory1.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.Ssl ssl12 = null;
        undertowEmbeddedServletContainerFactory1.setSsl(ssl12);
        boolean boolean14 = undertowEmbeddedServletContainerFactory1.isPersistSession();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet29);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
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
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory1.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        java.io.File file5 = null;
        undertowEmbeddedServletContainerFactory1.setAccessLogDirectory(file5);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection7 = undertowEmbeddedServletContainerFactory1.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory1.setContextPath("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection7);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
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
        org.springframework.boot.context.embedded.MimeMappings mimeMappings18 = undertowEmbeddedServletContainerFactory1.getMimeMappings();
        java.lang.String str19 = undertowEmbeddedServletContainerFactory1.getContextPath();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory21.setRegisterJspServlet(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        undertowEmbeddedServletContainerFactory25.setSessionTimeout((int) (byte) 100);
        org.springframework.boot.context.embedded.JspServlet jspServlet28 = undertowEmbeddedServletContainerFactory25.getJspServlet();
        undertowEmbeddedServletContainerFactory21.setJspServlet(jspServlet28);
        undertowEmbeddedServletContainerFactory1.setJspServlet(jspServlet28);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet28);
    }
}

