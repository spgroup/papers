import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str10 = hikariConfig9.getCatalog();
        long long11 = hikariConfig9.getIdleTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        long long7 = hikariConfig0.getConnectionTimeout();
        boolean boolean8 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionInitSql("HikariPool-829");
        java.lang.String str11 = hikariConfig0.getJdbcUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        java.lang.String str11 = hikariConfig0.getCatalog();
        hikariConfig0.setCatalog("HikariPool-1059");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        long long10 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIsolateInternalQueries(true);
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setTransactionIsolation("HikariPool-1361");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setDataSourceClassName("hi!");
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.setDataSourceClassName("HikariPool-514");
        boolean boolean16 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setIsolateInternalQueries(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setRegisterMbeans(true);
        long long13 = hikariConfig0.getMaxLifetime();
        int int14 = hikariConfig0.getAcquireIncrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setPoolName("HikariPool-510");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setAcquireRetries(10);
        hikariConfig1.setConnectionTestQuery("");
        java.lang.String str16 = hikariConfig1.getCatalog();
        hikariConfig1.setMaximumPoolSize((int) (short) 10);
        long long19 = hikariConfig1.getConnectionTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        int int6 = hikariConfig0.getTransactionIsolation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        hikariConfig0.setJdbcUrl("");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-1229");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-1229' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setTransactionIsolation("HikariPool-377");
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        boolean boolean14 = hikariConfig12.isReadOnly();
        int int15 = hikariConfig12.getAcquireIncrement();
        java.lang.String str16 = hikariConfig12.getDataSourceClassName();
        hikariConfig12.setConnectionTimeout((long) 0);
        hikariConfig12.setIdleTimeout((long) 100);
        int int21 = hikariConfig12.getTransactionIsolation();
        hikariConfig0.addDataSourceProperty("HikariPool-1601", (java.lang.Object) hikariConfig12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setMaximumPoolSize(3);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-250");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-250' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        int int8 = hikariConfig7.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        boolean boolean11 = hikariConfig9.isReadOnly();
        int int12 = hikariConfig9.getAcquireIncrement();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig9.setDataSource(dataSource13);
        hikariConfig9.setMaxLifetime((long) 1);
        java.lang.String str17 = hikariConfig9.getJdbcUrl();
        hikariConfig9.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource20 = null;
        hikariConfig9.setDataSource(dataSource20);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean23 = hikariConfig22.isJdbc4ConnectionTest();
        long long24 = hikariConfig22.getConnectionTimeout();
        hikariConfig22.setJdbcUrl("");
        java.lang.String str27 = hikariConfig22.getConnectionCustomizerClassName();
        java.util.Properties properties28 = hikariConfig22.getDataSourceProperties();
        hikariConfig9.setDataSourceProperties(properties28);
        hikariConfig7.setDataSourceProperties(properties28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 5000L + "'", long24 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties28);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str5 = hikariConfig0.getPoolName();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean8 = hikariConfig7.isJdbc4ConnectionTest();
        long long9 = hikariConfig7.getConnectionTimeout();
        boolean boolean10 = hikariConfig7.isIsolateInternalQueries();
        hikariConfig0.addDataSourceProperty("HikariPool-1631", (java.lang.Object) boolean10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "HikariPool-1733" + "'", str5.equals("HikariPool-1733"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setRegisterMbeans(true);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        int int14 = hikariConfig0.getAcquireIncrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        int int8 = hikariConfig0.getTransactionIsolation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setConnectionInitSql("HikariPool-137");
        int int5 = hikariConfig0.getAcquireIncrement();
        long long6 = hikariConfig0.getMaxLifetime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbcUrl("HikariPool-250");
        hikariConfig0.setPoolName("HikariPool-575");
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        int int15 = hikariConfig0.getTransactionIsolation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-377");
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setRegisterMbeans(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setJdbcUrl("HikariPool-1042");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setIdleTimeout((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-211");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-211' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-377");
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str9 = hikariConfig0.getCatalog();
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-1062");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-1062' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1143");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1143 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        java.lang.String str15 = hikariConfig1.getJdbcUrl();
        long long16 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setPoolName("HikariPool-514");
        java.lang.String str19 = hikariConfig1.getConnectionInitSql();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getConnectionTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.setPoolName("HikariPool-211");
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setTransactionIsolation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        java.lang.String str8 = hikariConfig0.getConnectionCustomizerClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAcquireRetryDelay((long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        int int11 = hikariConfig0.getMinimumPoolSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean5 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setTransactionIsolation("HikariPool-1059");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        java.lang.String str11 = hikariConfig0.getConnectionTestQuery();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setJdbc4ConnectionTest(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        long long5 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setConnectionInitSql("HikariPool-1511");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        java.lang.String str2 = hikariConfig0.getDataSourceClassName();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setJdbc4ConnectionTest(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setReadOnly(false);
        long long8 = hikariConfig0.getMaxLifetime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        boolean boolean7 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setJdbcUrl("HikariPool-960");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-1454");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-1454' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setIdleTimeout((long) (short) 100);
        java.lang.String str11 = hikariConfig0.getJdbcUrl();
        int int12 = hikariConfig0.getAcquireRetries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        hikariConfig0.setMaxLifetime((long) 100);
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionTestQuery("HikariPool-370");
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setAcquireRetryDelay(100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        boolean boolean10 = hikariConfig0.isReadOnly();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        boolean boolean10 = hikariConfig0.isInitializationFailFast();
        boolean boolean11 = hikariConfig0.isInitializationFailFast();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        hikariConfig0.setAutoCommit(true);
        int int10 = hikariConfig0.getAcquireIncrement();
        long long11 = hikariConfig0.getAcquireRetryDelay();
        int int12 = hikariConfig0.getTransactionIsolation();
        long long13 = hikariConfig0.getIdleTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str2 = hikariConfig0.getCatalog();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setLeakDetectionThreshold((-1L));
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setPoolName("HikariPool-1544");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setDataSourceClassName("HikariPool-250");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        int int6 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setMinimumPoolSize(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        int int6 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setInitializationFailFast(true);
        boolean boolean9 = hikariConfig0.isIsolateInternalQueries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setReadOnly(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        hikariConfig0.setRegisterMbeans(true);
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str8 = hikariConfig7.getConnectionInitSql();
        int int9 = hikariConfig7.getMinimumPoolSize();
        javax.sql.DataSource dataSource10 = hikariConfig7.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.addDataSourceProperty("HikariPool-1361", (java.lang.Object) dataSource10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        java.lang.String str11 = hikariConfig0.getCatalog();
        long long12 = hikariConfig0.getMaxLifetime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1800000L + "'", long12 == 1800000L);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setMinimumPoolSize((int) (short) 100);
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        boolean boolean12 = hikariConfig0.isInitializationFailFast();
        boolean boolean13 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean14 = hikariConfig0.isReadOnly();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        int int8 = hikariConfig7.getAcquireRetries();
        hikariConfig7.setConnectionInitSql("");
        hikariConfig7.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str13 = hikariConfig7.getDataSourceClassName();
        boolean boolean14 = hikariConfig7.isIsolateInternalQueries();
        boolean boolean15 = hikariConfig7.isReadOnly();
        boolean boolean16 = hikariConfig7.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean18 = hikariConfig17.isJdbc4ConnectionTest();
        long long19 = hikariConfig17.getConnectionTimeout();
        hikariConfig17.setJdbcUrl("");
        java.lang.String str22 = hikariConfig17.getConnectionCustomizerClassName();
        java.util.Properties properties23 = hikariConfig17.getDataSourceProperties();
        hikariConfig7.setDataSourceProperties(properties23);
        hikariConfig0.setDataSourceProperties(properties23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.setIdleTimeout((long) 0);
        hikariConfig0.setMaximumPoolSize(0);
        long long14 = hikariConfig0.getIdleTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setConnectionTimeout(0L);
        hikariConfig1.setReadOnly(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        java.lang.String str6 = hikariConfig0.getPoolName();
        java.lang.String str7 = hikariConfig0.getPoolName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HikariPool-1805" + "'", str6.equals("HikariPool-1805"));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HikariPool-1805" + "'", str7.equals("HikariPool-1805"));
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        boolean boolean6 = hikariConfig0.isInitializationFailFast();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        java.lang.String str11 = hikariConfig0.getCatalog();
        hikariConfig0.setLeakDetectionThreshold((long) (short) 100);
        hikariConfig0.setReadOnly(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setTransactionIsolation("HikariPool-1631");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str2 = hikariConfig0.getCatalog();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isReadOnly();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setAcquireIncrement(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long10 = hikariConfig0.getIdleTimeout();
        int int11 = hikariConfig0.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        boolean boolean14 = hikariConfig12.isReadOnly();
        int int15 = hikariConfig12.getAcquireIncrement();
        hikariConfig12.setConnectionTestQuery("hi!");
        hikariConfig12.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig12.setAutoCommit(true);
        java.util.Properties properties22 = hikariConfig12.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties22);
        java.lang.String str24 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setJdbcUrl("HikariPool-903");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setIsolateInternalQueries(true);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setTransactionIsolation("HikariPool-573");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        hikariConfig0.setMaxLifetime((long) 100);
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionTestQuery("HikariPool-370");
        hikariConfig0.setAcquireRetries((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setDataSourceClassName("HikariPool-370");
        hikariConfig0.setAutoCommit(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getAcquireIncrement();
        long long5 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str6 = hikariConfig0.getConnectionCustomizerClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        javax.sql.DataSource dataSource5 = null;
        hikariConfig0.setDataSource(dataSource5);
        int int7 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setInitializationFailFast(true);
        java.lang.String str10 = hikariConfig0.getCatalog();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig12.setAcquireRetryDelay((long) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setPoolName("HikariPool-1733");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        hikariConfig0.setReadOnly(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = null;
        hikariConfig0.setDataSource(dataSource1);
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbcUrl("HikariPool-250");
        hikariConfig0.setPoolName("HikariPool-575");
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setIdleTimeout((long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setLeakDetectionThreshold((long) '#');
        long long8 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setTransactionIsolation("HikariPool-1301");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-377");
        int int7 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setMinimumPoolSize(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionInitSql("hi!");
        int int10 = hikariConfig0.getAcquireIncrement();
        int int11 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setMinimumPoolSize(3);
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setCatalog("HikariPool-575");
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str10 = hikariConfig9.getCatalog();
        hikariConfig9.setTransactionIsolation("");
        long long13 = hikariConfig9.getIdleTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setCatalog("HikariPool-250");
        long long14 = hikariConfig0.getMaxLifetime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HikariPool-1847" + "'", str7.equals("HikariPool-1847"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setLeakDetectionThreshold(5000L);
        hikariConfig0.setAcquireRetries(0);
        hikariConfig0.setReadOnly(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setMaximumPoolSize(0);
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        int int14 = hikariConfig0.getTransactionIsolation();
        javax.sql.DataSource dataSource15 = hikariConfig0.getDataSource();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource15);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean9 = hikariConfig8.isInitializationFailFast();
        boolean boolean10 = hikariConfig8.isReadOnly();
        int int11 = hikariConfig8.getAcquireIncrement();
        hikariConfig8.setConnectionCustomizerClassName("");
        hikariConfig8.setUseInstrumentation(true);
        java.lang.String str16 = hikariConfig8.getJdbcUrl();
        long long17 = hikariConfig8.getConnectionTimeout();
        java.util.Properties properties18 = hikariConfig8.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 5000L + "'", long17 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long10 = hikariConfig0.getIdleTimeout();
        int int11 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setPoolName("HikariPool-447");
        java.lang.String str14 = hikariConfig0.getConnectionInitSql();
        long long15 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setDataSourceClassName("HikariPool-903");
        hikariConfig0.setAcquireIncrement((int) ' ');
        boolean boolean20 = hikariConfig0.isReadOnly();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        long long9 = hikariConfig0.getMaxLifetime();
        int int10 = hikariConfig0.getTransactionIsolation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        long long8 = hikariConfig7.getMaxLifetime();
        hikariConfig7.setCatalog("HikariPool-510");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        java.lang.String str5 = hikariConfig0.getDataSourceClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.setMaximumPoolSize((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        int int6 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setCatalog("HikariPool-697");
        hikariConfig0.setMaxLifetime((long) (byte) 1);
        int int13 = hikariConfig0.getMinimumPoolSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        java.lang.String str12 = hikariConfig1.getPoolName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str12 + "' != '" + "HikariPool-1863" + "'", str12.equals("HikariPool-1863"));
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = null;
        hikariConfig0.setDataSource(dataSource1);
        int int3 = hikariConfig0.getAcquireRetries();
        javax.sql.DataSource dataSource4 = hikariConfig0.getDataSource();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-452");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-452' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource4);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str10 = hikariConfig9.getCatalog();
        boolean boolean11 = hikariConfig9.isInitializationFailFast();
        int int12 = hikariConfig9.getMaximumPoolSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        boolean boolean9 = hikariConfig0.isReadOnly();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        java.lang.String str11 = hikariConfig0.getCatalog();
        int int12 = hikariConfig0.getAcquireIncrement();
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setConnectionTimeout(5000L);
        hikariConfig0.setRegisterMbeans(false);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str14 = hikariConfig13.getConnectionInitSql();
        long long15 = hikariConfig13.getMaxLifetime();
        java.lang.String str16 = hikariConfig13.getDataSourceClassName();
        hikariConfig13.setIdleTimeout((long) (-1));
        java.lang.String str19 = hikariConfig13.getConnectionTestQuery();
        int int20 = hikariConfig13.getMaximumPoolSize();
        hikariConfig13.setAcquireRetryDelay((long) (byte) 0);
        java.util.Properties properties23 = hikariConfig13.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig(properties23);
        hikariConfig0.setDataSourceProperties(properties23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1800000L + "'", long15 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 60 + "'", int20 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties23);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig0.setDataSource(dataSource11);
        hikariConfig0.setDataSourceClassName("HikariPool-801");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean9 = hikariConfig8.isJdbc4ConnectionTest();
        int int10 = hikariConfig8.getMinimumPoolSize();
        hikariConfig8.setAutoCommit(true);
        int int13 = hikariConfig8.getMaximumPoolSize();
        hikariConfig0.addDataSourceProperty("HikariPool-250", (java.lang.Object) int13);
        hikariConfig0.setDataSourceClassName("HikariPool-377");
        boolean boolean17 = hikariConfig0.isAutoCommit();
        boolean boolean18 = hikariConfig0.isJdbc4ConnectionTest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        int int8 = hikariConfig0.getMaximumPoolSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setTransactionIsolation("HikariPool-1454");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        int int11 = hikariConfig0.getTransactionIsolation();
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetries((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbcUrl("HikariPool-250");
        hikariConfig0.setPoolName("HikariPool-575");
        int int14 = hikariConfig0.getAcquireIncrement();
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setAcquireRetryDelay(1800000L);
        hikariConfig0.setUseInstrumentation(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setLeakDetectionThreshold((long) '#');
        hikariConfig0.setLeakDetectionThreshold((long) (short) 10);
        java.lang.String str10 = hikariConfig0.getCatalog();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-370");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-370' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        long long6 = hikariConfig0.getConnectionTimeout();
        int int7 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("HikariPool-1361");
        hikariConfig0.setCatalog("HikariPool-1579");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        long long9 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setIdleTimeout((long) (short) 1);
        hikariConfig0.setAutoCommit(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetryDelay((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetryDelay cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        int int6 = hikariConfig0.getAcquireIncrement();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireIncrement((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be less than 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setAutoCommit(true);
        java.lang.String str7 = hikariConfig0.getCatalog();
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setTransactionIsolation("HikariPool-1301");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-377");
        hikariConfig0.setMinimumPoolSize((int) '#');
        hikariConfig0.setAcquireRetries(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMinimumPoolSize(60);
        boolean boolean4 = hikariConfig0.isReadOnly();
        hikariConfig0.setMaximumPoolSize((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setJdbcUrl("HikariPool-903");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        int int12 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAcquireIncrement(60);
        long long15 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setAcquireRetryDelay((long) 'a');
        boolean boolean18 = hikariConfig1.isAutoCommit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setJdbcUrl("");
        long long6 = hikariConfig1.getAcquireRetryDelay();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str9 = hikariConfig8.getConnectionInitSql();
        long long10 = hikariConfig8.getMaxLifetime();
        java.lang.String str11 = hikariConfig8.getConnectionCustomizerClassName();
        int int12 = hikariConfig8.getMaximumPoolSize();
        int int13 = hikariConfig8.getMaximumPoolSize();
        long long14 = hikariConfig8.getMaxLifetime();
        hikariConfig8.setAcquireIncrement((int) (byte) 100);
        hikariConfig8.setAcquireRetryDelay(600000L);
        hikariConfig8.setUseInstrumentation(false);
        hikariConfig8.setUseInstrumentation(true);
        hikariConfig1.addDataSourceProperty("HikariPool-1863", (java.lang.Object) true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        int int8 = hikariConfig0.getMaximumPoolSize();
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setMaxLifetime((long) ' ');
        int int11 = hikariConfig0.getMaximumPoolSize();
        long long12 = hikariConfig0.getAcquireRetryDelay();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig0.setDataSource(dataSource13);
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean16 = hikariConfig15.isInitializationFailFast();
        boolean boolean17 = hikariConfig15.isReadOnly();
        int int18 = hikariConfig15.getAcquireIncrement();
        java.lang.String str19 = hikariConfig15.getDataSourceClassName();
        hikariConfig15.setConnectionTimeout((long) 0);
        hikariConfig15.setAcquireRetries(60);
        hikariConfig15.setRegisterMbeans(false);
        hikariConfig15.setInitializationFailFast(false);
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig28.setConnectionInitSql("");
        hikariConfig28.setRegisterMbeans(true);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean34 = hikariConfig33.isJdbc4ConnectionTest();
        long long35 = hikariConfig33.getConnectionTimeout();
        hikariConfig33.setJdbcUrl("");
        java.lang.String str38 = hikariConfig33.getConnectionCustomizerClassName();
        java.util.Properties properties39 = hikariConfig33.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig40 = new com.zaxxer.hikari.HikariConfig(properties39);
        hikariConfig28.setDataSourceProperties(properties39);
        hikariConfig15.setDataSourceProperties(properties39);
        hikariConfig0.setDataSourceProperties(properties39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 5000L + "'", long35 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties39);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        java.lang.String str9 = hikariConfig0.getPoolName();
        boolean boolean10 = hikariConfig0.isRegisterMbeans();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str9 + "' != '" + "HikariPool-1915" + "'", str9.equals("HikariPool-1915"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig7.setReadOnly(false);
        hikariConfig7.setMinimumPoolSize(0);
        javax.sql.DataSource dataSource12 = null;
        hikariConfig7.setDataSource(dataSource12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        long long10 = hikariConfig0.getIdleTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setTransactionIsolation("HikariPool-1707");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMinimumPoolSize(100);
        hikariConfig0.setIdleTimeout((long) 100);
        hikariConfig0.setAcquireRetryDelay((long) '4');
        hikariConfig0.setAcquireRetries(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.setIdleTimeout((long) 0);
        hikariConfig0.setMaximumPoolSize(0);
        hikariConfig0.setConnectionInitSql("HikariPool-1458");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1454");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1454 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean4 = hikariConfig0.isReadOnly();
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setRegisterMbeans(false);
        int int8 = hikariConfig0.getTransactionIsolation();
        java.lang.String str9 = hikariConfig0.getCatalog();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setConnectionTestQuery("HikariPool-1059");
        boolean boolean11 = hikariConfig0.isJdbc4ConnectionTest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setAcquireRetryDelay(100L);
        int int7 = hikariConfig0.getMaximumPoolSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setJdbcUrl("hi!");
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        boolean boolean8 = hikariConfig0.isReadOnly();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        long long5 = hikariConfig0.getConnectionTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5000L + "'", long5 == 5000L);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean4 = hikariConfig0.isReadOnly();
        hikariConfig0.setRegisterMbeans(false);
        int int7 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setIdleTimeout((long) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        java.lang.String str15 = hikariConfig1.getJdbcUrl();
        long long16 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setPoolName("HikariPool-514");
        hikariConfig1.setLeakDetectionThreshold(600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getJdbcUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        boolean boolean10 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTimeout((long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        int int12 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setDataSourceClassName("");
        java.lang.String str15 = hikariConfig1.getCatalog();
        hikariConfig1.setLeakDetectionThreshold(600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setReadOnly(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setMaxLifetime((long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.setJdbcUrl("hi!");
        java.lang.String str10 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HikariPool-1949" + "'", str7.equals("HikariPool-1949"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setDataSourceClassName("HikariPool-370");
        java.lang.String str11 = hikariConfig0.getCatalog();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setIdleTimeout((long) (byte) 10);
        hikariConfig0.setRegisterMbeans(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setAcquireIncrement((int) (short) 100);
        long long10 = hikariConfig0.getMaxLifetime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionTestQuery("");
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setAcquireRetries(3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setInitializationFailFast(false);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig13.setConnectionInitSql("");
        hikariConfig13.setRegisterMbeans(true);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean19 = hikariConfig18.isJdbc4ConnectionTest();
        long long20 = hikariConfig18.getConnectionTimeout();
        hikariConfig18.setJdbcUrl("");
        java.lang.String str23 = hikariConfig18.getConnectionCustomizerClassName();
        java.util.Properties properties24 = hikariConfig18.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig13.setDataSourceProperties(properties24);
        hikariConfig0.setDataSourceProperties(properties24);
        hikariConfig0.setReadOnly(false);
        int int30 = hikariConfig0.getTransactionIsolation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str10 = hikariConfig9.getConnectionInitSql();
        long long11 = hikariConfig9.getMaxLifetime();
        java.lang.Class<?> wildcardClass12 = hikariConfig9.getClass();
        hikariConfig0.addDataSourceProperty("HikariPool-510", (java.lang.Object) wildcardClass12);
        hikariConfig0.setMaxLifetime((long) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        long long7 = hikariConfig0.getConnectionTimeout();
        boolean boolean8 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionInitSql("HikariPool-829");
        int int11 = hikariConfig0.getMaximumPoolSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.setPoolName("HikariPool-211");
        java.lang.String str10 = hikariConfig0.getPoolName();
        hikariConfig0.setMinimumPoolSize(0);
        int int13 = hikariConfig0.getMinimumPoolSize();
        long long14 = hikariConfig0.getConnectionTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "HikariPool-211" + "'", str10.equals("HikariPool-211"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long10 = hikariConfig0.getIdleTimeout();
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource12);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str5 = hikariConfig0.getPoolName();
        long long6 = hikariConfig0.getAcquireRetryDelay();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "HikariPool-1969" + "'", str5.equals("HikariPool-1969"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str10 = hikariConfig9.getConnectionCustomizerClassName();
        hikariConfig9.setJdbcUrl("HikariPool-510");
        java.lang.String str13 = hikariConfig9.getCatalog();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setPoolName("hi!");
        long long6 = hikariConfig0.getConnectionTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = hikariConfig0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HikariPool-137" + "'", str6.equals("HikariPool-137"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        int int8 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str9 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setUseInstrumentation(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        java.util.Properties properties3 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setInitializationFailFast(false);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long10 = hikariConfig0.getIdleTimeout();
        int int11 = hikariConfig0.getAcquireRetries();
        javax.sql.DataSource dataSource12 = hikariConfig0.getDataSource();
        long long13 = hikariConfig0.getMaxLifetime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setCatalog("HikariPool-1104");
        hikariConfig0.setPoolName("HikariPool-510");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        long long5 = hikariConfig0.getIdleTimeout();
        java.util.Properties properties7 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        hikariConfig8.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean12 = hikariConfig11.isJdbc4ConnectionTest();
        long long13 = hikariConfig11.getConnectionTimeout();
        hikariConfig11.setJdbcUrl("");
        java.lang.String str16 = hikariConfig11.getConnectionCustomizerClassName();
        java.util.Properties properties17 = hikariConfig11.getDataSourceProperties();
        hikariConfig8.setDataSourceProperties(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig0.addDataSourceProperty("HikariPool-564", (java.lang.Object) hikariConfig19);
        java.lang.Class<?> wildcardClass21 = hikariConfig19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("");
        int int6 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setAutoCommit(false);
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setConnectionInitSql("HikariPool-137");
        int int5 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource6 = null;
        hikariConfig0.setDataSource(dataSource6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setJdbcUrl("HikariPool-573");
        int int9 = hikariConfig0.getAcquireRetries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetryDelay(0L);
        boolean boolean7 = hikariConfig0.isJdbc4ConnectionTest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setCatalog("");
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setMinimumPoolSize(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setIsolateInternalQueries(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-829");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-829 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setTransactionIsolation("HikariPool-902");
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setInitializationFailFast(true);
        long long11 = hikariConfig0.getConnectionTimeout();
        java.lang.String str12 = hikariConfig0.getConnectionInitSql();
        boolean boolean13 = hikariConfig0.isAutoCommit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1605");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1605 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setUseInstrumentation(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        hikariConfig0.setTransactionIsolation("HikariPool-137");
        hikariConfig0.setInitializationFailFast(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-1229");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-1229' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        long long7 = hikariConfig0.getConnectionTimeout();
        boolean boolean8 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionTimeout(100L);
        java.lang.String str11 = hikariConfig0.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        boolean boolean14 = hikariConfig12.isReadOnly();
        int int15 = hikariConfig12.getAcquireIncrement();
        hikariConfig12.setConnectionCustomizerClassName("");
        boolean boolean18 = hikariConfig12.isReadOnly();
        long long19 = hikariConfig12.getMaxLifetime();
        long long20 = hikariConfig12.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean22 = hikariConfig21.isJdbc4ConnectionTest();
        long long23 = hikariConfig21.getConnectionTimeout();
        hikariConfig21.setJdbcUrl("");
        java.lang.String str26 = hikariConfig21.getConnectionCustomizerClassName();
        java.util.Properties properties27 = hikariConfig21.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig28 = new com.zaxxer.hikari.HikariConfig(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig30 = new com.zaxxer.hikari.HikariConfig(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig31 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig12.setDataSourceProperties(properties27);
        com.zaxxer.hikari.HikariConfig hikariConfig33 = new com.zaxxer.hikari.HikariConfig(properties27);
        hikariConfig0.setDataSourceProperties(properties27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1800000L + "'", long20 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5000L + "'", long23 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties27);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean9 = hikariConfig8.isJdbc4ConnectionTest();
        long long10 = hikariConfig8.getConnectionTimeout();
        hikariConfig8.setJdbcUrl("");
        java.lang.String str13 = hikariConfig8.getConnectionCustomizerClassName();
        java.util.Properties properties14 = hikariConfig8.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig15 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties14);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties14);
        hikariConfig0.setDataSourceProperties(properties14);
        hikariConfig0.setIdleTimeout((long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 5000L + "'", long10 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        boolean boolean8 = hikariConfig0.isRegisterMbeans();
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig0.setIdleTimeout(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str11 = hikariConfig10.getConnectionInitSql();
        int int12 = hikariConfig10.getMinimumPoolSize();
        boolean boolean13 = hikariConfig10.isIsolateInternalQueries();
        long long14 = hikariConfig10.getMaxLifetime();
        java.util.Properties properties15 = hikariConfig10.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties15);
        long long17 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setConnectionTestQuery("HikariPool-1324");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1800000L + "'", long17 == 1800000L);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str8 = hikariConfig0.getPoolName();
        int int9 = hikariConfig0.getAcquireRetries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HikariPool-2030" + "'", str8.equals("HikariPool-2030"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean4 = hikariConfig3.isInitializationFailFast();
        javax.sql.DataSource dataSource5 = null;
        hikariConfig3.setDataSource(dataSource5);
        boolean boolean7 = hikariConfig3.isJdbc4ConnectionTest();
        hikariConfig3.setAcquireRetryDelay(0L);
        java.util.Properties properties10 = hikariConfig3.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str15 = hikariConfig14.getConnectionInitSql();
        int int16 = hikariConfig14.getMinimumPoolSize();
        int int17 = hikariConfig14.getMinimumPoolSize();
        hikariConfig12.addDataSourceProperty("HikariPool-1969", (java.lang.Object) int17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        hikariConfig0.setMaxLifetime((long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        boolean boolean7 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setCatalog("HikariPool-575");
        hikariConfig0.setJdbcUrl("HikariPool-1601");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str10 = hikariConfig9.getCatalog();
        java.lang.String str11 = hikariConfig9.getDataSourceClassName();
        hikariConfig9.setAcquireRetryDelay((long) (byte) 1);
        hikariConfig9.addDataSourceProperty("HikariPool-510", (java.lang.Object) "HikariPool-1042");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.setConnectionTimeout(1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        java.lang.String str2 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setAcquireRetryDelay((long) '#');
        hikariConfig0.setInitializationFailFast(true);
        int int7 = hikariConfig0.getAcquireIncrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-377");
        hikariConfig0.setUseInstrumentation(false);
        java.lang.String str9 = hikariConfig0.getCatalog();
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        java.lang.String str15 = hikariConfig1.getJdbcUrl();
        long long16 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setPoolName("HikariPool-514");
        hikariConfig1.setMinimumPoolSize((int) (byte) 100);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig21.setConnectionInitSql("");
        hikariConfig21.setConnectionInitSql("hi!");
        java.lang.String str26 = hikariConfig21.getConnectionCustomizerClassName();
        hikariConfig21.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig29 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean30 = hikariConfig29.isJdbc4ConnectionTest();
        long long31 = hikariConfig29.getConnectionTimeout();
        hikariConfig29.setJdbcUrl("");
        java.lang.String str34 = hikariConfig29.getConnectionCustomizerClassName();
        java.util.Properties properties35 = hikariConfig29.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig37 = new com.zaxxer.hikari.HikariConfig(properties35);
        com.zaxxer.hikari.HikariConfig hikariConfig38 = new com.zaxxer.hikari.HikariConfig(properties35);
        hikariConfig21.setDataSourceProperties(properties35);
        hikariConfig1.setDataSourceProperties(properties35);
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1733");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 5000L + "'", long31 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties35);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        int int7 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 0);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        boolean boolean11 = hikariConfig0.isRegisterMbeans();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setAcquireRetries((int) (byte) 0);
        hikariConfig0.setDataSourceClassName("HikariPool-1601");
        java.lang.String str8 = hikariConfig0.getConnectionCustomizerClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-370");
        hikariConfig0.setAcquireIncrement((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setTransactionIsolation("HikariPool-902");
        hikariConfig0.setIsolateInternalQueries(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        java.lang.String str2 = hikariConfig0.getConnectionInitSql();
        hikariConfig0.setAcquireRetries((int) (short) 10);
        hikariConfig0.setMaxLifetime((long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        int int7 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setTransactionIsolation("HikariPool-697");
        hikariConfig0.setMinimumPoolSize((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean7 = hikariConfig6.isJdbc4ConnectionTest();
        long long8 = hikariConfig6.getConnectionTimeout();
        hikariConfig6.setJdbcUrl("");
        java.lang.String str11 = hikariConfig6.getConnectionCustomizerClassName();
        java.util.Properties properties12 = hikariConfig6.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig0.setDataSourceProperties(properties12);
        hikariConfig0.setReadOnly(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties12);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetryDelay(0L);
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        int int9 = hikariConfig8.getAcquireRetries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        hikariConfig0.setMaxLifetime((long) 100);
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionTestQuery("HikariPool-370");
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        java.lang.String str14 = hikariConfig0.getPoolName();
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str14 + "' != '" + "HikariPool-2073" + "'", str14.equals("HikariPool-2073"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        java.lang.Class<?> wildcardClass6 = hikariConfig0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int10 = hikariConfig0.getMinimumPoolSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setMinimumPoolSize((int) (byte) 100);
        int int8 = hikariConfig0.getMinimumPoolSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        int int6 = hikariConfig0.getAcquireIncrement();
        boolean boolean7 = hikariConfig0.isAutoCommit();
        hikariConfig0.setTransactionIsolation("HikariPool-370");
        hikariConfig0.setAutoCommit(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean8 = hikariConfig0.isReadOnly();
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean11 = hikariConfig10.isJdbc4ConnectionTest();
        long long12 = hikariConfig10.getConnectionTimeout();
        hikariConfig10.setJdbcUrl("");
        java.lang.String str15 = hikariConfig10.getConnectionCustomizerClassName();
        java.util.Properties properties16 = hikariConfig10.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties16);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties16);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        long long10 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setReadOnly(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean4 = hikariConfig0.isReadOnly();
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setRegisterMbeans(false);
        int int8 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setTransactionIsolation("HikariPool-211");
        long long11 = hikariConfig0.getMaxLifetime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        int int8 = hikariConfig0.getMaximumPoolSize();
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setJdbc4ConnectionTest(false);
        boolean boolean12 = hikariConfig0.isJdbc4ConnectionTest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-697");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-697 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        long long10 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setPoolName("HikariPool-1059");
        hikariConfig0.setMinimumPoolSize(60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int11 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setIdleTimeout(0L);
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setIdleTimeout((long) '#');
        java.lang.String str17 = hikariConfig0.getCatalog();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout(100L);
        hikariConfig0.setAcquireRetryDelay(750L);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setMaximumPoolSize((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean9 = hikariConfig8.isJdbc4ConnectionTest();
        int int10 = hikariConfig8.getMinimumPoolSize();
        hikariConfig8.setAutoCommit(true);
        int int13 = hikariConfig8.getMaximumPoolSize();
        hikariConfig0.addDataSourceProperty("HikariPool-250", (java.lang.Object) int13);
        hikariConfig0.setDataSourceClassName("HikariPool-377");
        hikariConfig0.setReadOnly(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str5 = hikariConfig0.getCatalog();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        long long10 = hikariConfig0.getMaxLifetime();
        long long11 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setConnectionInitSql("HikariPool-1104");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setInitializationFailFast(false);
        int int13 = hikariConfig0.getMinimumPoolSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        hikariConfig0.setInitializationFailFast(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource9);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setDataSourceClassName("");
        int int5 = hikariConfig0.getMaximumPoolSize();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str8 = hikariConfig7.getConnectionInitSql();
        long long9 = hikariConfig7.getMaxLifetime();
        boolean boolean10 = hikariConfig7.isInitializationFailFast();
        hikariConfig7.setReadOnly(true);
        boolean boolean13 = hikariConfig7.isAutoCommit();
        hikariConfig7.setLeakDetectionThreshold(1L);
        hikariConfig7.setConnectionCustomizerClassName("");
        java.lang.String str18 = hikariConfig7.getCatalog();
        hikariConfig7.setDataSourceClassName("HikariPool-377");
        hikariConfig0.addDataSourceProperty("HikariPool-829", (java.lang.Object) "HikariPool-377");
        hikariConfig0.setIsolateInternalQueries(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        int int12 = hikariConfig1.getAcquireRetries();
        hikariConfig1.setAcquireIncrement(60);
        hikariConfig1.setConnectionTestQuery("HikariPool-902");
        javax.sql.DataSource dataSource17 = null;
        hikariConfig1.setDataSource(dataSource17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        boolean boolean4 = hikariConfig0.isAutoCommit();
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setInitializationFailFast(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        javax.sql.DataSource dataSource5 = hikariConfig0.getDataSource();
        hikariConfig0.setTransactionIsolation("HikariPool-514");
        hikariConfig0.setConnectionTestQuery("HikariPool-514");
        boolean boolean10 = hikariConfig0.isReadOnly();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        int int7 = hikariConfig0.getMaximumPoolSize();
        long long8 = hikariConfig0.getIdleTimeout();
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setReadOnly(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        long long8 = hikariConfig0.getConnectionTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1104");
        hikariConfig0.setConnectionInitSql("HikariPool-2073");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean12 = hikariConfig11.isJdbc4ConnectionTest();
        long long13 = hikariConfig11.getConnectionTimeout();
        hikariConfig11.setJdbcUrl("");
        java.lang.String str16 = hikariConfig11.getConnectionCustomizerClassName();
        java.util.Properties properties17 = hikariConfig11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig0.setDataSourceProperties(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int21 = hikariConfig20.getAcquireIncrement();
        hikariConfig20.setAcquireRetryDelay((long) 3);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean26 = hikariConfig25.isJdbc4ConnectionTest();
        hikariConfig25.setReadOnly(false);
        hikariConfig25.setDataSourceClassName("");
        hikariConfig25.setCatalog("");
        hikariConfig25.setConnectionTimeout(0L);
        hikariConfig20.addDataSourceProperty("HikariPool-903", (java.lang.Object) hikariConfig25);
        com.zaxxer.hikari.HikariConfig hikariConfig36 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean37 = hikariConfig36.isInitializationFailFast();
        boolean boolean38 = hikariConfig36.isReadOnly();
        int int39 = hikariConfig36.getAcquireIncrement();
        hikariConfig36.setConnectionCustomizerClassName("");
        boolean boolean42 = hikariConfig36.isReadOnly();
        long long43 = hikariConfig36.getMaxLifetime();
        long long44 = hikariConfig36.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig45 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean46 = hikariConfig45.isJdbc4ConnectionTest();
        long long47 = hikariConfig45.getConnectionTimeout();
        hikariConfig45.setJdbcUrl("");
        java.lang.String str50 = hikariConfig45.getConnectionCustomizerClassName();
        java.util.Properties properties51 = hikariConfig45.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig52 = new com.zaxxer.hikari.HikariConfig(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig53 = new com.zaxxer.hikari.HikariConfig(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig54 = new com.zaxxer.hikari.HikariConfig(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig55 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig36.setDataSourceProperties(properties51);
        com.zaxxer.hikari.HikariConfig hikariConfig57 = new com.zaxxer.hikari.HikariConfig(properties51);
        hikariConfig20.setDataSourceProperties(properties51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 1800000L + "'", long43 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1800000L + "'", long44 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 5000L + "'", long47 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties51);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setLeakDetectionThreshold(750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setMaximumPoolSize((int) 'a');
        int int10 = hikariConfig0.getMaximumPoolSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        int int5 = hikariConfig0.getAcquireRetries();
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setDataSourceClassName("HikariPool-1059");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        long long6 = hikariConfig0.getMaxLifetime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        java.util.Properties properties9 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDataSourceProperties(properties9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long10 = hikariConfig0.getIdleTimeout();
        int int11 = hikariConfig0.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        boolean boolean14 = hikariConfig12.isReadOnly();
        int int15 = hikariConfig12.getAcquireIncrement();
        hikariConfig12.setConnectionTestQuery("hi!");
        hikariConfig12.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig12.setAutoCommit(true);
        java.util.Properties properties22 = hikariConfig12.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties22);
        java.lang.String str24 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setConnectionInitSql("HikariPool-960");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        boolean boolean6 = hikariConfig0.isIsolateInternalQueries();
        java.lang.String str7 = hikariConfig0.getCatalog();
        long long8 = hikariConfig0.getMaxLifetime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setInitializationFailFast(true);
        long long11 = hikariConfig0.getAcquireRetryDelay();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setDataSourceClassName("hi!");
        hikariConfig0.setTransactionIsolation("");
        java.lang.Class<?> wildcardClass14 = hikariConfig0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setMinimumPoolSize((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbcUrl("HikariPool-250");
        hikariConfig0.setPoolName("HikariPool-575");
        int int14 = hikariConfig0.getAcquireIncrement();
        java.util.Properties properties15 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setLeakDetectionThreshold((long) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout(100L);
        hikariConfig0.setAcquireRetryDelay(750L);
        int int12 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setRegisterMbeans(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        hikariConfig0.setMaxLifetime((long) 100);
        hikariConfig0.setLeakDetectionThreshold(750L);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setMaxLifetime(0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getTransactionIsolation();
        java.lang.String str3 = hikariConfig0.getJdbcUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int11 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setIdleTimeout(0L);
        long long14 = hikariConfig0.getLeakDetectionThreshold();
        long long15 = hikariConfig0.getAcquireRetryDelay();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 750L + "'", long15 == 750L);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setMaxLifetime((long) (short) 10);
        long long8 = hikariConfig0.getConnectionTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        int int6 = hikariConfig0.getMaximumPoolSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean7 = hikariConfig6.isJdbc4ConnectionTest();
        long long8 = hikariConfig6.getConnectionTimeout();
        hikariConfig6.setJdbcUrl("");
        java.lang.String str11 = hikariConfig6.getConnectionCustomizerClassName();
        java.util.Properties properties12 = hikariConfig6.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig0.setDataSourceProperties(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        boolean boolean20 = hikariConfig18.isReadOnly();
        int int21 = hikariConfig18.getAcquireIncrement();
        hikariConfig18.setConnectionTestQuery("hi!");
        boolean boolean24 = hikariConfig18.isIsolateInternalQueries();
        hikariConfig16.addDataSourceProperty("HikariPool-211", (java.lang.Object) boolean24);
        long long26 = hikariConfig16.getLeakDetectionThreshold();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        hikariConfig0.setRegisterMbeans(false);
        long long5 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setMinimumPoolSize((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        long long10 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setPoolName("HikariPool-1059");
        hikariConfig0.setCatalog("HikariPool-1915");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig0.setPoolName("HikariPool-211");
        java.lang.String str10 = hikariConfig0.getPoolName();
        hikariConfig0.setMinimumPoolSize(0);
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "HikariPool-211" + "'", str10.equals("HikariPool-211"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        boolean boolean2 = hikariConfig0.isAutoCommit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        long long11 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setTransactionIsolation("HikariPool-137");
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str16 = hikariConfig0.getConnectionCustomizerClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        boolean boolean7 = hikariConfig0.isReadOnly();
        hikariConfig0.setAcquireIncrement(3);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        long long3 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setIsolateInternalQueries(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 750L + "'", long3 == 750L);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold(2147483647L);
        hikariConfig0.setMinimumPoolSize(10);
        java.lang.Class<?> wildcardClass6 = hikariConfig0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.addDataSourceProperty("HikariPool-1042", (java.lang.Object) 600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setMaximumPoolSize(100);
        hikariConfig1.setJdbc4ConnectionTest(true);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setReadOnly(false);
        hikariConfig11.setJdbcUrl("");
        hikariConfig0.addDataSourceProperty("", (java.lang.Object) hikariConfig11);
        hikariConfig0.setMinimumPoolSize(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        long long5 = hikariConfig0.getIdleTimeout();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        boolean boolean7 = hikariConfig0.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setAcquireRetries((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acquireRetries cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setJdbcUrl("HikariPool-211");
        int int9 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str10 = hikariConfig0.getConnectionTestQuery();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setIdleTimeout((long) (short) 10);
        java.lang.String str6 = hikariConfig0.getPoolName();
        hikariConfig0.setMinimumPoolSize(3);
        hikariConfig0.setMaxLifetime((long) '#');
        long long11 = hikariConfig0.getConnectionTimeout();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HikariPool-2167" + "'", str6.equals("HikariPool-2167"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        boolean boolean7 = hikariConfig0.isReadOnly();
        java.lang.String str8 = hikariConfig0.getDataSourceClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setMinimumPoolSize((int) ' ');
        hikariConfig0.setJdbcUrl("HikariPool-1059");
        hikariConfig0.setAutoCommit(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str10 = hikariConfig9.getCatalog();
        java.lang.String str11 = hikariConfig9.getDataSourceClassName();
        long long12 = hikariConfig9.getAcquireRetryDelay();
        long long13 = hikariConfig9.getIdleTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 750L + "'", long12 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) (short) 0);
        hikariConfig0.setAutoCommit(false);
        java.lang.String str10 = hikariConfig0.getCatalog();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        int int8 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setInitializationFailFast(false);
        java.lang.String str11 = hikariConfig0.getDataSourceClassName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-1949");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-1949' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setMinimumPoolSize((int) (byte) 10);
        hikariConfig0.setRegisterMbeans(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setAcquireIncrement(10);
        hikariConfig0.setPoolName("HikariPool-564");
        hikariConfig0.setInitializationFailFast(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HikariPool-137" + "'", str6.equals("HikariPool-137"));
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long10 = hikariConfig0.getIdleTimeout();
        int int11 = hikariConfig0.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean13 = hikariConfig12.isJdbc4ConnectionTest();
        long long14 = hikariConfig12.getConnectionTimeout();
        hikariConfig12.setJdbcUrl("");
        java.lang.String str17 = hikariConfig12.getConnectionCustomizerClassName();
        java.util.Properties properties18 = hikariConfig12.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties18);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties18);
        hikariConfig0.setDataSourceProperties(properties18);
        hikariConfig0.setUseInstrumentation(true);
        javax.sql.DataSource dataSource26 = null;
        hikariConfig0.setDataSource(dataSource26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties18);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        boolean boolean6 = hikariConfig0.isInitializationFailFast();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        int int9 = hikariConfig0.getAcquireIncrement();
        boolean boolean10 = hikariConfig0.isReadOnly();
        hikariConfig0.setMaxLifetime((long) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 0);
        hikariConfig0.setMinimumPoolSize(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        int int8 = hikariConfig7.getMaximumPoolSize();
        java.lang.String str9 = hikariConfig7.getJdbcUrl();
        int int10 = hikariConfig7.getMinimumPoolSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean4 = hikariConfig0.isReadOnly();
        hikariConfig0.setRegisterMbeans(false);
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str10 = hikariConfig9.getConnectionCustomizerClassName();
        hikariConfig9.setMaximumPoolSize(3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIsolateInternalQueries(true);
        long long11 = hikariConfig0.getAcquireRetryDelay();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str10 = hikariConfig9.getCatalog();
        int int11 = hikariConfig9.getAcquireIncrement();
        hikariConfig9.setInitializationFailFast(true);
        hikariConfig9.setCatalog("HikariPool-510");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setJdbcUrl("");
        long long6 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setLeakDetectionThreshold((long) (byte) 0);
        hikariConfig1.setRegisterMbeans(false);
        hikariConfig1.setCatalog("HikariPool-2092");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1805");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) (short) 0);
        hikariConfig0.setConnectionCustomizerClassName("");
        java.lang.String str10 = hikariConfig0.getJdbcUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionTimeout(750L);
        int int7 = hikariConfig0.getTransactionIsolation();
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.lang.String str9 = hikariConfig0.getConnectionCustomizerClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long10 = hikariConfig0.getIdleTimeout();
        int int11 = hikariConfig0.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean13 = hikariConfig12.isInitializationFailFast();
        boolean boolean14 = hikariConfig12.isReadOnly();
        int int15 = hikariConfig12.getAcquireIncrement();
        hikariConfig12.setConnectionTestQuery("hi!");
        hikariConfig12.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig12.setAutoCommit(true);
        java.util.Properties properties22 = hikariConfig12.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties22);
        boolean boolean24 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource25 = null;
        hikariConfig0.setDataSource(dataSource25);
        int int27 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setJdbc4ConnectionTest(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getMaximumPoolSize();
        long long6 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAcquireIncrement((int) (byte) 100);
        hikariConfig0.setAcquireRetryDelay(600000L);
        hikariConfig0.setUseInstrumentation(false);
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setConnectionTestQuery("HikariPool-1631");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(true);
        long long5 = hikariConfig0.getAcquireRetryDelay();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 750L + "'", long5 == 750L);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        long long4 = hikariConfig0.getMaxLifetime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1800000L + "'", long4 == 1800000L);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setMinimumPoolSize(60);
        java.lang.String str11 = hikariConfig0.getConnectionCustomizerClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setDriverClassName("");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class '' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setJdbc4ConnectionTest(true);
        int int10 = hikariConfig0.getAcquireRetries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        java.lang.String str11 = hikariConfig0.getCatalog();
        int int12 = hikariConfig0.getAcquireIncrement();
        int int13 = hikariConfig0.getAcquireRetries();
        boolean boolean14 = hikariConfig0.isReadOnly();
        java.lang.String str15 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIsolateInternalQueries(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setConnectionTestQuery("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionCustomizerClassName("hi!");
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setReadOnly(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        hikariConfig0.setTransactionIsolation("HikariPool-211");
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        long long10 = hikariConfig0.getAcquireRetryDelay();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 750L + "'", long10 == 750L);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        long long9 = hikariConfig0.getMaxLifetime();
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1800000L + "'", long9 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        boolean boolean7 = hikariConfig0.isRegisterMbeans();
        long long8 = hikariConfig0.getIdleTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setJdbcUrl("HikariPool-137");
        hikariConfig0.setMaximumPoolSize((int) 'a');
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setCatalog("HikariPool-1932");
        long long19 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setUseInstrumentation(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setMaxLifetime(0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean4 = hikariConfig3.isInitializationFailFast();
        javax.sql.DataSource dataSource5 = null;
        hikariConfig3.setDataSource(dataSource5);
        boolean boolean7 = hikariConfig3.isJdbc4ConnectionTest();
        hikariConfig3.setAcquireRetryDelay(0L);
        java.util.Properties properties10 = hikariConfig3.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireRetries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setJdbcUrl("hi!");
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        int int8 = hikariConfig0.getMinimumPoolSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setJdbcUrl("HikariPool-137");
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean14 = hikariConfig13.isInitializationFailFast();
        javax.sql.DataSource dataSource15 = null;
        hikariConfig13.setDataSource(dataSource15);
        boolean boolean17 = hikariConfig13.isJdbc4ConnectionTest();
        hikariConfig13.setAutoCommit(false);
        javax.sql.DataSource dataSource20 = hikariConfig13.getDataSource();
        java.util.Properties properties21 = hikariConfig13.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties21);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        java.lang.String str11 = hikariConfig0.getCatalog();
        hikariConfig0.setMaximumPoolSize(1);
        long long14 = hikariConfig0.getConnectionTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbcUrl("HikariPool-250");
        hikariConfig0.setPoolName("HikariPool-575");
        int int14 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        hikariConfig0.setInitializationFailFast(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        hikariConfig8.setAcquireIncrement((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        boolean boolean7 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setJdbcUrl("HikariPool-960");
        hikariConfig0.setReadOnly(true);
        hikariConfig0.setJdbcUrl("HikariPool-1915");
        int int14 = hikariConfig0.getAcquireIncrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setPoolName("HikariPool-1104");
        int int6 = hikariConfig0.getAcquireIncrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str10 = hikariConfig9.getCatalog();
        hikariConfig9.setTransactionIsolation("HikariPool-1744");
        long long13 = hikariConfig9.getMaxLifetime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1800000L + "'", long13 == 1800000L);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean8 = hikariConfig0.isReadOnly();
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setConnectionInitSql("HikariPool-1744");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("");
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig7.setDataSource(dataSource9);
        hikariConfig7.setReadOnly(false);
        hikariConfig7.setReadOnly(false);
        hikariConfig0.addDataSourceProperty("HikariPool-1059", (java.lang.Object) false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setAcquireIncrement((int) (byte) 1);
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setCatalog("HikariPool-1104");
        hikariConfig0.setMinimumPoolSize(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str10 = hikariConfig9.getCatalog();
        long long11 = hikariConfig9.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig();
        int int13 = hikariConfig12.getAcquireRetries();
        hikariConfig12.setConnectionInitSql("");
        hikariConfig12.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig12.setAutoCommit(true);
        hikariConfig12.setConnectionTestQuery("HikariPool-137");
        long long22 = hikariConfig12.getIdleTimeout();
        int int23 = hikariConfig12.getAcquireRetries();
        com.zaxxer.hikari.HikariConfig hikariConfig24 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean25 = hikariConfig24.isInitializationFailFast();
        boolean boolean26 = hikariConfig24.isReadOnly();
        int int27 = hikariConfig24.getAcquireIncrement();
        hikariConfig24.setConnectionTestQuery("hi!");
        hikariConfig24.setLeakDetectionThreshold((long) (byte) 1);
        hikariConfig24.setAutoCommit(true);
        java.util.Properties properties34 = hikariConfig24.getDataSourceProperties();
        hikariConfig12.setDataSourceProperties(properties34);
        hikariConfig9.setDataSourceProperties(properties34);
        hikariConfig9.setAutoCommit(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1800000L + "'", long11 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 600000L + "'", long22 == 600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties34);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        long long4 = hikariConfig0.getAcquireRetryDelay();
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 750L + "'", long4 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        long long10 = hikariConfig0.getMaxLifetime();
        long long11 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setReadOnly(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 600000L + "'", long11 == 600000L);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getMaximumPoolSize();
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold(0L);
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setReadOnly(false);
        java.util.Properties properties11 = hikariConfig0.getDataSourceProperties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties11);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries((int) (byte) 0);
        boolean boolean8 = hikariConfig0.isJdbc4ConnectionTest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        hikariConfig0.setMaxLifetime((long) 100);
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionTestQuery("HikariPool-370");
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        java.lang.String str14 = hikariConfig0.getPoolName();
        java.lang.String str15 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setUseInstrumentation(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str14 + "' != '" + "HikariPool-2282" + "'", str14.equals("HikariPool-2282"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMinimumPoolSize(100);
        hikariConfig0.setIdleTimeout((long) 100);
        hikariConfig0.setAcquireRetryDelay((long) '4');
        hikariConfig0.setMinimumPoolSize((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setAcquireIncrement((int) (short) 100);
        hikariConfig0.addDataSourceProperty("HikariPool-1301", (java.lang.Object) 60);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1605");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        int int9 = hikariConfig0.getAcquireRetries();
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setAcquireRetries((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        long long11 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str12 = hikariConfig0.getDataSourceClassName();
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("");
        int int6 = hikariConfig0.getMaximumPoolSize();
        long long7 = hikariConfig0.getMaxLifetime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setMaximumPoolSize(0);
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        int int14 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setMinimumPoolSize((int) (short) 0);
        java.lang.String str17 = hikariConfig0.getConnectionTestQuery();
        java.lang.String str18 = hikariConfig0.getConnectionInitSql();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        boolean boolean6 = hikariConfig0.isReadOnly();
        long long7 = hikariConfig0.getMaxLifetime();
        long long8 = hikariConfig0.getMaxLifetime();
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isJdbc4ConnectionTest();
        long long11 = hikariConfig9.getConnectionTimeout();
        hikariConfig9.setJdbcUrl("");
        java.lang.String str14 = hikariConfig9.getConnectionCustomizerClassName();
        java.util.Properties properties15 = hikariConfig9.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig17 = new com.zaxxer.hikari.HikariConfig(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig19 = new com.zaxxer.hikari.HikariConfig(properties15);
        hikariConfig0.setDataSourceProperties(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig21 = new com.zaxxer.hikari.HikariConfig(properties15);
        com.zaxxer.hikari.HikariConfig hikariConfig22 = new com.zaxxer.hikari.HikariConfig(properties15);
        java.lang.Class<?> wildcardClass23 = properties15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 5000L + "'", long11 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        long long9 = hikariConfig0.getConnectionTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setReadOnly(true);
        java.lang.String str8 = hikariConfig0.getPoolName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str8 + "' != '" + "HikariPool-2298" + "'", str8.equals("HikariPool-2298"));
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean9 = hikariConfig8.isJdbc4ConnectionTest();
        int int10 = hikariConfig8.getMinimumPoolSize();
        hikariConfig8.setAutoCommit(true);
        int int13 = hikariConfig8.getMaximumPoolSize();
        hikariConfig0.addDataSourceProperty("HikariPool-250", (java.lang.Object) int13);
        hikariConfig0.setDataSourceClassName("HikariPool-377");
        int int17 = hikariConfig0.getMaximumPoolSize();
        int int18 = hikariConfig0.getMinimumPoolSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        hikariConfig0.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean12 = hikariConfig11.isJdbc4ConnectionTest();
        long long13 = hikariConfig11.getConnectionTimeout();
        hikariConfig11.setJdbcUrl("");
        java.lang.String str16 = hikariConfig11.getConnectionCustomizerClassName();
        java.util.Properties properties17 = hikariConfig11.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig(properties17);
        hikariConfig0.setDataSourceProperties(properties17);
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig(properties17);
        int int21 = hikariConfig20.getAcquireIncrement();
        hikariConfig20.setAcquireRetryDelay((long) 3);
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean26 = hikariConfig25.isJdbc4ConnectionTest();
        hikariConfig25.setReadOnly(false);
        hikariConfig25.setDataSourceClassName("");
        hikariConfig25.setCatalog("");
        hikariConfig25.setConnectionTimeout(0L);
        hikariConfig20.addDataSourceProperty("HikariPool-903", (java.lang.Object) hikariConfig25);
        long long36 = hikariConfig20.getMaxLifetime();
        javax.sql.DataSource dataSource37 = hikariConfig20.getDataSource();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 5000L + "'", long13 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1800000L + "'", long36 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource37);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setIdleTimeout((long) (-1));
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionInitSql("HikariPool-1579");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setJdbc4ConnectionTest(true);
        java.lang.String str13 = hikariConfig0.getConnectionCustomizerClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("HikariPool-951");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setPoolName("hi!");
        int int9 = hikariConfig0.getTransactionIsolation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setMinimumPoolSize((int) (short) 100);
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        boolean boolean12 = hikariConfig0.isInitializationFailFast();
        int int13 = hikariConfig0.getAcquireRetries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIdleTimeout((long) 60);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setConnectionTimeout(1800000L);
        hikariConfig0.setJdbc4ConnectionTest(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setIdleTimeout((long) (short) 1);
        java.lang.String str5 = hikariConfig0.getConnectionInitSql();
        int int6 = hikariConfig0.getAcquireRetries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-370");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-370' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean7 = hikariConfig6.isJdbc4ConnectionTest();
        long long8 = hikariConfig6.getConnectionTimeout();
        hikariConfig6.setJdbcUrl("");
        java.lang.String str11 = hikariConfig6.getConnectionCustomizerClassName();
        java.util.Properties properties12 = hikariConfig6.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig0.setDataSourceProperties(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties12);
        int int17 = hikariConfig16.getAcquireRetries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        hikariConfig0.setJdbcUrl("");
        hikariConfig0.setAutoCommit(true);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: Unable to get driver for JDBC URL ");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        long long6 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setIsolateInternalQueries(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        long long10 = hikariConfig0.getMaxLifetime();
        boolean boolean11 = hikariConfig0.isAutoCommit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str13 = hikariConfig0.getPoolName();
        hikariConfig0.setJdbcUrl("HikariPool-1062");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str13 + "' != '" + "HikariPool-2322" + "'", str13.equals("HikariPool-2322"));
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        int int7 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 0);
        hikariConfig0.setConnectionInitSql("HikariPool-801");
        boolean boolean12 = hikariConfig0.isRegisterMbeans();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        java.lang.String str15 = hikariConfig1.getJdbcUrl();
        long long16 = hikariConfig1.getAcquireRetryDelay();
        hikariConfig1.setCatalog("HikariPool-1104");
        long long19 = hikariConfig1.getLeakDetectionThreshold();
        int int20 = hikariConfig1.getAcquireRetries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        long long10 = hikariConfig0.getMaxLifetime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean4 = hikariConfig0.isReadOnly();
        hikariConfig0.setRegisterMbeans(false);
        int int7 = hikariConfig0.getAcquireRetries();
        long long8 = hikariConfig0.getAcquireRetryDelay();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        boolean boolean3 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setMaxLifetime((long) (byte) 100);
        hikariConfig0.setDataSourceClassName("HikariPool-1143");
        hikariConfig0.setConnectionTestQuery("HikariPool-902");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        long long10 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setReadOnly(false);
        long long15 = hikariConfig0.getConnectionTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setAcquireIncrement((int) (short) 100);
        hikariConfig0.addDataSourceProperty("HikariPool-1301", (java.lang.Object) 60);
        hikariConfig0.setTransactionIsolation("HikariPool-1143");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        java.lang.String str2 = hikariConfig1.getCatalog();
        hikariConfig1.setConnectionInitSql("HikariPool-370");
        hikariConfig1.setLeakDetectionThreshold((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig1.setMaximumPoolSize((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: maxPoolSize cannot be negative");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setPoolName("hi!");
        int int9 = hikariConfig0.getAcquireIncrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetryDelay(0L);
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig10.setDataSource(dataSource12);
        boolean boolean14 = hikariConfig10.isJdbc4ConnectionTest();
        boolean boolean15 = hikariConfig10.isJdbc4ConnectionTest();
        boolean boolean16 = hikariConfig10.isAutoCommit();
        hikariConfig8.addDataSourceProperty("hi!", (java.lang.Object) boolean16);
        hikariConfig8.setDataSourceClassName("HikariPool-697");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setConnectionTimeout((long) (short) 0);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean10 = hikariConfig9.isInitializationFailFast();
        boolean boolean11 = hikariConfig9.isReadOnly();
        int int12 = hikariConfig9.getAcquireIncrement();
        javax.sql.DataSource dataSource13 = null;
        hikariConfig9.setDataSource(dataSource13);
        java.lang.String str15 = hikariConfig9.getCatalog();
        int int16 = hikariConfig9.getAcquireRetries();
        hikariConfig9.setTransactionIsolation("HikariPool-697");
        hikariConfig0.addDataSourceProperty("HikariPool-960", (java.lang.Object) "HikariPool-697");
        int int20 = hikariConfig0.getAcquireRetries();
        boolean boolean21 = hikariConfig0.isReadOnly();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setConnectionTestQuery("");
        hikariConfig0.setJdbc4ConnectionTest(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbc4ConnectionTest(false);
        javax.sql.DataSource dataSource11 = null;
        hikariConfig0.setDataSource(dataSource11);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean14 = hikariConfig13.isJdbc4ConnectionTest();
        long long15 = hikariConfig13.getConnectionTimeout();
        hikariConfig13.setJdbcUrl("");
        java.lang.String str18 = hikariConfig13.getConnectionCustomizerClassName();
        java.util.Properties properties19 = hikariConfig13.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties19);
        java.lang.String str21 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setMaxLifetime((long) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 5000L + "'", long15 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setIsolateInternalQueries(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getMaximumPoolSize();
        long long6 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setAcquireIncrement((int) (byte) 100);
        java.lang.String str9 = hikariConfig0.getConnectionInitSql();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str2 = hikariConfig0.getCatalog();
        hikariConfig0.setMinimumPoolSize((int) (short) 1);
        hikariConfig0.setIsolateInternalQueries(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAutoCommit(false);
        boolean boolean9 = hikariConfig0.isJdbc4ConnectionTest();
        javax.sql.DataSource dataSource10 = null;
        hikariConfig0.setDataSource(dataSource10);
        hikariConfig0.setMaximumPoolSize((int) '#');
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-564");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        long long3 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setJdbcUrl("HikariPool-1847");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 750L + "'", long3 == 750L);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int11 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setIdleTimeout(0L);
        hikariConfig0.setRegisterMbeans(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 60 + "'", int11 == 60);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setJdbcUrl("HikariPool-1744");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setReadOnly(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setMaxLifetime(1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        hikariConfig0.setJdbcUrl("");
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setDataSourceClassName("HikariPool-1260");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        hikariConfig0.setDataSourceClassName("HikariPool-1062");
        hikariConfig0.setIdleTimeout((long) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionTimeout((long) (byte) 100);
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setUseInstrumentation(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getCatalog();
        java.lang.String str6 = hikariConfig0.getJdbcUrl();
        long long7 = hikariConfig0.getIdleTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 600000L + "'", long7 == 600000L);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        hikariConfig0.setTransactionIsolation("HikariPool-137");
        boolean boolean12 = hikariConfig0.isReadOnly();
        hikariConfig0.setAcquireIncrement((int) (byte) 100);
        hikariConfig0.setCatalog("HikariPool-1059");
        long long17 = hikariConfig0.getLeakDetectionThreshold();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-1409");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-1409 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        int int7 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 0);
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setPoolName("HikariPool-447");
        hikariConfig0.setCatalog("HikariPool-1458");
        hikariConfig0.setLeakDetectionThreshold(0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setMinimumPoolSize((int) ' ');
        hikariConfig0.setJdbcUrl("HikariPool-1059");
        hikariConfig0.setRegisterMbeans(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource10);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAcquireRetryDelay(0L);
        java.util.Properties properties7 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties7);
        com.zaxxer.hikari.HikariConfig hikariConfig10 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean11 = hikariConfig10.isInitializationFailFast();
        javax.sql.DataSource dataSource12 = null;
        hikariConfig10.setDataSource(dataSource12);
        boolean boolean14 = hikariConfig10.isJdbc4ConnectionTest();
        boolean boolean15 = hikariConfig10.isJdbc4ConnectionTest();
        boolean boolean16 = hikariConfig10.isAutoCommit();
        hikariConfig8.addDataSourceProperty("hi!", (java.lang.Object) boolean16);
        long long18 = hikariConfig8.getLeakDetectionThreshold();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setAcquireRetries(60);
        boolean boolean9 = hikariConfig0.isAutoCommit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbcUrl("HikariPool-250");
        hikariConfig0.setPoolName("HikariPool-575");
        hikariConfig0.setMaxLifetime((long) (-1));
        hikariConfig0.setMaxLifetime((long) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setJdbcUrl("HikariPool-211");
        int int9 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setPoolName("HikariPool-1768");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        java.lang.String str8 = hikariConfig0.getConnectionInitSql();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setLeakDetectionThreshold((long) '#');
        java.lang.String str8 = hikariConfig0.getCatalog();
        java.lang.Class<?> wildcardClass9 = hikariConfig0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbcUrl("HikariPool-250");
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.addDataSourceProperty("HikariPool-1847", obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = null;
        hikariConfig0.setDataSource(dataSource1);
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold((long) 0);
        hikariConfig0.setIsolateInternalQueries(false);
        boolean boolean8 = hikariConfig0.isReadOnly();
        java.lang.String str9 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setMaxLifetime(1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        long long9 = hikariConfig0.getConnectionTimeout();
        java.util.Properties properties10 = hikariConfig0.getDataSourceProperties();
        int int11 = hikariConfig0.getMinimumPoolSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5000L + "'", long9 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setJdbcUrl("HikariPool-1042");
        hikariConfig0.setMaximumPoolSize((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        hikariConfig0.setMaxLifetime((long) 100);
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-573");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean7 = hikariConfig6.isJdbc4ConnectionTest();
        long long8 = hikariConfig6.getConnectionTimeout();
        hikariConfig6.setJdbcUrl("");
        java.lang.String str11 = hikariConfig6.getConnectionCustomizerClassName();
        java.util.Properties properties12 = hikariConfig6.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig0.setDataSourceProperties(properties12);
        hikariConfig0.setJdbcUrl("hi!");
        java.lang.String str18 = hikariConfig0.getPoolName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str18 + "' != '" + "HikariPool-2378" + "'", str18.equals("HikariPool-2378"));
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str10 = hikariConfig9.getConnectionCustomizerClassName();
        hikariConfig9.setJdbcUrl("HikariPool-510");
        hikariConfig9.setAcquireRetries((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        boolean boolean10 = hikariConfig0.isIsolateInternalQueries();
        int int11 = hikariConfig0.getAcquireIncrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setRegisterMbeans(true);
        hikariConfig0.setUseInstrumentation(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        long long11 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setTransactionIsolation("HikariPool-137");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setConnectionTimeout(2147483647L);
        java.lang.String str18 = hikariConfig0.getDataSourceClassName();
        long long19 = hikariConfig0.getMaxLifetime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1800000L + "'", long19 == 1800000L);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getMaximumPoolSize();
        long long6 = hikariConfig0.getMaxLifetime();
        java.lang.String str7 = hikariConfig0.getConnectionCustomizerClassName();
        int int8 = hikariConfig0.getTransactionIsolation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 60 + "'", int5 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1800000L + "'", long6 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-370");
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setTransactionIsolation("HikariPool-250");
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str13 = hikariConfig0.getConnectionTestQuery();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        boolean boolean8 = hikariConfig0.isAutoCommit();
        hikariConfig0.setAcquireRetryDelay((long) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setDataSourceClassName("HikariPool-211");
        hikariConfig0.setMinimumPoolSize(3);
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        javax.sql.DataSource dataSource6 = hikariConfig0.getDataSource();
        boolean boolean7 = hikariConfig0.isRegisterMbeans();
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setRegisterMbeans(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean9 = hikariConfig8.isJdbc4ConnectionTest();
        int int10 = hikariConfig8.getMinimumPoolSize();
        hikariConfig8.setAutoCommit(true);
        int int13 = hikariConfig8.getMaximumPoolSize();
        hikariConfig0.addDataSourceProperty("HikariPool-250", (java.lang.Object) int13);
        hikariConfig0.setDataSourceClassName("HikariPool-377");
        int int17 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setJdbc4ConnectionTest(false);
        long long20 = hikariConfig0.getAcquireRetryDelay();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 60 + "'", int17 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 750L + "'", long20 == 750L);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties5);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        long long6 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setConnectionTimeout((long) (byte) 100);
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setRegisterMbeans(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMinimumPoolSize(60);
        boolean boolean4 = hikariConfig0.isReadOnly();
        java.util.Properties properties5 = hikariConfig0.getDataSourceProperties();
        java.lang.String str6 = hikariConfig0.getConnectionTestQuery();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        java.lang.String str6 = hikariConfig0.getCatalog();
        boolean boolean7 = hikariConfig0.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str9 = hikariConfig8.getConnectionInitSql();
        long long10 = hikariConfig8.getMaxLifetime();
        java.lang.String str11 = hikariConfig8.getConnectionCustomizerClassName();
        int int12 = hikariConfig8.getMaximumPoolSize();
        int int13 = hikariConfig8.getMaximumPoolSize();
        long long14 = hikariConfig8.getMaxLifetime();
        hikariConfig8.setAcquireIncrement((int) (byte) 100);
        hikariConfig8.setAcquireRetryDelay(600000L);
        java.lang.String str19 = hikariConfig8.getJdbcUrl();
        com.zaxxer.hikari.HikariConfig hikariConfig20 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean21 = hikariConfig20.isJdbc4ConnectionTest();
        long long22 = hikariConfig20.getConnectionTimeout();
        hikariConfig20.setJdbcUrl("");
        boolean boolean25 = hikariConfig20.isRegisterMbeans();
        hikariConfig20.setIsolateInternalQueries(false);
        hikariConfig20.setAcquireRetries((int) '4');
        java.util.Properties properties30 = hikariConfig20.getDataSourceProperties();
        hikariConfig8.setDataSourceProperties(properties30);
        hikariConfig0.setDataSourceProperties(properties30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1800000L + "'", long14 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 5000L + "'", long22 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        int int9 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setPoolName("HikariPool-211");
        int int12 = hikariConfig0.getAcquireRetries();
        boolean boolean13 = hikariConfig0.isAutoCommit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        hikariConfig0.setInitializationFailFast(true);
        hikariConfig0.setJdbcUrl("HikariPool-250");
        hikariConfig0.setPoolName("HikariPool-575");
        boolean boolean14 = hikariConfig0.isInitializationFailFast();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setPoolName("hi!");
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setCatalog("HikariPool-1143");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        hikariConfig0.setTransactionIsolation("HikariPool-211");
        javax.sql.DataSource dataSource9 = hikariConfig0.getDataSource();
        boolean boolean10 = hikariConfig0.isJdbc4ConnectionTest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setConnectionCustomizerClassName("");
        long long4 = hikariConfig0.getConnectionTimeout();
        java.lang.String str5 = hikariConfig0.getConnectionTestQuery();
        hikariConfig0.setLeakDetectionThreshold((long) (short) 0);
        java.lang.String str8 = hikariConfig0.getCatalog();
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setMaxLifetime(1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 5000L + "'", long4 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        java.lang.String str6 = hikariConfig0.getDataSourceClassName();
        boolean boolean7 = hikariConfig0.isIsolateInternalQueries();
        boolean boolean8 = hikariConfig0.isReadOnly();
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        long long10 = hikariConfig0.getIdleTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        // The following exception was thrown during execution in test generation
        try {
            com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig("HikariPool-564");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Property file HikariPool-564 was not found.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        boolean boolean4 = hikariConfig0.isRegisterMbeans();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean7 = hikariConfig6.isJdbc4ConnectionTest();
        long long8 = hikariConfig6.getConnectionTimeout();
        hikariConfig6.setJdbcUrl("");
        java.lang.String str11 = hikariConfig6.getConnectionCustomizerClassName();
        java.util.Properties properties12 = hikariConfig6.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig0.setDataSourceProperties(properties12);
        boolean boolean16 = hikariConfig0.isAutoCommit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        com.zaxxer.hikari.HikariConfig hikariConfig5 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str6 = hikariConfig5.getConnectionInitSql();
        int int7 = hikariConfig5.getMinimumPoolSize();
        boolean boolean8 = hikariConfig5.isIsolateInternalQueries();
        hikariConfig5.setIdleTimeout((long) (short) 10);
        java.lang.String str11 = hikariConfig5.getPoolName();
        hikariConfig5.setAcquireRetryDelay(10L);
        hikariConfig1.addDataSourceProperty("", (java.lang.Object) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str11 + "' != '" + "HikariPool-2416" + "'", str11.equals("HikariPool-2416"));
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        com.zaxxer.hikari.HikariConfig hikariConfig6 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean7 = hikariConfig6.isJdbc4ConnectionTest();
        long long8 = hikariConfig6.getConnectionTimeout();
        hikariConfig6.setJdbcUrl("");
        java.lang.String str11 = hikariConfig6.getConnectionCustomizerClassName();
        java.util.Properties properties12 = hikariConfig6.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig(properties12);
        hikariConfig0.setDataSourceProperties(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig16 = new com.zaxxer.hikari.HikariConfig(properties12);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean19 = hikariConfig18.isInitializationFailFast();
        boolean boolean20 = hikariConfig18.isReadOnly();
        int int21 = hikariConfig18.getAcquireIncrement();
        hikariConfig18.setConnectionTestQuery("hi!");
        boolean boolean24 = hikariConfig18.isIsolateInternalQueries();
        hikariConfig16.addDataSourceProperty("HikariPool-211", (java.lang.Object) boolean24);
        hikariConfig16.setUseInstrumentation(true);
        hikariConfig16.setDataSourceClassName("HikariPool-726");
        hikariConfig16.setJdbcUrl("");
        hikariConfig16.setJdbc4ConnectionTest(false);
        int int34 = hikariConfig16.getMaximumPoolSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 60 + "'", int34 == 60);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setAcquireIncrement((int) (short) 100);
        int int10 = hikariConfig0.getAcquireIncrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        java.lang.String str2 = hikariConfig0.getDataSourceClassName();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setJdbcUrl("HikariPool-564");
        boolean boolean6 = hikariConfig0.isInitializationFailFast();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean9 = hikariConfig8.isJdbc4ConnectionTest();
        int int10 = hikariConfig8.getMinimumPoolSize();
        hikariConfig8.setAutoCommit(true);
        int int13 = hikariConfig8.getMaximumPoolSize();
        hikariConfig0.addDataSourceProperty("HikariPool-250", (java.lang.Object) int13);
        java.lang.String str15 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setInitializationFailFast(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setUseInstrumentation(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setMaxLifetime((long) 1);
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setJdbcUrl("HikariPool-137");
        hikariConfig0.setMaximumPoolSize((int) 'a');
        hikariConfig0.setJdbc4ConnectionTest(true);
        hikariConfig0.setCatalog("HikariPool-1932");
        long long19 = hikariConfig0.getConnectionTimeout();
        long long20 = hikariConfig0.getLeakDetectionThreshold();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 5000L + "'", long19 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setTransactionIsolation("HikariPool-1143");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setConnectionTimeout(5000L);
        int int11 = hikariConfig0.getAcquireIncrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        int int9 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setPoolName("HikariPool-211");
        long long12 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-829");
        boolean boolean15 = hikariConfig0.isJdbc4ConnectionTest();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 5000L + "'", long12 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setDataSourceClassName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setIsolateInternalQueries(false);
        javax.sql.DataSource dataSource11 = hikariConfig0.getDataSource();
        java.lang.String str12 = hikariConfig0.getConnectionTestQuery();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        java.lang.String str5 = hikariConfig0.getPoolName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str5 + "' != '" + "HikariPool-2434" + "'", str5.equals("HikariPool-2434"));
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setDataSourceClassName("");
        hikariConfig0.setCatalog("");
        hikariConfig0.setConnectionTimeout(0L);
        hikariConfig0.setConnectionInitSql("hi!");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setIsolateInternalQueries(false);
        java.lang.String str13 = hikariConfig0.getPoolName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-697");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-697' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str13 + "' != '" + "HikariPool-2436" + "'", str13.equals("HikariPool-2436"));
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setCatalog("HikariPool-137");
        boolean boolean8 = hikariConfig0.isReadOnly();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setRegisterMbeans(true);
        java.lang.String str12 = hikariConfig0.getCatalog();
        hikariConfig0.setAcquireIncrement((int) 'a');
        hikariConfig0.setConnectionTimeout(600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        int int7 = hikariConfig0.getMaximumPoolSize();
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource9 = null;
        hikariConfig0.setDataSource(dataSource9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        long long2 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setJdbc4ConnectionTest(false);
        long long5 = hikariConfig0.getMaxLifetime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 600000L + "'", long2 == 600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1800000L + "'", long5 == 1800000L);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setReadOnly(false);
        hikariConfig11.setJdbcUrl("");
        hikariConfig0.addDataSourceProperty("", (java.lang.Object) hikariConfig11);
        java.lang.String str17 = hikariConfig0.getDataSourceClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireIncrement(100);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setMaxLifetime((long) (byte) 0);
        javax.sql.DataSource dataSource10 = hikariConfig0.getDataSource();
        hikariConfig0.setMaximumPoolSize(0);
        boolean boolean13 = hikariConfig0.isJdbc4ConnectionTest();
        int int14 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setPoolName("HikariPool-514");
        javax.sql.DataSource dataSource17 = hikariConfig0.getDataSource();
        hikariConfig0.setLeakDetectionThreshold((long) (short) 100);
        hikariConfig0.setCatalog("HikariPool-903");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource17);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setAutoCommit(false);
        boolean boolean12 = hikariConfig0.isRegisterMbeans();
        com.zaxxer.hikari.HikariConfig hikariConfig14 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean15 = hikariConfig14.isInitializationFailFast();
        boolean boolean16 = hikariConfig14.isReadOnly();
        javax.sql.DataSource dataSource17 = hikariConfig14.getDataSource();
        boolean boolean18 = hikariConfig14.isInitializationFailFast();
        int int19 = hikariConfig14.getAcquireRetries();
        hikariConfig0.addDataSourceProperty("HikariPool-1744", (java.lang.Object) int19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setPoolName("HikariPool-211");
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setAcquireRetries(1);
        hikariConfig0.setLeakDetectionThreshold(5000L);
        hikariConfig0.setIdleTimeout(0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        int int7 = hikariConfig0.getTransactionIsolation();
        int int8 = hikariConfig0.getMinimumPoolSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        com.zaxxer.hikari.HikariConfig hikariConfig3 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean4 = hikariConfig3.isInitializationFailFast();
        javax.sql.DataSource dataSource5 = null;
        hikariConfig3.setDataSource(dataSource5);
        boolean boolean7 = hikariConfig3.isJdbc4ConnectionTest();
        hikariConfig3.setAcquireRetryDelay(0L);
        java.util.Properties properties10 = hikariConfig3.getDataSourceProperties();
        hikariConfig0.setDataSourceProperties(properties10);
        com.zaxxer.hikari.HikariConfig hikariConfig12 = new com.zaxxer.hikari.HikariConfig(properties10);
        int int13 = hikariConfig12.getMinimumPoolSize();
        long long14 = hikariConfig12.getConnectionTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 5000L + "'", long14 == 5000L);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setConnectionTimeout((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class '' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getMaximumPoolSize();
        int int5 = hikariConfig0.getAcquireRetries();
        int int6 = hikariConfig0.getMaximumPoolSize();
        java.lang.String str7 = hikariConfig0.getPoolName();
        long long8 = hikariConfig0.getMaxLifetime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HikariPool-2459" + "'", str7.equals("HikariPool-2459"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setAcquireIncrement((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setJdbcUrl("HikariPool-829");
        long long7 = hikariConfig0.getLeakDetectionThreshold();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        long long4 = hikariConfig0.getLeakDetectionThreshold();
        java.lang.String str5 = hikariConfig0.getCatalog();
        hikariConfig0.setMaximumPoolSize((int) (byte) 100);
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setRegisterMbeans(false);
        boolean boolean11 = hikariConfig0.isInitializationFailFast();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.setJdbcUrl("hi!");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setJdbcUrl("HikariPool-1865");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HikariPool-2463" + "'", str7.equals("HikariPool-2463"));
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        int int4 = hikariConfig0.getMaximumPoolSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-370");
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setTransactionIsolation("HikariPool-250");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1579");
        java.lang.String str13 = hikariConfig0.getDataSourceClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        int int6 = hikariConfig0.getMaximumPoolSize();
        int int7 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setIsolateInternalQueries(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60 + "'", int6 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold((long) '4');
        int int9 = hikariConfig0.getAcquireRetries();
        long long10 = hikariConfig0.getMaxLifetime();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1800000L + "'", long10 == 1800000L);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        long long7 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setAutoCommit(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        int int6 = hikariConfig0.getAcquireIncrement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig(properties6);
        com.zaxxer.hikari.HikariConfig hikariConfig9 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.lang.String str10 = hikariConfig9.getCatalog();
        hikariConfig9.setTransactionIsolation("HikariPool-1744");
        boolean boolean13 = hikariConfig9.isRegisterMbeans();
        hikariConfig9.setReadOnly(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setMaxLifetime((long) 10);
        hikariConfig0.setMinimumPoolSize((int) '4');
        hikariConfig0.setUseInstrumentation(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime(5000L);
        hikariConfig0.setCatalog("");
        long long13 = hikariConfig0.getIdleTimeout();
        int int14 = hikariConfig0.getMinimumPoolSize();
        int int15 = hikariConfig0.getAcquireIncrement();
        java.lang.String str16 = hikariConfig0.getDataSourceClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 600000L + "'", long13 == 600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setJdbc4ConnectionTest(false);
        hikariConfig0.setMaxLifetime(5000L);
        hikariConfig0.setCatalog("");
        hikariConfig0.setMinimumPoolSize(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionTimeout(750L);
        int int7 = hikariConfig0.getTransactionIsolation();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1059");
        hikariConfig0.setJdbcUrl("HikariPool-801");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setConnectionCustomizerClassName("");
        java.util.Properties properties15 = hikariConfig1.getDataSourceProperties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties15);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        java.lang.String str2 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setLeakDetectionThreshold((long) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        int int3 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaxLifetime((long) 1);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        int int7 = hikariConfig0.getTransactionIsolation();
        java.util.Properties properties8 = hikariConfig0.getDataSourceProperties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setMinimumPoolSize(100);
        hikariConfig0.setIdleTimeout((long) 100);
        hikariConfig0.setAcquireRetryDelay((long) '4');
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-801");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        java.util.Properties properties3 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig(properties3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties3);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetries(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setIdleTimeout(0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str6 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        java.util.Properties properties9 = hikariConfig0.getDataSourceProperties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties9);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        int int9 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setPoolName("HikariPool-211");
        int int12 = hikariConfig0.getAcquireRetries();
        java.lang.String str13 = hikariConfig0.getDataSourceClassName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setJdbcUrl("");
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean8 = hikariConfig7.isInitializationFailFast();
        boolean boolean9 = hikariConfig7.isReadOnly();
        hikariConfig1.addDataSourceProperty("hi!", (java.lang.Object) boolean9);
        hikariConfig1.setTransactionIsolation("HikariPool-447");
        hikariConfig1.setConnectionCustomizerClassName("HikariPool-1409");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        int int8 = hikariConfig0.getMaximumPoolSize();
        long long9 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setJdbc4ConnectionTest(false);
        int int12 = hikariConfig0.getMaximumPoolSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        javax.sql.DataSource dataSource1 = null;
        hikariConfig0.setDataSource(dataSource1);
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold((long) 0);
        hikariConfig0.setIsolateInternalQueries(false);
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setRegisterMbeans(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaximumPoolSize((int) (byte) 1);
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        long long10 = hikariConfig0.getIdleTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        boolean boolean6 = hikariConfig0.isJdbc4ConnectionTest();
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        int int7 = hikariConfig0.getMaximumPoolSize();
        long long8 = hikariConfig0.getIdleTimeout();
        boolean boolean9 = hikariConfig0.isRegisterMbeans();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 60 + "'", int7 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        long long7 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setTransactionIsolation("HikariPool-902");
        javax.sql.DataSource dataSource12 = null;
        hikariConfig0.setDataSource(dataSource12);
        hikariConfig0.setReadOnly(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1800000L + "'", long7 == 1800000L);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-370");
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setAcquireIncrement(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetryDelay((long) (byte) 10);
        hikariConfig0.setIdleTimeout(0L);
        java.lang.String str10 = hikariConfig0.getConnectionInitSql();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.setJdbcUrl("HikariPool-1229");
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setDriverClassName("HikariPool-1579");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: driverClassName specified class 'HikariPool-1579' could not be loaded");
        } catch (java.lang.RuntimeException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HikariPool-2500" + "'", str7.equals("HikariPool-2500"));
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setReadOnly(false);
        hikariConfig1.setJdbcUrl("");
        hikariConfig1.setMaximumPoolSize(100);
        long long8 = hikariConfig1.getAcquireRetryDelay();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 750L + "'", long8 == 750L);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setConnectionInitSql("hi!");
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-370");
        java.lang.String str8 = hikariConfig0.getJdbcUrl();
        hikariConfig0.setTransactionIsolation("HikariPool-250");
        hikariConfig0.setIsolateInternalQueries(false);
        long long13 = hikariConfig0.getAcquireRetryDelay();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 750L + "'", long13 == 750L);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setInitializationFailFast(false);
        long long7 = hikariConfig0.getConnectionTimeout();
        boolean boolean8 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionInitSql("HikariPool-829");
        int int11 = hikariConfig0.getAcquireRetries();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 5000L + "'", long7 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setCatalog("");
        boolean boolean4 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        java.lang.String str7 = hikariConfig0.getJdbcUrl();
        boolean boolean8 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setConnectionTimeout(600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-137");
        long long10 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setReadOnly(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 600000L + "'", long10 == 600000L);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        javax.sql.DataSource dataSource3 = hikariConfig0.getDataSource();
        int int4 = hikariConfig0.getMaximumPoolSize();
        boolean boolean5 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setLeakDetectionThreshold(0L);
        long long8 = hikariConfig0.getMaxLifetime();
        hikariConfig0.setJdbc4ConnectionTest(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 60 + "'", int4 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1800000L + "'", long8 == 1800000L);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setConnectionInitSql("hi!");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        boolean boolean6 = hikariConfig0.isReadOnly();
        com.zaxxer.hikari.HikariConfig hikariConfig8 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean9 = hikariConfig8.isJdbc4ConnectionTest();
        int int10 = hikariConfig8.getMinimumPoolSize();
        hikariConfig8.setAutoCommit(true);
        int int13 = hikariConfig8.getMaximumPoolSize();
        hikariConfig0.addDataSourceProperty("HikariPool-250", (java.lang.Object) int13);
        hikariConfig0.setDataSourceClassName("HikariPool-377");
        boolean boolean17 = hikariConfig0.isAutoCommit();
        hikariConfig0.setReadOnly(true);
        long long20 = hikariConfig0.getLeakDetectionThreshold();
        hikariConfig0.setPoolName("HikariPool-1969");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60 + "'", int13 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getConnectionInitSql();
        javax.sql.DataSource dataSource7 = null;
        hikariConfig0.setDataSource(dataSource7);
        java.util.Properties properties10 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig11 = new com.zaxxer.hikari.HikariConfig(properties10);
        hikariConfig11.setReadOnly(false);
        hikariConfig11.setJdbcUrl("");
        hikariConfig0.addDataSourceProperty("", (java.lang.Object) hikariConfig11);
        java.lang.String str17 = hikariConfig11.getConnectionInitSql();
        hikariConfig11.setRegisterMbeans(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        javax.sql.DataSource dataSource4 = null;
        hikariConfig0.setDataSource(dataSource4);
        java.lang.String str6 = hikariConfig0.getCatalog();
        long long7 = hikariConfig0.getAcquireRetryDelay();
        int int8 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setUseInstrumentation(true);
        java.lang.String str13 = hikariConfig0.getConnectionInitSql();
        java.util.Properties properties14 = hikariConfig0.getDataSourceProperties();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 750L + "'", long7 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties14);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        hikariConfig0.setConnectionTimeout((long) (short) 100);
        hikariConfig0.setMaxLifetime((long) 100);
        boolean boolean8 = hikariConfig0.isInitializationFailFast();
        boolean boolean9 = hikariConfig0.isReadOnly();
        hikariConfig0.setConnectionTestQuery("HikariPool-370");
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        javax.sql.DataSource dataSource13 = hikariConfig0.getDataSource();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource13);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setUseInstrumentation(true);
        hikariConfig0.setReadOnly(false);
        long long10 = hikariConfig0.getLeakDetectionThreshold();
        boolean boolean11 = hikariConfig0.isRegisterMbeans();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        int int1 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setLeakDetectionThreshold((long) (byte) 100);
        hikariConfig0.setAutoCommit(true);
        javax.sql.DataSource dataSource8 = null;
        hikariConfig0.setDataSource(dataSource8);
        hikariConfig0.setTransactionIsolation("HikariPool-137");
        boolean boolean12 = hikariConfig0.isInitializationFailFast();
        java.lang.String str13 = hikariConfig0.getJdbcUrl();
        boolean boolean14 = hikariConfig0.isInitializationFailFast();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setReadOnly(false);
        hikariConfig0.setCatalog("");
        java.lang.String str6 = hikariConfig0.getPoolName();
        hikariConfig0.setReadOnly(false);
        boolean boolean9 = hikariConfig0.isReadOnly();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str6 + "' != '" + "HikariPool-2515" + "'", str6.equals("HikariPool-2515"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        int int8 = hikariConfig7.getAcquireRetries();
        java.lang.String str9 = hikariConfig7.getCatalog();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setLeakDetectionThreshold((long) '#');
        hikariConfig0.setIsolateInternalQueries(true);
        java.lang.String str10 = hikariConfig0.getConnectionTestQuery();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1063");
        hikariConfig0.setMaxLifetime(2147483647L);
        java.lang.String str12 = hikariConfig0.getJdbcUrl();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        hikariConfig0.setMaxLifetime(0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        hikariConfig1.setRegisterMbeans(true);
        java.lang.String str14 = hikariConfig1.getConnectionInitSql();
        java.lang.String str15 = hikariConfig1.getJdbcUrl();
        long long16 = hikariConfig1.getAcquireRetryDelay();
        java.lang.String str17 = hikariConfig1.getPoolName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 750L + "'", long16 == 750L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str17 + "' != '" + "HikariPool-2522" + "'", str17.equals("HikariPool-2522"));
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setPoolName("HikariPool-211");
        boolean boolean11 = hikariConfig0.isIsolateInternalQueries();
        int int12 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setReadOnly(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60 + "'", int12 == 60);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        long long6 = hikariConfig0.getIdleTimeout();
        java.lang.String str7 = hikariConfig0.getConnectionInitSql();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        hikariConfig0.setReadOnly(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        java.util.Properties properties6 = hikariConfig0.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig7 = new com.zaxxer.hikari.HikariConfig(properties6);
        java.util.Properties properties8 = hikariConfig7.getDataSourceProperties();
        int int9 = hikariConfig7.getTransactionIsolation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        hikariConfig0.setLeakDetectionThreshold(1L);
        hikariConfig0.setConnectionCustomizerClassName("");
        long long11 = hikariConfig0.getAcquireRetryDelay();
        hikariConfig0.setTransactionIsolation("HikariPool-137");
        hikariConfig0.setInitializationFailFast(false);
        hikariConfig0.setConnectionTimeout(2147483647L);
        java.lang.String str18 = hikariConfig0.getConnectionInitSql();
        javax.sql.DataSource dataSource19 = hikariConfig0.getDataSource();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource19);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        int int13 = hikariConfig1.getTransactionIsolation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        javax.sql.DataSource dataSource2 = null;
        hikariConfig0.setDataSource(dataSource2);
        boolean boolean4 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setAutoCommit(false);
        javax.sql.DataSource dataSource7 = hikariConfig0.getDataSource();
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1063");
        hikariConfig0.setMaxLifetime(2147483647L);
        java.lang.Class<?> wildcardClass12 = hikariConfig0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dataSource7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        hikariConfig0.setMaxLifetime((long) '4');
        int int4 = hikariConfig0.getAcquireRetries();
        long long5 = hikariConfig0.getIdleTimeout();
        boolean boolean6 = hikariConfig0.isRegisterMbeans();
        boolean boolean7 = hikariConfig0.isReadOnly();
        long long8 = hikariConfig0.getConnectionTimeout();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 600000L + "'", long5 == 600000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 5000L + "'", long8 == 5000L);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getConnectionCustomizerClassName();
        int int4 = hikariConfig0.getMinimumPoolSize();
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setLeakDetectionThreshold((long) '#');
        hikariConfig0.setIsolateInternalQueries(true);
        hikariConfig0.setConnectionTestQuery("HikariPool-902");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        boolean boolean3 = hikariConfig0.isInitializationFailFast();
        hikariConfig0.setReadOnly(true);
        boolean boolean6 = hikariConfig0.isAutoCommit();
        java.lang.String str7 = hikariConfig0.getPoolName();
        hikariConfig0.setAcquireRetryDelay(100L);
        int int10 = hikariConfig0.getMinimumPoolSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str7 + "' != '" + "HikariPool-2535" + "'", str7.equals("HikariPool-2535"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isJdbc4ConnectionTest();
        long long2 = hikariConfig0.getConnectionTimeout();
        hikariConfig0.setJdbcUrl("");
        java.lang.String str5 = hikariConfig0.getConnectionCustomizerClassName();
        hikariConfig0.setAcquireRetries((int) (short) 100);
        long long8 = hikariConfig0.getIdleTimeout();
        hikariConfig0.setRegisterMbeans(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5000L + "'", long2 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 600000L + "'", long8 == 600000L);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        boolean boolean3 = hikariConfig0.isIsolateInternalQueries();
        hikariConfig0.setIsolateInternalQueries(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig0.setConnectionInitSql("");
        hikariConfig0.setIdleTimeout((long) (short) 1);
        java.lang.String str5 = hikariConfig0.getConnectionInitSql();
        int int6 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setDataSourceClassName("HikariPool-2459");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.util.Properties properties0 = null;
        com.zaxxer.hikari.HikariConfig hikariConfig1 = new com.zaxxer.hikari.HikariConfig(properties0);
        hikariConfig1.setMaxLifetime(0L);
        com.zaxxer.hikari.HikariConfig hikariConfig4 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean5 = hikariConfig4.isJdbc4ConnectionTest();
        long long6 = hikariConfig4.getConnectionTimeout();
        hikariConfig4.setJdbcUrl("");
        java.lang.String str9 = hikariConfig4.getConnectionCustomizerClassName();
        java.util.Properties properties10 = hikariConfig4.getDataSourceProperties();
        hikariConfig1.setDataSourceProperties(properties10);
        java.lang.String str12 = hikariConfig1.getConnectionTestQuery();
        hikariConfig1.setTransactionIsolation("hi!");
        boolean boolean15 = hikariConfig1.isIsolateInternalQueries();
        int int16 = hikariConfig1.getMinimumPoolSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 5000L + "'", long6 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setTransactionIsolation("");
        boolean boolean5 = hikariConfig0.isRegisterMbeans();
        java.lang.String str6 = hikariConfig0.getCatalog();
        hikariConfig0.setAcquireIncrement((int) (byte) 10);
        hikariConfig0.setAutoCommit(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        hikariConfig0.setConnectionCustomizerClassName("");
        hikariConfig0.setUseInstrumentation(true);
        int int8 = hikariConfig0.getMaximumPoolSize();
        hikariConfig0.setAcquireIncrement((int) (short) 1);
        long long11 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str12 = hikariConfig0.getPoolName();
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.setConnectionTimeout((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: connectionTimeout cannot be less than 100ms");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60 + "'", int8 == 60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 750L + "'", long11 == 750L);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + str12 + "' != '" + "HikariPool-2542" + "'", str12.equals("HikariPool-2542"));
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        long long2 = hikariConfig0.getMaxLifetime();
        java.lang.String str3 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setIdleTimeout((long) (-1));
        long long6 = hikariConfig0.getIdleTimeout();
        java.lang.String str7 = hikariConfig0.getConnectionTestQuery();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1800000L + "'", long2 == 1800000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        boolean boolean2 = hikariConfig0.isReadOnly();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.lang.String str4 = hikariConfig0.getDataSourceClassName();
        hikariConfig0.setConnectionTimeout((long) 0);
        hikariConfig0.setAcquireRetries(60);
        hikariConfig0.setRegisterMbeans(false);
        hikariConfig0.setInitializationFailFast(false);
        com.zaxxer.hikari.HikariConfig hikariConfig13 = new com.zaxxer.hikari.HikariConfig();
        hikariConfig13.setConnectionInitSql("");
        hikariConfig13.setRegisterMbeans(true);
        com.zaxxer.hikari.HikariConfig hikariConfig18 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean19 = hikariConfig18.isJdbc4ConnectionTest();
        long long20 = hikariConfig18.getConnectionTimeout();
        hikariConfig18.setJdbcUrl("");
        java.lang.String str23 = hikariConfig18.getConnectionCustomizerClassName();
        java.util.Properties properties24 = hikariConfig18.getDataSourceProperties();
        com.zaxxer.hikari.HikariConfig hikariConfig25 = new com.zaxxer.hikari.HikariConfig(properties24);
        hikariConfig13.setDataSourceProperties(properties24);
        hikariConfig0.setDataSourceProperties(properties24);
        hikariConfig0.setReadOnly(false);
        // The following exception was thrown during execution in test generation
        try {
            hikariConfig0.validate();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: one of either dataSource or dataSourceClassName must be specified");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 5000L + "'", long20 == 5000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties24);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        boolean boolean1 = hikariConfig0.isInitializationFailFast();
        java.lang.String str2 = hikariConfig0.getDataSourceClassName();
        int int3 = hikariConfig0.getAcquireIncrement();
        java.util.Properties properties4 = hikariConfig0.getDataSourceProperties();
        hikariConfig0.setConnectionTimeout(0L);
        hikariConfig0.setConnectionCustomizerClassName("HikariPool-1104");
        hikariConfig0.setUseInstrumentation(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(properties4);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.zaxxer.hikari.HikariConfig hikariConfig0 = new com.zaxxer.hikari.HikariConfig();
        java.lang.String str1 = hikariConfig0.getConnectionInitSql();
        int int2 = hikariConfig0.getMinimumPoolSize();
        int int3 = hikariConfig0.getMinimumPoolSize();
        hikariConfig0.setMaxLifetime((long) 1);
        long long6 = hikariConfig0.getAcquireRetryDelay();
        java.lang.String str7 = hikariConfig0.getDataSourceClassName();
        int int8 = hikariConfig0.getAcquireRetries();
        hikariConfig0.setConnectionTestQuery("hi!");
        hikariConfig0.setMaxLifetime((long) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 750L + "'", long6 == 750L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }
}
