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
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
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
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
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
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
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
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
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
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
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
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
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
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
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
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = null;
        s3SegmentPusher0.jsonMapper = objectMapper18;
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
        org.junit.Assert.assertNull(objectMapper15);
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = null;
        s3SegmentPusher0.s3Client = restS3Service16;
        java.io.File file18 = null;
        com.metamx.druid.client.DataSegment dataSegment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment20 = s3SegmentPusher0.push(file18, dataSegment19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig17;
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
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        java.lang.Class<?> wildcardClass11 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = null;
        s3SegmentPusher3.jsonMapper = objectMapper18;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper21 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig22 = s3SegmentPusher3.config;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig22);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher0.s3Client = restS3Service17;
        java.lang.Class<?> wildcardClass19 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher3.jsonMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
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
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher0.jsonMapper = objectMapper16;
        java.io.File file18 = null;
        com.metamx.druid.client.DataSegment dataSegment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment20 = s3SegmentPusher0.push(file18, dataSegment19);
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
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig17;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = null;
        s3SegmentPusher3.s3Client = restS3Service19;
        org.codehaus.jackson.map.ObjectMapper objectMapper21 = null;
        s3SegmentPusher3.jsonMapper = objectMapper21;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
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
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher3.s3Client = restS3Service13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig16;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = null;
        s3SegmentPusher3.jsonMapper = objectMapper18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
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
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
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
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher3.s3Client = restS3Service17;
        java.lang.Class<?> wildcardClass19 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
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
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher0.s3Client = restS3Service17;
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
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
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
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig16;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = null;
        s3SegmentPusher3.s3Client = restS3Service18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = null;
        s3SegmentPusher3.jsonMapper = objectMapper17;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = null;
        s3SegmentPusher3.jsonMapper = objectMapper19;
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
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
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
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher3.s3Client = restS3Service9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher3.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher3.s3Client = restS3Service15;
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
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
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
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher0.s3Client;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
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
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher3.config;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = s3SegmentPusherConfig15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        java.io.File file10 = null;
        com.metamx.druid.client.DataSegment dataSegment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment12 = s3SegmentPusher0.push(file10, dataSegment11);
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
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher3.jsonMapper = objectMapper13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher3.jsonMapper = objectMapper15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        java.io.File file9 = null;
        com.metamx.druid.client.DataSegment dataSegment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment11 = s3SegmentPusher0.push(file9, dataSegment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
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
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher0.jsonMapper = objectMapper5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = null;
        s3SegmentPusher3.s3Client = restS3Service20;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher3.config;
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
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher3.jsonMapper = objectMapper5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
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
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher3.jsonMapper = objectMapper14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = null;
        s3SegmentPusher3.s3Client = restS3Service16;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig18;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig20 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper21 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper21);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig15;
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
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = null;
        s3SegmentPusher0.s3Client = restS3Service16;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = null;
        s3SegmentPusher0.jsonMapper = objectMapper18;
        java.lang.Class<?> wildcardClass20 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher3.s3Client = restS3Service10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service16);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        java.io.File file14 = null;
        com.metamx.druid.client.DataSegment dataSegment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment16 = s3SegmentPusher0.push(file14, dataSegment15);
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
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
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
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
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig4);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher0.s3Client;
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
        org.junit.Assert.assertNull(restS3Service15);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        java.lang.Class<?> wildcardClass17 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
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
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = null;
        s3SegmentPusher0.jsonMapper = objectMapper18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper20 = s3SegmentPusher0.jsonMapper;
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
        org.junit.Assert.assertNull(restS3Service17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper20);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
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
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = null;
        s3SegmentPusher3.s3Client = restS3Service18;
        org.codehaus.jackson.map.ObjectMapper objectMapper20 = null;
        s3SegmentPusher3.jsonMapper = objectMapper20;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service21 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service21);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher0.s3Client = restS3Service17;
        java.lang.Class<?> wildcardClass19 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher3.s3Client;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = restS3Service5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        java.io.File file8 = null;
        com.metamx.druid.client.DataSegment dataSegment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment10 = s3SegmentPusher0.push(file8, dataSegment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher3.jsonMapper = objectMapper16;
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
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = objectMapper13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher0.s3Client;
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
        org.junit.Assert.assertNull(restS3Service15);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        java.io.File file8 = null;
        com.metamx.druid.client.DataSegment dataSegment9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment10 = s3SegmentPusher3.push(file8, dataSegment9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
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
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
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
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher3.s3Client = restS3Service15;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher3.s3Client = restS3Service17;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig20 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig20;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service19);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig4);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher0.jsonMapper;
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
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service18);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
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
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig8;
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
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher0.jsonMapper = objectMapper16;
        java.lang.Class<?> wildcardClass18 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
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
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher0.jsonMapper = objectMapper16;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = s3SegmentPusher0.config;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig18);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher3.s3Client = restS3Service13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher3.jsonMapper = objectMapper5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher3.jsonMapper = objectMapper11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig20 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig20);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig18;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = null;
        s3SegmentPusher0.s3Client = restS3Service20;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig19 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service18);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher3.s3Client = restS3Service9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher3.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = null;
        s3SegmentPusher0.jsonMapper = objectMapper17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = null;
        s3SegmentPusher0.s3Client = restS3Service16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher0.jsonMapper;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = s3SegmentPusher3.jsonMapper;
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
        org.junit.Assert.assertNull(objectMapper19);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = s3SegmentPusher0.s3Client;
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
        org.junit.Assert.assertNull(restS3Service18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service19);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig20 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig20;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper19);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher3.jsonMapper;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig15;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = null;
        s3SegmentPusher0.jsonMapper = objectMapper19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service18);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
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
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service17);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher3.jsonMapper;
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
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher3.jsonMapper = objectMapper16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = null;
        s3SegmentPusher0.jsonMapper = objectMapper17;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig21 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig21;
        org.codehaus.jackson.map.ObjectMapper objectMapper23 = null;
        s3SegmentPusher0.jsonMapper = objectMapper23;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service20);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = s3SegmentPusher0.config;
        java.lang.Class<?> wildcardClass19 = s3SegmentPusher0.getClass();
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
        org.junit.Assert.assertNull(restS3Service16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher3.jsonMapper = objectMapper11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher0.jsonMapper = objectMapper16;
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
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
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
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = s3SegmentPusherConfig13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig18;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service20);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher0.jsonMapper;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher0.s3Client;
        java.lang.Class<?> wildcardClass6 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
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
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher0.jsonMapper = objectMapper16;
        java.lang.Class<?> wildcardClass18 = s3SegmentPusher0.getClass();
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = null;
        s3SegmentPusher0.jsonMapper = objectMapper19;
        org.codehaus.jackson.map.ObjectMapper objectMapper21 = s3SegmentPusher0.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = objectMapper21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper21);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher0.jsonMapper = objectMapper5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
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
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher0.s3Client = restS3Service17;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig19 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher3.config;
        java.io.File file14 = null;
        com.metamx.druid.client.DataSegment dataSegment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment16 = s3SegmentPusher3.push(file14, dataSegment15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = null;
        s3SegmentPusher3.jsonMapper = objectMapper18;
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
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = restS3Service13.getClass();
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
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher3.jsonMapper;
        java.io.File file15 = null;
        com.metamx.druid.client.DataSegment dataSegment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment17 = s3SegmentPusher3.push(file15, dataSegment16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher0.jsonMapper = objectMapper16;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = null;
        s3SegmentPusher0.jsonMapper = objectMapper18;
        java.io.File file20 = null;
        com.metamx.druid.client.DataSegment dataSegment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment22 = s3SegmentPusher0.push(file20, dataSegment21);
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
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher3.s3Client = restS3Service14;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher3.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = objectMapper16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = null;
        s3SegmentPusher0.jsonMapper = objectMapper17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher3.s3Client = restS3Service9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher3.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher3.jsonMapper = objectMapper16;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
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
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = null;
        s3SegmentPusher0.jsonMapper = objectMapper18;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig20 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service21 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig22 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig22);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
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
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = null;
        s3SegmentPusher0.jsonMapper = objectMapper19;
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
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
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
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher3.s3Client = restS3Service17;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = null;
        s3SegmentPusher3.s3Client = restS3Service19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
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
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        java.lang.Class<?> wildcardClass8 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher3.jsonMapper = objectMapper12;
        java.io.File file14 = null;
        com.metamx.druid.client.DataSegment dataSegment15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment16 = s3SegmentPusher3.push(file14, dataSegment15);
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
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig15;
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher3.jsonMapper;
        java.io.File file10 = null;
        com.metamx.druid.client.DataSegment dataSegment11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment12 = s3SegmentPusher3.push(file10, dataSegment11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = s3SegmentPusher0.jsonMapper;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper19);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
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
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = null;
        s3SegmentPusher0.s3Client = restS3Service16;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = null;
        s3SegmentPusher0.jsonMapper = objectMapper18;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = null;
        s3SegmentPusher0.s3Client = restS3Service20;
        org.codehaus.jackson.map.ObjectMapper objectMapper22 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper22);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        java.lang.Class<?> wildcardClass15 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        s3SegmentPusher0.jsonMapper = objectMapper2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher3.jsonMapper = objectMapper16;
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        s3SegmentPusher0.jsonMapper = objectMapper2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig20 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig20);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = null;
        s3SegmentPusher0.jsonMapper = objectMapper19;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig21 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig21);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        java.lang.Class<?> wildcardClass14 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = null;
        s3SegmentPusher0.s3Client = restS3Service19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig18);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig20 = s3SegmentPusher0.config;
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
        org.junit.Assert.assertNull(restS3Service17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig20);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = s3SegmentPusher3.s3Client;
        java.io.File file20 = null;
        com.metamx.druid.client.DataSegment dataSegment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment22 = s3SegmentPusher3.push(file20, dataSegment21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(restS3Service19);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
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
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }
}

