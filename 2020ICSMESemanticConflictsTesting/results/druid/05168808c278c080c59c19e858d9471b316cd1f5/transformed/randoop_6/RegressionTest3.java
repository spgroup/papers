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
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher3.s3Client = restS3Service14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher3.s3Client = restS3Service17;
        java.lang.Class<?> wildcardClass19 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher3.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
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
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher0.jsonMapper = objectMapper16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher3.s3Client = restS3Service10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig15;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service17);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        java.io.File file11 = null;
        com.metamx.druid.client.DataSegment dataSegment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment13 = s3SegmentPusher0.push(file11, dataSegment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher3.s3Client;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = s3SegmentPusherConfig11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher0.jsonMapper = objectMapper16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = null;
        s3SegmentPusher0.jsonMapper = objectMapper17;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper19);
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        java.io.File file15 = null;
        com.metamx.druid.client.DataSegment dataSegment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment17 = s3SegmentPusher0.push(file15, dataSegment16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        java.lang.Class<?> wildcardClass11 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
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
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        java.io.File file17 = null;
        com.metamx.druid.client.DataSegment dataSegment18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment19 = s3SegmentPusher0.push(file17, dataSegment18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = null;
        s3SegmentPusher0.s3Client = restS3Service1;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher0.jsonMapper = objectMapper5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig17);
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = null;
        s3SegmentPusher3.s3Client = restS3Service16;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig18;
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        java.io.File file11 = null;
        com.metamx.druid.client.DataSegment dataSegment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment13 = s3SegmentPusher3.push(file11, dataSegment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher3.jsonMapper = objectMapper14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig17);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher3.s3Client = restS3Service14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher3.jsonMapper = objectMapper16;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig18;
        org.codehaus.jackson.map.ObjectMapper objectMapper20 = null;
        s3SegmentPusher3.jsonMapper = objectMapper20;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig22 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig23 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig23);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher0.jsonMapper = objectMapper16;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service18);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = null;
        s3SegmentPusher0.s3Client = restS3Service16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = null;
        s3SegmentPusher0.s3Client = restS3Service16;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher3.jsonMapper = objectMapper11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service17);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher3.s3Client = restS3Service6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher3.s3Client = restS3Service9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = s3SegmentPusher0.s3Client;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service18);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig18;
        java.lang.Class<?> wildcardClass20 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        java.io.File file6 = null;
        com.metamx.druid.client.DataSegment dataSegment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment8 = s3SegmentPusher0.push(file6, dataSegment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher0.s3Client;
        java.io.File file16 = null;
        com.metamx.druid.client.DataSegment dataSegment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment18 = s3SegmentPusher0.push(file16, dataSegment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher0.s3Client = restS3Service17;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig19 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig20 = s3SegmentPusher0.config;
        java.io.File file21 = null;
        com.metamx.druid.client.DataSegment dataSegment22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment23 = s3SegmentPusher0.push(file21, dataSegment22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig20);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher0.s3Client = restS3Service17;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = null;
        s3SegmentPusher0.jsonMapper = objectMapper19;
        org.codehaus.jackson.map.ObjectMapper objectMapper21 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper21);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher3.s3Client = restS3Service10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig17);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = s3SegmentPusherConfig9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
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
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
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
        java.lang.Class<?> wildcardClass11 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        s3SegmentPusher0.jsonMapper = objectMapper2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher3.jsonMapper = objectMapper12;
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
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = null;
        s3SegmentPusher0.jsonMapper = objectMapper17;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig21 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig21);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = null;
        s3SegmentPusher0.jsonMapper = objectMapper19;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig21 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper22 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper22);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher3.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = objectMapper9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper19);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        java.lang.Class<?> wildcardClass14 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = null;
        s3SegmentPusher0.s3Client = restS3Service16;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = null;
        s3SegmentPusher0.jsonMapper = objectMapper19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher0.s3Client = restS3Service17;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig19 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher3.s3Client = restS3Service9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher3.jsonMapper = objectMapper11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher3.s3Client = restS3Service13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher3.jsonMapper = objectMapper16;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig18);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher3.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher3.s3Client = restS3Service4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        java.io.File file11 = null;
        com.metamx.druid.client.DataSegment dataSegment12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment13 = s3SegmentPusher3.push(file11, dataSegment12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service18);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        java.lang.Class<?> wildcardClass15 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher3.s3Client;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = restS3Service11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        java.lang.Class<?> wildcardClass8 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        java.lang.Class<?> wildcardClass14 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher3.jsonMapper = objectMapper11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        java.lang.Class<?> wildcardClass15 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        java.lang.Class<?> wildcardClass10 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        java.lang.Class<?> wildcardClass14 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }
}

