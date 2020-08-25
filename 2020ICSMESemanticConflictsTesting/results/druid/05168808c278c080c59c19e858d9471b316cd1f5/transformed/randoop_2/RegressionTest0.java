import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.metamx.emitter.EmittingLogger emittingLogger0 = com.metamx.druid.loading.S3SegmentPusher.log;
        java.lang.Class<?> wildcardClass1 = emittingLogger0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(emittingLogger0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.google.common.base.Joiner joiner0 = null;
        com.metamx.druid.loading.S3SegmentPusher.JOINER = joiner0;
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        java.io.File file4 = null;
        com.metamx.druid.client.DataSegment dataSegment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment6 = s3SegmentPusher0.push(file4, dataSegment5);
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
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.google.common.base.Joiner joiner0 = com.metamx.druid.loading.S3SegmentPusher.JOINER;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(joiner0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        java.lang.Class<?> wildcardClass4 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        java.io.File file3 = null;
        com.metamx.druid.client.DataSegment dataSegment4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment5 = s3SegmentPusher0.push(file3, dataSegment4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        java.lang.Class<?> wildcardClass1 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.metamx.emitter.EmittingLogger emittingLogger0 = com.metamx.druid.loading.S3SegmentPusher.log;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        java.lang.Class<?> wildcardClass4 = emittingLogger0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(emittingLogger0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        java.io.File file5 = null;
        com.metamx.druid.client.DataSegment dataSegment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment7 = s3SegmentPusher0.push(file5, dataSegment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        java.lang.Class<?> wildcardClass5 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = restS3Service3.getClass();
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
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        java.io.File file4 = null;
        com.metamx.druid.client.DataSegment dataSegment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment6 = s3SegmentPusher3.push(file4, dataSegment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        java.io.File file1 = null;
        com.metamx.druid.client.DataSegment dataSegment2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment3 = s3SegmentPusher0.push(file1, dataSegment2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        java.io.File file6 = null;
        com.metamx.druid.client.DataSegment dataSegment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment8 = s3SegmentPusher3.push(file6, dataSegment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        java.io.File file7 = null;
        com.metamx.druid.client.DataSegment dataSegment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment9 = s3SegmentPusher0.push(file7, dataSegment8);
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
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        java.lang.Class<?> wildcardClass9 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = objectMapper8.getClass();
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
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        java.lang.Class<?> wildcardClass8 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
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
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher3.config;
        java.io.File file6 = null;
        com.metamx.druid.client.DataSegment dataSegment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment8 = s3SegmentPusher3.push(file6, dataSegment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = objectMapper5.getClass();
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
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.metamx.emitter.EmittingLogger emittingLogger0 = com.metamx.druid.loading.S3SegmentPusher.log;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        java.lang.Class<?> wildcardClass2 = emittingLogger0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(emittingLogger0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        java.io.File file7 = null;
        com.metamx.druid.client.DataSegment dataSegment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment9 = s3SegmentPusher3.push(file7, dataSegment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
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
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        java.io.File file4 = null;
        com.metamx.druid.client.DataSegment dataSegment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment6 = s3SegmentPusher0.push(file4, dataSegment5);
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
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        java.lang.Class<?> wildcardClass8 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        java.io.File file7 = null;
        com.metamx.druid.client.DataSegment dataSegment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment9 = s3SegmentPusher3.push(file7, dataSegment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = objectMapper9.getClass();
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
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        java.io.File file2 = null;
        com.metamx.druid.client.DataSegment dataSegment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment4 = s3SegmentPusher0.push(file2, dataSegment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher3.config;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = s3SegmentPusherConfig5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        java.lang.Class<?> wildcardClass8 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
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
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        java.io.File file5 = null;
        com.metamx.druid.client.DataSegment dataSegment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment7 = s3SegmentPusher3.push(file5, dataSegment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
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
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
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
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        java.lang.Class<?> wildcardClass6 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
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
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        java.io.File file9 = null;
        com.metamx.druid.client.DataSegment dataSegment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment11 = s3SegmentPusher3.push(file9, dataSegment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        java.lang.Class<?> wildcardClass6 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = objectMapper11.getClass();
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
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = s3SegmentPusher0.config;
        java.lang.Class<?> wildcardClass3 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = s3SegmentPusherConfig7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher3.jsonMapper = objectMapper5;
        java.lang.Class<?> wildcardClass7 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        java.io.File file7 = null;
        com.metamx.druid.client.DataSegment dataSegment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment9 = s3SegmentPusher0.push(file7, dataSegment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        java.lang.Class<?> wildcardClass6 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        java.lang.Class<?> wildcardClass9 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        java.lang.Class<?> wildcardClass7 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher0.jsonMapper = objectMapper5;
        java.lang.Class<?> wildcardClass7 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
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
        java.lang.Class<?> wildcardClass10 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
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
        java.lang.Class<?> wildcardClass14 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher3.s3Client = restS3Service4;
        java.io.File file6 = null;
        com.metamx.druid.client.DataSegment dataSegment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment8 = s3SegmentPusher3.push(file6, dataSegment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
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
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        java.lang.Class<?> wildcardClass4 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
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
        java.lang.Class<?> wildcardClass11 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
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
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
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
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = objectMapper15.getClass();
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
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        java.io.File file7 = null;
        com.metamx.druid.client.DataSegment dataSegment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment9 = s3SegmentPusher0.push(file7, dataSegment8);
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
        org.junit.Assert.assertNull(restS3Service6);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher0.jsonMapper;
        java.io.File file5 = null;
        com.metamx.druid.client.DataSegment dataSegment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment7 = s3SegmentPusher0.push(file5, dataSegment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.metamx.emitter.EmittingLogger emittingLogger0 = null;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher3.jsonMapper = objectMapper5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        java.io.File file4 = null;
        com.metamx.druid.client.DataSegment dataSegment5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment6 = s3SegmentPusher0.push(file4, dataSegment5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
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
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = s3SegmentPusherConfig9.getClass();
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
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
        java.lang.Class<?> wildcardClass13 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.metamx.emitter.EmittingLogger emittingLogger0 = com.metamx.druid.loading.S3SegmentPusher.log;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(emittingLogger0);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
        java.lang.Class<?> wildcardClass13 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        java.lang.Class<?> wildcardClass10 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher3.s3Client;
        java.io.File file6 = null;
        com.metamx.druid.client.DataSegment dataSegment7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment8 = s3SegmentPusher3.push(file6, dataSegment7);
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
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        org.junit.Assert.assertNull(restS3Service9);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher3.s3Client = restS3Service10;
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        java.lang.Class<?> wildcardClass9 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        java.lang.Class<?> wildcardClass7 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
        java.lang.Class<?> wildcardClass10 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher3.jsonMapper = objectMapper12;
        java.lang.Class<?> wildcardClass14 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
        java.lang.Class<?> wildcardClass16 = s3SegmentPusher0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        java.lang.Class<?> wildcardClass7 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
        java.lang.Class<?> wildcardClass10 = s3SegmentPusher0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
        java.lang.Class<?> wildcardClass16 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        java.io.File file9 = null;
        com.metamx.druid.client.DataSegment dataSegment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment11 = s3SegmentPusher3.push(file9, dataSegment10);
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
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
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
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
        java.lang.Class<?> wildcardClass10 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        java.lang.Class<?> wildcardClass11 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
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
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        java.lang.Class<?> wildcardClass13 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher3.s3Client = restS3Service10;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
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
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher3.jsonMapper = objectMapper9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher3.s3Client;
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
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
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher3.s3Client = restS3Service9;
        java.lang.Class<?> wildcardClass11 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = objectMapper8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = objectMapper7.getClass();
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
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher3.s3Client;
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
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        java.lang.Class<?> wildcardClass9 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
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
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
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
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
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
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
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
        java.lang.Class<?> wildcardClass10 = s3SegmentPusher0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
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
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        java.lang.Class<?> wildcardClass19 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
        java.io.File file13 = null;
        com.metamx.druid.client.DataSegment dataSegment14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment15 = s3SegmentPusher3.push(file13, dataSegment14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        java.io.File file7 = null;
        com.metamx.druid.client.DataSegment dataSegment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment9 = s3SegmentPusher0.push(file7, dataSegment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = objectMapper6.getClass();
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
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher3.s3Client = restS3Service13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = restS3Service4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        java.lang.Class<?> wildcardClass6 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = objectMapper10.getClass();
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
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
        java.lang.Class<?> wildcardClass14 = s3SegmentPusher3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        java.io.File file9 = null;
        com.metamx.druid.client.DataSegment dataSegment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment11 = s3SegmentPusher3.push(file9, dataSegment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = restS3Service11.getClass();
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
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = s3SegmentPusherConfig16.getClass();
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
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
        java.lang.Class<?> wildcardClass17 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
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
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service19 = null;
        s3SegmentPusher0.s3Client = restS3Service19;
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
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        java.lang.Class<?> wildcardClass7 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher3.s3Client;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = objectMapper13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        java.lang.Class<?> wildcardClass13 = s3SegmentPusher0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = s3SegmentPusherConfig7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        java.io.File file7 = null;
        com.metamx.druid.client.DataSegment dataSegment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment9 = s3SegmentPusher0.push(file7, dataSegment8);
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
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = objectMapper5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher0.config;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = s3SegmentPusherConfig15.getClass();
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
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher3.s3Client;
        java.io.File file9 = null;
        com.metamx.druid.client.DataSegment dataSegment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment11 = s3SegmentPusher3.push(file9, dataSegment10);
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
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
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        java.lang.Class<?> wildcardClass14 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
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
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
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
        java.lang.Class<?> wildcardClass15 = s3SegmentPusher0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = objectMapper10.getClass();
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
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        java.lang.Class<?> wildcardClass13 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        java.lang.Class<?> wildcardClass8 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
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
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
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
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = objectMapper2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
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
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        java.lang.Class<?> wildcardClass15 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        java.io.File file9 = null;
        com.metamx.druid.client.DataSegment dataSegment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment11 = s3SegmentPusher3.push(file9, dataSegment10);
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
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher0.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = objectMapper4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        java.lang.Class<?> wildcardClass9 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        java.lang.Class<?> wildcardClass10 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
        java.lang.Class<?> wildcardClass15 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        java.lang.Class<?> wildcardClass19 = s3SegmentPusher3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
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
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        java.lang.Class<?> wildcardClass14 = s3SegmentPusher0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        java.lang.Class<?> wildcardClass11 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = objectMapper11.getClass();
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
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        java.lang.Class<?> wildcardClass5 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        java.lang.Class<?> wildcardClass14 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher3.jsonMapper = objectMapper10;
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher0.jsonMapper = objectMapper5;
        java.io.File file7 = null;
        com.metamx.druid.client.DataSegment dataSegment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment9 = s3SegmentPusher0.push(file7, dataSegment8);
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
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher0.jsonMapper = objectMapper5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        java.lang.Class<?> wildcardClass6 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        java.lang.Class<?> wildcardClass13 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
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
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
        java.lang.Class<?> wildcardClass13 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        java.lang.Class<?> wildcardClass7 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
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
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher3.s3Client = restS3Service10;
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = objectMapper6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        java.io.File file7 = null;
        com.metamx.druid.client.DataSegment dataSegment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment9 = s3SegmentPusher0.push(file7, dataSegment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        java.io.File file13 = null;
        com.metamx.druid.client.DataSegment dataSegment14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment15 = s3SegmentPusher3.push(file13, dataSegment14);
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
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
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
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
        org.junit.Assert.assertNull(restS3Service9);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = s3SegmentPusherConfig1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        java.lang.Class<?> wildcardClass14 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
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
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        java.lang.Class<?> wildcardClass10 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        java.lang.Class<?> wildcardClass6 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        java.lang.Class<?> wildcardClass19 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
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
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = restS3Service6.getClass();
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
        org.junit.Assert.assertNull(restS3Service6);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service17);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher3.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher3.config;
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher3.s3Client;
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
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher0.s3Client;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = null;
        s3SegmentPusher0.s3Client = restS3Service16;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
        java.io.File file18 = null;
        com.metamx.druid.client.DataSegment dataSegment19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment20 = s3SegmentPusher3.push(file18, dataSegment19);
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
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.metamx.emitter.EmittingLogger emittingLogger0 = com.metamx.druid.loading.S3SegmentPusher.log;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = emittingLogger0.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(emittingLogger0);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
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
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher0.s3Client = restS3Service17;
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
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
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
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
        java.lang.Class<?> wildcardClass18 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher3.jsonMapper = objectMapper10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher0.s3Client = restS3Service17;
        java.io.File file19 = null;
        com.metamx.druid.client.DataSegment dataSegment20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment21 = s3SegmentPusher0.push(file19, dataSegment20);
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
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        java.io.File file7 = null;
        com.metamx.druid.client.DataSegment dataSegment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment9 = s3SegmentPusher0.push(file7, dataSegment8);
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
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher0.jsonMapper = objectMapper5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        java.lang.Class<?> wildcardClass11 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig19 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig19;
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
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = objectMapper6.getClass();
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
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
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
        java.io.File file13 = null;
        com.metamx.druid.client.DataSegment dataSegment14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment15 = s3SegmentPusher3.push(file13, dataSegment14);
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
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = s3SegmentPusherConfig7.getClass();
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
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = s3SegmentPusherConfig6.getClass();
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
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher3.s3Client = restS3Service10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper19);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = null;
        s3SegmentPusher0.s3Client = restS3Service20;
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
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        java.lang.Class<?> wildcardClass10 = s3SegmentPusher0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher0.jsonMapper = objectMapper5;
        java.lang.Class<?> wildcardClass7 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        java.lang.Class<?> wildcardClass14 = s3SegmentPusher0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig5;
        java.lang.Class<?> wildcardClass7 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher3.s3Client = restS3Service11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = s3SegmentPusher3.config;
        java.lang.Class<?> wildcardClass14 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
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
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
        java.lang.Class<?> wildcardClass19 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
        java.lang.Class<?> wildcardClass14 = s3SegmentPusher0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = restS3Service10.getClass();
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
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = objectMapper3.getClass();
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
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig15;
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
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher0.s3Client;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = restS3Service15.getClass();
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        java.lang.Class<?> wildcardClass9 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        java.lang.Class<?> wildcardClass16 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = restS3Service7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = objectMapper13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        java.io.File file7 = null;
        com.metamx.druid.client.DataSegment dataSegment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment9 = s3SegmentPusher0.push(file7, dataSegment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher3.s3Client = restS3Service4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher3.config;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = s3SegmentPusherConfig11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        java.lang.Class<?> wildcardClass10 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        java.lang.Class<?> wildcardClass16 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher3.jsonMapper = objectMapper13;
        java.lang.Class<?> wildcardClass15 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher0.jsonMapper = objectMapper15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper19 = null;
        s3SegmentPusher0.jsonMapper = objectMapper19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        java.lang.Class<?> wildcardClass7 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        java.lang.Class<?> wildcardClass15 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        java.lang.Class<?> wildcardClass10 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher3.s3Client = restS3Service14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher0.config;
        java.lang.Class<?> wildcardClass16 = s3SegmentPusher0.getClass();
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
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher0.s3Client;
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
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
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
        org.junit.Assert.assertNull(restS3Service11);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
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
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher0.jsonMapper = objectMapper8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
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
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        java.lang.Class<?> wildcardClass11 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper17 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = null;
        s3SegmentPusher0.s3Client = restS3Service18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        java.lang.Class<?> wildcardClass4 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher0.s3Client;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
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
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = null;
        s3SegmentPusher0.s3Client = restS3Service17;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig19 = s3SegmentPusher0.config;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig19);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper18 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        java.lang.Class<?> wildcardClass7 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
        java.lang.Class<?> wildcardClass21 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
        java.lang.Class<?> wildcardClass13 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        java.lang.Class<?> wildcardClass8 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher3.s3Client;
        java.lang.Class<?> wildcardClass8 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
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
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        java.lang.Class<?> wildcardClass9 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher3.s3Client;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = restS3Service7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        java.lang.Class<?> wildcardClass11 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher0.config;
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = s3SegmentPusher3.jsonMapper;
        java.lang.Class<?> wildcardClass15 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service20 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service21 = s3SegmentPusher3.s3Client;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service21);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
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
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
        java.lang.Class<?> wildcardClass13 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher3.jsonMapper = objectMapper11;
        java.io.File file13 = null;
        com.metamx.druid.client.DataSegment dataSegment14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment15 = s3SegmentPusher3.push(file13, dataSegment14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = objectMapper11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
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
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.metamx.emitter.EmittingLogger emittingLogger0 = com.metamx.druid.loading.S3SegmentPusher.log;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        com.metamx.druid.loading.S3SegmentPusher.log = emittingLogger0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = emittingLogger0.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(emittingLogger0);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
        java.lang.Class<?> wildcardClass15 = s3SegmentPusher0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = null;
        s3SegmentPusher0.s3Client = restS3Service1;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        java.io.File file5 = null;
        com.metamx.druid.client.DataSegment dataSegment6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment7 = s3SegmentPusher0.push(file5, dataSegment6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        java.lang.Class<?> wildcardClass9 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
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
        java.lang.Class<?> wildcardClass15 = s3SegmentPusher0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher3.s3Client = restS3Service10;
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
        org.junit.Assert.assertNull(restS3Service9);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
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
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher0.s3Client = restS3Service12;
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
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher3.jsonMapper = objectMapper10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher0.jsonMapper = objectMapper13;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher3.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = s3SegmentPusher3.config;
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
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = null;
        s3SegmentPusher3.jsonMapper = objectMapper15;
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
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = s3SegmentPusher0.config;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = s3SegmentPusherConfig17.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig17);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = s3SegmentPusher0.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = objectMapper11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher3.s3Client = restS3Service4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = restS3Service6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = null;
        s3SegmentPusher0.s3Client = restS3Service7;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig9 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher3.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher3.jsonMapper = objectMapper11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher3.s3Client = restS3Service15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig10;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher0.jsonMapper = objectMapper7;
        java.lang.Class<?> wildcardClass9 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = null;
        s3SegmentPusher0.s3Client = restS3Service15;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service17 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service17);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher3.jsonMapper = objectMapper11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher3.s3Client;
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
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper15 = s3SegmentPusher0.jsonMapper;
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
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher0.s3Client = restS3Service4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher0.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = objectMapper4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
        org.junit.Assert.assertNull(objectMapper19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper21);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = null;
        s3SegmentPusher0.s3Client = restS3Service13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher0.s3Client = restS3Service9;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
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
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig15;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig17 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig17;
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
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig14;
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
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher3.s3Client = restS3Service10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig12;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher3.jsonMapper = objectMapper14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = s3SegmentPusher0.jsonMapper;
        java.lang.Class<?> wildcardClass9 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = null;
        s3SegmentPusher3.jsonMapper = objectMapper13;
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service15 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper11 = null;
        s3SegmentPusher0.jsonMapper = objectMapper11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = null;
        s3SegmentPusher0.s3Client = restS3Service6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper9 = null;
        s3SegmentPusher0.jsonMapper = objectMapper9;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher0.jsonMapper = objectMapper5;
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        java.lang.Class<?> wildcardClass14 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig6;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig8 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig8);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig19 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig19;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service21 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service21);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = null;
        s3SegmentPusher0.s3Client = restS3Service14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = s3SegmentPusher0.config;
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
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig10 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = null;
        s3SegmentPusher3.s3Client = restS3Service4;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        java.lang.Class<?> wildcardClass9 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = s3SegmentPusher0.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        java.lang.Class<?> wildcardClass11 = s3SegmentPusher0.getClass();
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
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = null;
        s3SegmentPusher0.jsonMapper = objectMapper12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
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
        org.junit.Assert.assertNull(restS3Service14);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher0.jsonMapper = objectMapper10;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        s3SegmentPusher0.jsonMapper = objectMapper2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher0.jsonMapper = objectMapper14;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service18 = s3SegmentPusher0.s3Client;
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
        org.junit.Assert.assertNull(restS3Service18);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher0.jsonMapper;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = objectMapper12.getClass();
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
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper14 = null;
        s3SegmentPusher3.jsonMapper = objectMapper14;
        java.io.File file16 = null;
        com.metamx.druid.client.DataSegment dataSegment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment18 = s3SegmentPusher3.push(file16, dataSegment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher3.s3Client;
        java.io.File file9 = null;
        com.metamx.druid.client.DataSegment dataSegment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment11 = s3SegmentPusher3.push(file9, dataSegment10);
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
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = s3SegmentPusher0.s3Client;
        java.lang.Class<?> wildcardClass9 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig13);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig7;
        java.lang.Class<?> wildcardClass9 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher0.config;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = s3SegmentPusherConfig5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service1 = null;
        s3SegmentPusher0.s3Client = restS3Service1;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher0.jsonMapper = objectMapper5;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = s3SegmentPusher0.s3Client;
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
        org.junit.Assert.assertNull(restS3Service16);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = s3SegmentPusher0.s3Client;
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
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher0.s3Client = restS3Service5;
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = null;
        s3SegmentPusher0.s3Client = restS3Service2;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig18 = s3SegmentPusher0.config;
        java.io.File file19 = null;
        com.metamx.druid.client.DataSegment dataSegment20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment21 = s3SegmentPusher0.push(file19, dataSegment20);
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
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig18);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper16 = null;
        s3SegmentPusher0.jsonMapper = objectMapper16;
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
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig2 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig2;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig4 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = null;
        s3SegmentPusher0.jsonMapper = objectMapper5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig7;
        java.lang.Class<?> wildcardClass9 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = s3SegmentPusher0.config;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig12);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher3.s3Client = restS3Service10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        java.lang.Class<?> wildcardClass14 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        java.lang.Class<?> wildcardClass4 = s3SegmentPusher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig5;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        java.io.File file9 = null;
        com.metamx.druid.client.DataSegment dataSegment10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment11 = s3SegmentPusher3.push(file9, dataSegment10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
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
        java.io.File file16 = null;
        com.metamx.druid.client.DataSegment dataSegment17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment18 = s3SegmentPusher3.push(file16, dataSegment17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
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
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper12 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service13 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher3.s3Client = restS3Service10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig14 = s3SegmentPusher3.config;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig14);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        java.io.File file7 = null;
        com.metamx.druid.client.DataSegment dataSegment8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment9 = s3SegmentPusher3.push(file7, dataSegment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = s3SegmentPusher3.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher3.s3Client = restS3Service8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service5);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig1;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig3 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig3;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig5 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = null;
        s3SegmentPusher0.jsonMapper = objectMapper6;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig5);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service3 = null;
        s3SegmentPusher0.s3Client = restS3Service3;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher0.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service7 = s3SegmentPusher0.s3Client;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = restS3Service7.getClass();
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
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service7);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher0.s3Client = restS3Service10;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig12 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig12;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service14 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig15 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig16 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig16;
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
        org.junit.Assert.assertNull(restS3Service14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig15);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper3 = s3SegmentPusher0.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher0.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher0.config;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher0.s3Client = restS3Service8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher0.s3Client;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig11 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig11;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig13 = null;
        s3SegmentPusher0.config = s3SegmentPusherConfig13;
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
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service6 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service6);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
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
        java.lang.Class<?> wildcardClass12 = s3SegmentPusher0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service16 = null;
        s3SegmentPusher0.s3Client = restS3Service16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service13);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = s3SegmentPusher0.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service2 = s3SegmentPusher0.s3Client;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = restS3Service2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service2);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = null;
        s3SegmentPusher3.s3Client = restS3Service10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper13 = s3SegmentPusher3.jsonMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service5 = null;
        s3SegmentPusher3.s3Client = restS3Service5;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service8 = null;
        s3SegmentPusher3.s3Client = restS3Service8;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service10 = s3SegmentPusher3.s3Client;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service10);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher0 = new com.metamx.druid.loading.S3SegmentPusher();
        org.codehaus.jackson.map.ObjectMapper objectMapper1 = null;
        s3SegmentPusher0.jsonMapper = objectMapper1;
        java.io.File file3 = null;
        com.metamx.druid.client.DataSegment dataSegment4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.metamx.druid.client.DataSegment dataSegment5 = s3SegmentPusher0.push(file3, dataSegment4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
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
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = null;
        s3SegmentPusher3.config = s3SegmentPusherConfig6;
        java.lang.Class<?> wildcardClass8 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service11 = null;
        s3SegmentPusher0.s3Client = restS3Service11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service4 = s3SegmentPusher3.s3Client;
        org.codehaus.jackson.map.ObjectMapper objectMapper5 = s3SegmentPusher3.jsonMapper;
        org.codehaus.jackson.map.ObjectMapper objectMapper6 = s3SegmentPusher3.jsonMapper;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig7 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper8 = null;
        s3SegmentPusher3.jsonMapper = objectMapper8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig7);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        org.codehaus.jackson.map.ObjectMapper objectMapper4 = null;
        s3SegmentPusher3.jsonMapper = objectMapper4;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig6 = s3SegmentPusher3.config;
        org.codehaus.jackson.map.ObjectMapper objectMapper7 = null;
        s3SegmentPusher3.jsonMapper = objectMapper7;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service9 = null;
        s3SegmentPusher3.s3Client = restS3Service9;
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
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
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
        org.codehaus.jackson.map.ObjectMapper objectMapper10 = null;
        s3SegmentPusher3.jsonMapper = objectMapper10;
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service12 = null;
        s3SegmentPusher3.s3Client = restS3Service12;
        java.lang.Class<?> wildcardClass14 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(s3SegmentPusherConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
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
        org.junit.Assert.assertNull(objectMapper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(restS3Service11);
    }
}

