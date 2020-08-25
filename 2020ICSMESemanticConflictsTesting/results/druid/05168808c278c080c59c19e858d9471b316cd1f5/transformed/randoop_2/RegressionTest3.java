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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher3.s3Client = restS3Service9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher3.s3Client = restS3Service8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher3.jsonMapper = objectMapper10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher3.jsonMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher3.s3Client;
        java.lang.Class<?> wildcardClass14 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = s3SegmentPusherConfig10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher3.jsonMapper = objectMapper10;
        java.io.File file12 = null;
        com.metamx.druid.client.DataSegment dataSegment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment14 = s3SegmentPusher3.push(file12, dataSegment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig17);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = s3SegmentPusher0.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = objectMapper19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper19);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        java.io.File file12 = null;
        com.metamx.druid.client.DataSegment dataSegment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment14 = s3SegmentPusher0.push(file12, dataSegment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = null;
        s3SegmentPusher0.s3Client = restS3Service18;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig20 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig20;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig22 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service23 = null;
        s3SegmentPusher0.s3Client = restS3Service23;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig22);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher3.jsonMapper;
        java.io.File file12 = null;
        com.metamx.druid.client.DataSegment dataSegment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment14 = s3SegmentPusher3.push(file12, dataSegment13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher3.s3Client = restS3Service8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher3.s3Client = restS3Service17;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig19 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher3.jsonMapper = objectMapper13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = null;
        s3SegmentPusher0.s3Client = restS3Service16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        java.lang.Class<?> wildcardClass13 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service17);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        java.lang.Class<?> wildcardClass9 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        java.lang.Class<?> wildcardClass13 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher0.jsonMapper = objectMapper16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher3.jsonMapper = objectMapper12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher3.jsonMapper = objectMapper14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher3.jsonMapper = objectMapper16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher0.s3Client = restS3Service17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        java.io.File file13 = null;
        com.metamx.druid.client.DataSegment dataSegment14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment15 = s3SegmentPusher0.push(file13, dataSegment14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher3.s3Client = restS3Service13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = null;
        s3SegmentPusher3.jsonMapper = objectMapper17;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = null;
        s3SegmentPusher3.s3Client = restS3Service19;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig21 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig21;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = null;
        s3SegmentPusher0.jsonMapper = objectMapper17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        java.lang.Class<?> wildcardClass14 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }
}

