import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int int0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_UNCOMMITTED_OFFSETS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10000000 + "'", int0 == 10000000);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        java.lang.Class<?> wildcardClass1 = firstPollOffsetStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy0 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy0.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        long long0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 30000L + "'", long0 == 30000L);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        long long0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 200L + "'", long0 == 200L);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Object>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.AUTO_COMMIT_INTERVAL_MS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "auto.commit.interval.ms" + "'", str0.equals("auto.commit.interval.ms"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.VALUE_DESERIALIZER;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "value.deserializer" + "'", str0.equals("value.deserializer"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.BOOTSTRAP_SERVERS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "bootstrap.servers" + "'", str0.equals("bootstrap.servers"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Object>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.KEY_DESERIALIZER;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "key.deserializer" + "'", str0.equals("key.deserializer"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        java.lang.Class<?> wildcardClass1 = firstPollOffsetStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy0 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy0.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int int0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_MAX_RETRIES;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2147483647 + "'", int0 == 2147483647);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.GROUP_ID;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "group.id" + "'", str0.equals("group.id"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String str0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.Consumer.ENABLE_AUTO_COMMIT;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "enable.auto.commit" + "'", str0.equals("enable.auto.commit"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.reflect.AnnotatedElement> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.AnnotatedElement> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.String> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.String> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.String>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        java.lang.Class<?> wildcardClass1 = firstPollOffsetStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy0 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy0.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.io.Serializable> strKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.io.Serializable> strBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.io.Serializable>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.CharSequence> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.CharSequence> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> serializableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> serializableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy0 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST;
        java.lang.Class<?> wildcardClass1 = firstPollOffsetStrategy0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy0 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST + "'", firstPollOffsetStrategy0.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strComparableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strComparableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Object>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.CharSequence> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.CharSequence> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.reflect.Type> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.Type> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.reflect.Type> serializableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.Type> serializableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String> firstPollOffsetStrategyBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Object> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Object> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Object>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.reflect.AnnotatedElement> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.AnnotatedElement> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.CharSequence> serializableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.CharSequence> serializableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.io.Serializable> charSequenceKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.io.Serializable> charSequenceBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.io.Serializable>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.String> serializableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.String> serializableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.String>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.reflect.GenericDeclaration> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.GenericDeclaration> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement> strComparableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type> annotatedElementBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.reflect.Type> objKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.Type> objBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.String>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> genericDeclarationBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> serializableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> serializableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.io.Serializable> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.io.Serializable> firstPollOffsetStrategyBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.io.Serializable>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.CharSequence> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.CharSequence> firstPollOffsetStrategyBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.String>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.io.Serializable>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.String> charSequenceKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.String> charSequenceBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.String>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.Object> objKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Object> objBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Object>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.Object> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Object> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Object>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration> strComparableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyEnumBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.io.Serializable> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.io.Serializable> firstPollOffsetStrategyEnumBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.io.Serializable>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.io.Serializable> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.io.Serializable> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.io.Serializable>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Object> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Object> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Object>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String> firstPollOffsetStrategyEnumBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.String> objKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.String> objBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.String>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.String> typeKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.String> typeBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.String>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.CharSequence> typeKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.CharSequence> typeBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Object> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Object>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.String>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.String> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.CharSequence> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.CharSequence> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.CharSequence> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Object> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Object> firstPollOffsetStrategyEnumBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Object>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.reflect.Type> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.Type> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.String>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type> firstPollOffsetStrategyEnumBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.io.Serializable> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.io.Serializable>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.reflect.Type> typeKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.Type> typeBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.reflect.Type> charSequenceKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.Type> charSequenceBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.CharSequence> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.CharSequence> firstPollOffsetStrategyEnumBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.String> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.String>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.CharSequence> strKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.CharSequence> strBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> charSequenceKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> charSequenceBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.Comparable<java.lang.String>> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Comparable<java.lang.String>> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.io.Serializable> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.io.Serializable> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.io.Serializable>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration> annotatedElementBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.String> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.String> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.String>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.AnnotatedElement> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Object> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Object>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.CharSequence> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.CharSequence> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> annotatedElementBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.io.Serializable>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.io.Serializable>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> objKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> objBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.io.Serializable> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.io.Serializable> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.io.Serializable>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strComparableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strComparableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>> typeBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.String> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.String> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.String>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Object>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.reflect.Type> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.Type> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.CharSequence> charSequenceKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.CharSequence> charSequenceBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.String>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.String> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.String> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.String>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.CharSequence> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.CharSequence> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.CharSequence> objKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.CharSequence> objBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.reflect.AnnotatedElement> strKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.AnnotatedElement> strBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.GenericDeclaration> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.reflect.GenericDeclaration> strKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.GenericDeclaration> strBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.Type> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.Type> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.reflect.GenericDeclaration> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.GenericDeclaration> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.io.Serializable> serializableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.io.Serializable> serializableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.io.Serializable>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.reflect.AnnotatedElement> objKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.AnnotatedElement> objBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.CharSequence> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.CharSequence> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.io.Serializable> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.io.Serializable> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.io.Serializable>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.Comparable<java.lang.String>> objKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Comparable<java.lang.String>> objBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.io.Serializable>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> objKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> objBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Object> genericDeclarationBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Object>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> firstPollOffsetStrategyEnumBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> annotatedElementBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>> strComparableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.AnnotatedElement> serializableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.CharSequence> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.CharSequence> strComparableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.reflect.GenericDeclaration> objKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.GenericDeclaration> objBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> firstPollOffsetStrategyEnumBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object> firstPollOffsetStrategyBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Object>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.reflect.Type> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.Type> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.AnnotatedElement> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.Object> typeKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Object> typeBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Object>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> genericDeclarationBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> typeKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> typeBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.Object> charSequenceKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Object> charSequenceBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Object>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Comparable<java.lang.String>> charSequenceBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyEnumBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.io.Serializable> typeKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.io.Serializable> typeBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.io.Serializable>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.String> strKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String> strBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.String>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> charSequenceKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> charSequenceBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyEnumBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Object> serializableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.Object>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.AnnotatedElement>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.Type> firstPollOffsetStrategyKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.Type> firstPollOffsetStrategyBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Object> strKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Object> strBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Object>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.io.Serializable> genericDeclarationBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.io.Serializable>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.lang.Object> objKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Object> objBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.Object>(strMap0, kafkaSpoutStreams1, objKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.io.Serializable> strComparableBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Comparable<java.lang.String>, java.io.Serializable>(strMap0, kafkaSpoutStreams1, strComparableKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.Object> typeKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Object> typeBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Object>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.CharSequence, java.io.Serializable> charSequenceKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.io.Serializable> charSequenceBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.CharSequence, java.io.Serializable>(strMap0, kafkaSpoutStreams1, charSequenceKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.reflect.Type> serializableKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.Type> serializableBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.io.Serializable, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.String>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.Type, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> typeKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> typeBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>(strMap0, kafkaSpoutStreams1, typeKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, java.lang.String>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.reflect.Type> strKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.Type> strBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.reflect.Type>(strMap0, kafkaSpoutStreams1, strKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>> genericDeclarationBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.Comparable<java.lang.String>>(strMap0, kafkaSpoutStreams1, genericDeclarationKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.io.Serializable> firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.io.Serializable> firstPollOffsetStrategyEnumBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.io.Serializable>(strMap0, kafkaSpoutStreams1, firstPollOffsetStrategyEnumKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }
}

