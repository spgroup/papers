import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        undertowEmbeddedServletContainerFactory0.setPersistSession(false);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory0.setSessionStoreDir(file4);
        org.springframework.boot.context.embedded.Ssl ssl6 = null;
        undertowEmbeddedServletContainerFactory0.setSsl(ssl6);
        java.lang.ClassLoader classLoader8 = undertowEmbeddedServletContainerFactory0.getServletClassLoader();
        undertowEmbeddedServletContainerFactory0.setBufferSize((java.lang.Integer) 0);
        java.lang.String str11 = undertowEmbeddedServletContainerFactory0.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean13 = undertowEmbeddedServletContainerFactory12.isPersistSession();
        java.io.File file14 = undertowEmbeddedServletContainerFactory12.accessLogDirectory;
        boolean boolean15 = undertowEmbeddedServletContainerFactory12.useForwardHeaders;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray16 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList17 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList17, undertowDeploymentInfoCustomizerArray16);
        undertowEmbeddedServletContainerFactory12.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList17;
        undertowEmbeddedServletContainerFactory0.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList17;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection21 = undertowEmbeddedServletContainerFactory0.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean23 = undertowEmbeddedServletContainerFactory22.isPersistSession();
        org.springframework.boot.context.embedded.JspServlet jspServlet24 = undertowEmbeddedServletContainerFactory22.getJspServlet();
        boolean boolean25 = undertowEmbeddedServletContainerFactory22.isRegisterDefaultServlet();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection26 = undertowEmbeddedServletContainerFactory22.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean29 = undertowEmbeddedServletContainerFactory28.isPersistSession();
        java.io.File file30 = undertowEmbeddedServletContainerFactory28.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings31 = undertowEmbeddedServletContainerFactory28.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader32 = undertowEmbeddedServletContainerFactory28.resourceLoader;
        java.io.File file33 = null;
        undertowEmbeddedServletContainerFactory28.setSessionStoreDir(file33);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo35 = null;
        undertowEmbeddedServletContainerFactory28.configureErrorPages(deploymentInfo35);
        org.springframework.boot.context.embedded.ServletContextInitializer servletContextInitializer37 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray38 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { servletContextInitializer37 };
        undertowEmbeddedServletContainerFactory28.addInitializers(servletContextInitializerArray38);
        initializer27.initializers = servletContextInitializerArray38;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray41 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        initializer27.initializers = servletContextInitializerArray41;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory44 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean45 = undertowEmbeddedServletContainerFactory44.isPersistSession();
        java.io.File file46 = undertowEmbeddedServletContainerFactory44.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings47 = undertowEmbeddedServletContainerFactory44.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader48 = undertowEmbeddedServletContainerFactory44.resourceLoader;
        java.io.File file49 = null;
        undertowEmbeddedServletContainerFactory44.setSessionStoreDir(file49);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo51 = null;
        undertowEmbeddedServletContainerFactory44.configureErrorPages(deploymentInfo51);
        org.springframework.boot.context.embedded.ServletContextInitializer servletContextInitializer53 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray54 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { servletContextInitializer53 };
        undertowEmbeddedServletContainerFactory44.addInitializers(servletContextInitializerArray54);
        initializer43.initializers = servletContextInitializerArray54;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray57 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        initializer43.initializers = servletContextInitializerArray57;
        initializer27.initializers = servletContextInitializerArray57;
        io.undertow.servlet.api.DeploymentManager deploymentManager60 = undertowEmbeddedServletContainerFactory22.createDeploymentManager(servletContextInitializerArray57);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory61 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean62 = undertowEmbeddedServletContainerFactory61.isPersistSession();
        java.io.File file63 = undertowEmbeddedServletContainerFactory61.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings64 = undertowEmbeddedServletContainerFactory61.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader65 = undertowEmbeddedServletContainerFactory61.resourceLoader;
        boolean boolean66 = undertowEmbeddedServletContainerFactory61.isRegisterDefaultServlet();
        java.lang.ClassLoader classLoader67 = undertowEmbeddedServletContainerFactory61.getServletClassLoader();
        undertowEmbeddedServletContainerFactory61.directBuffers = false;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList70 = undertowEmbeddedServletContainerFactory61.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory71 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean72 = undertowEmbeddedServletContainerFactory71.isPersistSession();
        java.io.File file73 = undertowEmbeddedServletContainerFactory71.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList74 = undertowEmbeddedServletContainerFactory71.builderCustomizers;
        int int75 = undertowEmbeddedServletContainerFactory71.getPort();
        undertowEmbeddedServletContainerFactory71.useForwardHeaders = false;
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray78 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory71.addErrorPages(errorPageArray78);
        undertowEmbeddedServletContainerFactory61.addErrorPages(errorPageArray78);
        undertowEmbeddedServletContainerFactory22.addErrorPages(errorPageArray78);
        undertowEmbeddedServletContainerFactory0.addErrorPages(errorPageArray78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(deploymentManager60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 8080 + "'", int75 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray78);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file5 = null;
        undertowEmbeddedServletContainerFactory2.accessLogDirectory = file5;
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory2.buffersPerRegion = 100;
        undertowEmbeddedServletContainerFactory2.buffersPerRegion = 1;
        java.net.InetAddress inetAddress13 = null;
        undertowEmbeddedServletContainerFactory2.setAddress(inetAddress13);
        org.springframework.boot.context.embedded.Ssl ssl15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.xnio.SslClientAuthMode sslClientAuthMode16 = undertowEmbeddedServletContainerFactory2.getSslClientAuthMode(ssl15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file5 = null;
        undertowEmbeddedServletContainerFactory2.accessLogDirectory = file5;
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory2.buffersPerRegion = 100;
        undertowEmbeddedServletContainerFactory2.buffersPerRegion = 1;
        java.net.InetAddress inetAddress13 = null;
        undertowEmbeddedServletContainerFactory2.setAddress(inetAddress13);
        org.springframework.boot.context.embedded.Ssl ssl15 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory19.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file22 = null;
        undertowEmbeddedServletContainerFactory19.accessLogDirectory = file22;
        undertowEmbeddedServletContainerFactory19.setPersistSession(true);
        java.lang.Integer int26 = undertowEmbeddedServletContainerFactory19.bufferSize;
        undertowEmbeddedServletContainerFactory19.workerThreads = 0;
        org.springframework.core.io.ResourceLoader resourceLoader29 = null;
        undertowEmbeddedServletContainerFactory19.setResourceLoader(resourceLoader29);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(8080);
        undertowEmbeddedServletContainerFactory32.buffersPerRegion = 1;
        undertowEmbeddedServletContainerFactory32.setBuffersPerRegion((java.lang.Integer) 100);
        undertowEmbeddedServletContainerFactory32.setBuffersPerRegion((java.lang.Integer) 1800);
        io.undertow.Undertow.Builder builder40 = undertowEmbeddedServletContainerFactory32.createBuilder((int) 'a');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory43 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory43.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file46 = null;
        undertowEmbeddedServletContainerFactory43.accessLogDirectory = file46;
        boolean boolean48 = undertowEmbeddedServletContainerFactory43.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray49 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory43.addInitializers(servletContextInitializerArray49);
        undertowEmbeddedServletContainerFactory43.setDisplayName("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory55.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file58 = null;
        undertowEmbeddedServletContainerFactory55.accessLogDirectory = file58;
        boolean boolean60 = undertowEmbeddedServletContainerFactory55.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray61 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory55.addInitializers(servletContextInitializerArray61);
        io.undertow.servlet.api.DeploymentManager deploymentManager63 = undertowEmbeddedServletContainerFactory43.createDeploymentManager(servletContextInitializerArray61);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer65 = undertowEmbeddedServletContainerFactory19.getUndertowEmbeddedServletContainer(builder40, deploymentManager63, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory2.configureSsl(ssl15, (int) '4', builder40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(deploymentManager63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer65);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings3 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader4 = undertowEmbeddedServletContainerFactory0.resourceLoader;
        boolean boolean5 = undertowEmbeddedServletContainerFactory0.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory0.bufferSize = 0;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings8 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        org.springframework.boot.context.embedded.MimeMappings mimeMappings9 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        undertowEmbeddedServletContainerFactory0.setBuffersPerRegion((java.lang.Integer) 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings9);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean3 = undertowEmbeddedServletContainerFactory2.isPersistSession();
        java.io.File file4 = undertowEmbeddedServletContainerFactory2.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray5 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory2.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray5);
        org.springframework.boot.context.embedded.Ssl ssl7 = undertowEmbeddedServletContainerFactory2.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean9 = undertowEmbeddedServletContainerFactory8.isPersistSession();
        undertowEmbeddedServletContainerFactory8.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean13 = undertowEmbeddedServletContainerFactory12.isPersistSession();
        io.undertow.Undertow.Builder builder15 = undertowEmbeddedServletContainerFactory12.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager16 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer18 = undertowEmbeddedServletContainerFactory8.getUndertowEmbeddedServletContainer(builder15, deploymentManager16, (int) (byte) 1);
        io.undertow.servlet.api.DeploymentManager deploymentManager19 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer21 = undertowEmbeddedServletContainerFactory2.getUndertowEmbeddedServletContainer(builder15, deploymentManager19, (int) 'a');
        io.undertow.servlet.api.DeploymentManager deploymentManager22 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer24 = undertowEmbeddedServletContainerFactory0.getUndertowEmbeddedServletContainer(builder15, deploymentManager22, (int) '#');
        org.springframework.boot.context.embedded.JspServlet jspServlet25 = undertowEmbeddedServletContainerFactory0.getJspServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean28 = undertowEmbeddedServletContainerFactory27.isPersistSession();
        java.io.File file29 = undertowEmbeddedServletContainerFactory27.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings30 = undertowEmbeddedServletContainerFactory27.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader31 = undertowEmbeddedServletContainerFactory27.resourceLoader;
        java.io.File file32 = null;
        undertowEmbeddedServletContainerFactory27.setSessionStoreDir(file32);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo34 = null;
        undertowEmbeddedServletContainerFactory27.configureErrorPages(deploymentInfo34);
        org.springframework.boot.context.embedded.ServletContextInitializer servletContextInitializer36 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray37 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { servletContextInitializer36 };
        undertowEmbeddedServletContainerFactory27.addInitializers(servletContextInitializerArray37);
        initializer26.initializers = servletContextInitializerArray37;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean41 = undertowEmbeddedServletContainerFactory40.isPersistSession();
        java.io.File file42 = undertowEmbeddedServletContainerFactory40.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings43 = undertowEmbeddedServletContainerFactory40.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader44 = undertowEmbeddedServletContainerFactory40.resourceLoader;
        java.io.File file45 = null;
        undertowEmbeddedServletContainerFactory40.setSessionStoreDir(file45);
        undertowEmbeddedServletContainerFactory40.setBufferSize((java.lang.Integer) (-1));
        java.io.File file49 = null;
        undertowEmbeddedServletContainerFactory40.accessLogDirectory = file49;
        java.lang.Integer int51 = undertowEmbeddedServletContainerFactory40.buffersPerRegion;
        undertowEmbeddedServletContainerFactory40.setRegisterDefaultServlet(false);
        undertowEmbeddedServletContainerFactory40.setBuffersPerRegion((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory56 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean57 = undertowEmbeddedServletContainerFactory56.isPersistSession();
        java.io.File file58 = undertowEmbeddedServletContainerFactory56.accessLogDirectory;
        undertowEmbeddedServletContainerFactory56.setSessionTimeout(1);
        boolean boolean61 = undertowEmbeddedServletContainerFactory56.accessLogEnabled;
        undertowEmbeddedServletContainerFactory56.setAccessLogPattern("0.0.0.0");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory66 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory66.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file69 = null;
        undertowEmbeddedServletContainerFactory66.accessLogDirectory = file69;
        boolean boolean71 = undertowEmbeddedServletContainerFactory66.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray72 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory66.addInitializers(servletContextInitializerArray72);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer74 = undertowEmbeddedServletContainerFactory56.getEmbeddedServletContainer(servletContextInitializerArray72);
        undertowEmbeddedServletContainerFactory40.addInitializers(servletContextInitializerArray72);
        initializer26.initializers = servletContextInitializerArray72;
        undertowEmbeddedServletContainerFactory0.addInitializers(servletContextInitializerArray72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer74);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(8080);
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 1;
        org.springframework.core.io.ResourceLoader resourceLoader4 = null;
        undertowEmbeddedServletContainerFactory1.resourceLoader = resourceLoader4;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean7 = undertowEmbeddedServletContainerFactory6.isPersistSession();
        undertowEmbeddedServletContainerFactory6.setBufferSize((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean11 = undertowEmbeddedServletContainerFactory10.isPersistSession();
        io.undertow.Undertow.Builder builder13 = undertowEmbeddedServletContainerFactory10.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings14 = undertowEmbeddedServletContainerFactory10.getMimeMappings();
        int int15 = undertowEmbeddedServletContainerFactory10.getPort();
        java.lang.ClassLoader classLoader16 = undertowEmbeddedServletContainerFactory10.getServletClassLoader();
        undertowEmbeddedServletContainerFactory10.useForwardHeaders = false;
        java.io.File file19 = undertowEmbeddedServletContainerFactory10.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings20 = undertowEmbeddedServletContainerFactory10.getMimeMappings();
        undertowEmbeddedServletContainerFactory6.setMimeMappings(mimeMappings20);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings22 = undertowEmbeddedServletContainerFactory6.getMimeMappings();
        undertowEmbeddedServletContainerFactory1.setMimeMappings(mimeMappings22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8080 + "'", int15 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings22);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings3 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader4 = undertowEmbeddedServletContainerFactory0.resourceLoader;
        undertowEmbeddedServletContainerFactory0.setBufferSize((java.lang.Integer) 1);
        boolean boolean7 = undertowEmbeddedServletContainerFactory0.useForwardHeaders;
        java.lang.Integer int8 = undertowEmbeddedServletContainerFactory0.ioThreads;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean10 = undertowEmbeddedServletContainerFactory9.isPersistSession();
        java.io.File file11 = undertowEmbeddedServletContainerFactory9.accessLogDirectory;
        undertowEmbeddedServletContainerFactory9.setSessionTimeout(1);
        boolean boolean14 = undertowEmbeddedServletContainerFactory9.accessLogEnabled;
        undertowEmbeddedServletContainerFactory9.setAccessLogPattern("0.0.0.0");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean18 = undertowEmbeddedServletContainerFactory17.isPersistSession();
        java.io.File file19 = undertowEmbeddedServletContainerFactory17.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings20 = undertowEmbeddedServletContainerFactory17.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader21 = undertowEmbeddedServletContainerFactory17.resourceLoader;
        undertowEmbeddedServletContainerFactory17.setBufferSize((java.lang.Integer) 1);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList24 = undertowEmbeddedServletContainerFactory17.builderCustomizers;
        undertowEmbeddedServletContainerFactory9.builderCustomizers = undertowBuilderCustomizerList24;
        undertowEmbeddedServletContainerFactory0.setBuilderCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList24);
        org.springframework.boot.context.embedded.JspServlet jspServlet27 = undertowEmbeddedServletContainerFactory0.getJspServlet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet27);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory0.setPort((int) (short) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean4 = undertowEmbeddedServletContainerFactory3.isPersistSession();
        io.undertow.Undertow.Builder builder6 = undertowEmbeddedServletContainerFactory3.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings7 = undertowEmbeddedServletContainerFactory3.getMimeMappings();
        undertowEmbeddedServletContainerFactory0.setMimeMappings(mimeMappings7);
        undertowEmbeddedServletContainerFactory0.setAccessLogPattern("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings7);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file5 = null;
        undertowEmbeddedServletContainerFactory2.accessLogDirectory = file5;
        boolean boolean7 = undertowEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray8);
        undertowEmbeddedServletContainerFactory2.setDisplayName("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory14.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file17 = null;
        undertowEmbeddedServletContainerFactory14.accessLogDirectory = file17;
        boolean boolean19 = undertowEmbeddedServletContainerFactory14.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray20 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory14.addInitializers(servletContextInitializerArray20);
        io.undertow.servlet.api.DeploymentManager deploymentManager22 = undertowEmbeddedServletContainerFactory2.createDeploymentManager(servletContextInitializerArray20);
        undertowEmbeddedServletContainerFactory2.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory27.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory27.directBuffers = true;
        org.springframework.boot.context.embedded.JspServlet jspServlet32 = undertowEmbeddedServletContainerFactory27.getJspServlet();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection33 = undertowEmbeddedServletContainerFactory27.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory2.setBuilderCustomizers(undertowBuilderCustomizerCollection33);
        io.undertow.Undertow.Builder builder36 = undertowEmbeddedServletContainerFactory2.createBuilder((int) 'a');
        org.springframework.core.io.ResourceLoader resourceLoader37 = null;
        undertowEmbeddedServletContainerFactory2.resourceLoader = resourceLoader37;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(deploymentManager22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        undertowEmbeddedServletContainerFactory0.accessLogEnabled = false;
        boolean boolean4 = undertowEmbeddedServletContainerFactory0.isRegisterDefaultServlet();
        java.io.File file5 = undertowEmbeddedServletContainerFactory0.getDocumentRoot();
        undertowEmbeddedServletContainerFactory0.setAccessLogPattern("");
        undertowEmbeddedServletContainerFactory0.setJspServletClassName("0.0.0.0");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean11 = undertowEmbeddedServletContainerFactory10.isPersistSession();
        java.io.File file12 = undertowEmbeddedServletContainerFactory10.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray13 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory10.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray13);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean16 = undertowEmbeddedServletContainerFactory15.isPersistSession();
        java.io.File file17 = undertowEmbeddedServletContainerFactory15.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings18 = undertowEmbeddedServletContainerFactory15.getMimeMappings();
        undertowEmbeddedServletContainerFactory10.setMimeMappings(mimeMappings18);
        undertowEmbeddedServletContainerFactory10.setDisplayName("");
        undertowEmbeddedServletContainerFactory10.setAccessLogPattern("0.0.0.0");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection24 = undertowEmbeddedServletContainerFactory10.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory0.setBuilderCustomizers(undertowBuilderCustomizerCollection24);
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory0.setContextPath("0.0.0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ContextPath must start with '/' and not end with '/'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection24);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        java.net.InetAddress inetAddress3 = undertowEmbeddedServletContainerFactory2.getAddress();
        org.springframework.core.io.ResourceLoader resourceLoader4 = null;
        undertowEmbeddedServletContainerFactory2.setResourceLoader(resourceLoader4);
        org.xnio.XnioWorker xnioWorker6 = undertowEmbeddedServletContainerFactory2.createWorker();
        java.net.InetAddress inetAddress7 = undertowEmbeddedServletContainerFactory2.getAddress();
        undertowEmbeddedServletContainerFactory2.bufferSize = 1800;
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory2.setAccessLogDirectory(file10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(xnioWorker6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress7);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 10);
        undertowEmbeddedServletContainerFactory2.setSessionTimeout((int) (short) 100);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        undertowEmbeddedServletContainerFactory0.accessLogEnabled = false;
        undertowEmbeddedServletContainerFactory0.setSessionTimeout((int) (short) 0);
        java.lang.String str6 = undertowEmbeddedServletContainerFactory0.getDisplayName();
        undertowEmbeddedServletContainerFactory0.setPort((int) (byte) 0);
        undertowEmbeddedServletContainerFactory0.ioThreads = 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        org.springframework.boot.context.embedded.JspServlet jspServlet2 = undertowEmbeddedServletContainerFactory0.getJspServlet();
        boolean boolean3 = undertowEmbeddedServletContainerFactory0.isAccessLogEnabled();
        java.net.InetAddress inetAddress4 = undertowEmbeddedServletContainerFactory0.getAddress();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress4);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        undertowEmbeddedServletContainerFactory0.setPersistSession(false);
        undertowEmbeddedServletContainerFactory0.accessLogEnabled = false;
        undertowEmbeddedServletContainerFactory0.accessLogEnabled = true;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection8 = undertowEmbeddedServletContainerFactory0.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory0.setBufferSize((java.lang.Integer) 8080);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean12 = undertowEmbeddedServletContainerFactory11.isPersistSession();
        undertowEmbeddedServletContainerFactory11.setPersistSession(false);
        undertowEmbeddedServletContainerFactory11.accessLogEnabled = false;
        undertowEmbeddedServletContainerFactory11.accessLogEnabled = true;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean20 = undertowEmbeddedServletContainerFactory19.isPersistSession();
        java.io.File file21 = undertowEmbeddedServletContainerFactory19.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray22 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory19.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray22);
        undertowEmbeddedServletContainerFactory11.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray22);
        java.io.File file25 = null;
        undertowEmbeddedServletContainerFactory11.setDocumentRoot(file25);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList27 = undertowEmbeddedServletContainerFactory11.builderCustomizers;
        undertowEmbeddedServletContainerFactory0.builderCustomizers = undertowBuilderCustomizerList27;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean30 = undertowEmbeddedServletContainerFactory29.isPersistSession();
        io.undertow.Undertow.Builder builder32 = undertowEmbeddedServletContainerFactory29.createBuilder((int) (short) 0);
        undertowEmbeddedServletContainerFactory29.useForwardHeaders = false;
        undertowEmbeddedServletContainerFactory29.directBuffers = false;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList37 = undertowEmbeddedServletContainerFactory29.builderCustomizers;
        undertowEmbeddedServletContainerFactory0.setBuilderCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList37);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings3 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader4 = undertowEmbeddedServletContainerFactory0.resourceLoader;
        undertowEmbeddedServletContainerFactory0.setBufferSize((java.lang.Integer) 1);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList7 = undertowEmbeddedServletContainerFactory0.builderCustomizers;
        java.net.InetAddress inetAddress8 = undertowEmbeddedServletContainerFactory0.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean10 = undertowEmbeddedServletContainerFactory9.isPersistSession();
        io.undertow.Undertow.Builder builder12 = undertowEmbeddedServletContainerFactory9.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings13 = undertowEmbeddedServletContainerFactory9.getMimeMappings();
        int int14 = undertowEmbeddedServletContainerFactory9.getPort();
        java.lang.ClassLoader classLoader15 = undertowEmbeddedServletContainerFactory9.getServletClassLoader();
        undertowEmbeddedServletContainerFactory9.useForwardHeaders = false;
        undertowEmbeddedServletContainerFactory9.setDisplayName("");
        java.lang.Boolean boolean20 = undertowEmbeddedServletContainerFactory9.directBuffers;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet21 = undertowEmbeddedServletContainerFactory9.getErrorPages();
        undertowEmbeddedServletContainerFactory0.setErrorPages(errorPageSet21);
        java.io.File file23 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection24 = undertowEmbeddedServletContainerFactory0.getBuilderCustomizers();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8080 + "'", int14 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection24);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        io.undertow.Undertow.Builder builder3 = undertowEmbeddedServletContainerFactory0.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        int int5 = undertowEmbeddedServletContainerFactory0.getPort();
        java.lang.ClassLoader classLoader6 = undertowEmbeddedServletContainerFactory0.getServletClassLoader();
        int int7 = undertowEmbeddedServletContainerFactory0.getPort();
        boolean boolean8 = undertowEmbeddedServletContainerFactory0.isRegisterDefaultServlet();
        io.undertow.Undertow.Builder builder10 = undertowEmbeddedServletContainerFactory0.createBuilder(1800);
        org.springframework.boot.context.embedded.Compression compression11 = null;
        undertowEmbeddedServletContainerFactory0.setCompression(compression11);
        java.io.File file13 = undertowEmbeddedServletContainerFactory0.getDocumentRoot();
        java.net.InetAddress inetAddress14 = null;
        undertowEmbeddedServletContainerFactory0.setAddress(inetAddress14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8080 + "'", int5 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8080 + "'", int7 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file13);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList3 = undertowEmbeddedServletContainerFactory0.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean5 = undertowEmbeddedServletContainerFactory4.isPersistSession();
        io.undertow.Undertow.Builder builder7 = undertowEmbeddedServletContainerFactory4.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager8 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer10 = undertowEmbeddedServletContainerFactory0.getUndertowEmbeddedServletContainer(builder7, deploymentManager8, (int) (byte) -1);
        undertowEmbeddedServletContainerFactory0.setSessionTimeout(100);
        io.undertow.Undertow.Builder builder14 = undertowEmbeddedServletContainerFactory0.createBuilder((int) '4');
        undertowEmbeddedServletContainerFactory0.setBufferSize((java.lang.Integer) 1);
        io.undertow.Undertow.Builder builder18 = undertowEmbeddedServletContainerFactory0.createBuilder((int) (byte) 100);
        undertowEmbeddedServletContainerFactory0.workerThreads = 1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        undertowEmbeddedServletContainerFactory0.setPersistSession(false);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory0.setSessionStoreDir(file4);
        undertowEmbeddedServletContainerFactory0.setPersistSession(true);
        org.springframework.core.io.ResourceLoader resourceLoader8 = undertowEmbeddedServletContainerFactory0.resourceLoader;
        org.springframework.core.io.ResourceLoader resourceLoader9 = null;
        undertowEmbeddedServletContainerFactory0.setResourceLoader(resourceLoader9);
        undertowEmbeddedServletContainerFactory0.workerThreads = (-1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean14 = undertowEmbeddedServletContainerFactory13.isPersistSession();
        java.io.File file15 = undertowEmbeddedServletContainerFactory13.accessLogDirectory;
        undertowEmbeddedServletContainerFactory13.setSessionTimeout(1);
        boolean boolean18 = undertowEmbeddedServletContainerFactory13.accessLogEnabled;
        undertowEmbeddedServletContainerFactory13.setAccessLogPattern("0.0.0.0");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory23.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file26 = null;
        undertowEmbeddedServletContainerFactory23.accessLogDirectory = file26;
        boolean boolean28 = undertowEmbeddedServletContainerFactory23.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray29 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory23.addInitializers(servletContextInitializerArray29);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer31 = undertowEmbeddedServletContainerFactory13.getEmbeddedServletContainer(servletContextInitializerArray29);
        undertowEmbeddedServletContainerFactory0.addInitializers(servletContextInitializerArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer31);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        undertowEmbeddedServletContainerFactory0.setPersistSession(false);
        undertowEmbeddedServletContainerFactory0.accessLogEnabled = false;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet6 = undertowEmbeddedServletContainerFactory0.getErrorPages();
        java.lang.Integer int7 = undertowEmbeddedServletContainerFactory0.workerThreads;
        int int8 = undertowEmbeddedServletContainerFactory0.getPort();
        undertowEmbeddedServletContainerFactory0.setBuffersPerRegion((java.lang.Integer) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8080 + "'", int8 == 8080);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(100);
        int int2 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1800 + "'", int2 == 1800);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray3 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory0.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray3);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean6 = undertowEmbeddedServletContainerFactory5.isPersistSession();
        undertowEmbeddedServletContainerFactory5.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean10 = undertowEmbeddedServletContainerFactory9.isPersistSession();
        io.undertow.Undertow.Builder builder12 = undertowEmbeddedServletContainerFactory9.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager13 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer15 = undertowEmbeddedServletContainerFactory5.getUndertowEmbeddedServletContainer(builder12, deploymentManager13, (int) (byte) 1);
        io.undertow.servlet.api.DeploymentManager deploymentManager16 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer18 = undertowEmbeddedServletContainerFactory0.getUndertowEmbeddedServletContainer(builder12, deploymentManager16, (int) (byte) -1);
        org.springframework.boot.context.embedded.Ssl ssl19 = undertowEmbeddedServletContainerFactory0.getSsl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl19);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        org.springframework.boot.context.embedded.JspServlet jspServlet2 = undertowEmbeddedServletContainerFactory0.getJspServlet();
        boolean boolean3 = undertowEmbeddedServletContainerFactory0.isRegisterDefaultServlet();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection4 = undertowEmbeddedServletContainerFactory0.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean7 = undertowEmbeddedServletContainerFactory6.isPersistSession();
        java.io.File file8 = undertowEmbeddedServletContainerFactory6.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings9 = undertowEmbeddedServletContainerFactory6.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader10 = undertowEmbeddedServletContainerFactory6.resourceLoader;
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory6.setSessionStoreDir(file11);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo13 = null;
        undertowEmbeddedServletContainerFactory6.configureErrorPages(deploymentInfo13);
        org.springframework.boot.context.embedded.ServletContextInitializer servletContextInitializer15 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray16 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { servletContextInitializer15 };
        undertowEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray16);
        initializer5.initializers = servletContextInitializerArray16;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray19 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        initializer5.initializers = servletContextInitializerArray19;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean23 = undertowEmbeddedServletContainerFactory22.isPersistSession();
        java.io.File file24 = undertowEmbeddedServletContainerFactory22.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings25 = undertowEmbeddedServletContainerFactory22.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader26 = undertowEmbeddedServletContainerFactory22.resourceLoader;
        java.io.File file27 = null;
        undertowEmbeddedServletContainerFactory22.setSessionStoreDir(file27);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo29 = null;
        undertowEmbeddedServletContainerFactory22.configureErrorPages(deploymentInfo29);
        org.springframework.boot.context.embedded.ServletContextInitializer servletContextInitializer31 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray32 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { servletContextInitializer31 };
        undertowEmbeddedServletContainerFactory22.addInitializers(servletContextInitializerArray32);
        initializer21.initializers = servletContextInitializerArray32;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray35 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        initializer21.initializers = servletContextInitializerArray35;
        initializer5.initializers = servletContextInitializerArray35;
        io.undertow.servlet.api.DeploymentManager deploymentManager38 = undertowEmbeddedServletContainerFactory0.createDeploymentManager(servletContextInitializerArray35);
        java.lang.Integer int39 = undertowEmbeddedServletContainerFactory0.workerThreads;
        java.lang.String str40 = undertowEmbeddedServletContainerFactory0.getDisplayName();
        java.lang.String str41 = undertowEmbeddedServletContainerFactory0.getContextPath();
        org.springframework.boot.context.embedded.Ssl ssl42 = undertowEmbeddedServletContainerFactory0.getSsl();
        org.springframework.boot.context.embedded.ErrorPage errorPage43 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.servlet.api.ErrorPage errorPage44 = undertowEmbeddedServletContainerFactory0.getUndertowErrorPage(errorPage43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(deploymentManager38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "" + "'", str41.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl42);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings3 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader4 = undertowEmbeddedServletContainerFactory0.resourceLoader;
        java.io.File file5 = null;
        undertowEmbeddedServletContainerFactory0.setSessionStoreDir(file5);
        boolean boolean7 = undertowEmbeddedServletContainerFactory0.useForwardHeaders;
        undertowEmbeddedServletContainerFactory0.workerThreads = 10;
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory0.setSessionStoreDir(file10);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo12 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory0.configureAccessLog(deploymentInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        java.net.InetAddress inetAddress3 = undertowEmbeddedServletContainerFactory2.getAddress();
        org.springframework.core.io.ResourceLoader resourceLoader4 = null;
        undertowEmbeddedServletContainerFactory2.setResourceLoader(resourceLoader4);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean8 = undertowEmbeddedServletContainerFactory7.isPersistSession();
        java.io.File file9 = undertowEmbeddedServletContainerFactory7.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings10 = undertowEmbeddedServletContainerFactory7.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader11 = undertowEmbeddedServletContainerFactory7.resourceLoader;
        java.io.File file12 = null;
        undertowEmbeddedServletContainerFactory7.setSessionStoreDir(file12);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo14 = null;
        undertowEmbeddedServletContainerFactory7.configureErrorPages(deploymentInfo14);
        org.springframework.boot.context.embedded.ServletContextInitializer servletContextInitializer16 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray17 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { servletContextInitializer16 };
        undertowEmbeddedServletContainerFactory7.addInitializers(servletContextInitializerArray17);
        initializer6.initializers = servletContextInitializerArray17;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray20 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        initializer6.initializers = servletContextInitializerArray20;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean24 = undertowEmbeddedServletContainerFactory23.isPersistSession();
        java.io.File file25 = undertowEmbeddedServletContainerFactory23.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings26 = undertowEmbeddedServletContainerFactory23.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader27 = undertowEmbeddedServletContainerFactory23.resourceLoader;
        java.io.File file28 = null;
        undertowEmbeddedServletContainerFactory23.setSessionStoreDir(file28);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo30 = null;
        undertowEmbeddedServletContainerFactory23.configureErrorPages(deploymentInfo30);
        org.springframework.boot.context.embedded.ServletContextInitializer servletContextInitializer32 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray33 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { servletContextInitializer32 };
        undertowEmbeddedServletContainerFactory23.addInitializers(servletContextInitializerArray33);
        initializer22.initializers = servletContextInitializerArray33;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray36 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        initializer22.initializers = servletContextInitializerArray36;
        initializer6.initializers = servletContextInitializerArray36;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray39 = initializer6.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray40 = initializer6.initializers;
        undertowEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray40);
        undertowEmbeddedServletContainerFactory2.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory46 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory46.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory46.directBuffers = true;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer51 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean53 = undertowEmbeddedServletContainerFactory52.isPersistSession();
        java.io.File file54 = undertowEmbeddedServletContainerFactory52.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings55 = undertowEmbeddedServletContainerFactory52.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader56 = undertowEmbeddedServletContainerFactory52.resourceLoader;
        java.io.File file57 = null;
        undertowEmbeddedServletContainerFactory52.setSessionStoreDir(file57);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo59 = null;
        undertowEmbeddedServletContainerFactory52.configureErrorPages(deploymentInfo59);
        org.springframework.boot.context.embedded.ServletContextInitializer servletContextInitializer61 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray62 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { servletContextInitializer61 };
        undertowEmbeddedServletContainerFactory52.addInitializers(servletContextInitializerArray62);
        initializer51.initializers = servletContextInitializerArray62;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray65 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        initializer51.initializers = servletContextInitializerArray65;
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer67 = undertowEmbeddedServletContainerFactory46.getEmbeddedServletContainer(servletContextInitializerArray65);
        undertowEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray65);
        int int69 = undertowEmbeddedServletContainerFactory2.getPort();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        undertowEmbeddedServletContainerFactory0.setPersistSession(false);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory0.setSessionStoreDir(file4);
        org.springframework.boot.context.embedded.Ssl ssl6 = null;
        undertowEmbeddedServletContainerFactory0.setSsl(ssl6);
        undertowEmbeddedServletContainerFactory0.setDirectBuffers((java.lang.Boolean) false);
        undertowEmbeddedServletContainerFactory0.useForwardHeaders = true;
        undertowEmbeddedServletContainerFactory0.ioThreads = 1800;
        undertowEmbeddedServletContainerFactory0.setDisplayName("hi!");
        boolean boolean16 = undertowEmbeddedServletContainerFactory0.accessLogEnabled;
        int int17 = undertowEmbeddedServletContainerFactory0.getPort();
        org.springframework.boot.context.embedded.Ssl ssl18 = null;
        undertowEmbeddedServletContainerFactory0.setSsl(ssl18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8080 + "'", int17 == 8080);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray3 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory0.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray3);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean6 = undertowEmbeddedServletContainerFactory5.isPersistSession();
        java.io.File file7 = undertowEmbeddedServletContainerFactory5.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings8 = undertowEmbeddedServletContainerFactory5.getMimeMappings();
        undertowEmbeddedServletContainerFactory0.setMimeMappings(mimeMappings8);
        org.springframework.boot.context.embedded.Compression compression10 = undertowEmbeddedServletContainerFactory0.getCompression();
        undertowEmbeddedServletContainerFactory0.setBufferSize((java.lang.Integer) (-1));
        undertowEmbeddedServletContainerFactory0.setPort((-1));
        undertowEmbeddedServletContainerFactory0.setPort((int) (byte) 1);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList17 = undertowEmbeddedServletContainerFactory0.deploymentInfoCustomizers;
        java.io.File file18 = undertowEmbeddedServletContainerFactory0.getSessionStoreDir();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file18);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray3 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory0.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray3);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean6 = undertowEmbeddedServletContainerFactory5.isPersistSession();
        java.io.File file7 = undertowEmbeddedServletContainerFactory5.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings8 = undertowEmbeddedServletContainerFactory5.getMimeMappings();
        undertowEmbeddedServletContainerFactory0.setMimeMappings(mimeMappings8);
        org.springframework.boot.context.embedded.Compression compression10 = undertowEmbeddedServletContainerFactory0.getCompression();
        java.lang.String str11 = undertowEmbeddedServletContainerFactory0.getContextPath();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList12 = undertowEmbeddedServletContainerFactory0.deploymentInfoCustomizers;
        org.springframework.boot.context.embedded.Compression compression13 = undertowEmbeddedServletContainerFactory0.getCompression();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression13);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray3 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory0.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray3);
        undertowEmbeddedServletContainerFactory0.buffersPerRegion = (-1);
        undertowEmbeddedServletContainerFactory0.setAccessLogPattern("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray3);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        org.springframework.boot.context.embedded.JspServlet jspServlet2 = undertowEmbeddedServletContainerFactory0.getJspServlet();
        boolean boolean3 = undertowEmbeddedServletContainerFactory0.isRegisterDefaultServlet();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection4 = undertowEmbeddedServletContainerFactory0.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean7 = undertowEmbeddedServletContainerFactory6.isPersistSession();
        java.io.File file8 = undertowEmbeddedServletContainerFactory6.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings9 = undertowEmbeddedServletContainerFactory6.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader10 = undertowEmbeddedServletContainerFactory6.resourceLoader;
        java.io.File file11 = null;
        undertowEmbeddedServletContainerFactory6.setSessionStoreDir(file11);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo13 = null;
        undertowEmbeddedServletContainerFactory6.configureErrorPages(deploymentInfo13);
        org.springframework.boot.context.embedded.ServletContextInitializer servletContextInitializer15 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray16 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { servletContextInitializer15 };
        undertowEmbeddedServletContainerFactory6.addInitializers(servletContextInitializerArray16);
        initializer5.initializers = servletContextInitializerArray16;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray19 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        initializer5.initializers = servletContextInitializerArray19;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean23 = undertowEmbeddedServletContainerFactory22.isPersistSession();
        java.io.File file24 = undertowEmbeddedServletContainerFactory22.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings25 = undertowEmbeddedServletContainerFactory22.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader26 = undertowEmbeddedServletContainerFactory22.resourceLoader;
        java.io.File file27 = null;
        undertowEmbeddedServletContainerFactory22.setSessionStoreDir(file27);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo29 = null;
        undertowEmbeddedServletContainerFactory22.configureErrorPages(deploymentInfo29);
        org.springframework.boot.context.embedded.ServletContextInitializer servletContextInitializer31 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray32 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { servletContextInitializer31 };
        undertowEmbeddedServletContainerFactory22.addInitializers(servletContextInitializerArray32);
        initializer21.initializers = servletContextInitializerArray32;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray35 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        initializer21.initializers = servletContextInitializerArray35;
        initializer5.initializers = servletContextInitializerArray35;
        io.undertow.servlet.api.DeploymentManager deploymentManager38 = undertowEmbeddedServletContainerFactory0.createDeploymentManager(servletContextInitializerArray35);
        java.lang.Integer int39 = undertowEmbeddedServletContainerFactory0.workerThreads;
        java.lang.String str40 = undertowEmbeddedServletContainerFactory0.getDisplayName();
        java.lang.String str41 = undertowEmbeddedServletContainerFactory0.getDisplayName();
        java.lang.Integer int42 = undertowEmbeddedServletContainerFactory0.bufferSize;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(deploymentManager38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int42);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        io.undertow.Undertow.Builder builder3 = undertowEmbeddedServletContainerFactory0.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        int int5 = undertowEmbeddedServletContainerFactory0.getPort();
        java.lang.ClassLoader classLoader6 = undertowEmbeddedServletContainerFactory0.getServletClassLoader();
        undertowEmbeddedServletContainerFactory0.setPort((int) (short) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean10 = undertowEmbeddedServletContainerFactory9.isPersistSession();
        undertowEmbeddedServletContainerFactory9.accessLogEnabled = false;
        io.undertow.Undertow.Builder builder14 = undertowEmbeddedServletContainerFactory9.createBuilder((int) (short) 100);
        io.undertow.servlet.api.DeploymentManager deploymentManager15 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer17 = undertowEmbeddedServletContainerFactory0.getUndertowEmbeddedServletContainer(builder14, deploymentManager15, (int) (byte) 100);
        java.io.File file18 = null;
        undertowEmbeddedServletContainerFactory0.setDocumentRoot(file18);
        org.springframework.boot.context.embedded.Ssl ssl20 = undertowEmbeddedServletContainerFactory0.getSsl();
        undertowEmbeddedServletContainerFactory0.setJspServletClassName("");
        org.springframework.core.io.ResourceLoader resourceLoader23 = null;
        undertowEmbeddedServletContainerFactory0.resourceLoader = resourceLoader23;
        undertowEmbeddedServletContainerFactory0.setJspServletClassName("hi!");
        java.net.InetAddress inetAddress27 = null;
        undertowEmbeddedServletContainerFactory0.setAddress(inetAddress27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8080 + "'", int5 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl20);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory0.setPort((int) (short) 10);
        boolean boolean3 = undertowEmbeddedServletContainerFactory0.isRegisterDefaultServlet();
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet4 = undertowEmbeddedServletContainerFactory0.getErrorPages();
        java.lang.String str5 = undertowEmbeddedServletContainerFactory0.getListenAddress();
        undertowEmbeddedServletContainerFactory0.bufferSize = 1800;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0.0.0.0" + "'", str5.equals("0.0.0.0"));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        io.undertow.Undertow.Builder builder3 = undertowEmbeddedServletContainerFactory0.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        int int5 = undertowEmbeddedServletContainerFactory0.getPort();
        java.lang.ClassLoader classLoader6 = undertowEmbeddedServletContainerFactory0.getServletClassLoader();
        undertowEmbeddedServletContainerFactory0.useForwardHeaders = false;
        java.net.InetAddress inetAddress9 = undertowEmbeddedServletContainerFactory0.getAddress();
        undertowEmbeddedServletContainerFactory0.setBuffersPerRegion((java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8080 + "'", int5 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress9);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 0);
        java.lang.Integer int5 = undertowEmbeddedServletContainerFactory2.workerThreads;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory0.setPort((int) (short) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean4 = undertowEmbeddedServletContainerFactory3.isPersistSession();
        io.undertow.Undertow.Builder builder6 = undertowEmbeddedServletContainerFactory3.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings7 = undertowEmbeddedServletContainerFactory3.getMimeMappings();
        undertowEmbeddedServletContainerFactory0.setMimeMappings(mimeMappings7);
        undertowEmbeddedServletContainerFactory0.bufferSize = 10;
        org.springframework.boot.context.embedded.JspServlet jspServlet11 = undertowEmbeddedServletContainerFactory0.getJspServlet();
        undertowEmbeddedServletContainerFactory0.useForwardHeaders = false;
        undertowEmbeddedServletContainerFactory0.setDirectBuffers((java.lang.Boolean) false);
        java.lang.Boolean boolean16 = undertowEmbeddedServletContainerFactory0.directBuffers;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16.equals(false));
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList3 = undertowEmbeddedServletContainerFactory0.builderCustomizers;
        int int4 = undertowEmbeddedServletContainerFactory0.getSessionTimeout();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory7.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory7.directBuffers = true;
        java.io.File file12 = null;
        undertowEmbeddedServletContainerFactory7.setSessionStoreDir(file12);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean15 = undertowEmbeddedServletContainerFactory14.isPersistSession();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean17 = undertowEmbeddedServletContainerFactory16.isPersistSession();
        java.io.File file18 = undertowEmbeddedServletContainerFactory16.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray19 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory16.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray19);
        org.springframework.boot.context.embedded.Ssl ssl21 = undertowEmbeddedServletContainerFactory16.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean23 = undertowEmbeddedServletContainerFactory22.isPersistSession();
        undertowEmbeddedServletContainerFactory22.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean27 = undertowEmbeddedServletContainerFactory26.isPersistSession();
        io.undertow.Undertow.Builder builder29 = undertowEmbeddedServletContainerFactory26.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager30 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer32 = undertowEmbeddedServletContainerFactory22.getUndertowEmbeddedServletContainer(builder29, deploymentManager30, (int) (byte) 1);
        io.undertow.servlet.api.DeploymentManager deploymentManager33 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer35 = undertowEmbeddedServletContainerFactory16.getUndertowEmbeddedServletContainer(builder29, deploymentManager33, (int) 'a');
        io.undertow.servlet.api.DeploymentManager deploymentManager36 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer38 = undertowEmbeddedServletContainerFactory14.getUndertowEmbeddedServletContainer(builder29, deploymentManager36, (int) '#');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory41.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file44 = null;
        undertowEmbeddedServletContainerFactory41.accessLogDirectory = file44;
        boolean boolean46 = undertowEmbeddedServletContainerFactory41.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray47 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory41.addInitializers(servletContextInitializerArray47);
        undertowEmbeddedServletContainerFactory41.setIoThreads((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory51 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean52 = undertowEmbeddedServletContainerFactory51.isPersistSession();
        java.io.File file53 = undertowEmbeddedServletContainerFactory51.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings54 = undertowEmbeddedServletContainerFactory51.getMimeMappings();
        java.lang.Integer int55 = undertowEmbeddedServletContainerFactory51.bufferSize;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer56 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray57 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer56 };
        undertowEmbeddedServletContainerFactory51.addBuilderCustomizers(undertowBuilderCustomizerArray57);
        undertowEmbeddedServletContainerFactory41.addBuilderCustomizers(undertowBuilderCustomizerArray57);
        undertowEmbeddedServletContainerFactory14.addBuilderCustomizers(undertowBuilderCustomizerArray57);
        undertowEmbeddedServletContainerFactory7.addBuilderCustomizers(undertowBuilderCustomizerArray57);
        undertowEmbeddedServletContainerFactory0.addBuilderCustomizers(undertowBuilderCustomizerArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1800 + "'", int4 == 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray57);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings3 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader4 = undertowEmbeddedServletContainerFactory0.resourceLoader;
        java.io.File file5 = null;
        undertowEmbeddedServletContainerFactory0.setSessionStoreDir(file5);
        undertowEmbeddedServletContainerFactory0.setBufferSize((java.lang.Integer) (-1));
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory0.accessLogDirectory = file9;
        java.lang.Integer int11 = undertowEmbeddedServletContainerFactory0.buffersPerRegion;
        undertowEmbeddedServletContainerFactory0.setAccessLogEnabled(false);
        java.net.InetAddress inetAddress14 = null;
        undertowEmbeddedServletContainerFactory0.setAddress(inetAddress14);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean17 = undertowEmbeddedServletContainerFactory16.isPersistSession();
        undertowEmbeddedServletContainerFactory16.accessLogEnabled = false;
        boolean boolean20 = undertowEmbeddedServletContainerFactory16.isRegisterDefaultServlet();
        java.io.File file21 = undertowEmbeddedServletContainerFactory16.getDocumentRoot();
        org.xnio.XnioWorker xnioWorker22 = undertowEmbeddedServletContainerFactory16.createWorker();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory25.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file28 = null;
        undertowEmbeddedServletContainerFactory25.accessLogDirectory = file28;
        boolean boolean30 = undertowEmbeddedServletContainerFactory25.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray31 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory25.addInitializers(servletContextInitializerArray31);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray33 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory25.addErrorPages(errorPageArray33);
        undertowEmbeddedServletContainerFactory25.useForwardHeaders = true;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory37 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean38 = undertowEmbeddedServletContainerFactory37.isPersistSession();
        java.io.File file39 = undertowEmbeddedServletContainerFactory37.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings40 = undertowEmbeddedServletContainerFactory37.getMimeMappings();
        java.lang.Integer int41 = undertowEmbeddedServletContainerFactory37.bufferSize;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer42 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray43 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer42 };
        undertowEmbeddedServletContainerFactory37.addBuilderCustomizers(undertowBuilderCustomizerArray43);
        undertowEmbeddedServletContainerFactory25.addBuilderCustomizers(undertowBuilderCustomizerArray43);
        undertowEmbeddedServletContainerFactory16.addBuilderCustomizers(undertowBuilderCustomizerArray43);
        undertowEmbeddedServletContainerFactory0.addBuilderCustomizers(undertowBuilderCustomizerArray43);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet48 = undertowEmbeddedServletContainerFactory0.getErrorPages();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(xnioWorker22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet48);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("hi!", 1800);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ContextPath must start with '/' and not end with '/'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings3 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader4 = undertowEmbeddedServletContainerFactory0.resourceLoader;
        undertowEmbeddedServletContainerFactory0.setBufferSize((java.lang.Integer) 1);
        undertowEmbeddedServletContainerFactory0.setPersistSession(false);
        java.lang.Integer int9 = undertowEmbeddedServletContainerFactory0.workerThreads;
        int int10 = undertowEmbeddedServletContainerFactory0.getPort();
        undertowEmbeddedServletContainerFactory0.setAccessLogEnabled(true);
        java.io.File file13 = undertowEmbeddedServletContainerFactory0.getSessionStoreDir();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8080 + "'", int10 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file13);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList3 = undertowEmbeddedServletContainerFactory0.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean5 = undertowEmbeddedServletContainerFactory4.isPersistSession();
        io.undertow.Undertow.Builder builder7 = undertowEmbeddedServletContainerFactory4.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager8 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer10 = undertowEmbeddedServletContainerFactory0.getUndertowEmbeddedServletContainer(builder7, deploymentManager8, (int) (byte) -1);
        undertowEmbeddedServletContainerFactory0.setSessionTimeout(100);
        io.undertow.Undertow.Builder builder14 = undertowEmbeddedServletContainerFactory0.createBuilder((int) '4');
        undertowEmbeddedServletContainerFactory0.setBufferSize((java.lang.Integer) 1);
        io.undertow.Undertow.Builder builder18 = undertowEmbeddedServletContainerFactory0.createBuilder((int) (byte) 100);
        undertowEmbeddedServletContainerFactory0.useForwardHeaders = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file5 = null;
        undertowEmbeddedServletContainerFactory2.accessLogDirectory = file5;
        undertowEmbeddedServletContainerFactory2.setPersistSession(true);
        org.springframework.boot.context.embedded.Compression compression9 = null;
        undertowEmbeddedServletContainerFactory2.setCompression(compression9);
        java.lang.Integer int11 = undertowEmbeddedServletContainerFactory2.buffersPerRegion;
        undertowEmbeddedServletContainerFactory2.ioThreads = 1800;
        java.io.File file14 = null;
        undertowEmbeddedServletContainerFactory2.accessLogDirectory = file14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11.equals(0));
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        undertowEmbeddedServletContainerFactory0.setPersistSession(false);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory0.setSessionStoreDir(file4);
        org.springframework.boot.context.embedded.Ssl ssl6 = null;
        undertowEmbeddedServletContainerFactory0.setSsl(ssl6);
        undertowEmbeddedServletContainerFactory0.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory((int) '#');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean13 = undertowEmbeddedServletContainerFactory12.isPersistSession();
        org.springframework.boot.context.embedded.JspServlet jspServlet14 = undertowEmbeddedServletContainerFactory12.getJspServlet();
        boolean boolean15 = undertowEmbeddedServletContainerFactory12.isRegisterDefaultServlet();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection16 = undertowEmbeddedServletContainerFactory12.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer17 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean19 = undertowEmbeddedServletContainerFactory18.isPersistSession();
        java.io.File file20 = undertowEmbeddedServletContainerFactory18.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings21 = undertowEmbeddedServletContainerFactory18.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader22 = undertowEmbeddedServletContainerFactory18.resourceLoader;
        java.io.File file23 = null;
        undertowEmbeddedServletContainerFactory18.setSessionStoreDir(file23);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo25 = null;
        undertowEmbeddedServletContainerFactory18.configureErrorPages(deploymentInfo25);
        org.springframework.boot.context.embedded.ServletContextInitializer servletContextInitializer27 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray28 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { servletContextInitializer27 };
        undertowEmbeddedServletContainerFactory18.addInitializers(servletContextInitializerArray28);
        initializer17.initializers = servletContextInitializerArray28;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray31 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        initializer17.initializers = servletContextInitializerArray31;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer33 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory34 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean35 = undertowEmbeddedServletContainerFactory34.isPersistSession();
        java.io.File file36 = undertowEmbeddedServletContainerFactory34.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings37 = undertowEmbeddedServletContainerFactory34.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader38 = undertowEmbeddedServletContainerFactory34.resourceLoader;
        java.io.File file39 = null;
        undertowEmbeddedServletContainerFactory34.setSessionStoreDir(file39);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo41 = null;
        undertowEmbeddedServletContainerFactory34.configureErrorPages(deploymentInfo41);
        org.springframework.boot.context.embedded.ServletContextInitializer servletContextInitializer43 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray44 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { servletContextInitializer43 };
        undertowEmbeddedServletContainerFactory34.addInitializers(servletContextInitializerArray44);
        initializer33.initializers = servletContextInitializerArray44;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray47 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        initializer33.initializers = servletContextInitializerArray47;
        initializer17.initializers = servletContextInitializerArray47;
        io.undertow.servlet.api.DeploymentManager deploymentManager50 = undertowEmbeddedServletContainerFactory12.createDeploymentManager(servletContextInitializerArray47);
        java.lang.Integer int51 = undertowEmbeddedServletContainerFactory12.workerThreads;
        java.lang.String str52 = undertowEmbeddedServletContainerFactory12.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory53 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean54 = undertowEmbeddedServletContainerFactory53.isPersistSession();
        java.io.File file55 = undertowEmbeddedServletContainerFactory53.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList56 = undertowEmbeddedServletContainerFactory53.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory57 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean58 = undertowEmbeddedServletContainerFactory57.isPersistSession();
        io.undertow.Undertow.Builder builder60 = undertowEmbeddedServletContainerFactory57.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager61 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer63 = undertowEmbeddedServletContainerFactory53.getUndertowEmbeddedServletContainer(builder60, deploymentManager61, (int) (byte) -1);
        undertowEmbeddedServletContainerFactory53.setSessionTimeout(100);
        io.undertow.Undertow.Builder builder67 = undertowEmbeddedServletContainerFactory53.createBuilder((int) '4');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory68 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean69 = undertowEmbeddedServletContainerFactory68.isPersistSession();
        java.io.File file70 = undertowEmbeddedServletContainerFactory68.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList71 = undertowEmbeddedServletContainerFactory68.builderCustomizers;
        undertowEmbeddedServletContainerFactory68.setDisplayName("hi!");
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray74 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory68.addErrorPages(errorPageArray74);
        undertowEmbeddedServletContainerFactory53.addErrorPages(errorPageArray74);
        undertowEmbeddedServletContainerFactory12.addErrorPages(errorPageArray74);
        undertowEmbeddedServletContainerFactory11.addErrorPages(errorPageArray74);
        undertowEmbeddedServletContainerFactory0.addErrorPages(errorPageArray74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(deploymentManager50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray74);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        io.undertow.Undertow.Builder builder3 = undertowEmbeddedServletContainerFactory0.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory7.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory7.accessLogDirectory = file10;
        boolean boolean12 = undertowEmbeddedServletContainerFactory7.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean14 = undertowEmbeddedServletContainerFactory13.isPersistSession();
        java.io.File file15 = undertowEmbeddedServletContainerFactory13.accessLogDirectory;
        boolean boolean16 = undertowEmbeddedServletContainerFactory13.useForwardHeaders;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray17 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList18 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList18, undertowDeploymentInfoCustomizerArray17);
        undertowEmbeddedServletContainerFactory13.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList18;
        undertowEmbeddedServletContainerFactory7.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList18;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray22 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList23 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList23, undertowBuilderCustomizerArray22);
        undertowEmbeddedServletContainerFactory7.setBuilderCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList23);
        undertowEmbeddedServletContainerFactory0.builderCustomizers = undertowBuilderCustomizerList23;
        undertowEmbeddedServletContainerFactory0.setUseForwardHeaders(true);
        undertowEmbeddedServletContainerFactory0.accessLogEnabled = false;
        boolean boolean31 = undertowEmbeddedServletContainerFactory0.accessLogEnabled;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean33 = undertowEmbeddedServletContainerFactory32.isPersistSession();
        java.io.File file34 = undertowEmbeddedServletContainerFactory32.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings35 = undertowEmbeddedServletContainerFactory32.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader36 = undertowEmbeddedServletContainerFactory32.resourceLoader;
        undertowEmbeddedServletContainerFactory32.setBufferSize((java.lang.Integer) 1);
        boolean boolean39 = undertowEmbeddedServletContainerFactory32.useForwardHeaders;
        java.lang.Integer int40 = undertowEmbeddedServletContainerFactory32.ioThreads;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray41 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList42 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList42, undertowBuilderCustomizerArray41);
        undertowEmbeddedServletContainerFactory32.setBuilderCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList42);
        undertowEmbeddedServletContainerFactory0.builderCustomizers = undertowBuilderCustomizerList42;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings3 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader4 = undertowEmbeddedServletContainerFactory0.resourceLoader;
        boolean boolean5 = undertowEmbeddedServletContainerFactory0.isRegisterDefaultServlet();
        java.lang.ClassLoader classLoader6 = undertowEmbeddedServletContainerFactory0.getServletClassLoader();
        undertowEmbeddedServletContainerFactory0.directBuffers = false;
        boolean boolean9 = undertowEmbeddedServletContainerFactory0.isRegisterDefaultServlet();
        java.net.InetAddress inetAddress10 = undertowEmbeddedServletContainerFactory0.getAddress();
        undertowEmbeddedServletContainerFactory0.useForwardHeaders = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress10);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file5 = null;
        undertowEmbeddedServletContainerFactory2.accessLogDirectory = file5;
        boolean boolean7 = undertowEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean9 = undertowEmbeddedServletContainerFactory8.isPersistSession();
        java.io.File file10 = undertowEmbeddedServletContainerFactory8.accessLogDirectory;
        boolean boolean11 = undertowEmbeddedServletContainerFactory8.useForwardHeaders;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray12 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList13 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList13, undertowDeploymentInfoCustomizerArray12);
        undertowEmbeddedServletContainerFactory8.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList13;
        undertowEmbeddedServletContainerFactory2.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList13;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray17 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList18 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList18, undertowBuilderCustomizerArray17);
        undertowEmbeddedServletContainerFactory2.setBuilderCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList18);
        org.springframework.boot.context.embedded.Compression compression21 = null;
        undertowEmbeddedServletContainerFactory2.setCompression(compression21);
        undertowEmbeddedServletContainerFactory2.setSessionTimeout(0);
        undertowEmbeddedServletContainerFactory2.setIoThreads((java.lang.Integer) 100);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean28 = undertowEmbeddedServletContainerFactory27.isPersistSession();
        undertowEmbeddedServletContainerFactory27.setPersistSession(false);
        undertowEmbeddedServletContainerFactory27.accessLogEnabled = false;
        boolean boolean33 = undertowEmbeddedServletContainerFactory27.accessLogEnabled;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList34 = undertowEmbeddedServletContainerFactory27.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory2.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList34;
        java.lang.Integer int36 = undertowEmbeddedServletContainerFactory2.bufferSize;
        undertowEmbeddedServletContainerFactory2.accessLogPattern = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int36);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isRegisterDefaultServlet();
        org.springframework.core.io.ResourceLoader resourceLoader2 = undertowEmbeddedServletContainerFactory0.resourceLoader;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory5.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory5.directBuffers = true;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings10 = undertowEmbeddedServletContainerFactory5.getMimeMappings();
        java.lang.String str11 = undertowEmbeddedServletContainerFactory5.accessLogPattern;
        undertowEmbeddedServletContainerFactory5.workerThreads = 10;
        org.springframework.core.io.ResourceLoader resourceLoader14 = null;
        undertowEmbeddedServletContainerFactory5.setResourceLoader(resourceLoader14);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory18 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory18.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory18.directBuffers = true;
        io.undertow.servlet.api.DeploymentInfo deploymentInfo23 = null;
        undertowEmbeddedServletContainerFactory18.configureErrorPages(deploymentInfo23);
        java.io.File file25 = undertowEmbeddedServletContainerFactory18.getSessionStoreDir();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory28.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory28.directBuffers = true;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings33 = undertowEmbeddedServletContainerFactory28.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader34 = null;
        undertowEmbeddedServletContainerFactory28.setResourceLoader(resourceLoader34);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection36 = undertowEmbeddedServletContainerFactory28.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory18.setBuilderCustomizers(undertowBuilderCustomizerCollection36);
        java.io.File file38 = null;
        undertowEmbeddedServletContainerFactory18.setDocumentRoot(file38);
        undertowEmbeddedServletContainerFactory18.setAccessLogEnabled(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean43 = undertowEmbeddedServletContainerFactory42.isPersistSession();
        java.io.File file44 = undertowEmbeddedServletContainerFactory42.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings45 = undertowEmbeddedServletContainerFactory42.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader46 = undertowEmbeddedServletContainerFactory42.resourceLoader;
        undertowEmbeddedServletContainerFactory42.setBufferSize((java.lang.Integer) 1);
        boolean boolean49 = undertowEmbeddedServletContainerFactory42.useForwardHeaders;
        java.lang.ClassLoader classLoader50 = undertowEmbeddedServletContainerFactory42.getServletClassLoader();
        java.lang.Boolean boolean51 = undertowEmbeddedServletContainerFactory42.directBuffers;
        undertowEmbeddedServletContainerFactory42.setRegisterJspServlet(false);
        java.io.File file54 = null;
        undertowEmbeddedServletContainerFactory42.setSessionStoreDir(file54);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory56 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean57 = undertowEmbeddedServletContainerFactory56.isPersistSession();
        undertowEmbeddedServletContainerFactory56.setPersistSession(false);
        undertowEmbeddedServletContainerFactory56.accessLogEnabled = false;
        undertowEmbeddedServletContainerFactory56.accessLogEnabled = true;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory64 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean65 = undertowEmbeddedServletContainerFactory64.isPersistSession();
        java.io.File file66 = undertowEmbeddedServletContainerFactory64.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray67 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory64.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray67);
        undertowEmbeddedServletContainerFactory56.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray67);
        undertowEmbeddedServletContainerFactory42.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray67);
        undertowEmbeddedServletContainerFactory18.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray67);
        undertowEmbeddedServletContainerFactory5.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray67);
        undertowEmbeddedServletContainerFactory0.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray67);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo74 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory0.configureMimeMappings(deploymentInfo74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray67);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory0.setIoThreads((java.lang.Integer) 1);
        undertowEmbeddedServletContainerFactory0.accessLogEnabled = true;
        undertowEmbeddedServletContainerFactory0.directBuffers = false;
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory0.setPort((int) (short) 10);
        boolean boolean3 = undertowEmbeddedServletContainerFactory0.isRegisterDefaultServlet();
        undertowEmbeddedServletContainerFactory0.ioThreads = 1;
        java.lang.Integer int6 = undertowEmbeddedServletContainerFactory0.workerThreads;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager();
        java.lang.String str1 = jarResourceManager0.jarPath;
        jarResourceManager0.close();
        boolean boolean3 = jarResourceManager0.isResourceChangeListenerSupported();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        io.undertow.Undertow.Builder builder3 = undertowEmbeddedServletContainerFactory0.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        int int5 = undertowEmbeddedServletContainerFactory0.getPort();
        java.lang.ClassLoader classLoader6 = undertowEmbeddedServletContainerFactory0.getServletClassLoader();
        undertowEmbeddedServletContainerFactory0.setPort((int) (short) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean10 = undertowEmbeddedServletContainerFactory9.isPersistSession();
        undertowEmbeddedServletContainerFactory9.accessLogEnabled = false;
        io.undertow.Undertow.Builder builder14 = undertowEmbeddedServletContainerFactory9.createBuilder((int) (short) 100);
        io.undertow.servlet.api.DeploymentManager deploymentManager15 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer17 = undertowEmbeddedServletContainerFactory0.getUndertowEmbeddedServletContainer(builder14, deploymentManager15, (int) (byte) 100);
        java.io.File file18 = null;
        undertowEmbeddedServletContainerFactory0.setDocumentRoot(file18);
        org.springframework.boot.context.embedded.Ssl ssl20 = undertowEmbeddedServletContainerFactory0.getSsl();
        undertowEmbeddedServletContainerFactory0.setJspServletClassName("");
        org.springframework.core.io.ResourceLoader resourceLoader23 = null;
        undertowEmbeddedServletContainerFactory0.resourceLoader = resourceLoader23;
        undertowEmbeddedServletContainerFactory0.setJspServletClassName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray28 = initializer27.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray29 = initializer27.initializers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean32 = undertowEmbeddedServletContainerFactory31.isPersistSession();
        java.io.File file33 = undertowEmbeddedServletContainerFactory31.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings34 = undertowEmbeddedServletContainerFactory31.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader35 = undertowEmbeddedServletContainerFactory31.resourceLoader;
        java.io.File file36 = null;
        undertowEmbeddedServletContainerFactory31.setSessionStoreDir(file36);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo38 = null;
        undertowEmbeddedServletContainerFactory31.configureErrorPages(deploymentInfo38);
        org.springframework.boot.context.embedded.ServletContextInitializer servletContextInitializer40 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray41 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { servletContextInitializer40 };
        undertowEmbeddedServletContainerFactory31.addInitializers(servletContextInitializerArray41);
        initializer30.initializers = servletContextInitializerArray41;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray44 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        initializer30.initializers = servletContextInitializerArray44;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer46 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean48 = undertowEmbeddedServletContainerFactory47.isPersistSession();
        java.io.File file49 = undertowEmbeddedServletContainerFactory47.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings50 = undertowEmbeddedServletContainerFactory47.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader51 = undertowEmbeddedServletContainerFactory47.resourceLoader;
        java.io.File file52 = null;
        undertowEmbeddedServletContainerFactory47.setSessionStoreDir(file52);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo54 = null;
        undertowEmbeddedServletContainerFactory47.configureErrorPages(deploymentInfo54);
        org.springframework.boot.context.embedded.ServletContextInitializer servletContextInitializer56 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray57 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { servletContextInitializer56 };
        undertowEmbeddedServletContainerFactory47.addInitializers(servletContextInitializerArray57);
        initializer46.initializers = servletContextInitializerArray57;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray60 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        initializer46.initializers = servletContextInitializerArray60;
        initializer30.initializers = servletContextInitializerArray60;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray63 = initializer30.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray64 = initializer30.initializers;
        initializer27.initializers = servletContextInitializerArray64;
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer66 = undertowEmbeddedServletContainerFactory0.getEmbeddedServletContainer(servletContextInitializerArray64);
        org.springframework.boot.context.embedded.JspServlet jspServlet67 = undertowEmbeddedServletContainerFactory0.getJspServlet();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo68 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory0.configureMimeMappings(deploymentInfo68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8080 + "'", int5 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(servletContextInitializerArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(servletContextInitializerArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet67);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings3 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader4 = undertowEmbeddedServletContainerFactory0.resourceLoader;
        java.io.File file5 = null;
        undertowEmbeddedServletContainerFactory0.setSessionStoreDir(file5);
        undertowEmbeddedServletContainerFactory0.setBufferSize((java.lang.Integer) (-1));
        java.io.File file9 = null;
        undertowEmbeddedServletContainerFactory0.accessLogDirectory = file9;
        undertowEmbeddedServletContainerFactory0.buffersPerRegion = 0;
        org.xnio.XnioWorker xnioWorker13 = undertowEmbeddedServletContainerFactory0.createWorker();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList14 = undertowEmbeddedServletContainerFactory0.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory0.useForwardHeaders = true;
        io.undertow.server.handlers.resource.ResourceManager resourceManager17 = undertowEmbeddedServletContainerFactory0.getDocumentRootResourceManager();
        io.undertow.server.handlers.resource.ResourceManager resourceManager18 = undertowEmbeddedServletContainerFactory0.getDocumentRootResourceManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(xnioWorker13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(resourceManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(resourceManager18);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        io.undertow.Undertow.Builder builder3 = undertowEmbeddedServletContainerFactory0.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        int int5 = undertowEmbeddedServletContainerFactory0.getPort();
        undertowEmbeddedServletContainerFactory0.setIoThreads((java.lang.Integer) 100);
        undertowEmbeddedServletContainerFactory0.setPersistSession(true);
        java.io.File file10 = undertowEmbeddedServletContainerFactory0.getSessionStoreDir();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo11 = null;
        undertowEmbeddedServletContainerFactory0.configureErrorPages(deploymentInfo11);
        java.lang.String str13 = undertowEmbeddedServletContainerFactory0.getContextPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8080 + "'", int5 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file5 = null;
        undertowEmbeddedServletContainerFactory2.accessLogDirectory = file5;
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 10);
        java.lang.Integer int9 = undertowEmbeddedServletContainerFactory2.ioThreads;
        undertowEmbeddedServletContainerFactory2.buffersPerRegion = 8080;
        boolean boolean12 = undertowEmbeddedServletContainerFactory2.isPersistSession();
        undertowEmbeddedServletContainerFactory2.setRegisterDefaultServlet(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        io.undertow.Undertow.Builder builder3 = undertowEmbeddedServletContainerFactory0.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        int int5 = undertowEmbeddedServletContainerFactory0.getPort();
        java.lang.ClassLoader classLoader6 = undertowEmbeddedServletContainerFactory0.getServletClassLoader();
        undertowEmbeddedServletContainerFactory0.useForwardHeaders = false;
        undertowEmbeddedServletContainerFactory0.setDisplayName("");
        java.lang.Boolean boolean11 = undertowEmbeddedServletContainerFactory0.directBuffers;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet12 = undertowEmbeddedServletContainerFactory0.getErrorPages();
        java.net.InetAddress inetAddress13 = undertowEmbeddedServletContainerFactory0.getAddress();
        io.undertow.server.handlers.resource.ResourceManager resourceManager14 = undertowEmbeddedServletContainerFactory0.getDocumentRootResourceManager();
        undertowEmbeddedServletContainerFactory0.setRegisterJspServlet(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8080 + "'", int5 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(resourceManager14);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager();
        java.lang.String str1 = jarResourceManager0.jarPath;
        boolean boolean2 = jarResourceManager0.isResourceChangeListenerSupported();
        jarResourceManager0.close();
        jarResourceManager0.close();
        jarResourceManager0.close();
        boolean boolean6 = jarResourceManager0.isResourceChangeListenerSupported();
        java.lang.String str7 = jarResourceManager0.jarPath;
        jarResourceManager0.close();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList3 = undertowEmbeddedServletContainerFactory0.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean5 = undertowEmbeddedServletContainerFactory4.isPersistSession();
        io.undertow.Undertow.Builder builder7 = undertowEmbeddedServletContainerFactory4.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager8 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer10 = undertowEmbeddedServletContainerFactory0.getUndertowEmbeddedServletContainer(builder7, deploymentManager8, (int) (byte) -1);
        undertowEmbeddedServletContainerFactory0.setSessionTimeout(100);
        undertowEmbeddedServletContainerFactory0.setAccessLogEnabled(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean16 = undertowEmbeddedServletContainerFactory15.isPersistSession();
        io.undertow.Undertow.Builder builder18 = undertowEmbeddedServletContainerFactory15.createBuilder((int) (short) 0);
        undertowEmbeddedServletContainerFactory15.useForwardHeaders = false;
        undertowEmbeddedServletContainerFactory15.directBuffers = false;
        undertowEmbeddedServletContainerFactory15.setRegisterDefaultServlet(false);
        org.xnio.XnioWorker xnioWorker25 = undertowEmbeddedServletContainerFactory15.createWorker();
        org.springframework.core.io.ResourceLoader resourceLoader26 = null;
        undertowEmbeddedServletContainerFactory15.setResourceLoader(resourceLoader26);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean29 = undertowEmbeddedServletContainerFactory28.isPersistSession();
        io.undertow.Undertow.Builder builder31 = undertowEmbeddedServletContainerFactory28.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings32 = undertowEmbeddedServletContainerFactory28.getMimeMappings();
        int int33 = undertowEmbeddedServletContainerFactory28.getPort();
        java.lang.ClassLoader classLoader34 = undertowEmbeddedServletContainerFactory28.getServletClassLoader();
        undertowEmbeddedServletContainerFactory28.useForwardHeaders = false;
        undertowEmbeddedServletContainerFactory28.setDisplayName("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean40 = undertowEmbeddedServletContainerFactory39.isPersistSession();
        java.io.File file41 = undertowEmbeddedServletContainerFactory39.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings42 = undertowEmbeddedServletContainerFactory39.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader43 = undertowEmbeddedServletContainerFactory39.resourceLoader;
        undertowEmbeddedServletContainerFactory39.setBufferSize((java.lang.Integer) 1);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList46 = undertowEmbeddedServletContainerFactory39.builderCustomizers;
        undertowEmbeddedServletContainerFactory28.builderCustomizers = undertowBuilderCustomizerList46;
        undertowEmbeddedServletContainerFactory15.setBuilderCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList46);
        undertowEmbeddedServletContainerFactory15.bufferSize = 10;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory51 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean52 = undertowEmbeddedServletContainerFactory51.isPersistSession();
        java.io.File file53 = undertowEmbeddedServletContainerFactory51.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList54 = undertowEmbeddedServletContainerFactory51.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean56 = undertowEmbeddedServletContainerFactory55.isPersistSession();
        io.undertow.Undertow.Builder builder58 = undertowEmbeddedServletContainerFactory55.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager59 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer61 = undertowEmbeddedServletContainerFactory51.getUndertowEmbeddedServletContainer(builder58, deploymentManager59, (int) (byte) -1);
        undertowEmbeddedServletContainerFactory51.setSessionTimeout(100);
        io.undertow.Undertow.Builder builder65 = undertowEmbeddedServletContainerFactory51.createBuilder((int) '4');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory66 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean67 = undertowEmbeddedServletContainerFactory66.isPersistSession();
        java.io.File file68 = undertowEmbeddedServletContainerFactory66.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList69 = undertowEmbeddedServletContainerFactory66.builderCustomizers;
        undertowEmbeddedServletContainerFactory66.setDisplayName("hi!");
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray72 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory66.addErrorPages(errorPageArray72);
        undertowEmbeddedServletContainerFactory51.addErrorPages(errorPageArray72);
        undertowEmbeddedServletContainerFactory15.addErrorPages(errorPageArray72);
        undertowEmbeddedServletContainerFactory0.addErrorPages(errorPageArray72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(xnioWorker25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8080 + "'", int33 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray72);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings3 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader4 = undertowEmbeddedServletContainerFactory0.resourceLoader;
        java.io.File file5 = null;
        undertowEmbeddedServletContainerFactory0.setSessionStoreDir(file5);
        boolean boolean7 = undertowEmbeddedServletContainerFactory0.useForwardHeaders;
        org.springframework.boot.context.embedded.Ssl ssl8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.xnio.SslClientAuthMode sslClientAuthMode9 = undertowEmbeddedServletContainerFactory0.getSslClientAuthMode(ssl8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager();
        jarResourceManager0.close();
        jarResourceManager0.jarPath = "0.0.0.0";
        java.lang.String str4 = jarResourceManager0.jarPath;
        jarResourceManager0.jarPath = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0.0.0" + "'", str4.equals("0.0.0.0"));
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        undertowEmbeddedServletContainerFactory0.setPersistSession(false);
        undertowEmbeddedServletContainerFactory0.accessLogEnabled = false;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet6 = undertowEmbeddedServletContainerFactory0.getErrorPages();
        java.lang.Integer int7 = undertowEmbeddedServletContainerFactory0.workerThreads;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet8 = undertowEmbeddedServletContainerFactory0.getErrorPages();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory11 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        java.net.InetAddress inetAddress12 = undertowEmbeddedServletContainerFactory11.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean14 = undertowEmbeddedServletContainerFactory13.isPersistSession();
        java.io.File file15 = undertowEmbeddedServletContainerFactory13.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings16 = undertowEmbeddedServletContainerFactory13.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader17 = undertowEmbeddedServletContainerFactory13.resourceLoader;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet18 = undertowEmbeddedServletContainerFactory13.getErrorPages();
        undertowEmbeddedServletContainerFactory11.setErrorPages(errorPageSet18);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory20 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean21 = undertowEmbeddedServletContainerFactory20.isPersistSession();
        java.io.File file22 = undertowEmbeddedServletContainerFactory20.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings23 = undertowEmbeddedServletContainerFactory20.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader24 = undertowEmbeddedServletContainerFactory20.resourceLoader;
        java.io.File file25 = null;
        undertowEmbeddedServletContainerFactory20.setSessionStoreDir(file25);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo27 = null;
        undertowEmbeddedServletContainerFactory20.configureErrorPages(deploymentInfo27);
        undertowEmbeddedServletContainerFactory20.setRegisterDefaultServlet(false);
        boolean boolean31 = undertowEmbeddedServletContainerFactory20.isPersistSession();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean33 = undertowEmbeddedServletContainerFactory32.isPersistSession();
        undertowEmbeddedServletContainerFactory32.accessLogEnabled = false;
        boolean boolean36 = undertowEmbeddedServletContainerFactory32.isRegisterDefaultServlet();
        java.io.File file37 = undertowEmbeddedServletContainerFactory32.getDocumentRoot();
        undertowEmbeddedServletContainerFactory32.setAccessLogPattern("");
        org.springframework.boot.context.embedded.JspServlet jspServlet40 = undertowEmbeddedServletContainerFactory32.getJspServlet();
        undertowEmbeddedServletContainerFactory20.setJspServlet(jspServlet40);
        undertowEmbeddedServletContainerFactory11.setJspServlet(jspServlet40);
        undertowEmbeddedServletContainerFactory0.setJspServlet(jspServlet40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet40);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        undertowEmbeddedServletContainerFactory0.accessLogEnabled = false;
        undertowEmbeddedServletContainerFactory0.setSessionTimeout((int) (short) 0);
        java.lang.String str6 = undertowEmbeddedServletContainerFactory0.getDisplayName();
        undertowEmbeddedServletContainerFactory0.setPort((int) (byte) 0);
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory0.setSessionTimeout((int) (byte) 10, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: TimeUnit must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList3 = undertowEmbeddedServletContainerFactory0.builderCustomizers;
        undertowEmbeddedServletContainerFactory0.setDisplayName("hi!");
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory0.addErrorPages(errorPageArray6);
        java.net.InetAddress inetAddress8 = undertowEmbeddedServletContainerFactory0.getAddress();
        undertowEmbeddedServletContainerFactory0.ioThreads = 0;
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        undertowEmbeddedServletContainerFactory0.setResourceLoader(resourceLoader11);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList13 = undertowEmbeddedServletContainerFactory0.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean15 = undertowEmbeddedServletContainerFactory14.isPersistSession();
        org.springframework.boot.context.embedded.JspServlet jspServlet16 = undertowEmbeddedServletContainerFactory14.getJspServlet();
        boolean boolean17 = undertowEmbeddedServletContainerFactory14.isRegisterDefaultServlet();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection18 = undertowEmbeddedServletContainerFactory14.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory21.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory21.directBuffers = true;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings26 = undertowEmbeddedServletContainerFactory21.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader27 = null;
        undertowEmbeddedServletContainerFactory21.setResourceLoader(resourceLoader27);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection29 = undertowEmbeddedServletContainerFactory21.getBuilderCustomizers();
        java.lang.Integer int30 = undertowEmbeddedServletContainerFactory21.bufferSize;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory31 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean32 = undertowEmbeddedServletContainerFactory31.isPersistSession();
        java.io.File file33 = undertowEmbeddedServletContainerFactory31.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList34 = undertowEmbeddedServletContainerFactory31.builderCustomizers;
        undertowEmbeddedServletContainerFactory31.setDisplayName("hi!");
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray37 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory31.addErrorPages(errorPageArray37);
        undertowEmbeddedServletContainerFactory31.setWorkerThreads((java.lang.Integer) 8080);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList41 = undertowEmbeddedServletContainerFactory31.builderCustomizers;
        undertowEmbeddedServletContainerFactory21.setBuilderCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList41);
        undertowEmbeddedServletContainerFactory14.setBuilderCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList41);
        undertowEmbeddedServletContainerFactory0.builderCustomizers = undertowBuilderCustomizerList41;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList41);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean3 = undertowEmbeddedServletContainerFactory2.isPersistSession();
        java.io.File file4 = undertowEmbeddedServletContainerFactory2.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray5 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory2.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray5);
        org.springframework.boot.context.embedded.Ssl ssl7 = undertowEmbeddedServletContainerFactory2.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean9 = undertowEmbeddedServletContainerFactory8.isPersistSession();
        undertowEmbeddedServletContainerFactory8.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean13 = undertowEmbeddedServletContainerFactory12.isPersistSession();
        io.undertow.Undertow.Builder builder15 = undertowEmbeddedServletContainerFactory12.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager16 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer18 = undertowEmbeddedServletContainerFactory8.getUndertowEmbeddedServletContainer(builder15, deploymentManager16, (int) (byte) 1);
        io.undertow.servlet.api.DeploymentManager deploymentManager19 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer21 = undertowEmbeddedServletContainerFactory2.getUndertowEmbeddedServletContainer(builder15, deploymentManager19, (int) 'a');
        io.undertow.servlet.api.DeploymentManager deploymentManager22 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer24 = undertowEmbeddedServletContainerFactory0.getUndertowEmbeddedServletContainer(builder15, deploymentManager22, (int) '#');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        java.net.InetAddress inetAddress28 = undertowEmbeddedServletContainerFactory27.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean30 = undertowEmbeddedServletContainerFactory29.isPersistSession();
        java.io.File file31 = undertowEmbeddedServletContainerFactory29.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings32 = undertowEmbeddedServletContainerFactory29.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader33 = undertowEmbeddedServletContainerFactory29.resourceLoader;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet34 = undertowEmbeddedServletContainerFactory29.getErrorPages();
        undertowEmbeddedServletContainerFactory27.setErrorPages(errorPageSet34);
        undertowEmbeddedServletContainerFactory0.setErrorPages(errorPageSet34);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet37 = undertowEmbeddedServletContainerFactory0.getErrorPages();
        java.lang.ClassLoader classLoader38 = undertowEmbeddedServletContainerFactory0.getServletClassLoader();
        java.lang.ClassLoader classLoader39 = undertowEmbeddedServletContainerFactory0.getServletClassLoader();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader39);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean3 = undertowEmbeddedServletContainerFactory2.isPersistSession();
        java.io.File file4 = undertowEmbeddedServletContainerFactory2.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray5 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory2.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray5);
        org.springframework.boot.context.embedded.Ssl ssl7 = undertowEmbeddedServletContainerFactory2.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean9 = undertowEmbeddedServletContainerFactory8.isPersistSession();
        undertowEmbeddedServletContainerFactory8.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean13 = undertowEmbeddedServletContainerFactory12.isPersistSession();
        io.undertow.Undertow.Builder builder15 = undertowEmbeddedServletContainerFactory12.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager16 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer18 = undertowEmbeddedServletContainerFactory8.getUndertowEmbeddedServletContainer(builder15, deploymentManager16, (int) (byte) 1);
        io.undertow.servlet.api.DeploymentManager deploymentManager19 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer21 = undertowEmbeddedServletContainerFactory2.getUndertowEmbeddedServletContainer(builder15, deploymentManager19, (int) 'a');
        io.undertow.servlet.api.DeploymentManager deploymentManager22 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer24 = undertowEmbeddedServletContainerFactory0.getUndertowEmbeddedServletContainer(builder15, deploymentManager22, (int) '#');
        java.io.File file25 = null;
        undertowEmbeddedServletContainerFactory0.accessLogDirectory = file25;
        org.springframework.boot.context.embedded.Ssl ssl27 = undertowEmbeddedServletContainerFactory0.getSsl();
        boolean boolean28 = undertowEmbeddedServletContainerFactory0.isRegisterDefaultServlet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        undertowEmbeddedServletContainerFactory0.setPersistSession(false);
        java.io.File file4 = null;
        undertowEmbeddedServletContainerFactory0.setSessionStoreDir(file4);
        org.springframework.boot.context.embedded.Ssl ssl6 = null;
        undertowEmbeddedServletContainerFactory0.setSsl(ssl6);
        java.lang.ClassLoader classLoader8 = undertowEmbeddedServletContainerFactory0.getServletClassLoader();
        undertowEmbeddedServletContainerFactory0.setBufferSize((java.lang.Integer) 0);
        java.lang.String str11 = undertowEmbeddedServletContainerFactory0.getDisplayName();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean13 = undertowEmbeddedServletContainerFactory12.isPersistSession();
        java.io.File file14 = undertowEmbeddedServletContainerFactory12.accessLogDirectory;
        boolean boolean15 = undertowEmbeddedServletContainerFactory12.useForwardHeaders;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray16 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList17 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList17, undertowDeploymentInfoCustomizerArray16);
        undertowEmbeddedServletContainerFactory12.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList17;
        undertowEmbeddedServletContainerFactory0.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList17;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean22 = undertowEmbeddedServletContainerFactory21.isPersistSession();
        java.io.File file23 = undertowEmbeddedServletContainerFactory21.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList24 = undertowEmbeddedServletContainerFactory21.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean26 = undertowEmbeddedServletContainerFactory25.isPersistSession();
        io.undertow.Undertow.Builder builder28 = undertowEmbeddedServletContainerFactory25.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager29 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer31 = undertowEmbeddedServletContainerFactory21.getUndertowEmbeddedServletContainer(builder28, deploymentManager29, (int) (byte) -1);
        undertowEmbeddedServletContainerFactory21.setSessionTimeout(100);
        io.undertow.Undertow.Builder builder35 = undertowEmbeddedServletContainerFactory21.createBuilder((int) '4');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean37 = undertowEmbeddedServletContainerFactory36.isPersistSession();
        java.io.File file38 = undertowEmbeddedServletContainerFactory36.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList39 = undertowEmbeddedServletContainerFactory36.builderCustomizers;
        undertowEmbeddedServletContainerFactory36.setDisplayName("hi!");
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray42 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory36.addErrorPages(errorPageArray42);
        undertowEmbeddedServletContainerFactory21.addErrorPages(errorPageArray42);
        undertowEmbeddedServletContainerFactory0.addErrorPages(errorPageArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray42);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList3 = undertowEmbeddedServletContainerFactory0.builderCustomizers;
        undertowEmbeddedServletContainerFactory0.setDisplayName("hi!");
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory0.addErrorPages(errorPageArray6);
        java.net.InetAddress inetAddress8 = undertowEmbeddedServletContainerFactory0.getAddress();
        undertowEmbeddedServletContainerFactory0.ioThreads = 0;
        undertowEmbeddedServletContainerFactory0.setDisplayName("hi!");
        undertowEmbeddedServletContainerFactory0.setJspServletClassName("");
        java.lang.String str15 = undertowEmbeddedServletContainerFactory0.getDisplayName();
        org.springframework.boot.context.embedded.Ssl ssl16 = undertowEmbeddedServletContainerFactory0.getSsl();
        org.springframework.boot.context.embedded.ErrorPage errorPage17 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.servlet.api.ErrorPage errorPage18 = undertowEmbeddedServletContainerFactory0.getUndertowErrorPage(errorPage17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl16);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        undertowEmbeddedServletContainerFactory0.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean5 = undertowEmbeddedServletContainerFactory4.isPersistSession();
        io.undertow.Undertow.Builder builder7 = undertowEmbeddedServletContainerFactory4.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager8 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer10 = undertowEmbeddedServletContainerFactory0.getUndertowEmbeddedServletContainer(builder7, deploymentManager8, (int) (byte) 1);
        undertowEmbeddedServletContainerFactory0.setRegisterJspServlet(true);
        undertowEmbeddedServletContainerFactory0.ioThreads = 1800;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet15 = undertowEmbeddedServletContainerFactory0.getErrorPages();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet15);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray3 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory0.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray3);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean6 = undertowEmbeddedServletContainerFactory5.isPersistSession();
        java.io.File file7 = undertowEmbeddedServletContainerFactory5.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings8 = undertowEmbeddedServletContainerFactory5.getMimeMappings();
        undertowEmbeddedServletContainerFactory0.setMimeMappings(mimeMappings8);
        org.springframework.boot.context.embedded.Compression compression10 = undertowEmbeddedServletContainerFactory0.getCompression();
        undertowEmbeddedServletContainerFactory0.setBufferSize((java.lang.Integer) (-1));
        undertowEmbeddedServletContainerFactory0.setPort((-1));
        java.lang.String str15 = undertowEmbeddedServletContainerFactory0.getDisplayName();
        org.springframework.core.io.ResourceLoader resourceLoader16 = null;
        undertowEmbeddedServletContainerFactory0.setResourceLoader(resourceLoader16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        org.springframework.boot.context.embedded.JspServlet jspServlet2 = undertowEmbeddedServletContainerFactory0.getJspServlet();
        boolean boolean3 = undertowEmbeddedServletContainerFactory0.isRegisterDefaultServlet();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo4 = null;
        undertowEmbeddedServletContainerFactory0.configureErrorPages(deploymentInfo4);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        java.net.InetAddress inetAddress9 = undertowEmbeddedServletContainerFactory8.getAddress();
        org.springframework.core.io.ResourceLoader resourceLoader10 = null;
        undertowEmbeddedServletContainerFactory8.setResourceLoader(resourceLoader10);
        org.springframework.boot.context.embedded.JspServlet jspServlet12 = undertowEmbeddedServletContainerFactory8.getJspServlet();
        undertowEmbeddedServletContainerFactory0.setJspServlet(jspServlet12);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection14 = undertowEmbeddedServletContainerFactory0.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean16 = undertowEmbeddedServletContainerFactory15.isPersistSession();
        io.undertow.Undertow.Builder builder18 = undertowEmbeddedServletContainerFactory15.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean20 = undertowEmbeddedServletContainerFactory19.isPersistSession();
        undertowEmbeddedServletContainerFactory19.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        java.net.InetAddress inetAddress26 = undertowEmbeddedServletContainerFactory25.getAddress();
        org.springframework.core.io.ResourceLoader resourceLoader27 = null;
        undertowEmbeddedServletContainerFactory25.setResourceLoader(resourceLoader27);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory30 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean31 = undertowEmbeddedServletContainerFactory30.isPersistSession();
        java.io.File file32 = undertowEmbeddedServletContainerFactory30.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings33 = undertowEmbeddedServletContainerFactory30.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader34 = undertowEmbeddedServletContainerFactory30.resourceLoader;
        java.io.File file35 = null;
        undertowEmbeddedServletContainerFactory30.setSessionStoreDir(file35);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo37 = null;
        undertowEmbeddedServletContainerFactory30.configureErrorPages(deploymentInfo37);
        org.springframework.boot.context.embedded.ServletContextInitializer servletContextInitializer39 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray40 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { servletContextInitializer39 };
        undertowEmbeddedServletContainerFactory30.addInitializers(servletContextInitializerArray40);
        initializer29.initializers = servletContextInitializerArray40;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray43 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        initializer29.initializers = servletContextInitializerArray43;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer45 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory46 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean47 = undertowEmbeddedServletContainerFactory46.isPersistSession();
        java.io.File file48 = undertowEmbeddedServletContainerFactory46.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings49 = undertowEmbeddedServletContainerFactory46.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader50 = undertowEmbeddedServletContainerFactory46.resourceLoader;
        java.io.File file51 = null;
        undertowEmbeddedServletContainerFactory46.setSessionStoreDir(file51);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo53 = null;
        undertowEmbeddedServletContainerFactory46.configureErrorPages(deploymentInfo53);
        org.springframework.boot.context.embedded.ServletContextInitializer servletContextInitializer55 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray56 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { servletContextInitializer55 };
        undertowEmbeddedServletContainerFactory46.addInitializers(servletContextInitializerArray56);
        initializer45.initializers = servletContextInitializerArray56;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray59 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        initializer45.initializers = servletContextInitializerArray59;
        initializer29.initializers = servletContextInitializerArray59;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray62 = initializer29.initializers;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray63 = initializer29.initializers;
        undertowEmbeddedServletContainerFactory25.addInitializers(servletContextInitializerArray63);
        undertowEmbeddedServletContainerFactory25.setSessionTimeout((int) (byte) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory69 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory69.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory69.directBuffers = true;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer74 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory75 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean76 = undertowEmbeddedServletContainerFactory75.isPersistSession();
        java.io.File file77 = undertowEmbeddedServletContainerFactory75.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings78 = undertowEmbeddedServletContainerFactory75.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader79 = undertowEmbeddedServletContainerFactory75.resourceLoader;
        java.io.File file80 = null;
        undertowEmbeddedServletContainerFactory75.setSessionStoreDir(file80);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo82 = null;
        undertowEmbeddedServletContainerFactory75.configureErrorPages(deploymentInfo82);
        org.springframework.boot.context.embedded.ServletContextInitializer servletContextInitializer84 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray85 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { servletContextInitializer84 };
        undertowEmbeddedServletContainerFactory75.addInitializers(servletContextInitializerArray85);
        initializer74.initializers = servletContextInitializerArray85;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray88 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        initializer74.initializers = servletContextInitializerArray88;
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer90 = undertowEmbeddedServletContainerFactory69.getEmbeddedServletContainer(servletContextInitializerArray88);
        undertowEmbeddedServletContainerFactory25.addInitializers(servletContextInitializerArray88);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer92 = undertowEmbeddedServletContainerFactory19.getEmbeddedServletContainer(servletContextInitializerArray88);
        io.undertow.servlet.api.DeploymentManager deploymentManager93 = undertowEmbeddedServletContainerFactory15.createDeploymentManager(servletContextInitializerArray88);
        undertowEmbeddedServletContainerFactory0.addInitializers(servletContextInitializerArray88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(deploymentManager93);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file5 = null;
        undertowEmbeddedServletContainerFactory2.accessLogDirectory = file5;
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 10);
        int int9 = undertowEmbeddedServletContainerFactory2.getSessionTimeout();
        undertowEmbeddedServletContainerFactory2.setPersistSession(false);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection12 = undertowEmbeddedServletContainerFactory2.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean14 = undertowEmbeddedServletContainerFactory13.isPersistSession();
        io.undertow.Undertow.Builder builder16 = undertowEmbeddedServletContainerFactory13.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings17 = undertowEmbeddedServletContainerFactory13.getMimeMappings();
        int int18 = undertowEmbeddedServletContainerFactory13.getPort();
        java.lang.ClassLoader classLoader19 = undertowEmbeddedServletContainerFactory13.getServletClassLoader();
        undertowEmbeddedServletContainerFactory13.setPort((int) (short) 1);
        io.undertow.Undertow.Builder builder23 = undertowEmbeddedServletContainerFactory13.createBuilder((-1));
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection24 = undertowEmbeddedServletContainerFactory13.getBuilderCustomizers();
        undertowEmbeddedServletContainerFactory2.setBuilderCustomizers(undertowBuilderCustomizerCollection24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1800 + "'", int9 == 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8080 + "'", int18 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection24);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        java.lang.String str3 = undertowEmbeddedServletContainerFactory2.accessLogPattern;
        java.io.File file4 = undertowEmbeddedServletContainerFactory2.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory2.bufferSize = 0;
        undertowEmbeddedServletContainerFactory2.setRegisterJspServlet(true);
        undertowEmbeddedServletContainerFactory2.setSessionTimeout((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file4);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList3 = undertowEmbeddedServletContainerFactory0.builderCustomizers;
        undertowEmbeddedServletContainerFactory0.setDisplayName("hi!");
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory0.addErrorPages(errorPageArray6);
        java.net.InetAddress inetAddress8 = undertowEmbeddedServletContainerFactory0.getAddress();
        undertowEmbeddedServletContainerFactory0.ioThreads = 0;
        java.lang.String str11 = undertowEmbeddedServletContainerFactory0.getContextPath();
        org.springframework.boot.context.embedded.Ssl ssl12 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean15 = undertowEmbeddedServletContainerFactory14.isPersistSession();
        java.io.File file16 = undertowEmbeddedServletContainerFactory14.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray17 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory14.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray17);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean20 = undertowEmbeddedServletContainerFactory19.isPersistSession();
        undertowEmbeddedServletContainerFactory19.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory23 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean24 = undertowEmbeddedServletContainerFactory23.isPersistSession();
        io.undertow.Undertow.Builder builder26 = undertowEmbeddedServletContainerFactory23.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager27 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer29 = undertowEmbeddedServletContainerFactory19.getUndertowEmbeddedServletContainer(builder26, deploymentManager27, (int) (byte) 1);
        io.undertow.servlet.api.DeploymentManager deploymentManager30 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer32 = undertowEmbeddedServletContainerFactory14.getUndertowEmbeddedServletContainer(builder26, deploymentManager30, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory0.configureSsl(ssl12, 100, builder26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer32);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList3 = undertowEmbeddedServletContainerFactory0.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean5 = undertowEmbeddedServletContainerFactory4.isPersistSession();
        io.undertow.Undertow.Builder builder7 = undertowEmbeddedServletContainerFactory4.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager8 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer10 = undertowEmbeddedServletContainerFactory0.getUndertowEmbeddedServletContainer(builder7, deploymentManager8, (int) (byte) -1);
        org.xnio.XnioWorker xnioWorker11 = undertowEmbeddedServletContainerFactory0.createWorker();
        org.springframework.core.io.ResourceLoader resourceLoader12 = null;
        undertowEmbeddedServletContainerFactory0.setResourceLoader(resourceLoader12);
        undertowEmbeddedServletContainerFactory0.workerThreads = 100;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(xnioWorker11);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings3 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader4 = undertowEmbeddedServletContainerFactory0.resourceLoader;
        undertowEmbeddedServletContainerFactory0.setBufferSize((java.lang.Integer) 1);
        boolean boolean7 = undertowEmbeddedServletContainerFactory0.useForwardHeaders;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection8 = undertowEmbeddedServletContainerFactory0.getBuilderCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        java.io.File file10 = undertowEmbeddedServletContainerFactory9.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory9.setAccessLogPattern("");
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection13 = undertowEmbeddedServletContainerFactory9.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean15 = undertowEmbeddedServletContainerFactory14.isPersistSession();
        io.undertow.Undertow.Builder builder17 = undertowEmbeddedServletContainerFactory14.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings18 = undertowEmbeddedServletContainerFactory14.getMimeMappings();
        int int19 = undertowEmbeddedServletContainerFactory14.getPort();
        java.lang.ClassLoader classLoader20 = undertowEmbeddedServletContainerFactory14.getServletClassLoader();
        undertowEmbeddedServletContainerFactory14.useForwardHeaders = false;
        java.net.InetAddress inetAddress23 = undertowEmbeddedServletContainerFactory14.getAddress();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection24 = undertowEmbeddedServletContainerFactory14.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean26 = undertowEmbeddedServletContainerFactory25.isPersistSession();
        undertowEmbeddedServletContainerFactory25.accessLogEnabled = false;
        boolean boolean29 = undertowEmbeddedServletContainerFactory25.isRegisterDefaultServlet();
        java.io.File file30 = undertowEmbeddedServletContainerFactory25.getDocumentRoot();
        undertowEmbeddedServletContainerFactory25.setAccessLogPattern("");
        org.springframework.boot.context.embedded.JspServlet jspServlet33 = undertowEmbeddedServletContainerFactory25.getJspServlet();
        java.io.File file34 = null;
        undertowEmbeddedServletContainerFactory25.accessLogDirectory = file34;
        boolean boolean36 = undertowEmbeddedServletContainerFactory25.accessLogEnabled;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory37 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory37.setPort((int) (short) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean41 = undertowEmbeddedServletContainerFactory40.isPersistSession();
        io.undertow.Undertow.Builder builder43 = undertowEmbeddedServletContainerFactory40.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings44 = undertowEmbeddedServletContainerFactory40.getMimeMappings();
        undertowEmbeddedServletContainerFactory37.setMimeMappings(mimeMappings44);
        undertowEmbeddedServletContainerFactory37.bufferSize = 10;
        org.springframework.boot.context.embedded.JspServlet jspServlet48 = undertowEmbeddedServletContainerFactory37.getJspServlet();
        undertowEmbeddedServletContainerFactory25.setJspServlet(jspServlet48);
        undertowEmbeddedServletContainerFactory14.setJspServlet(jspServlet48);
        undertowEmbeddedServletContainerFactory9.setJspServlet(jspServlet48);
        undertowEmbeddedServletContainerFactory0.setJspServlet(jspServlet48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8080 + "'", int19 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet48);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        io.undertow.Undertow.Builder builder3 = undertowEmbeddedServletContainerFactory0.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        int int5 = undertowEmbeddedServletContainerFactory0.getPort();
        java.lang.ClassLoader classLoader6 = undertowEmbeddedServletContainerFactory0.getServletClassLoader();
        undertowEmbeddedServletContainerFactory0.setPort((int) (short) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean10 = undertowEmbeddedServletContainerFactory9.isPersistSession();
        undertowEmbeddedServletContainerFactory9.accessLogEnabled = false;
        io.undertow.Undertow.Builder builder14 = undertowEmbeddedServletContainerFactory9.createBuilder((int) (short) 100);
        io.undertow.servlet.api.DeploymentManager deploymentManager15 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer17 = undertowEmbeddedServletContainerFactory0.getUndertowEmbeddedServletContainer(builder14, deploymentManager15, (int) (byte) 100);
        java.lang.Integer int18 = undertowEmbeddedServletContainerFactory0.bufferSize;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8080 + "'", int5 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int18);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        undertowEmbeddedServletContainerFactory0.accessLogEnabled = false;
        io.undertow.Undertow.Builder builder5 = undertowEmbeddedServletContainerFactory0.createBuilder((int) (short) 100);
        org.springframework.core.io.ResourceLoader resourceLoader6 = undertowEmbeddedServletContainerFactory0.resourceLoader;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList7 = undertowEmbeddedServletContainerFactory0.deploymentInfoCustomizers;
        java.io.File file8 = null;
        undertowEmbeddedServletContainerFactory0.accessLogDirectory = file8;
        java.io.File file10 = undertowEmbeddedServletContainerFactory0.getDocumentRoot();
        boolean boolean11 = undertowEmbeddedServletContainerFactory0.useForwardHeaders;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager();
        boolean boolean1 = jarResourceManager0.isResourceChangeListenerSupported();
        java.lang.String str2 = jarResourceManager0.jarPath;
        boolean boolean3 = jarResourceManager0.isResourceChangeListenerSupported();
        java.lang.String str4 = jarResourceManager0.jarPath;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.server.handlers.resource.Resource resource6 = jarResourceManager0.getResource("");
            org.junit.Assert.fail("Expected exception of type java.net.MalformedURLException; message: no !/ in spec");
        } catch (java.net.MalformedURLException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList3 = undertowEmbeddedServletContainerFactory0.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean5 = undertowEmbeddedServletContainerFactory4.isPersistSession();
        io.undertow.Undertow.Builder builder7 = undertowEmbeddedServletContainerFactory4.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager8 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer10 = undertowEmbeddedServletContainerFactory0.getUndertowEmbeddedServletContainer(builder7, deploymentManager8, (int) (byte) -1);
        undertowEmbeddedServletContainerFactory0.setSessionTimeout(100);
        io.undertow.Undertow.Builder builder14 = undertowEmbeddedServletContainerFactory0.createBuilder((int) '4');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean16 = undertowEmbeddedServletContainerFactory15.isPersistSession();
        java.io.File file17 = undertowEmbeddedServletContainerFactory15.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray18 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory15.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray18);
        org.springframework.boot.context.embedded.Ssl ssl20 = undertowEmbeddedServletContainerFactory15.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean22 = undertowEmbeddedServletContainerFactory21.isPersistSession();
        undertowEmbeddedServletContainerFactory21.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean26 = undertowEmbeddedServletContainerFactory25.isPersistSession();
        io.undertow.Undertow.Builder builder28 = undertowEmbeddedServletContainerFactory25.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager29 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer31 = undertowEmbeddedServletContainerFactory21.getUndertowEmbeddedServletContainer(builder28, deploymentManager29, (int) (byte) 1);
        io.undertow.servlet.api.DeploymentManager deploymentManager32 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer34 = undertowEmbeddedServletContainerFactory15.getUndertowEmbeddedServletContainer(builder28, deploymentManager32, (int) 'a');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory35 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean36 = undertowEmbeddedServletContainerFactory35.isPersistSession();
        java.io.File file37 = undertowEmbeddedServletContainerFactory35.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray38 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory35.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray38);
        org.springframework.boot.context.embedded.Ssl ssl40 = undertowEmbeddedServletContainerFactory35.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory41 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean42 = undertowEmbeddedServletContainerFactory41.isPersistSession();
        undertowEmbeddedServletContainerFactory41.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory45 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean46 = undertowEmbeddedServletContainerFactory45.isPersistSession();
        io.undertow.Undertow.Builder builder48 = undertowEmbeddedServletContainerFactory45.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager49 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer51 = undertowEmbeddedServletContainerFactory41.getUndertowEmbeddedServletContainer(builder48, deploymentManager49, (int) (byte) 1);
        io.undertow.servlet.api.DeploymentManager deploymentManager52 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer54 = undertowEmbeddedServletContainerFactory35.getUndertowEmbeddedServletContainer(builder48, deploymentManager52, (int) 'a');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean56 = undertowEmbeddedServletContainerFactory55.isPersistSession();
        undertowEmbeddedServletContainerFactory55.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory59 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean60 = undertowEmbeddedServletContainerFactory59.isPersistSession();
        io.undertow.Undertow.Builder builder62 = undertowEmbeddedServletContainerFactory59.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager63 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer65 = undertowEmbeddedServletContainerFactory55.getUndertowEmbeddedServletContainer(builder62, deploymentManager63, (int) (byte) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory66 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean67 = undertowEmbeddedServletContainerFactory66.isPersistSession();
        java.io.File file68 = undertowEmbeddedServletContainerFactory66.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList69 = undertowEmbeddedServletContainerFactory66.builderCustomizers;
        undertowEmbeddedServletContainerFactory66.setDisplayName("hi!");
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray72 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory66.addErrorPages(errorPageArray72);
        undertowEmbeddedServletContainerFactory66.setIoThreads((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.Compression compression76 = undertowEmbeddedServletContainerFactory66.getCompression();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory79 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory79.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file82 = null;
        undertowEmbeddedServletContainerFactory79.accessLogDirectory = file82;
        boolean boolean84 = undertowEmbeddedServletContainerFactory79.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray85 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory79.addInitializers(servletContextInitializerArray85);
        io.undertow.servlet.api.DeploymentManager deploymentManager87 = undertowEmbeddedServletContainerFactory66.createDeploymentManager(servletContextInitializerArray85);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer89 = undertowEmbeddedServletContainerFactory35.getUndertowEmbeddedServletContainer(builder62, deploymentManager87, (int) (short) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer91 = undertowEmbeddedServletContainerFactory0.getUndertowEmbeddedServletContainer(builder28, deploymentManager87, (int) '#');
        undertowEmbeddedServletContainerFactory0.setUseForwardHeaders(true);
        java.lang.String str94 = undertowEmbeddedServletContainerFactory0.accessLogPattern;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(deploymentManager87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str94);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        undertowEmbeddedServletContainerFactory0.setPersistSession(false);
        undertowEmbeddedServletContainerFactory0.accessLogEnabled = false;
        boolean boolean6 = undertowEmbeddedServletContainerFactory0.accessLogEnabled;
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory0.setDocumentRoot(file7);
        java.lang.ClassLoader classLoader9 = undertowEmbeddedServletContainerFactory0.getServletClassLoader();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean11 = undertowEmbeddedServletContainerFactory10.isPersistSession();
        io.undertow.Undertow.Builder builder13 = undertowEmbeddedServletContainerFactory10.createBuilder((int) (short) 0);
        undertowEmbeddedServletContainerFactory10.useForwardHeaders = false;
        undertowEmbeddedServletContainerFactory10.directBuffers = false;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList18 = undertowEmbeddedServletContainerFactory10.builderCustomizers;
        undertowEmbeddedServletContainerFactory0.builderCustomizers = undertowBuilderCustomizerList18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList18);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory0.setPort((int) (short) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory3 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean4 = undertowEmbeddedServletContainerFactory3.isPersistSession();
        io.undertow.Undertow.Builder builder6 = undertowEmbeddedServletContainerFactory3.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings7 = undertowEmbeddedServletContainerFactory3.getMimeMappings();
        undertowEmbeddedServletContainerFactory0.setMimeMappings(mimeMappings7);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection9 = undertowEmbeddedServletContainerFactory0.getDeploymentInfoCustomizers();
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList10 = undertowEmbeddedServletContainerFactory0.builderCustomizers;
        undertowEmbeddedServletContainerFactory0.ioThreads = 0;
        io.undertow.server.handlers.resource.ResourceManager resourceManager13 = undertowEmbeddedServletContainerFactory0.getDocumentRootResourceManager();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(resourceManager13);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList3 = undertowEmbeddedServletContainerFactory0.builderCustomizers;
        undertowEmbeddedServletContainerFactory0.setDisplayName("hi!");
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory0.addErrorPages(errorPageArray6);
        undertowEmbeddedServletContainerFactory0.setIoThreads((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory0.buffersPerRegion = (-1);
        undertowEmbeddedServletContainerFactory0.setPort((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray6);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        io.undertow.Undertow.Builder builder3 = undertowEmbeddedServletContainerFactory0.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        int int5 = undertowEmbeddedServletContainerFactory0.getPort();
        java.lang.ClassLoader classLoader6 = undertowEmbeddedServletContainerFactory0.getServletClassLoader();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory7 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean8 = undertowEmbeddedServletContainerFactory7.isPersistSession();
        undertowEmbeddedServletContainerFactory7.accessLogEnabled = false;
        undertowEmbeddedServletContainerFactory7.setSessionTimeout((int) (short) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory15.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file18 = null;
        undertowEmbeddedServletContainerFactory15.accessLogDirectory = file18;
        boolean boolean20 = undertowEmbeddedServletContainerFactory15.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray21 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory15.addInitializers(servletContextInitializerArray21);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray23 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory15.addErrorPages(errorPageArray23);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList25 = undertowEmbeddedServletContainerFactory15.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory7.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList25;
        undertowEmbeddedServletContainerFactory0.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList25;
        undertowEmbeddedServletContainerFactory0.setUseForwardHeaders(true);
        java.lang.Integer int30 = undertowEmbeddedServletContainerFactory0.ioThreads;
        java.net.InetAddress inetAddress31 = null;
        undertowEmbeddedServletContainerFactory0.setAddress(inetAddress31);
        org.xnio.XnioWorker xnioWorker33 = undertowEmbeddedServletContainerFactory0.createWorker();
        undertowEmbeddedServletContainerFactory0.setPort((int) (byte) -1);
        org.springframework.boot.context.embedded.ErrorPage errorPage36 = null;
        // The following exception was thrown during execution in test generation
        try {
            io.undertow.servlet.api.ErrorPage errorPage37 = undertowEmbeddedServletContainerFactory0.getUndertowErrorPage(errorPage36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8080 + "'", int5 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(xnioWorker33);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings3 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader4 = undertowEmbeddedServletContainerFactory0.resourceLoader;
        boolean boolean5 = undertowEmbeddedServletContainerFactory0.isRegisterDefaultServlet();
        java.lang.ClassLoader classLoader6 = undertowEmbeddedServletContainerFactory0.getServletClassLoader();
        undertowEmbeddedServletContainerFactory0.directBuffers = false;
        undertowEmbeddedServletContainerFactory0.setAccessLogEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader6);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file5 = null;
        undertowEmbeddedServletContainerFactory2.accessLogDirectory = file5;
        undertowEmbeddedServletContainerFactory2.setPersistSession(true);
        org.springframework.boot.context.embedded.Compression compression9 = null;
        undertowEmbeddedServletContainerFactory2.setCompression(compression9);
        undertowEmbeddedServletContainerFactory2.setIoThreads((java.lang.Integer) 0);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray3 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory0.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray3);
        org.springframework.boot.context.embedded.Ssl ssl5 = undertowEmbeddedServletContainerFactory0.getSsl();
        undertowEmbeddedServletContainerFactory0.setBufferSize((java.lang.Integer) 1);
        boolean boolean8 = undertowEmbeddedServletContainerFactory0.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean10 = undertowEmbeddedServletContainerFactory9.isPersistSession();
        java.io.File file11 = undertowEmbeddedServletContainerFactory9.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings12 = undertowEmbeddedServletContainerFactory9.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader13 = undertowEmbeddedServletContainerFactory9.resourceLoader;
        undertowEmbeddedServletContainerFactory9.setBufferSize((java.lang.Integer) 1);
        boolean boolean16 = undertowEmbeddedServletContainerFactory9.useForwardHeaders;
        java.lang.Integer int17 = undertowEmbeddedServletContainerFactory9.ioThreads;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray18 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList19 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList19, undertowBuilderCustomizerArray18);
        undertowEmbeddedServletContainerFactory9.setBuilderCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList19);
        undertowEmbeddedServletContainerFactory0.builderCustomizers = undertowBuilderCustomizerList19;
        undertowEmbeddedServletContainerFactory0.setDisplayName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        io.undertow.Undertow.Builder builder3 = undertowEmbeddedServletContainerFactory0.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        int int5 = undertowEmbeddedServletContainerFactory0.getPort();
        java.lang.ClassLoader classLoader6 = undertowEmbeddedServletContainerFactory0.getServletClassLoader();
        undertowEmbeddedServletContainerFactory0.setPort((int) (short) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory9 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean10 = undertowEmbeddedServletContainerFactory9.isPersistSession();
        undertowEmbeddedServletContainerFactory9.accessLogEnabled = false;
        io.undertow.Undertow.Builder builder14 = undertowEmbeddedServletContainerFactory9.createBuilder((int) (short) 100);
        io.undertow.servlet.api.DeploymentManager deploymentManager15 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer17 = undertowEmbeddedServletContainerFactory0.getUndertowEmbeddedServletContainer(builder14, deploymentManager15, (int) (byte) 100);
        java.io.File file18 = null;
        undertowEmbeddedServletContainerFactory0.setDocumentRoot(file18);
        java.net.InetAddress inetAddress20 = null;
        undertowEmbeddedServletContainerFactory0.setAddress(inetAddress20);
        undertowEmbeddedServletContainerFactory0.accessLogEnabled = true;
        io.undertow.servlet.api.DeploymentInfo deploymentInfo24 = null;
        undertowEmbeddedServletContainerFactory0.configureErrorPages(deploymentInfo24);
        java.io.File file26 = undertowEmbeddedServletContainerFactory0.getSessionStoreDir();
        io.undertow.servlet.api.DeploymentInfo deploymentInfo27 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory0.configureMimeMappings(deploymentInfo27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8080 + "'", int5 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file26);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList3 = undertowEmbeddedServletContainerFactory0.builderCustomizers;
        undertowEmbeddedServletContainerFactory0.setDisplayName("hi!");
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory0.addErrorPages(errorPageArray6);
        undertowEmbeddedServletContainerFactory0.setWorkerThreads((java.lang.Integer) 8080);
        java.io.File file10 = null;
        undertowEmbeddedServletContainerFactory0.setDocumentRoot(file10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean13 = undertowEmbeddedServletContainerFactory12.isPersistSession();
        undertowEmbeddedServletContainerFactory12.accessLogEnabled = false;
        io.undertow.Undertow.Builder builder17 = undertowEmbeddedServletContainerFactory12.createBuilder((int) (short) 100);
        org.springframework.core.io.ResourceLoader resourceLoader18 = undertowEmbeddedServletContainerFactory12.resourceLoader;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory19 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean20 = undertowEmbeddedServletContainerFactory19.isPersistSession();
        java.io.File file21 = undertowEmbeddedServletContainerFactory19.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings22 = undertowEmbeddedServletContainerFactory19.getMimeMappings();
        undertowEmbeddedServletContainerFactory12.setMimeMappings(mimeMappings22);
        undertowEmbeddedServletContainerFactory0.setMimeMappings(mimeMappings22);
        org.springframework.boot.context.embedded.JspServlet jspServlet25 = undertowEmbeddedServletContainerFactory0.getJspServlet();
        java.io.File file26 = undertowEmbeddedServletContainerFactory0.getSessionStoreDir();
        io.undertow.Undertow.Builder builder28 = undertowEmbeddedServletContainerFactory0.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean30 = undertowEmbeddedServletContainerFactory29.isPersistSession();
        java.io.File file31 = undertowEmbeddedServletContainerFactory29.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings32 = undertowEmbeddedServletContainerFactory29.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader33 = undertowEmbeddedServletContainerFactory29.resourceLoader;
        undertowEmbeddedServletContainerFactory29.setBufferSize((java.lang.Integer) 1);
        boolean boolean36 = undertowEmbeddedServletContainerFactory29.useForwardHeaders;
        java.lang.Integer int37 = undertowEmbeddedServletContainerFactory29.ioThreads;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray38 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList39 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList39, undertowBuilderCustomizerArray38);
        undertowEmbeddedServletContainerFactory29.setBuilderCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList39);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean43 = undertowEmbeddedServletContainerFactory42.isPersistSession();
        java.io.File file44 = undertowEmbeddedServletContainerFactory42.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray45 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory42.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray45);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean48 = undertowEmbeddedServletContainerFactory47.isPersistSession();
        java.io.File file49 = undertowEmbeddedServletContainerFactory47.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings50 = undertowEmbeddedServletContainerFactory47.getMimeMappings();
        undertowEmbeddedServletContainerFactory42.setMimeMappings(mimeMappings50);
        org.springframework.boot.context.embedded.Compression compression52 = undertowEmbeddedServletContainerFactory42.getCompression();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory55 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory55.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory55.directBuffers = true;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings60 = undertowEmbeddedServletContainerFactory55.getMimeMappings();
        undertowEmbeddedServletContainerFactory42.setMimeMappings(mimeMappings60);
        undertowEmbeddedServletContainerFactory29.setMimeMappings(mimeMappings60);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory63 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean64 = undertowEmbeddedServletContainerFactory63.isPersistSession();
        io.undertow.Undertow.Builder builder66 = undertowEmbeddedServletContainerFactory63.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings67 = undertowEmbeddedServletContainerFactory63.getMimeMappings();
        int int68 = undertowEmbeddedServletContainerFactory63.getPort();
        undertowEmbeddedServletContainerFactory63.setRegisterJspServlet(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory73 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory73.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file76 = null;
        undertowEmbeddedServletContainerFactory73.accessLogDirectory = file76;
        undertowEmbeddedServletContainerFactory73.setPersistSession(true);
        java.lang.Integer int80 = undertowEmbeddedServletContainerFactory73.bufferSize;
        undertowEmbeddedServletContainerFactory73.workerThreads = 0;
        undertowEmbeddedServletContainerFactory73.setContextPath("");
        java.net.InetAddress inetAddress85 = null;
        undertowEmbeddedServletContainerFactory73.setAddress(inetAddress85);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory87 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean88 = undertowEmbeddedServletContainerFactory87.isPersistSession();
        java.io.File file89 = undertowEmbeddedServletContainerFactory87.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray90 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory87.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray90);
        undertowEmbeddedServletContainerFactory73.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray90);
        undertowEmbeddedServletContainerFactory63.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray90);
        undertowEmbeddedServletContainerFactory29.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray90);
        undertowEmbeddedServletContainerFactory0.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 8080 + "'", int68 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray90);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        org.springframework.core.io.ResourceLoader resourceLoader2 = null;
        undertowEmbeddedServletContainerFactory0.resourceLoader = resourceLoader2;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList4 = undertowEmbeddedServletContainerFactory0.builderCustomizers;
        undertowEmbeddedServletContainerFactory0.useForwardHeaders = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList4);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        java.lang.String str3 = undertowEmbeddedServletContainerFactory2.accessLogPattern;
        java.io.File file4 = undertowEmbeddedServletContainerFactory2.getSessionStoreDir();
        undertowEmbeddedServletContainerFactory2.bufferSize = 0;
        undertowEmbeddedServletContainerFactory2.setAccessLogPattern("");
        org.springframework.core.io.ResourceLoader resourceLoader9 = undertowEmbeddedServletContainerFactory2.resourceLoader;
        java.lang.String str10 = undertowEmbeddedServletContainerFactory2.getContextPath();
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory2.addErrorPages(errorPageArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ErrorPages must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        io.undertow.Undertow.Builder builder3 = undertowEmbeddedServletContainerFactory0.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        boolean boolean5 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection6 = undertowEmbeddedServletContainerFactory0.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory0.setPort((int) (byte) -1);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection9 = undertowEmbeddedServletContainerFactory0.getBuilderCustomizers();
        org.springframework.boot.context.embedded.Ssl ssl10 = undertowEmbeddedServletContainerFactory0.getSsl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl10);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file5 = null;
        undertowEmbeddedServletContainerFactory2.accessLogDirectory = file5;
        boolean boolean7 = undertowEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray8);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray10 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory2.addErrorPages(errorPageArray10);
        undertowEmbeddedServletContainerFactory2.setUseForwardHeaders(false);
        io.undertow.server.handlers.resource.ResourceManager resourceManager14 = undertowEmbeddedServletContainerFactory2.getDocumentRootResourceManager();
        undertowEmbeddedServletContainerFactory2.setBufferSize((java.lang.Integer) 1800);
        undertowEmbeddedServletContainerFactory2.setPort((int) '4');
        undertowEmbeddedServletContainerFactory2.setAccessLogEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(resourceManager14);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        boolean boolean3 = undertowEmbeddedServletContainerFactory0.useForwardHeaders;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray4 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList5 = new java.util.ArrayList<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer>) undertowDeploymentInfoCustomizerList5, undertowDeploymentInfoCustomizerArray4);
        undertowEmbeddedServletContainerFactory0.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList5;
        undertowEmbeddedServletContainerFactory0.setPersistSession(true);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo10 = null;
        undertowEmbeddedServletContainerFactory0.configureErrorPages(deploymentInfo10);
        undertowEmbeddedServletContainerFactory0.setUseForwardHeaders(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        io.undertow.Undertow.Builder builder3 = undertowEmbeddedServletContainerFactory0.createBuilder((int) (short) 0);
        undertowEmbeddedServletContainerFactory0.buffersPerRegion = 100;
        java.net.InetAddress inetAddress6 = undertowEmbeddedServletContainerFactory0.getAddress();
        boolean boolean7 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        undertowEmbeddedServletContainerFactory0.setBufferSize((java.lang.Integer) 1800);
        java.net.InetAddress inetAddress10 = undertowEmbeddedServletContainerFactory0.getAddress();
        org.springframework.boot.context.embedded.JspServlet jspServlet11 = undertowEmbeddedServletContainerFactory0.getJspServlet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet11);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 0);
        undertowEmbeddedServletContainerFactory2.directBuffers = true;
        io.undertow.servlet.api.DeploymentInfo deploymentInfo7 = null;
        undertowEmbeddedServletContainerFactory2.configureErrorPages(deploymentInfo7);
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection9 = undertowEmbeddedServletContainerFactory2.getDeploymentInfoCustomizers();
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 0);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean13 = undertowEmbeddedServletContainerFactory12.isPersistSession();
        undertowEmbeddedServletContainerFactory12.setPersistSession(false);
        undertowEmbeddedServletContainerFactory12.accessLogEnabled = false;
        boolean boolean18 = undertowEmbeddedServletContainerFactory12.accessLogEnabled;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerList19 = undertowEmbeddedServletContainerFactory12.deploymentInfoCustomizers;
        undertowEmbeddedServletContainerFactory2.deploymentInfoCustomizers = undertowDeploymentInfoCustomizerList19;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory2.setContextPath("0.0.0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ContextPath must start with '/' and not end with '/'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerList19);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList3 = undertowEmbeddedServletContainerFactory0.builderCustomizers;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory4 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean5 = undertowEmbeddedServletContainerFactory4.isPersistSession();
        io.undertow.Undertow.Builder builder7 = undertowEmbeddedServletContainerFactory4.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager8 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer10 = undertowEmbeddedServletContainerFactory0.getUndertowEmbeddedServletContainer(builder7, deploymentManager8, (int) (byte) -1);
        org.xnio.XnioWorker xnioWorker11 = undertowEmbeddedServletContainerFactory0.createWorker();
        java.net.InetAddress inetAddress12 = null;
        undertowEmbeddedServletContainerFactory0.setAddress(inetAddress12);
        org.springframework.boot.context.embedded.Ssl ssl14 = null;
        undertowEmbeddedServletContainerFactory0.setSsl(ssl14);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory16 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean17 = undertowEmbeddedServletContainerFactory16.isPersistSession();
        java.io.File file18 = undertowEmbeddedServletContainerFactory16.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray19 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory16.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray19);
        org.springframework.boot.context.embedded.Ssl ssl21 = undertowEmbeddedServletContainerFactory16.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory22 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean23 = undertowEmbeddedServletContainerFactory22.isPersistSession();
        undertowEmbeddedServletContainerFactory22.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean27 = undertowEmbeddedServletContainerFactory26.isPersistSession();
        io.undertow.Undertow.Builder builder29 = undertowEmbeddedServletContainerFactory26.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager30 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer32 = undertowEmbeddedServletContainerFactory22.getUndertowEmbeddedServletContainer(builder29, deploymentManager30, (int) (byte) 1);
        io.undertow.servlet.api.DeploymentManager deploymentManager33 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer35 = undertowEmbeddedServletContainerFactory16.getUndertowEmbeddedServletContainer(builder29, deploymentManager33, (int) 'a');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean37 = undertowEmbeddedServletContainerFactory36.isPersistSession();
        undertowEmbeddedServletContainerFactory36.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory40 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean41 = undertowEmbeddedServletContainerFactory40.isPersistSession();
        io.undertow.Undertow.Builder builder43 = undertowEmbeddedServletContainerFactory40.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager44 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer46 = undertowEmbeddedServletContainerFactory36.getUndertowEmbeddedServletContainer(builder43, deploymentManager44, (int) (byte) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean48 = undertowEmbeddedServletContainerFactory47.isPersistSession();
        java.io.File file49 = undertowEmbeddedServletContainerFactory47.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList50 = undertowEmbeddedServletContainerFactory47.builderCustomizers;
        undertowEmbeddedServletContainerFactory47.setDisplayName("hi!");
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray53 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory47.addErrorPages(errorPageArray53);
        undertowEmbeddedServletContainerFactory47.setIoThreads((java.lang.Integer) 10);
        org.springframework.boot.context.embedded.Compression compression57 = undertowEmbeddedServletContainerFactory47.getCompression();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory60 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory60.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file63 = null;
        undertowEmbeddedServletContainerFactory60.accessLogDirectory = file63;
        boolean boolean65 = undertowEmbeddedServletContainerFactory60.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray66 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory60.addInitializers(servletContextInitializerArray66);
        io.undertow.servlet.api.DeploymentManager deploymentManager68 = undertowEmbeddedServletContainerFactory47.createDeploymentManager(servletContextInitializerArray66);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer70 = undertowEmbeddedServletContainerFactory16.getUndertowEmbeddedServletContainer(builder43, deploymentManager68, (int) (short) 10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory71 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean72 = undertowEmbeddedServletContainerFactory71.isPersistSession();
        java.io.File file73 = undertowEmbeddedServletContainerFactory71.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings74 = undertowEmbeddedServletContainerFactory71.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader75 = undertowEmbeddedServletContainerFactory71.resourceLoader;
        java.io.File file76 = null;
        undertowEmbeddedServletContainerFactory71.setSessionStoreDir(file76);
        undertowEmbeddedServletContainerFactory71.setBufferSize((java.lang.Integer) (-1));
        java.io.File file80 = null;
        undertowEmbeddedServletContainerFactory71.accessLogDirectory = file80;
        java.lang.Integer int82 = undertowEmbeddedServletContainerFactory71.buffersPerRegion;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray83 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory71.addInitializers(servletContextInitializerArray83);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer85 = undertowEmbeddedServletContainerFactory16.getEmbeddedServletContainer(servletContextInitializerArray83);
        undertowEmbeddedServletContainerFactory0.addInitializers(servletContextInitializerArray83);
        boolean boolean87 = undertowEmbeddedServletContainerFactory0.accessLogEnabled;
        org.xnio.XnioWorker xnioWorker88 = undertowEmbeddedServletContainerFactory0.createWorker();
        java.net.InetAddress inetAddress89 = null;
        undertowEmbeddedServletContainerFactory0.setAddress(inetAddress89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(xnioWorker11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(compression57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(deploymentManager68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(xnioWorker88);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList3 = undertowEmbeddedServletContainerFactory0.builderCustomizers;
        undertowEmbeddedServletContainerFactory0.setDisplayName("hi!");
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray6 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory0.addErrorPages(errorPageArray6);
        java.net.InetAddress inetAddress8 = undertowEmbeddedServletContainerFactory0.getAddress();
        undertowEmbeddedServletContainerFactory0.ioThreads = 0;
        undertowEmbeddedServletContainerFactory0.setDisplayName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory15.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file18 = null;
        undertowEmbeddedServletContainerFactory15.accessLogDirectory = file18;
        undertowEmbeddedServletContainerFactory15.setBuffersPerRegion((java.lang.Integer) 10);
        undertowEmbeddedServletContainerFactory15.buffersPerRegion = 100;
        boolean boolean24 = undertowEmbeddedServletContainerFactory15.useForwardHeaders;
        undertowEmbeddedServletContainerFactory15.setDirectBuffers((java.lang.Boolean) false);
        java.lang.Integer int27 = undertowEmbeddedServletContainerFactory15.workerThreads;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory28 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean29 = undertowEmbeddedServletContainerFactory28.isPersistSession();
        undertowEmbeddedServletContainerFactory28.accessLogEnabled = false;
        boolean boolean32 = undertowEmbeddedServletContainerFactory28.isRegisterDefaultServlet();
        java.io.File file33 = undertowEmbeddedServletContainerFactory28.getDocumentRoot();
        undertowEmbeddedServletContainerFactory28.setBufferSize((java.lang.Integer) (-1));
        undertowEmbeddedServletContainerFactory28.setBufferSize((java.lang.Integer) (-1));
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList38 = undertowEmbeddedServletContainerFactory28.builderCustomizers;
        undertowEmbeddedServletContainerFactory15.setBuilderCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList38);
        undertowEmbeddedServletContainerFactory0.builderCustomizers = undertowBuilderCustomizerList38;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList38);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(8080);
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 1;
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 100);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 1800);
        io.undertow.Undertow.Builder builder9 = undertowEmbeddedServletContainerFactory1.createBuilder((int) 'a');
        java.lang.Boolean boolean10 = undertowEmbeddedServletContainerFactory1.directBuffers;
        undertowEmbeddedServletContainerFactory1.setDisplayName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean10);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isRegisterDefaultServlet();
        int int2 = undertowEmbeddedServletContainerFactory0.getSessionTimeout();
        undertowEmbeddedServletContainerFactory0.setSessionTimeout((int) ' ');
        org.springframework.boot.context.embedded.Ssl ssl5 = null;
        undertowEmbeddedServletContainerFactory0.setSsl(ssl5);
        undertowEmbeddedServletContainerFactory0.ioThreads = 1;
        undertowEmbeddedServletContainerFactory0.setRegisterDefaultServlet(false);
        undertowEmbeddedServletContainerFactory0.ioThreads = 10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1800 + "'", int2 == 1800);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        undertowEmbeddedServletContainerFactory0.setPersistSession(false);
        undertowEmbeddedServletContainerFactory0.accessLogEnabled = false;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet6 = undertowEmbeddedServletContainerFactory0.getErrorPages();
        undertowEmbeddedServletContainerFactory0.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory0.setBufferSize((java.lang.Integer) 8080);
        java.io.File file11 = undertowEmbeddedServletContainerFactory0.getSessionStoreDir();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = file11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file11);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean3 = undertowEmbeddedServletContainerFactory2.isPersistSession();
        java.io.File file4 = undertowEmbeddedServletContainerFactory2.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray5 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory2.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray5);
        org.springframework.boot.context.embedded.Ssl ssl7 = undertowEmbeddedServletContainerFactory2.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean9 = undertowEmbeddedServletContainerFactory8.isPersistSession();
        undertowEmbeddedServletContainerFactory8.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean13 = undertowEmbeddedServletContainerFactory12.isPersistSession();
        io.undertow.Undertow.Builder builder15 = undertowEmbeddedServletContainerFactory12.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager16 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer18 = undertowEmbeddedServletContainerFactory8.getUndertowEmbeddedServletContainer(builder15, deploymentManager16, (int) (byte) 1);
        io.undertow.servlet.api.DeploymentManager deploymentManager19 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer21 = undertowEmbeddedServletContainerFactory2.getUndertowEmbeddedServletContainer(builder15, deploymentManager19, (int) 'a');
        io.undertow.servlet.api.DeploymentManager deploymentManager22 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer24 = undertowEmbeddedServletContainerFactory0.getUndertowEmbeddedServletContainer(builder15, deploymentManager22, (int) '#');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        java.net.InetAddress inetAddress28 = undertowEmbeddedServletContainerFactory27.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean30 = undertowEmbeddedServletContainerFactory29.isPersistSession();
        java.io.File file31 = undertowEmbeddedServletContainerFactory29.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings32 = undertowEmbeddedServletContainerFactory29.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader33 = undertowEmbeddedServletContainerFactory29.resourceLoader;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet34 = undertowEmbeddedServletContainerFactory29.getErrorPages();
        undertowEmbeddedServletContainerFactory27.setErrorPages(errorPageSet34);
        undertowEmbeddedServletContainerFactory0.setErrorPages(errorPageSet34);
        undertowEmbeddedServletContainerFactory0.setRegisterDefaultServlet(true);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory39 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean40 = undertowEmbeddedServletContainerFactory39.isPersistSession();
        undertowEmbeddedServletContainerFactory39.accessLogEnabled = false;
        boolean boolean43 = undertowEmbeddedServletContainerFactory39.isRegisterDefaultServlet();
        java.io.File file44 = undertowEmbeddedServletContainerFactory39.getDocumentRoot();
        undertowEmbeddedServletContainerFactory39.setAccessLogPattern("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory47 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean48 = undertowEmbeddedServletContainerFactory47.isPersistSession();
        java.io.File file49 = undertowEmbeddedServletContainerFactory47.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings50 = undertowEmbeddedServletContainerFactory47.getMimeMappings();
        java.lang.Integer int51 = undertowEmbeddedServletContainerFactory47.bufferSize;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean53 = undertowEmbeddedServletContainerFactory52.isPersistSession();
        undertowEmbeddedServletContainerFactory52.setPersistSession(false);
        undertowEmbeddedServletContainerFactory52.accessLogEnabled = false;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet58 = undertowEmbeddedServletContainerFactory52.getErrorPages();
        undertowEmbeddedServletContainerFactory47.setErrorPages(errorPageSet58);
        undertowEmbeddedServletContainerFactory39.setErrorPages(errorPageSet58);
        undertowEmbeddedServletContainerFactory0.setErrorPages(errorPageSet58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet58);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean3 = undertowEmbeddedServletContainerFactory2.isPersistSession();
        java.io.File file4 = undertowEmbeddedServletContainerFactory2.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray5 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory2.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray5);
        org.springframework.boot.context.embedded.Ssl ssl7 = undertowEmbeddedServletContainerFactory2.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean9 = undertowEmbeddedServletContainerFactory8.isPersistSession();
        undertowEmbeddedServletContainerFactory8.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean13 = undertowEmbeddedServletContainerFactory12.isPersistSession();
        io.undertow.Undertow.Builder builder15 = undertowEmbeddedServletContainerFactory12.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager16 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer18 = undertowEmbeddedServletContainerFactory8.getUndertowEmbeddedServletContainer(builder15, deploymentManager16, (int) (byte) 1);
        io.undertow.servlet.api.DeploymentManager deploymentManager19 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer21 = undertowEmbeddedServletContainerFactory2.getUndertowEmbeddedServletContainer(builder15, deploymentManager19, (int) 'a');
        io.undertow.servlet.api.DeploymentManager deploymentManager22 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer24 = undertowEmbeddedServletContainerFactory0.getUndertowEmbeddedServletContainer(builder15, deploymentManager22, (int) '#');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        java.net.InetAddress inetAddress28 = undertowEmbeddedServletContainerFactory27.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean30 = undertowEmbeddedServletContainerFactory29.isPersistSession();
        java.io.File file31 = undertowEmbeddedServletContainerFactory29.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings32 = undertowEmbeddedServletContainerFactory29.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader33 = undertowEmbeddedServletContainerFactory29.resourceLoader;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet34 = undertowEmbeddedServletContainerFactory29.getErrorPages();
        undertowEmbeddedServletContainerFactory27.setErrorPages(errorPageSet34);
        undertowEmbeddedServletContainerFactory0.setErrorPages(errorPageSet34);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet37 = undertowEmbeddedServletContainerFactory0.getErrorPages();
        undertowEmbeddedServletContainerFactory0.setDirectBuffers((java.lang.Boolean) false);
        org.springframework.boot.context.embedded.JspServlet jspServlet40 = undertowEmbeddedServletContainerFactory0.getJspServlet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet40);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray3 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory0.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray3);
        org.springframework.boot.context.embedded.Ssl ssl5 = undertowEmbeddedServletContainerFactory0.getSsl();
        undertowEmbeddedServletContainerFactory0.setPort((int) (short) -1);
        undertowEmbeddedServletContainerFactory0.setPersistSession(true);
        java.lang.Integer int10 = undertowEmbeddedServletContainerFactory0.bufferSize;
        int int11 = undertowEmbeddedServletContainerFactory0.getSessionTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1800 + "'", int11 == 1800);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean3 = undertowEmbeddedServletContainerFactory2.isPersistSession();
        java.io.File file4 = undertowEmbeddedServletContainerFactory2.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray5 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory2.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray5);
        org.springframework.boot.context.embedded.Ssl ssl7 = undertowEmbeddedServletContainerFactory2.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory8 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean9 = undertowEmbeddedServletContainerFactory8.isPersistSession();
        undertowEmbeddedServletContainerFactory8.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean13 = undertowEmbeddedServletContainerFactory12.isPersistSession();
        io.undertow.Undertow.Builder builder15 = undertowEmbeddedServletContainerFactory12.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager16 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer18 = undertowEmbeddedServletContainerFactory8.getUndertowEmbeddedServletContainer(builder15, deploymentManager16, (int) (byte) 1);
        io.undertow.servlet.api.DeploymentManager deploymentManager19 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer21 = undertowEmbeddedServletContainerFactory2.getUndertowEmbeddedServletContainer(builder15, deploymentManager19, (int) 'a');
        io.undertow.servlet.api.DeploymentManager deploymentManager22 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer24 = undertowEmbeddedServletContainerFactory0.getUndertowEmbeddedServletContainer(builder15, deploymentManager22, (int) '#');
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory27 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        java.net.InetAddress inetAddress28 = undertowEmbeddedServletContainerFactory27.getAddress();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory29 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean30 = undertowEmbeddedServletContainerFactory29.isPersistSession();
        java.io.File file31 = undertowEmbeddedServletContainerFactory29.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings32 = undertowEmbeddedServletContainerFactory29.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader33 = undertowEmbeddedServletContainerFactory29.resourceLoader;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet34 = undertowEmbeddedServletContainerFactory29.getErrorPages();
        undertowEmbeddedServletContainerFactory27.setErrorPages(errorPageSet34);
        undertowEmbeddedServletContainerFactory0.setErrorPages(errorPageSet34);
        java.io.File file37 = null;
        undertowEmbeddedServletContainerFactory0.setAccessLogDirectory(file37);
        undertowEmbeddedServletContainerFactory0.workerThreads = 10;
        org.springframework.core.io.ResourceLoader resourceLoader41 = null;
        undertowEmbeddedServletContainerFactory0.setResourceLoader(resourceLoader41);
        undertowEmbeddedServletContainerFactory0.setAccessLogEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet34);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        io.undertow.Undertow.Builder builder3 = undertowEmbeddedServletContainerFactory0.createBuilder((int) (short) 0);
        undertowEmbeddedServletContainerFactory0.useForwardHeaders = false;
        undertowEmbeddedServletContainerFactory0.directBuffers = false;
        undertowEmbeddedServletContainerFactory0.setRegisterDefaultServlet(false);
        org.xnio.XnioWorker xnioWorker10 = undertowEmbeddedServletContainerFactory0.createWorker();
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        undertowEmbeddedServletContainerFactory0.setResourceLoader(resourceLoader11);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean14 = undertowEmbeddedServletContainerFactory13.isPersistSession();
        io.undertow.Undertow.Builder builder16 = undertowEmbeddedServletContainerFactory13.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings17 = undertowEmbeddedServletContainerFactory13.getMimeMappings();
        int int18 = undertowEmbeddedServletContainerFactory13.getPort();
        java.lang.ClassLoader classLoader19 = undertowEmbeddedServletContainerFactory13.getServletClassLoader();
        undertowEmbeddedServletContainerFactory13.useForwardHeaders = false;
        undertowEmbeddedServletContainerFactory13.setDisplayName("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean25 = undertowEmbeddedServletContainerFactory24.isPersistSession();
        java.io.File file26 = undertowEmbeddedServletContainerFactory24.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings27 = undertowEmbeddedServletContainerFactory24.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader28 = undertowEmbeddedServletContainerFactory24.resourceLoader;
        undertowEmbeddedServletContainerFactory24.setBufferSize((java.lang.Integer) 1);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList31 = undertowEmbeddedServletContainerFactory24.builderCustomizers;
        undertowEmbeddedServletContainerFactory13.builderCustomizers = undertowBuilderCustomizerList31;
        undertowEmbeddedServletContainerFactory0.setBuilderCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList31);
        undertowEmbeddedServletContainerFactory0.bufferSize = 10;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean37 = undertowEmbeddedServletContainerFactory36.isPersistSession();
        io.undertow.Undertow.Builder builder39 = undertowEmbeddedServletContainerFactory36.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings40 = undertowEmbeddedServletContainerFactory36.getMimeMappings();
        int int41 = undertowEmbeddedServletContainerFactory36.getPort();
        java.lang.ClassLoader classLoader42 = undertowEmbeddedServletContainerFactory36.getServletClassLoader();
        undertowEmbeddedServletContainerFactory36.useForwardHeaders = false;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory45 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean46 = undertowEmbeddedServletContainerFactory45.isPersistSession();
        java.io.File file47 = undertowEmbeddedServletContainerFactory45.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings48 = undertowEmbeddedServletContainerFactory45.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader49 = undertowEmbeddedServletContainerFactory45.resourceLoader;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet50 = undertowEmbeddedServletContainerFactory45.getErrorPages();
        undertowEmbeddedServletContainerFactory36.setErrorPages(errorPageSet50);
        undertowEmbeddedServletContainerFactory0.setErrorPages(errorPageSet50);
        java.lang.Integer int53 = undertowEmbeddedServletContainerFactory0.workerThreads;
        boolean boolean54 = undertowEmbeddedServletContainerFactory0.useForwardHeaders;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(xnioWorker10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8080 + "'", int18 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8080 + "'", int41 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory1 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory(8080);
        undertowEmbeddedServletContainerFactory1.buffersPerRegion = 1;
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 100);
        undertowEmbeddedServletContainerFactory1.setBuffersPerRegion((java.lang.Integer) 1800);
        io.undertow.Undertow.Builder builder9 = undertowEmbeddedServletContainerFactory1.createBuilder((int) 'a');
        undertowEmbeddedServletContainerFactory1.setIoThreads((java.lang.Integer) 0);
        int int12 = undertowEmbeddedServletContainerFactory1.getSessionTimeout();
        int int13 = undertowEmbeddedServletContainerFactory1.getPort();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer14 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory15 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean16 = undertowEmbeddedServletContainerFactory15.isPersistSession();
        java.io.File file17 = undertowEmbeddedServletContainerFactory15.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList18 = undertowEmbeddedServletContainerFactory15.builderCustomizers;
        undertowEmbeddedServletContainerFactory15.setDisplayName("hi!");
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray21 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory15.addErrorPages(errorPageArray21);
        java.net.InetAddress inetAddress23 = undertowEmbeddedServletContainerFactory15.getAddress();
        undertowEmbeddedServletContainerFactory15.ioThreads = 0;
        undertowEmbeddedServletContainerFactory15.setDisplayName("hi!");
        undertowEmbeddedServletContainerFactory15.setJspServletClassName("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory32 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory32.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file35 = null;
        undertowEmbeddedServletContainerFactory32.accessLogDirectory = file35;
        boolean boolean37 = undertowEmbeddedServletContainerFactory32.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray38 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory32.addInitializers(servletContextInitializerArray38);
        undertowEmbeddedServletContainerFactory15.addInitializers(servletContextInitializerArray38);
        initializer14.initializers = servletContextInitializerArray38;
        undertowEmbeddedServletContainerFactory1.addInitializers(servletContextInitializerArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1800 + "'", int12 == 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8080 + "'", int13 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inetAddress23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray38);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] undertowDeploymentInfoCustomizerArray3 = new org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer[] {};
        undertowEmbeddedServletContainerFactory0.addDeploymentInfoCustomizers(undertowDeploymentInfoCustomizerArray3);
        org.springframework.boot.context.embedded.Ssl ssl5 = undertowEmbeddedServletContainerFactory0.getSsl();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory6 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean7 = undertowEmbeddedServletContainerFactory6.isPersistSession();
        undertowEmbeddedServletContainerFactory6.setPersistSession(false);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory10 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean11 = undertowEmbeddedServletContainerFactory10.isPersistSession();
        io.undertow.Undertow.Builder builder13 = undertowEmbeddedServletContainerFactory10.createBuilder((int) (short) 0);
        io.undertow.servlet.api.DeploymentManager deploymentManager14 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer16 = undertowEmbeddedServletContainerFactory6.getUndertowEmbeddedServletContainer(builder13, deploymentManager14, (int) (byte) 1);
        io.undertow.servlet.api.DeploymentManager deploymentManager17 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainer undertowEmbeddedServletContainer19 = undertowEmbeddedServletContainerFactory0.getUndertowEmbeddedServletContainer(builder13, deploymentManager17, (int) 'a');
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowDeploymentInfoCustomizer> undertowDeploymentInfoCustomizerCollection20 = undertowEmbeddedServletContainerFactory0.getDeploymentInfoCustomizers();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory21 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        undertowEmbeddedServletContainerFactory21.setIoThreads((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean25 = undertowEmbeddedServletContainerFactory24.isPersistSession();
        org.springframework.boot.context.embedded.JspServlet jspServlet26 = undertowEmbeddedServletContainerFactory24.getJspServlet();
        undertowEmbeddedServletContainerFactory21.setJspServlet(jspServlet26);
        undertowEmbeddedServletContainerFactory0.setJspServlet(jspServlet26);
        java.lang.String str29 = undertowEmbeddedServletContainerFactory0.getContextPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(ssl5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowEmbeddedServletContainer19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowDeploymentInfoCustomizerCollection20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        org.springframework.boot.context.embedded.JspServlet jspServlet2 = undertowEmbeddedServletContainerFactory0.getJspServlet();
        org.springframework.core.io.ResourceLoader resourceLoader3 = undertowEmbeddedServletContainerFactory0.resourceLoader;
        java.util.concurrent.TimeUnit timeUnit5 = null;
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory0.setSessionTimeout((int) '#', timeUnit5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: TimeUnit must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jspServlet2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader3);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings3 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        java.lang.Integer int4 = undertowEmbeddedServletContainerFactory0.bufferSize;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer undertowBuilderCustomizer5 = null;
        org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] undertowBuilderCustomizerArray6 = new org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer[] { undertowBuilderCustomizer5 };
        undertowEmbeddedServletContainerFactory0.addBuilderCustomizers(undertowBuilderCustomizerArray6);
        boolean boolean8 = undertowEmbeddedServletContainerFactory0.accessLogEnabled;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        undertowEmbeddedServletContainerFactory0.setPersistSession(false);
        undertowEmbeddedServletContainerFactory0.accessLogEnabled = false;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet6 = undertowEmbeddedServletContainerFactory0.getErrorPages();
        undertowEmbeddedServletContainerFactory0.setRegisterDefaultServlet(true);
        java.lang.Boolean boolean9 = undertowEmbeddedServletContainerFactory0.directBuffers;
        undertowEmbeddedServletContainerFactory0.setDisplayName("hi!");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean13 = undertowEmbeddedServletContainerFactory12.isPersistSession();
        undertowEmbeddedServletContainerFactory12.accessLogEnabled = false;
        undertowEmbeddedServletContainerFactory12.setRegisterDefaultServlet(true);
        undertowEmbeddedServletContainerFactory12.setBufferSize((java.lang.Integer) 8080);
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet20 = undertowEmbeddedServletContainerFactory12.getErrorPages();
        undertowEmbeddedServletContainerFactory0.setErrorPages(errorPageSet20);
        java.lang.Integer int22 = undertowEmbeddedServletContainerFactory0.buffersPerRegion;
        org.springframework.boot.context.embedded.Ssl ssl23 = null;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory25 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean26 = undertowEmbeddedServletContainerFactory25.isPersistSession();
        java.io.File file27 = undertowEmbeddedServletContainerFactory25.accessLogDirectory;
        undertowEmbeddedServletContainerFactory25.setSessionTimeout(1);
        boolean boolean30 = undertowEmbeddedServletContainerFactory25.accessLogEnabled;
        io.undertow.Undertow.Builder builder32 = undertowEmbeddedServletContainerFactory25.createBuilder((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            undertowEmbeddedServletContainerFactory0.configureSsl(ssl23, (-1), builder32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager();
        jarResourceManager0.close();
        jarResourceManager0.jarPath = "0.0.0.0";
        java.lang.String str4 = jarResourceManager0.jarPath;
        boolean boolean5 = jarResourceManager0.isResourceChangeListenerSupported();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0.0.0.0" + "'", str4.equals("0.0.0.0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file5 = null;
        undertowEmbeddedServletContainerFactory2.accessLogDirectory = file5;
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 10);
        java.lang.Integer int9 = undertowEmbeddedServletContainerFactory2.bufferSize;
        org.springframework.core.io.ResourceLoader resourceLoader10 = null;
        undertowEmbeddedServletContainerFactory2.setResourceLoader(resourceLoader10);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer initializer12 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.Initializer();
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean14 = undertowEmbeddedServletContainerFactory13.isPersistSession();
        java.io.File file15 = undertowEmbeddedServletContainerFactory13.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings16 = undertowEmbeddedServletContainerFactory13.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader17 = undertowEmbeddedServletContainerFactory13.resourceLoader;
        java.io.File file18 = null;
        undertowEmbeddedServletContainerFactory13.setSessionStoreDir(file18);
        io.undertow.servlet.api.DeploymentInfo deploymentInfo20 = null;
        undertowEmbeddedServletContainerFactory13.configureErrorPages(deploymentInfo20);
        org.springframework.boot.context.embedded.ServletContextInitializer servletContextInitializer22 = null;
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray23 = new org.springframework.boot.context.embedded.ServletContextInitializer[] { servletContextInitializer22 };
        undertowEmbeddedServletContainerFactory13.addInitializers(servletContextInitializerArray23);
        initializer12.initializers = servletContextInitializerArray23;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory26 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean27 = undertowEmbeddedServletContainerFactory26.isPersistSession();
        java.io.File file28 = undertowEmbeddedServletContainerFactory26.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings29 = undertowEmbeddedServletContainerFactory26.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader30 = undertowEmbeddedServletContainerFactory26.resourceLoader;
        java.io.File file31 = null;
        undertowEmbeddedServletContainerFactory26.setSessionStoreDir(file31);
        undertowEmbeddedServletContainerFactory26.setBufferSize((java.lang.Integer) (-1));
        java.io.File file35 = null;
        undertowEmbeddedServletContainerFactory26.accessLogDirectory = file35;
        java.lang.Integer int37 = undertowEmbeddedServletContainerFactory26.buffersPerRegion;
        undertowEmbeddedServletContainerFactory26.setRegisterDefaultServlet(false);
        undertowEmbeddedServletContainerFactory26.setBuffersPerRegion((java.lang.Integer) 1);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory42 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean43 = undertowEmbeddedServletContainerFactory42.isPersistSession();
        java.io.File file44 = undertowEmbeddedServletContainerFactory42.accessLogDirectory;
        undertowEmbeddedServletContainerFactory42.setSessionTimeout(1);
        boolean boolean47 = undertowEmbeddedServletContainerFactory42.accessLogEnabled;
        undertowEmbeddedServletContainerFactory42.setAccessLogPattern("0.0.0.0");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory52 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory52.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file55 = null;
        undertowEmbeddedServletContainerFactory52.accessLogDirectory = file55;
        boolean boolean57 = undertowEmbeddedServletContainerFactory52.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray58 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory52.addInitializers(servletContextInitializerArray58);
        org.springframework.boot.context.embedded.EmbeddedServletContainer embeddedServletContainer60 = undertowEmbeddedServletContainerFactory42.getEmbeddedServletContainer(servletContextInitializerArray58);
        undertowEmbeddedServletContainerFactory26.addInitializers(servletContextInitializerArray58);
        initializer12.initializers = servletContextInitializerArray58;
        io.undertow.servlet.api.DeploymentManager deploymentManager63 = undertowEmbeddedServletContainerFactory2.createDeploymentManager(servletContextInitializerArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(embeddedServletContainer60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(deploymentManager63);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager();
        java.lang.String str1 = jarResourceManager0.jarPath;
        boolean boolean2 = jarResourceManager0.isResourceChangeListenerSupported();
        jarResourceManager0.close();
        jarResourceManager0.jarPath = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        undertowEmbeddedServletContainerFactory0.setPersistSession(false);
        undertowEmbeddedServletContainerFactory0.accessLogEnabled = false;
        undertowEmbeddedServletContainerFactory0.accessLogEnabled = true;
        java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerCollection8 = undertowEmbeddedServletContainerFactory0.getBuilderCustomizers();
        java.lang.Class<?> wildcardClass9 = undertowEmbeddedServletContainerFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) ' ');
        undertowEmbeddedServletContainerFactory2.accessLogPattern = "";
        java.lang.Integer int5 = undertowEmbeddedServletContainerFactory2.ioThreads;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", (int) (byte) -1);
        java.lang.Boolean boolean3 = undertowEmbeddedServletContainerFactory2.directBuffers;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings4 = undertowEmbeddedServletContainerFactory2.getMimeMappings();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(boolean3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings4);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList3 = undertowEmbeddedServletContainerFactory0.builderCustomizers;
        int int4 = undertowEmbeddedServletContainerFactory0.getPort();
        undertowEmbeddedServletContainerFactory0.setPort((int) '#');
        undertowEmbeddedServletContainerFactory0.accessLogPattern = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8080 + "'", int4 == 8080);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings3 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        java.lang.Integer int4 = undertowEmbeddedServletContainerFactory0.bufferSize;
        java.io.File file5 = null;
        undertowEmbeddedServletContainerFactory0.setDocumentRoot(file5);
        java.io.File file7 = null;
        undertowEmbeddedServletContainerFactory0.setSessionStoreDir(file7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        java.io.File file2 = undertowEmbeddedServletContainerFactory0.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings3 = undertowEmbeddedServletContainerFactory0.getMimeMappings();
        java.lang.Integer int4 = undertowEmbeddedServletContainerFactory0.bufferSize;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory5 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean6 = undertowEmbeddedServletContainerFactory5.isPersistSession();
        undertowEmbeddedServletContainerFactory5.setPersistSession(false);
        undertowEmbeddedServletContainerFactory5.accessLogEnabled = false;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet11 = undertowEmbeddedServletContainerFactory5.getErrorPages();
        undertowEmbeddedServletContainerFactory0.setErrorPages(errorPageSet11);
        java.lang.Integer int13 = undertowEmbeddedServletContainerFactory0.buffersPerRegion;
        undertowEmbeddedServletContainerFactory0.setRegisterDefaultServlet(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory2 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory("", 1);
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 0);
        java.io.File file5 = null;
        undertowEmbeddedServletContainerFactory2.accessLogDirectory = file5;
        boolean boolean7 = undertowEmbeddedServletContainerFactory2.isRegisterDefaultServlet();
        org.springframework.boot.context.embedded.ServletContextInitializer[] servletContextInitializerArray8 = new org.springframework.boot.context.embedded.ServletContextInitializer[] {};
        undertowEmbeddedServletContainerFactory2.addInitializers(servletContextInitializerArray8);
        org.springframework.boot.context.embedded.ErrorPage[] errorPageArray10 = new org.springframework.boot.context.embedded.ErrorPage[] {};
        undertowEmbeddedServletContainerFactory2.addErrorPages(errorPageArray10);
        undertowEmbeddedServletContainerFactory2.useForwardHeaders = true;
        java.io.File file14 = undertowEmbeddedServletContainerFactory2.getDocumentRoot();
        undertowEmbeddedServletContainerFactory2.setBuffersPerRegion((java.lang.Integer) 1800);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(servletContextInitializerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file14);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean1 = undertowEmbeddedServletContainerFactory0.isPersistSession();
        io.undertow.Undertow.Builder builder3 = undertowEmbeddedServletContainerFactory0.createBuilder((int) (short) 0);
        undertowEmbeddedServletContainerFactory0.useForwardHeaders = false;
        undertowEmbeddedServletContainerFactory0.directBuffers = false;
        undertowEmbeddedServletContainerFactory0.setRegisterDefaultServlet(false);
        org.xnio.XnioWorker xnioWorker10 = undertowEmbeddedServletContainerFactory0.createWorker();
        org.springframework.core.io.ResourceLoader resourceLoader11 = null;
        undertowEmbeddedServletContainerFactory0.setResourceLoader(resourceLoader11);
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory13 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean14 = undertowEmbeddedServletContainerFactory13.isPersistSession();
        io.undertow.Undertow.Builder builder16 = undertowEmbeddedServletContainerFactory13.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings17 = undertowEmbeddedServletContainerFactory13.getMimeMappings();
        int int18 = undertowEmbeddedServletContainerFactory13.getPort();
        java.lang.ClassLoader classLoader19 = undertowEmbeddedServletContainerFactory13.getServletClassLoader();
        undertowEmbeddedServletContainerFactory13.useForwardHeaders = false;
        undertowEmbeddedServletContainerFactory13.setDisplayName("");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory24 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean25 = undertowEmbeddedServletContainerFactory24.isPersistSession();
        java.io.File file26 = undertowEmbeddedServletContainerFactory24.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings27 = undertowEmbeddedServletContainerFactory24.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader28 = undertowEmbeddedServletContainerFactory24.resourceLoader;
        undertowEmbeddedServletContainerFactory24.setBufferSize((java.lang.Integer) 1);
        java.util.List<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer> undertowBuilderCustomizerList31 = undertowEmbeddedServletContainerFactory24.builderCustomizers;
        undertowEmbeddedServletContainerFactory13.builderCustomizers = undertowBuilderCustomizerList31;
        undertowEmbeddedServletContainerFactory0.setBuilderCustomizers((java.util.Collection<org.springframework.boot.context.embedded.undertow.UndertowBuilderCustomizer>) undertowBuilderCustomizerList31);
        undertowEmbeddedServletContainerFactory0.bufferSize = 10;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory36 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean37 = undertowEmbeddedServletContainerFactory36.isPersistSession();
        io.undertow.Undertow.Builder builder39 = undertowEmbeddedServletContainerFactory36.createBuilder((int) (short) 0);
        org.springframework.boot.context.embedded.MimeMappings mimeMappings40 = undertowEmbeddedServletContainerFactory36.getMimeMappings();
        int int41 = undertowEmbeddedServletContainerFactory36.getPort();
        java.lang.ClassLoader classLoader42 = undertowEmbeddedServletContainerFactory36.getServletClassLoader();
        undertowEmbeddedServletContainerFactory36.useForwardHeaders = false;
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory undertowEmbeddedServletContainerFactory45 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory();
        boolean boolean46 = undertowEmbeddedServletContainerFactory45.isPersistSession();
        java.io.File file47 = undertowEmbeddedServletContainerFactory45.accessLogDirectory;
        org.springframework.boot.context.embedded.MimeMappings mimeMappings48 = undertowEmbeddedServletContainerFactory45.getMimeMappings();
        org.springframework.core.io.ResourceLoader resourceLoader49 = undertowEmbeddedServletContainerFactory45.resourceLoader;
        java.util.Set<org.springframework.boot.context.embedded.ErrorPage> errorPageSet50 = undertowEmbeddedServletContainerFactory45.getErrorPages();
        undertowEmbeddedServletContainerFactory36.setErrorPages(errorPageSet50);
        undertowEmbeddedServletContainerFactory0.setErrorPages(errorPageSet50);
        undertowEmbeddedServletContainerFactory0.workerThreads = 100;
        org.springframework.boot.context.embedded.Ssl ssl55 = null;
        undertowEmbeddedServletContainerFactory0.setSsl(ssl55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(xnioWorker10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8080 + "'", int18 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(undertowBuilderCustomizerList31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8080 + "'", int41 == 8080);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(classLoader42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(file47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mimeMappings48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(resourceLoader49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(errorPageSet50);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager jarResourceManager0 = new org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory.JarResourceManager();
        jarResourceManager0.jarPath = "";
        boolean boolean3 = jarResourceManager0.isResourceChangeListenerSupported();
        boolean boolean4 = jarResourceManager0.isResourceChangeListenerSupported();
        jarResourceManager0.jarPath = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }
}

