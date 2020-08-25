import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.String> strSerializableDeserializer6 = strBuilder0.keyDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig7 = strBuilder0.build();
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig7 = strBuilder0.build();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer3 = serializableKafkaSpoutConfig0.keyDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        java.lang.String str7 = serializableKafkaSpoutConfig0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long3 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        java.util.regex.Pattern pattern4 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = serializableKafkaSpoutConfig0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.getKafkaProps();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        serializableKafkaSpoutConfig0.maxUncommittedOffsets = (byte) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        java.util.regex.Pattern pattern7 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        strBuilder0.pollTimeoutMs = (short) 10;
        long long11 = strBuilder0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig12 = strBuilder0.build();
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        long long5 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder7 = strBuilder0.setMaxUncommittedOffsets((int) (short) -1);
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig9 = strBuilder0.build();
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = serializableKafkaSpoutConfig0.getRetryService();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = serializableKafkaSpoutConfig0.retryService;
        int int4 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        long long3 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder4 = serializableKafkaSpoutConfig0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        int int6 = serializableKafkaSpoutConfig0.maxUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement> typeKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.Type, java.lang.reflect.AnnotatedElement>(typeBuilder0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = serializableKafkaSpoutConfig0.getFirstPollOffsetStrategy();
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = 200L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder8 = strBuilder0.setMaxUncommittedOffsets((int) (byte) 0);
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = strBuilder0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setMaxUncommittedOffsets((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig12 = strBuilder0.build();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
        strBuilder0.firstPollOffsetStrategy = firstPollOffsetStrategy1;
        strBuilder0.maxUncommittedOffsets = (-1);
        strBuilder0.offsetCommitPeriodMs = (-1L);
        long long7 = strBuilder0.pollTimeoutMs;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutTuplesBuilder8 = strBuilder0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = strBuilder0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder11 = strBuilder0.setPollTimeoutMs((long) (-1));
        org.apache.storm.kafka.spout.SerializableDeserializer<java.lang.Comparable<java.lang.String>> strComparableSerializableDeserializer12 = strBuilder0.valueDeserializer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<java.lang.String, java.lang.Comparable<java.lang.String>> strBuilder14 = strBuilder0.setMaxUncommittedOffsets((int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, java.lang.Comparable<java.lang.String>> strKafkaSpoutConfig15 = strBuilder0.build();
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (byte) 1;
        int int5 = serializableKafkaSpoutConfig0.getMaxUncommittedOffsets();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        long long2 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        serializableKafkaSpoutConfig0.offsetCommitPeriodMs = (short) 0;
        long long5 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        java.util.regex.Pattern pattern6 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = 35;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyBuilder0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig.Builder<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>> firstPollOffsetStrategyKafkaSpoutConfig1 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy, java.lang.Comparable<java.lang.String>>(firstPollOffsetStrategyBuilder0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        long long3 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.kafka.common.serialization.Deserializer<java.io.Serializable> serializableDeserializer4 = serializableKafkaSpoutConfig0.getKeyDeserializer();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = serializableKafkaSpoutConfig0.getKafkaProps();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = serializableKafkaSpoutConfig0.valueDeserializer;
        long long7 = serializableKafkaSpoutConfig0.offsetCommitPeriodMs;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = serializableKafkaSpoutConfig0.getConsumerGroupId();
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        long long1 = serializableKafkaSpoutConfig0.getPollTimeoutMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer2 = serializableKafkaSpoutConfig0.getValueDeserializer();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        long long4 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        serializableKafkaSpoutConfig0.pollTimeoutMs = (byte) 1;
        java.util.regex.Pattern pattern7 = serializableKafkaSpoutConfig0.getTopicWildcardPattern();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object> serializableKafkaSpoutConfig0 = new org.apache.storm.kafka.spout.KafkaSpoutConfig<java.io.Serializable, java.lang.Object>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = serializableKafkaSpoutConfig0.getKafkaSpoutStreams();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = serializableKafkaSpoutConfig0.kafkaProps;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.io.Serializable, java.lang.Object> serializableKafkaSpoutTuplesBuilder3 = serializableKafkaSpoutConfig0.getTuplesBuilder();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = serializableKafkaSpoutConfig0.kafkaSpoutStreams;
        long long5 = serializableKafkaSpoutConfig0.getOffsetsCommitPeriodMs();
        org.apache.kafka.common.serialization.Deserializer<java.lang.Object> objDeserializer6 = serializableKafkaSpoutConfig0.valueDeserializer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = serializableKafkaSpoutConfig0.isConsumerAutoCommitMode();
    }
}

