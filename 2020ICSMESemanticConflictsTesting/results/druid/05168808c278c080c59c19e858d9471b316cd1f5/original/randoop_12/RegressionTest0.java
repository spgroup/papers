import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        org.jets3t.service.impl.rest.httpclient.RestS3Service restS3Service0 = null;
        com.metamx.druid.loading.S3SegmentPusherConfig s3SegmentPusherConfig1 = null;
        org.codehaus.jackson.map.ObjectMapper objectMapper2 = null;
        com.metamx.druid.loading.S3SegmentPusher s3SegmentPusher3 = new com.metamx.druid.loading.S3SegmentPusher(restS3Service0, s3SegmentPusherConfig1, objectMapper2);
        java.lang.Class<?> wildcardClass4 = s3SegmentPusher3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
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
}

