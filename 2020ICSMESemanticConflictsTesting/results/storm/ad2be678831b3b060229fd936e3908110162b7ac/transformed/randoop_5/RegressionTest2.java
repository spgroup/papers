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
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams4;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap6;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer8 = serializableKafkaSpoutConfig0.keyDeserializer;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer8);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = serializableKafkaSpoutConfig0.retryService;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer5 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer5;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = serializableKafkaSpoutConfig0.getRetryService();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = serializableKafkaSpoutConfig0.getKafkaProps();
        java.util.regex.Pattern pattern11 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap13 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern11);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer11 = serializableKafkaSpoutConfig0.valueDeserializer;
        int int12 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        long long13 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        long long14 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.util.regex.Pattern pattern15 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern15);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = '4';
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        long long4 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap6;
        long long8 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer9 = serializableKafkaSpoutConfig0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap12 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams10);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder15 = strBuilder0.setPollTimeoutMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy17 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder16.firstPollOffsetStrategy = firstPollOffsetStrategy17;
        strBuilder15.firstPollOffsetStrategy = firstPollOffsetStrategy17;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer20 = null;
        strBuilder15.keyDeserializer = strSerializableDeserializer20;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer22 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder23 = strBuilder15.setValueDeserializer(strComparableSerializableDeserializer22);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer24 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder25 = strBuilder23.setValueDeserializer(strComparableSerializableDeserializer24);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy17 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy17.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder25);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
        java.lang.Class<?> wildcardClass1 = strBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder7 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder10 = strBuilder0.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = strBuilder10.firstPollOffsetStrategy;
        long long12 = strBuilder10.pollTimeoutMs;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strSerializableDeserializer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy11 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy11.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder7 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder9.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        strBuilder9.kafkaSpoutStreams = kafkaSpoutStreams12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder9.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        strBuilder9.maxUncommittedOffsets = 10;
        strBuilder9.offsetCommitPeriodMs = 30000L;
        long long20 = strBuilder9.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer21 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder22 = strBuilder9.setValueDeserializer(strComparableSerializableDeserializer21);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder24 = strBuilder9.setPollTimeoutMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder25 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy26 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder25.firstPollOffsetStrategy = firstPollOffsetStrategy26;
        strBuilder24.firstPollOffsetStrategy = firstPollOffsetStrategy26;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder29 = strBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy26);
        long long30 = strBuilder0.offsetCommitPeriodMs;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strSerializableDeserializer6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy10 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy10.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy14 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy14.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 30000L + "'", long20 == 30000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy26 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy26.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 52L + "'", long30 == 52L);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer1 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer1;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer3 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer3;
        serializableKafkaSpoutConfig0.pollTimeoutMs = (short) 100;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService7;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder9 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder9;
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer10 = serializableKafkaSpoutConfig0.getValueDeserializer();
        long long11 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = serializableKafkaSpoutConfig0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams14 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams14);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        java.lang.String str7 = serializableKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder8 = serializableKafkaSpoutConfig0.tuplesBuilder;
        java.lang.String str9 = serializableKafkaSpoutConfig0.toString();
        long long10 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str7.equals("KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str9.equals("KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=1, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setPollTimeoutMs((long) (-1));
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer12 = null;
        strBuilder11.keyDeserializer = strSerializableDeserializer12;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams14 = null;
        strBuilder11.kafkaSpoutStreams = kafkaSpoutStreams14;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder11);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern8 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer9 = serializableKafkaSpoutConfig0.valueDeserializer;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer9);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeBuilder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.GenericDeclaration>(typeBuilder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        long long4 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder7 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        java.util.List<java.lang.String> strList8 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        long long10 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams7;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer9 = null;
        strBuilder0.valueDeserializer = strComparableSerializableDeserializer9;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer11 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = strBuilder0.setKeyDeserializer(strSerializableDeserializer11);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder13.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        strBuilder13.maxUncommittedOffsets = (-1);
        long long18 = strBuilder13.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder20 = strBuilder13.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder22 = strBuilder13.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer23 = null;
        strBuilder13.valueDeserializer = strComparableSerializableDeserializer23;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder26 = strBuilder13.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder27 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy28 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder27.firstPollOffsetStrategy = firstPollOffsetStrategy28;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder30 = strBuilder13.setFirstPollOffsetStrategy(firstPollOffsetStrategy28);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder31 = strBuilder12.setFirstPollOffsetStrategy(firstPollOffsetStrategy28);
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = strBuilder31.kafkaProps;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strSerializableDeserializer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy14 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy14.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy28 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy28.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap32);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder9.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        strBuilder9.kafkaSpoutStreams = kafkaSpoutStreams12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder9.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        strBuilder9.maxUncommittedOffsets = 10;
        strBuilder9.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy20 = strBuilder9.firstPollOffsetStrategy;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy20;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder23 = strBuilder0.setPollTimeoutMs((long) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer24 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder25 = strBuilder0.setKeyDeserializer(strSerializableDeserializer24);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService26 = strBuilder25.retryService;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strSerializableDeserializer6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy10 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy10.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy14 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy14.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy20 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy20.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService26);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder15 = strBuilder0.setPollTimeoutMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy17 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder16.firstPollOffsetStrategy = firstPollOffsetStrategy17;
        strBuilder15.firstPollOffsetStrategy = firstPollOffsetStrategy17;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer20 = null;
        strBuilder15.keyDeserializer = strSerializableDeserializer20;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer22 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder23 = strBuilder15.setValueDeserializer(strComparableSerializableDeserializer22);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService24 = null;
        strBuilder15.retryService = kafkaSpoutRetryService24;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy17 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy17.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder23);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer9 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer9;
        java.lang.String str11 = serializableKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = serializableKafkaSpoutConfig0.getRetryService();
        java.util.List<java.lang.String> strList13 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str11.equals("KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList13);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) -1;
        java.lang.String str12 = serializableKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer13 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer13;
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = 'a';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=-1, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str12.equals("KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=-1, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}"));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setOffsetCommitPeriodMs((long) (short) 10);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer9 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder10 = strBuilder8.setValueDeserializer(strComparableSerializableDeserializer9);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder11.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        strBuilder11.maxUncommittedOffsets = (-1);
        strBuilder11.offsetCommitPeriodMs = (-1L);
        long long18 = strBuilder11.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder19 = strBuilder11.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams20 = strBuilder11.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder22 = strBuilder11.setOffsetCommitPeriodMs((long) (byte) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy23 = strBuilder11.firstPollOffsetStrategy;
        strBuilder10.firstPollOffsetStrategy = firstPollOffsetStrategy23;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy12 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy12.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy23 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy23.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        long long7 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder3;
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams5;
        int int7 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap8;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer10 = serializableKafkaSpoutConfig0.getValueDeserializer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer10);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService1;
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (short) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        java.lang.String str6 = serializableKafkaSpoutConfig0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=100, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str6.equals("KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=100, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}"));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 10;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder6 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = serializableKafkaSpoutConfig0.kafkaProps;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = strBuilder0.setOffsetCommitPeriodMs((long) 10);
        long long13 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder15 = strBuilder0.setOffsetCommitPeriodMs((long) 35);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder12);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder8.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = null;
        strBuilder8.kafkaSpoutStreams = kafkaSpoutStreams11;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder8.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        strBuilder8.maxUncommittedOffsets = 10;
        strBuilder8.offsetCommitPeriodMs = 30000L;
        int int19 = strBuilder8.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams20 = null;
        strBuilder8.kafkaSpoutStreams = kafkaSpoutStreams20;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder22 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy23 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder22.firstPollOffsetStrategy = firstPollOffsetStrategy23;
        strBuilder8.firstPollOffsetStrategy = firstPollOffsetStrategy23;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy23;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy9 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy9.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy13 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy13.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy23 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy23.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap11;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer13 = serializableKafkaSpoutConfig0.valueDeserializer;
        long long14 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy15 = serializableKafkaSpoutConfig0.firstPollOffsetStrategy;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy15);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = serializableKafkaSpoutConfig0.getKafkaProps();
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        int int5 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap6;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder2 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder2;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = serializableKafkaSpoutConfig0.kafkaProps;
        long long5 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = serializableKafkaSpoutConfig0.retryService;
        java.lang.String str11 = serializableKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer12 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer13 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap15 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=EARLIEST, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str11.equals("KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=EARLIEST, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer13);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 10;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = serializableKafkaSpoutConfig0.retryService;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.kafkaProps;
        long long8 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        java.lang.String str9 = serializableKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=10, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str9.equals("KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=10, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}"));
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder8;
        strBuilder0.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = strBuilder0.kafkaSpoutStreams;
        long long14 = strBuilder0.offsetCommitPeriodMs;
        strBuilder0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer17 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer17;
        strBuilder0.maxUncommittedOffsets = 1;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer21 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder22 = strBuilder0.setKeyDeserializer(strSerializableDeserializer21);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer23 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder24 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer23);
        int int25 = strBuilder24.maxUncommittedOffsets;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer3 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        long long4 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = serializableKafkaSpoutConfig0.firstPollOffsetStrategy;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy6);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        long long5 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.lang.String str6 = serializableKafkaSpoutConfig0.toString();
        java.lang.String str7 = serializableKafkaSpoutConfig0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str6.equals("KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str7.equals("KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}"));
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = serializableKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = serializableKafkaSpoutConfig0.getRetryService();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = serializableKafkaSpoutConfig0.getKafkaProps();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap4);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = serializableKafkaSpoutConfig0.getKafkaProps();
        int int5 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) -1;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer8 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer8);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = serializableKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        long long12 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = 52;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        long long6 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer7 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer7);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder9.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        strBuilder9.kafkaSpoutStreams = kafkaSpoutStreams12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder9.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        strBuilder9.maxUncommittedOffsets = 10;
        strBuilder9.offsetCommitPeriodMs = 30000L;
        int int20 = strBuilder9.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder21 = null;
        strBuilder9.tuplesBuilder = strKafkaSpoutTuplesBuilder21;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer23 = null;
        strBuilder9.keyDeserializer = strSerializableDeserializer23;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder25 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy26 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder25.firstPollOffsetStrategy = firstPollOffsetStrategy26;
        strBuilder25.maxUncommittedOffsets = (-1);
        long long30 = strBuilder25.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer31 = strBuilder25.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams32 = null;
        strBuilder25.kafkaSpoutStreams = kafkaSpoutStreams32;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder34 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy35 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder34.firstPollOffsetStrategy = firstPollOffsetStrategy35;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams37 = null;
        strBuilder34.kafkaSpoutStreams = kafkaSpoutStreams37;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy39 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder34.firstPollOffsetStrategy = firstPollOffsetStrategy39;
        strBuilder34.maxUncommittedOffsets = 10;
        strBuilder34.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy45 = strBuilder34.firstPollOffsetStrategy;
        strBuilder25.firstPollOffsetStrategy = firstPollOffsetStrategy45;
        strBuilder9.firstPollOffsetStrategy = firstPollOffsetStrategy45;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy45;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy10 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy10.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy14 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy14.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy26 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy26.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 100L + "'", long30 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strSerializableDeserializer31);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy35 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy35.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy39 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy39.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy45 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy45.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        long long3 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = serializableKafkaSpoutConfig0.getRetryService();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService4);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder15 = strBuilder0.setPollTimeoutMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder17 = strBuilder15.setMaxUncommittedOffsets(52);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService18 = strBuilder15.retryService;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService18);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = serializableKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer12 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        long long13 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        int int14 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.List<java.lang.String> strList15 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList15);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        strBuilder0.pollTimeoutMs = 10L;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer8 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = strBuilder0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = strBuilder0.kafkaProps;
        long long12 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setMaxUncommittedOffsets(0);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder14.setPollTimeoutMs((long) ' ');
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder16);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder8;
        strBuilder0.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = strBuilder0.kafkaSpoutStreams;
        long long14 = strBuilder0.offsetCommitPeriodMs;
        strBuilder0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams17;
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        strBuilder0.kafkaProps = strMap19;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy21 = strBuilder0.firstPollOffsetStrategy;
        strBuilder0.pollTimeoutMs = (byte) 10;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer24 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder25 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer24);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder26 = strBuilder25.tuplesBuilder;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy21 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy21.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder26);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = serializableKafkaSpoutConfig0.retryService;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = serializableKafkaSpoutConfig0.getKafkaProps();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap5 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder11 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = serializableKafkaSpoutConfig0.getKafkaProps();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 10;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = serializableKafkaSpoutConfig0.retryService;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap7;
        int int9 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder15 = strBuilder0.setPollTimeoutMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder17 = strBuilder15.setMaxUncommittedOffsets(52);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer18 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder19 = strBuilder15.setValueDeserializer(strComparableSerializableDeserializer18);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder20 = strBuilder15.tuplesBuilder;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder20);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer9 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder10 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer9);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = null;
        strBuilder10.kafkaSpoutStreams = kafkaSpoutStreams11;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder10);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder7 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder9.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        strBuilder9.kafkaSpoutStreams = kafkaSpoutStreams12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder9.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        strBuilder9.maxUncommittedOffsets = 10;
        strBuilder9.offsetCommitPeriodMs = 30000L;
        long long20 = strBuilder9.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer21 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder22 = strBuilder9.setValueDeserializer(strComparableSerializableDeserializer21);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder24 = strBuilder9.setPollTimeoutMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder25 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy26 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder25.firstPollOffsetStrategy = firstPollOffsetStrategy26;
        strBuilder24.firstPollOffsetStrategy = firstPollOffsetStrategy26;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder29 = strBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy26);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy30 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder31 = strBuilder29.setFirstPollOffsetStrategy(firstPollOffsetStrategy30);
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = strBuilder31.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder34 = strBuilder31.setOffsetCommitPeriodMs(0L);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strSerializableDeserializer6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy10 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy10.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy14 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy14.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 30000L + "'", long20 == 30000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy26 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy26.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy30 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy30.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder34);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = serializableKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams13;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder16 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams17);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        strBuilder0.retryService = kafkaSpoutRetryService11;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setOffsetCommitPeriodMs((long) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder14.setOffsetCommitPeriodMs((long) 100);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer17 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder18 = strBuilder14.setKeyDeserializer(strSerializableDeserializer17);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder19 = null;
        strBuilder18.tuplesBuilder = strKafkaSpoutTuplesBuilder19;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder22 = strBuilder18.setMaxUncommittedOffsets((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig23 = strBuilder18.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService11;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams13;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap15;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer17 = serializableKafkaSpoutConfig0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams18 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer19 = serializableKafkaSpoutConfig0.getValueDeserializer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer19);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration> firstPollOffsetStrategyEnumKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        strBuilder0.maxUncommittedOffsets = (short) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams13;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer15 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setKeyDeserializer(strSerializableDeserializer15);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams17;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder20 = strBuilder0.setMaxUncommittedOffsets((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig21 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder5 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strBuilder0.kafkaSpoutStreams;
        strBuilder0.offsetCommitPeriodMs = (byte) 1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder10 = strBuilder0.setPollTimeoutMs((-1L));
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = strBuilder10.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder12.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = null;
        strBuilder12.kafkaSpoutStreams = kafkaSpoutStreams15;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy17 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder12.firstPollOffsetStrategy = firstPollOffsetStrategy17;
        strBuilder12.maxUncommittedOffsets = 10;
        strBuilder12.offsetCommitPeriodMs = 30000L;
        int int23 = strBuilder12.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy24 = strBuilder12.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder25 = strBuilder10.setFirstPollOffsetStrategy(firstPollOffsetStrategy24);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer26 = null;
        strBuilder10.valueDeserializer = strComparableSerializableDeserializer26;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy11 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy11.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy13 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy13.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy17 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy17.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy24 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy24.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder25);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder6 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer5);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer7 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder10 = strBuilder0.setPollTimeoutMs((-1L));
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = strBuilder10.kafkaSpoutStreams;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer9 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer9;
        java.lang.String str11 = serializableKafkaSpoutConfig0.toString();
        int int12 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder13 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams14 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str11.equals("KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams14);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>> firstPollOffsetStrategyEnumKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>, org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>>();
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        int int11 = strBuilder0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy15 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder14.firstPollOffsetStrategy = firstPollOffsetStrategy15;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy15;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer18 = null;
        strBuilder0.valueDeserializer = strComparableSerializableDeserializer18;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder20 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder20;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder22 = strBuilder0.tuplesBuilder;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy15 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy15.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder22);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> serializableKafkaSpoutConfigKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> serializableKafkaSpoutConfigBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, serializableKafkaSpoutConfigKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = strBuilder0.retryService;
        strBuilder0.offsetCommitPeriodMs = 'a';
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder17 = strBuilder0.setPollTimeoutMs((long) (-1));
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams18 = strBuilder17.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer19 = strBuilder17.keyDeserializer;
        strBuilder17.pollTimeoutMs = (byte) 100;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer22 = null;
        strBuilder17.valueDeserializer = strComparableSerializableDeserializer22;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strSerializableDeserializer19);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence> objKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.lang.CharSequence>();
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = strBuilder0.retryService;
        strBuilder0.offsetCommitPeriodMs = 'a';
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setPollTimeoutMs((long) (byte) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        strBuilder0.kafkaProps = strMap17;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        int int21 = strBuilder0.maxUncommittedOffsets;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder5 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strBuilder0.kafkaSpoutStreams;
        strBuilder0.offsetCommitPeriodMs = (byte) 1;
        strBuilder0.offsetCommitPeriodMs = 0;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setMaxUncommittedOffsets(0);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder11.setPollTimeoutMs((long) 1);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strSerializableDeserializer9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 10;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder6 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        java.util.List<java.lang.String> strList8 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList8);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.lang.String str2 = serializableKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer3 = serializableKafkaSpoutConfig0.keyDeserializer;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str2.equals("KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer3);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = serializableKafkaSpoutConfig0.retryService;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        strBuilder0.kafkaProps = strMap8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setPollTimeoutMs((long) (short) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = strBuilder11.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig13 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long14 = serializableKafkaSpoutConfig13.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = null;
        serializableKafkaSpoutConfig13.kafkaSpoutStreams = kafkaSpoutStreams15;
        java.util.regex.Pattern pattern17 = serializableKafkaSpoutConfig13.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService18 = null;
        serializableKafkaSpoutConfig13.retryService = kafkaSpoutRetryService18;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams20 = serializableKafkaSpoutConfig13.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy21 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        serializableKafkaSpoutConfig13.firstPollOffsetStrategy = firstPollOffsetStrategy21;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder23 = strBuilder11.setFirstPollOffsetStrategy(firstPollOffsetStrategy21);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder24 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy25 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder24.firstPollOffsetStrategy = firstPollOffsetStrategy25;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams27 = null;
        strBuilder24.kafkaSpoutStreams = kafkaSpoutStreams27;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy29 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder24.firstPollOffsetStrategy = firstPollOffsetStrategy29;
        strBuilder24.maxUncommittedOffsets = 10;
        strBuilder24.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService35 = null;
        strBuilder24.retryService = kafkaSpoutRetryService35;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder38 = strBuilder24.setOffsetCommitPeriodMs((long) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder40 = strBuilder38.setOffsetCommitPeriodMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder41 = strBuilder40.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy42 = strBuilder40.firstPollOffsetStrategy;
        strBuilder11.firstPollOffsetStrategy = firstPollOffsetStrategy42;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams44 = null;
        strBuilder11.kafkaSpoutStreams = kafkaSpoutStreams44;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams46 = null;
        strBuilder11.kafkaSpoutStreams = kafkaSpoutStreams46;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams20);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy21 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy21.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy25 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy25.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy29 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy29.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder41);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy42 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy42.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        strBuilder0.maxUncommittedOffsets = (short) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams13;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setOffsetCommitPeriodMs((long) (short) 100);
        long long17 = strBuilder16.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer18 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder19 = strBuilder16.setValueDeserializer(strComparableSerializableDeserializer18);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer20 = null;
        strBuilder19.valueDeserializer = strComparableSerializableDeserializer20;
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = null;
        strBuilder19.kafkaProps = strMap22;
        int int24 = strBuilder19.maxUncommittedOffsets;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setOffsetCommitPeriodMs((long) (short) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        strBuilder8.kafkaProps = strMap9;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        strBuilder0.retryService = kafkaSpoutRetryService11;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setOffsetCommitPeriodMs((long) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder14.setOffsetCommitPeriodMs((long) 100);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer17 = strBuilder16.keyDeserializer;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strSerializableDeserializer17);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.getValueDeserializer();
        long long5 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder6 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder6 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer5);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer7 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder10 = strBuilder0.setPollTimeoutMs((-1L));
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        strBuilder10.kafkaProps = strMap11;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder10);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder8;
        strBuilder0.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = strBuilder0.kafkaSpoutStreams;
        long long14 = strBuilder0.offsetCommitPeriodMs;
        strBuilder0.maxUncommittedOffsets = 0;
        long long17 = strBuilder0.offsetCommitPeriodMs;
        long long18 = strBuilder0.offsetCommitPeriodMs;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder12 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder12);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>> annotatedElementKafkaSpoutTuplesBuilder2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>> annotatedElementBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>>(strMap0, kafkaSpoutStreams1, annotatedElementKafkaSpoutTuplesBuilder2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap11;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService13 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService13;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder15 = serializableKafkaSpoutConfig0.tuplesBuilder;
        int int16 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer10 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer10;
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService13 = serializableKafkaSpoutConfig0.retryService;
        java.util.regex.Pattern pattern14 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern14);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = strBuilder0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder12.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        strBuilder12.maxUncommittedOffsets = (-1);
        long long17 = strBuilder12.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder19 = strBuilder12.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder21 = strBuilder12.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer22 = null;
        strBuilder12.valueDeserializer = strComparableSerializableDeserializer22;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder25 = strBuilder12.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder26 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy27 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder26.firstPollOffsetStrategy = firstPollOffsetStrategy27;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder29 = strBuilder12.setFirstPollOffsetStrategy(firstPollOffsetStrategy27);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder30 = strBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy27);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer31 = strBuilder0.keyDeserializer;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy11 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy11.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy13 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy13.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy27 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy27.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strSerializableDeserializer31);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer5 = strBuilder0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strBuilder0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig7 = strBuilder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparableSerializableDeserializer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer11 = serializableKafkaSpoutConfig0.keyDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer12 = serializableKafkaSpoutConfig0.keyDeserializer;
        java.lang.Class<?> wildcardClass13 = serializableKafkaSpoutConfig0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        strBuilder0.retryService = kafkaSpoutRetryService11;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setOffsetCommitPeriodMs((long) 10);
        strBuilder0.offsetCommitPeriodMs = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService17 = strBuilder0.retryService;
        strBuilder0.offsetCommitPeriodMs = 10;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService17);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder0.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setOffsetCommitPeriodMs(200L);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder11);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        strBuilder0.pollTimeoutMs = 10L;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer8 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = strBuilder0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = strBuilder0.kafkaProps;
        long long12 = strBuilder0.pollTimeoutMs;
        int int13 = strBuilder0.maxUncommittedOffsets;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> serializableKafkaSpoutConfigKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer7 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer7);
        long long9 = strBuilder8.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = strBuilder8.retryService;
        long long11 = strBuilder8.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer12 = strBuilder8.keyDeserializer;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strSerializableDeserializer12);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setOffsetCommitPeriodMs((long) (short) -1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer9 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder10 = strBuilder0.setKeyDeserializer(strSerializableDeserializer9);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        strBuilder10.retryService = kafkaSpoutRetryService11;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder13.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        strBuilder13.maxUncommittedOffsets = (-1);
        strBuilder13.offsetCommitPeriodMs = (-1L);
        long long20 = strBuilder13.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder21 = null;
        strBuilder13.tuplesBuilder = strKafkaSpoutTuplesBuilder21;
        strBuilder13.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams25 = strBuilder13.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams26 = strBuilder13.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder27 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy28 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder27.firstPollOffsetStrategy = firstPollOffsetStrategy28;
        strBuilder27.maxUncommittedOffsets = (-1);
        long long32 = strBuilder27.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder34 = strBuilder27.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder36 = strBuilder27.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer37 = null;
        strBuilder27.valueDeserializer = strComparableSerializableDeserializer37;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder40 = strBuilder27.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder41 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy42 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder41.firstPollOffsetStrategy = firstPollOffsetStrategy42;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder44 = strBuilder27.setFirstPollOffsetStrategy(firstPollOffsetStrategy42);
        strBuilder13.firstPollOffsetStrategy = firstPollOffsetStrategy42;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder46 = strBuilder10.setFirstPollOffsetStrategy(firstPollOffsetStrategy42);
        strBuilder10.maxUncommittedOffsets = (short) 100;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strSerializableDeserializer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy14 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy14.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams26);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy28 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy28.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 100L + "'", long32 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy42 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy42.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder46);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        long long4 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap6;
        long long8 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer9 = serializableKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = serializableKafkaSpoutConfig0.kafkaProps;
        int int11 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        int int12 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        long long3 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService4;
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        long long7 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = serializableKafkaSpoutConfig0.getRetryService();
        int int9 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer10 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = (-1L);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap11;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer15 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy17 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder16.firstPollOffsetStrategy = firstPollOffsetStrategy17;
        strBuilder16.maxUncommittedOffsets = (-1);
        long long21 = strBuilder16.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer22 = strBuilder16.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder23 = null;
        strBuilder16.tuplesBuilder = strKafkaSpoutTuplesBuilder23;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder25 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy26 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder25.firstPollOffsetStrategy = firstPollOffsetStrategy26;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams28 = null;
        strBuilder25.kafkaSpoutStreams = kafkaSpoutStreams28;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy30 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder25.firstPollOffsetStrategy = firstPollOffsetStrategy30;
        strBuilder25.maxUncommittedOffsets = 10;
        strBuilder25.offsetCommitPeriodMs = 30000L;
        long long36 = strBuilder25.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer37 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder38 = strBuilder25.setValueDeserializer(strComparableSerializableDeserializer37);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder40 = strBuilder25.setPollTimeoutMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder41 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy42 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder41.firstPollOffsetStrategy = firstPollOffsetStrategy42;
        strBuilder40.firstPollOffsetStrategy = firstPollOffsetStrategy42;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder45 = strBuilder16.setFirstPollOffsetStrategy(firstPollOffsetStrategy42);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy46 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder47 = strBuilder45.setFirstPollOffsetStrategy(firstPollOffsetStrategy46);
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy46;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer15);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy17 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy17.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strSerializableDeserializer22);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy26 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy26.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy30 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy30.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 30000L + "'", long36 == 30000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy42 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy42.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy46 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy46.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder47);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        long long4 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = serializableKafkaSpoutConfig0.valueDeserializer;
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.firstPollOffsetStrategy;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder5 = strBuilder0.tuplesBuilder;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        strBuilder0.kafkaProps = strMap6;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder0.setPollTimeoutMs((long) (short) 100);
        strBuilder0.offsetCommitPeriodMs = 200L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setOffsetCommitPeriodMs(10L);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        int int11 = strBuilder0.maxUncommittedOffsets;
        long long12 = strBuilder0.pollTimeoutMs;
        strBuilder0.pollTimeoutMs = 10;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder15 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder15;
        java.lang.Class<?> wildcardClass17 = strBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder6 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer5);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer7 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer7;
        strBuilder0.maxUncommittedOffsets = 'a';
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder14 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer15 = serializableKafkaSpoutConfig0.valueDeserializer;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer15);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer3 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder4 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap5;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder7 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder7;
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder4);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer12);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = strBuilder13.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = strBuilder13.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams16 = null;
        strBuilder13.kafkaSpoutStreams = kafkaSpoutStreams16;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer9 = strBuilder0.valueDeserializer;
        java.lang.Class<?> wildcardClass10 = strBuilder0.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparableSerializableDeserializer9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.Type> wildcardClassKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.Type>();
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder0.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer10 = null;
        strBuilder0.valueDeserializer = strComparableSerializableDeserializer10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy15 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder14.firstPollOffsetStrategy = firstPollOffsetStrategy15;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder17 = strBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy15);
        strBuilder17.pollTimeoutMs = 1L;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy15 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy15.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder17);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer9 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer9;
        java.lang.String str11 = serializableKafkaSpoutConfig0.toString();
        int int12 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        java.lang.String str13 = serializableKafkaSpoutConfig0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str11.equals("KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str13.equals("KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}"));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer3 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer3;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams5;
        java.util.List<java.lang.String> strList7 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList7);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = strBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setMaxUncommittedOffsets((int) (short) 1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = null;
        strBuilder0.valueDeserializer = strComparableSerializableDeserializer12;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder14 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder14;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder11);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strBuilder0.kafkaProps;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer4 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder5 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer4);
        long long6 = strBuilder0.offsetCommitPeriodMs;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder8;
        strBuilder0.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strBuilder0.kafkaSpoutStreams;
        strBuilder0.maxUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setPollTimeoutMs((long) '4');
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy17 = strBuilder0.firstPollOffsetStrategy;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy17 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy17.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        strBuilder0.maxUncommittedOffsets = (short) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams13;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setOffsetCommitPeriodMs((long) (short) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder18 = strBuilder0.setPollTimeoutMs((long) (short) -1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer19 = strBuilder18.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy20 = strBuilder18.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy21 = strBuilder18.firstPollOffsetStrategy;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strSerializableDeserializer19);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy20 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy20.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy21 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy21.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.getValueDeserializer();
        long long5 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = ' ';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = serializableKafkaSpoutConfig0.getRetryService();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setPollTimeoutMs((long) (-1));
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = null;
        strBuilder11.valueDeserializer = strComparableSerializableDeserializer12;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = strBuilder11.retryService;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer15 = strBuilder11.keyDeserializer;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strSerializableDeserializer15);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long3 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = serializableKafkaSpoutConfig0.firstPollOffsetStrategy;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap6;
        java.util.regex.Pattern pattern8 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern8);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder6 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder7.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = null;
        strBuilder7.kafkaSpoutStreams = kafkaSpoutStreams10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder12.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = null;
        strBuilder12.kafkaSpoutStreams = kafkaSpoutStreams15;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy17 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder12.firstPollOffsetStrategy = firstPollOffsetStrategy17;
        strBuilder12.maxUncommittedOffsets = 10;
        strBuilder12.offsetCommitPeriodMs = 30000L;
        strBuilder12.maxUncommittedOffsets = (short) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams25 = null;
        strBuilder12.kafkaSpoutStreams = kafkaSpoutStreams25;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer27 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder28 = strBuilder12.setKeyDeserializer(strSerializableDeserializer27);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams29 = null;
        strBuilder12.kafkaSpoutStreams = kafkaSpoutStreams29;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder31 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy32 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder31.firstPollOffsetStrategy = firstPollOffsetStrategy32;
        strBuilder31.maxUncommittedOffsets = (-1);
        long long36 = strBuilder31.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer37 = strBuilder31.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams38 = null;
        strBuilder31.kafkaSpoutStreams = kafkaSpoutStreams38;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder40 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy41 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder40.firstPollOffsetStrategy = firstPollOffsetStrategy41;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams43 = null;
        strBuilder40.kafkaSpoutStreams = kafkaSpoutStreams43;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy45 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder40.firstPollOffsetStrategy = firstPollOffsetStrategy45;
        strBuilder40.maxUncommittedOffsets = 10;
        strBuilder40.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy51 = strBuilder40.firstPollOffsetStrategy;
        strBuilder31.firstPollOffsetStrategy = firstPollOffsetStrategy51;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder53 = strBuilder12.setFirstPollOffsetStrategy(firstPollOffsetStrategy51);
        strBuilder7.firstPollOffsetStrategy = firstPollOffsetStrategy51;
        strBuilder6.firstPollOffsetStrategy = firstPollOffsetStrategy51;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder56 = strBuilder6.tuplesBuilder;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy13 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy13.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy17 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy17.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy32 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy32.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strSerializableDeserializer37);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy41 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy41.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy45 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy45.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy51 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy51.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder56);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder8;
        strBuilder0.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer13 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setKeyDeserializer(strSerializableDeserializer13);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        strBuilder0.kafkaProps = strMap15;
        long long17 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer18 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer18;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder8;
        strBuilder0.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = strBuilder0.kafkaSpoutStreams;
        long long14 = strBuilder0.offsetCommitPeriodMs;
        strBuilder0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams17;
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        strBuilder0.kafkaProps = strMap19;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy21 = strBuilder0.firstPollOffsetStrategy;
        strBuilder0.pollTimeoutMs = (byte) 10;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer24 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder25 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer24);
        strBuilder25.offsetCommitPeriodMs = 'a';
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy21 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy21.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder25);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = strBuilder0.kafkaProps;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer4 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder5 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer4);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setOffsetCommitPeriodMs(10L);
        long long9 = strBuilder0.pollTimeoutMs;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        strBuilder0.kafkaProps = strMap8;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer10 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setKeyDeserializer(strSerializableDeserializer10);
        strBuilder11.offsetCommitPeriodMs = 52;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams14 = strBuilder11.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer15 = strBuilder11.valueDeserializer;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer16 = null;
        strBuilder11.keyDeserializer = strSerializableDeserializer16;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparableSerializableDeserializer15);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer12);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder14 = null;
        strBuilder13.tuplesBuilder = strKafkaSpoutTuplesBuilder14;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer16 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder17 = strBuilder13.setValueDeserializer(strComparableSerializableDeserializer16);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams18 = null;
        strBuilder17.kafkaSpoutStreams = kafkaSpoutStreams18;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder17);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer3 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer3;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap5;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer7 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer7;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = serializableKafkaSpoutConfig0.kafkaProps;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder6 = serializableKafkaSpoutConfig0.tuplesBuilder;
        long long7 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        strBuilder0.pollTimeoutMs = 10L;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer8 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = strBuilder0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = strBuilder0.kafkaProps;
        long long12 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setMaxUncommittedOffsets(0);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService15 = strBuilder14.retryService;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService15);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder3 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder3.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = null;
        strBuilder3.kafkaSpoutStreams = kafkaSpoutStreams6;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder3.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        strBuilder3.maxUncommittedOffsets = 10;
        strBuilder3.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = strBuilder3.firstPollOffsetStrategy;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        int int16 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap17;
        java.util.List<java.lang.String> strList19 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer2);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy4 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy4.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy14 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy14.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList19);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 100L;
        long long7 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        java.util.regex.Pattern pattern8 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder6 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder7.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = null;
        strBuilder7.kafkaSpoutStreams = kafkaSpoutStreams10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder7.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        strBuilder7.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy14);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService17 = strBuilder0.retryService;
        strBuilder0.maxUncommittedOffsets = (short) -1;
        int int20 = strBuilder0.maxUncommittedOffsets;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy12 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy12.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy14 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy14.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = strBuilder0.setOffsetCommitPeriodMs((long) 10);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer13 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer13;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = null;
        strBuilder16.kafkaSpoutStreams = kafkaSpoutStreams17;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService19 = null;
        strBuilder16.retryService = kafkaSpoutRetryService19;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder16);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer11 = serializableKafkaSpoutConfig0.keyDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer12 = serializableKafkaSpoutConfig0.keyDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer13 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer13;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 97L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy17 = serializableKafkaSpoutConfig0.firstPollOffsetStrategy;
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService19 = serializableKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy20 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        int int21 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer22 = serializableKafkaSpoutConfig0.keyDeserializer;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer22);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder1 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder1;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer3 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer3;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 1L;
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder1 = serializableKafkaSpoutConfig0.tuplesBuilder;
        long long2 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = serializableKafkaSpoutConfig0.kafkaProps;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.GenericDeclaration> objBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.Object, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        long long5 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.util.List<java.lang.String> strList6 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams7;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder9 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder9;
        serializableKafkaSpoutConfig0.pollTimeoutMs = (short) -1;
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap14 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams7;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = serializableKafkaSpoutConfig0.retryService;
        long long10 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer12);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = strBuilder13.kafkaProps;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer15 = null;
        strBuilder13.valueDeserializer = strComparableSerializableDeserializer15;
        strBuilder13.maxUncommittedOffsets = (short) 1;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap14);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        strBuilder0.retryService = kafkaSpoutRetryService11;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setOffsetCommitPeriodMs((long) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder14.setOffsetCommitPeriodMs((long) 100);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder17 = strBuilder16.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder19 = strBuilder16.setMaxUncommittedOffsets((int) (byte) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder20 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy21 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder20.firstPollOffsetStrategy = firstPollOffsetStrategy21;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams23 = null;
        strBuilder20.kafkaSpoutStreams = kafkaSpoutStreams23;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy25 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder20.firstPollOffsetStrategy = firstPollOffsetStrategy25;
        strBuilder20.maxUncommittedOffsets = 10;
        strBuilder20.offsetCommitPeriodMs = 30000L;
        strBuilder20.maxUncommittedOffsets = (short) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams33 = null;
        strBuilder20.kafkaSpoutStreams = kafkaSpoutStreams33;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder36 = strBuilder20.setOffsetCommitPeriodMs((long) (short) 100);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder38 = strBuilder20.setPollTimeoutMs((long) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService39 = null;
        strBuilder20.retryService = kafkaSpoutRetryService39;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy41 = strBuilder20.firstPollOffsetStrategy;
        strBuilder16.firstPollOffsetStrategy = firstPollOffsetStrategy41;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy21 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy21.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy25 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy25.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy41 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy41.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer10 = serializableKafkaSpoutConfig0.keyDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = serializableKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = serializableKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams13);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer5 = strBuilder0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = strBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder7.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = null;
        strBuilder7.kafkaSpoutStreams = kafkaSpoutStreams10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder7.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        strBuilder7.maxUncommittedOffsets = 10;
        strBuilder7.offsetCommitPeriodMs = 30000L;
        int int18 = strBuilder7.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams19 = null;
        strBuilder7.kafkaSpoutStreams = kafkaSpoutStreams19;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder21 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy22 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder21.firstPollOffsetStrategy = firstPollOffsetStrategy22;
        strBuilder7.firstPollOffsetStrategy = firstPollOffsetStrategy22;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy22;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder27 = strBuilder0.setOffsetCommitPeriodMs(0L);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer28 = strBuilder27.keyDeserializer;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparableSerializableDeserializer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy12 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy12.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy22 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy22.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strSerializableDeserializer28);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.getValueDeserializer();
        long long5 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer6 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        java.lang.Class<?> wildcardClass7 = serializableKafkaSpoutConfig0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams10;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap13;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams15);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig11 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long12 = serializableKafkaSpoutConfig11.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        serializableKafkaSpoutConfig11.kafkaSpoutStreams = kafkaSpoutStreams13;
        java.util.regex.Pattern pattern15 = serializableKafkaSpoutConfig11.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService16 = null;
        serializableKafkaSpoutConfig11.retryService = kafkaSpoutRetryService16;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams18 = serializableKafkaSpoutConfig11.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy19 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        serializableKafkaSpoutConfig11.firstPollOffsetStrategy = firstPollOffsetStrategy19;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer21 = null;
        serializableKafkaSpoutConfig11.valueDeserializer = objDeserializer21;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy23 = serializableKafkaSpoutConfig11.firstPollOffsetStrategy;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy23;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams18);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy19 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy19.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy23 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy23.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.getValueDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = serializableKafkaSpoutConfig0.kafkaProps;
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = serializableKafkaSpoutConfig0.getKafkaProps();
        long long7 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.lang.String str1 = serializableKafkaSpoutConfig0.toString();
        java.util.regex.Pattern pattern2 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str1.equals("KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern2);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        java.util.regex.Pattern pattern9 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        long long10 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer4 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = serializableKafkaSpoutConfig0.kafkaProps;
        long long6 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer7 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer7;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = serializableKafkaSpoutConfig0.getKafkaProps();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap9);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> annotatedElementKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>();
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer12);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder15 = strBuilder0.setPollTimeoutMs((long) 100);
        strBuilder0.pollTimeoutMs = 100;
        strBuilder0.offsetCommitPeriodMs = 0;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap8;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer10 = serializableKafkaSpoutConfig0.keyDeserializer;
        java.lang.String str11 = serializableKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = serializableKafkaSpoutConfig0.getKafkaProps();
        int int13 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str11.equals("KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder8;
        strBuilder0.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = strBuilder0.kafkaSpoutStreams;
        long long14 = strBuilder0.offsetCommitPeriodMs;
        strBuilder0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer17 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer17;
        strBuilder0.maxUncommittedOffsets = 1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy21 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder22 = strBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy21);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer23 = strBuilder0.valueDeserializer;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strComparableSerializableDeserializer23);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        java.util.regex.Pattern pattern14 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder17 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder17;
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = serializableKafkaSpoutConfig0.kafkaProps;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap19);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = null;
        strBuilder0.tuplesBuilder = strKafkaSpoutTuplesBuilder8;
        strBuilder0.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = strBuilder0.kafkaSpoutStreams;
        long long14 = strBuilder0.offsetCommitPeriodMs;
        strBuilder0.maxUncommittedOffsets = 0;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer17 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer17;
        strBuilder0.maxUncommittedOffsets = 1;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer21 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder22 = strBuilder0.setKeyDeserializer(strSerializableDeserializer21);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer23 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder24 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer23);
        strBuilder0.pollTimeoutMs = 0L;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder24);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 10;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = serializableKafkaSpoutConfig0.retryService;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder8 = serializableKafkaSpoutConfig0.tuplesBuilder;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = serializableKafkaSpoutConfig0.getKafkaProps();
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 52;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = serializableKafkaSpoutConfig0.retryService;
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = 35;
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (byte) -1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer9 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer9;
        java.lang.String str11 = serializableKafkaSpoutConfig0.toString();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str11.equals("KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}"));
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = strBuilder0.retryService;
        strBuilder0.offsetCommitPeriodMs = 'a';
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder17 = strBuilder0.setPollTimeoutMs((long) (-1));
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer18 = strBuilder0.keyDeserializer;
        strBuilder0.pollTimeoutMs = (byte) 1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder21 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy22 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder21.firstPollOffsetStrategy = firstPollOffsetStrategy22;
        strBuilder21.maxUncommittedOffsets = (-1);
        long long26 = strBuilder21.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder28 = strBuilder21.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder30 = strBuilder21.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer31 = null;
        strBuilder21.valueDeserializer = strComparableSerializableDeserializer31;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder34 = strBuilder21.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder35 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy36 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder35.firstPollOffsetStrategy = firstPollOffsetStrategy36;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder38 = strBuilder21.setFirstPollOffsetStrategy(firstPollOffsetStrategy36);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder40 = strBuilder38.setMaxUncommittedOffsets(0);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig41 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long42 = serializableKafkaSpoutConfig41.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams43 = null;
        serializableKafkaSpoutConfig41.kafkaSpoutStreams = kafkaSpoutStreams43;
        java.util.regex.Pattern pattern45 = serializableKafkaSpoutConfig41.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams46 = serializableKafkaSpoutConfig41.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern47 = serializableKafkaSpoutConfig41.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams48 = serializableKafkaSpoutConfig41.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap49 = null;
        serializableKafkaSpoutConfig41.kafkaProps = strMap49;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer51 = serializableKafkaSpoutConfig41.keyDeserializer;
        java.lang.String str52 = serializableKafkaSpoutConfig41.toString();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer53 = null;
        serializableKafkaSpoutConfig41.keyDeserializer = serializableDeserializer53;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig55 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long56 = serializableKafkaSpoutConfig55.getPollTimeoutMs();
        long long57 = serializableKafkaSpoutConfig55.offsetCommitPeriodMs;
        long long58 = serializableKafkaSpoutConfig55.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder59 = serializableKafkaSpoutConfig55.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams60 = serializableKafkaSpoutConfig55.getKafkaSpoutStreams();
        int int61 = serializableKafkaSpoutConfig55.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder62 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy63 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder62.firstPollOffsetStrategy = firstPollOffsetStrategy63;
        strBuilder62.maxUncommittedOffsets = (-1);
        long long67 = strBuilder62.pollTimeoutMs;
        strBuilder62.pollTimeoutMs = 10L;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer70 = null;
        strBuilder62.keyDeserializer = strSerializableDeserializer70;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams72 = strBuilder62.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder73 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy74 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder73.firstPollOffsetStrategy = firstPollOffsetStrategy74;
        strBuilder73.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer78 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder79 = strBuilder73.setValueDeserializer(strComparableSerializableDeserializer78);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder80 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy81 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder80.firstPollOffsetStrategy = firstPollOffsetStrategy81;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams83 = null;
        strBuilder80.kafkaSpoutStreams = kafkaSpoutStreams83;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy85 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder80.firstPollOffsetStrategy = firstPollOffsetStrategy85;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy87 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        strBuilder80.firstPollOffsetStrategy = firstPollOffsetStrategy87;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder89 = strBuilder73.setFirstPollOffsetStrategy(firstPollOffsetStrategy87);
        java.util.Map<java.lang.String, java.lang.Object> strMap90 = strBuilder73.kafkaProps;
        int int91 = strBuilder73.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy92 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder93 = strBuilder73.setFirstPollOffsetStrategy(firstPollOffsetStrategy92);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder94 = strBuilder62.setFirstPollOffsetStrategy(firstPollOffsetStrategy92);
        serializableKafkaSpoutConfig55.firstPollOffsetStrategy = firstPollOffsetStrategy92;
        serializableKafkaSpoutConfig41.firstPollOffsetStrategy = firstPollOffsetStrategy92;
        strBuilder40.firstPollOffsetStrategy = firstPollOffsetStrategy92;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder98 = strBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy92);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strSerializableDeserializer18);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy22 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy22.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy36 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy36.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str52.equals("KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + 0L + "'", long58 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy63 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy63.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + (-1L) + "'", long67 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams72);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy74 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy74.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy81 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy81.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy85 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy85.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy87 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy87.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy92 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy92.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder98);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.util.Map<java.lang.String, java.lang.Object> strMap0 = null;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilderKafkaSpoutTuplesBuilder2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy> strBuilderBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>, org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>(strMap0, kafkaSpoutStreams1, strBuilderKafkaSpoutTuplesBuilder2, kafkaSpoutRetryService3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Properties defining consumer connection to Kafka broker are required: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder4 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder4.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder4.maxUncommittedOffsets = (-1);
        strBuilder4.offsetCommitPeriodMs = (-1L);
        long long11 = strBuilder4.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder12 = strBuilder4.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = strBuilder4.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder15 = strBuilder4.setOffsetCommitPeriodMs((long) (byte) 1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy16 = strBuilder4.firstPollOffsetStrategy;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap3);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strKafkaSpoutTuplesBuilder12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy16 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy16.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = strBuilder0.setOffsetCommitPeriodMs((long) 10);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer13 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer13;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = null;
        strBuilder16.kafkaSpoutStreams = kafkaSpoutStreams17;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder20 = strBuilder16.setPollTimeoutMs(30000L);
        strBuilder20.maxUncommittedOffsets = (short) -1;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer23 = null;
        strBuilder20.valueDeserializer = strComparableSerializableDeserializer23;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer11 = serializableKafkaSpoutConfig0.keyDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer12 = serializableKafkaSpoutConfig0.keyDeserializer;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer13 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer13;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 97L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy17 = serializableKafkaSpoutConfig0.firstPollOffsetStrategy;
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService19 = serializableKafkaSpoutConfig0.getRetryService();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService19);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Object> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Object>();
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder10 = serializableKafkaSpoutConfig0.tuplesBuilder;
        java.util.regex.Pattern pattern11 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.regex.Pattern pattern12 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern12);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder5 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder5.firstPollOffsetStrategy = firstPollOffsetStrategy6;
        strBuilder5.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer10 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder5.setValueDeserializer(strComparableSerializableDeserializer10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder12.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = null;
        strBuilder12.kafkaSpoutStreams = kafkaSpoutStreams15;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy17 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder12.firstPollOffsetStrategy = firstPollOffsetStrategy17;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy19 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        strBuilder12.firstPollOffsetStrategy = firstPollOffsetStrategy19;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder21 = strBuilder5.setFirstPollOffsetStrategy(firstPollOffsetStrategy19);
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy19;
        java.lang.Class<?> wildcardClass23 = serializableKafkaSpoutConfig0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy6 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy6.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy13 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy13.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy17 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy17.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy19 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy19.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        long long3 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap11;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 100L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService15 = serializableKafkaSpoutConfig0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService15);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder0.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer10 = null;
        strBuilder0.valueDeserializer = strComparableSerializableDeserializer10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy15 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder14.firstPollOffsetStrategy = firstPollOffsetStrategy15;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder17 = strBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy15);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder19 = strBuilder17.setMaxUncommittedOffsets(0);
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = strBuilder17.kafkaProps;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy15 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy15.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap20);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = strBuilder0.retryService;
        strBuilder0.offsetCommitPeriodMs = 'a';
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder17 = strBuilder0.setPollTimeoutMs((long) (-1));
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer18 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder19 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer18);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy20 = strBuilder19.firstPollOffsetStrategy;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 30000L + "'", long11 == 30000L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy20 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy20.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        long long5 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = serializableKafkaSpoutConfig0.valueDeserializer;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer6);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer4;
        java.util.List<java.lang.String> strList6 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serializableKafkaSpoutConfig0.getConsumerGroupId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList6);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer11 = serializableKafkaSpoutConfig0.valueDeserializer;
        int int12 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        long long13 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService14;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 200L;
        long long18 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (short) 1;
        long long21 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 200L + "'", long18 == 200L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap11;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer13 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams14 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        long long15 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        java.util.regex.Pattern pattern16 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap18 = serializableKafkaSpoutConfig0.setDefaultsAndGetKafkaProps(strMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern16);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder9 = strBuilder0.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer10 = null;
        strBuilder0.valueDeserializer = strComparableSerializableDeserializer10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = strBuilder0.setMaxUncommittedOffsets((int) (short) 10);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer14 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer14;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService16 = null;
        strBuilder0.retryService = kafkaSpoutRetryService16;
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = null;
        strBuilder0.kafkaProps = strMap18;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>> wildcardClassKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.Enum<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy>>();
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer11 = serializableKafkaSpoutConfig0.valueDeserializer;
        int int12 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        long long13 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService14;
        int int16 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        int int17 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer8 = serializableKafkaSpoutConfig0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        long long11 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        long long12 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = serializableKafkaSpoutConfig0.kafkaProps;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap13);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer5 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder6 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder7.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = null;
        strBuilder7.kafkaSpoutStreams = kafkaSpoutStreams10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder7.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        strBuilder7.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy14);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer17 = strBuilder0.keyDeserializer;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy12 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy12.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy14 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy14.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strSerializableDeserializer17);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        long long6 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer7 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setValueDeserializer(strComparableSerializableDeserializer7);
        strBuilder8.maxUncommittedOffsets = 97;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer11 = serializableKafkaSpoutConfig0.valueDeserializer;
        int int12 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        long long13 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService14;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 200L;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer18 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService19 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService19;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder21 = serializableKafkaSpoutConfig0.tuplesBuilder;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder21);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.offsetCommitPeriodMs = (byte) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setMaxUncommittedOffsets(100);
        long long12 = strBuilder0.offsetCommitPeriodMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setMaxUncommittedOffsets(10);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer15 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder14.setKeyDeserializer(strSerializableDeserializer15);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder16);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.offsetCommitPeriodMs = (byte) 100;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setMaxUncommittedOffsets(100);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = null;
        strBuilder11.kafkaProps = strMap12;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer14 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder15 = strBuilder11.setKeyDeserializer(strSerializableDeserializer14);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy17 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder16.firstPollOffsetStrategy = firstPollOffsetStrategy17;
        strBuilder16.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer21 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder22 = strBuilder16.setValueDeserializer(strComparableSerializableDeserializer21);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder23 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy24 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder23.firstPollOffsetStrategy = firstPollOffsetStrategy24;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams26 = null;
        strBuilder23.kafkaSpoutStreams = kafkaSpoutStreams26;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy28 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder23.firstPollOffsetStrategy = firstPollOffsetStrategy28;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy30 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        strBuilder23.firstPollOffsetStrategy = firstPollOffsetStrategy30;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder32 = strBuilder16.setFirstPollOffsetStrategy(firstPollOffsetStrategy30);
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = strBuilder16.kafkaProps;
        int int34 = strBuilder16.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy35 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder36 = strBuilder16.setFirstPollOffsetStrategy(firstPollOffsetStrategy35);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder37 = strBuilder11.setFirstPollOffsetStrategy(firstPollOffsetStrategy35);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy38 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST;
        strBuilder37.firstPollOffsetStrategy = firstPollOffsetStrategy38;
        int int40 = strBuilder37.maxUncommittedOffsets;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy17 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy17.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy24 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy24.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy28 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy28.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy30 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy30.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy35 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy35.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy38 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST + "'", firstPollOffsetStrategy38.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>();
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder11 = serializableKafkaSpoutConfig0.tuplesBuilder;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 200L;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder14 = serializableKafkaSpoutConfig0.tuplesBuilder;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder14);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        strBuilder0.pollTimeoutMs = 10L;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer8 = null;
        strBuilder0.valueDeserializer = strComparableSerializableDeserializer8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder10 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder10.firstPollOffsetStrategy = firstPollOffsetStrategy11;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        strBuilder10.kafkaSpoutStreams = kafkaSpoutStreams13;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy15 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder10.firstPollOffsetStrategy = firstPollOffsetStrategy15;
        strBuilder10.maxUncommittedOffsets = 10;
        strBuilder10.offsetCommitPeriodMs = 30000L;
        int int21 = strBuilder10.maxUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy22 = strBuilder10.firstPollOffsetStrategy;
        strBuilder10.pollTimeoutMs = ' ';
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder25 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy26 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder25.firstPollOffsetStrategy = firstPollOffsetStrategy26;
        strBuilder25.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer30 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder31 = strBuilder25.setValueDeserializer(strComparableSerializableDeserializer30);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder32 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy33 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder32.firstPollOffsetStrategy = firstPollOffsetStrategy33;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams35 = null;
        strBuilder32.kafkaSpoutStreams = kafkaSpoutStreams35;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy37 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder32.firstPollOffsetStrategy = firstPollOffsetStrategy37;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy39 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        strBuilder32.firstPollOffsetStrategy = firstPollOffsetStrategy39;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder41 = strBuilder25.setFirstPollOffsetStrategy(firstPollOffsetStrategy39);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy42 = strBuilder25.firstPollOffsetStrategy;
        strBuilder10.firstPollOffsetStrategy = firstPollOffsetStrategy42;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder44 = strBuilder0.setFirstPollOffsetStrategy(firstPollOffsetStrategy42);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService45 = strBuilder0.retryService;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy11 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy11.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy15 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy15.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy22 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy22.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy26 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy26.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy33 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy33.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy37 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy37.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy39 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy39.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy42 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy42.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService45);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = null;
        serializableKafkaSpoutConfig0.valueDeserializer = objDeserializer2;
        long long4 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer5 = serializableKafkaSpoutConfig0.valueDeserializer;
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder7 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig8 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long9 = serializableKafkaSpoutConfig8.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = null;
        serializableKafkaSpoutConfig8.kafkaSpoutStreams = kafkaSpoutStreams10;
        long long12 = serializableKafkaSpoutConfig8.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder13 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder13.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        strBuilder13.maxUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer18 = null;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder19 = strBuilder13.setValueDeserializer(strComparableSerializableDeserializer18);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder20 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy21 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder20.firstPollOffsetStrategy = firstPollOffsetStrategy21;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams23 = null;
        strBuilder20.kafkaSpoutStreams = kafkaSpoutStreams23;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy25 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder20.firstPollOffsetStrategy = firstPollOffsetStrategy25;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy27 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        strBuilder20.firstPollOffsetStrategy = firstPollOffsetStrategy27;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder29 = strBuilder13.setFirstPollOffsetStrategy(firstPollOffsetStrategy27);
        serializableKafkaSpoutConfig8.firstPollOffsetStrategy = firstPollOffsetStrategy27;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy27;
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer32 = serializableKafkaSpoutConfig0.keyDeserializer;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy14 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy14.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy21 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy21.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy25 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy25.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy27 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy27.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer32);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService5;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST;
        serializableKafkaSpoutConfig0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = serializableKafkaSpoutConfig0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams13;
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = serializableKafkaSpoutConfig0.kafkaProps;
        java.util.List<java.lang.String> strList16 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = serializableKafkaSpoutConfig0.getKafkaProps();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy8 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST + "'", firstPollOffsetStrategy8.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap17);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        strBuilder0.kafkaSpoutStreams = kafkaSpoutStreams3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy5;
        strBuilder0.maxUncommittedOffsets = 10;
        strBuilder0.offsetCommitPeriodMs = 30000L;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder12 = strBuilder0.setOffsetCommitPeriodMs((long) 10);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer13 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer13;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder16 = strBuilder0.setPollTimeoutMs((long) '#');
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams17 = null;
        strBuilder16.kafkaSpoutStreams = kafkaSpoutStreams17;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder20 = strBuilder16.setPollTimeoutMs(30000L);
        java.lang.Class<?> wildcardClass21 = strBuilder16.getClass();
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy5 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST + "'", firstPollOffsetStrategy5.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        strBuilder0.kafkaProps = strMap8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = strBuilder0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = strBuilder0.kafkaSpoutStreams;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy10 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy10.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.List<java.lang.String> strList10 = serializableKafkaSpoutConfig0.getSubscribedTopics();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer11 = serializableKafkaSpoutConfig0.valueDeserializer;
        int int12 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        long long13 = serializableKafkaSpoutConfig0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService14;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 200L;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService18 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService18;
        java.lang.String str20 = serializableKafkaSpoutConfig0.toString();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer21 = null;
        serializableKafkaSpoutConfig0.keyDeserializer = serializableDeserializer21;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strList10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=200, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str20.equals("KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=200, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}"));
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        strBuilder0.pollTimeoutMs = 10L;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer8 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setMaxUncommittedOffsets(100);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        strBuilder11.kafkaSpoutStreams = kafkaSpoutStreams12;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig14 = strBuilder11.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder11);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        serializableKafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams2;
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        long long9 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        int int10 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap11;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        serializableKafkaSpoutConfig0.pollTimeoutMs = 10;
        long long17 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
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
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = serializableKafkaSpoutConfig0.getRetryService();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.getKafkaProps();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        strBuilder0.pollTimeoutMs = 10L;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer8 = null;
        strBuilder0.keyDeserializer = strSerializableDeserializer8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = strBuilder0.kafkaSpoutStreams;
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = strBuilder0.kafkaProps;
        long long12 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setMaxUncommittedOffsets(0);
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer15 = null;
        strBuilder14.valueDeserializer = strComparableSerializableDeserializer15;
        org.junit.Assert.assertTrue("'" + firstPollOffsetStrategy1 + "' != '" + org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST + "'", firstPollOffsetStrategy1.equals(org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        serializableKafkaSpoutConfig0.kafkaProps = strMap1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 10;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = serializableKafkaSpoutConfig0.retryService;
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder8 = serializableKafkaSpoutConfig0.tuplesBuilder;
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = serializableKafkaSpoutConfig0.retryService;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableKafkaSpoutTuplesBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(strMap9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService10);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        long long3 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = null;
        serializableKafkaSpoutConfig0.retryService = kafkaSpoutRetryService4;
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        long long7 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder9 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder9;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        long long12 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(pattern6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        long long5 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.lang.String str6 = serializableKafkaSpoutConfig0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder8 = null;
        serializableKafkaSpoutConfig0.tuplesBuilder = serializableKafkaSpoutTuplesBuilder8;
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer10 = serializableKafkaSpoutConfig0.valueDeserializer;
        long long11 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(serializableDeserializer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}" + "'", str6.equals("KafkaSpoutConfig{kafkaProps=null, keyDeserializer=null, valueDeserializer=null, pollTimeoutMs=0, offsetCommitPeriodMs=0, maxUncommittedOffsets=0, firstPollOffsetStrategy=null, kafkaSpoutStreams=null, tuplesBuilder=null, retryService=null, topics=null, topicWildcardPattern=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objDeserializer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }
}
