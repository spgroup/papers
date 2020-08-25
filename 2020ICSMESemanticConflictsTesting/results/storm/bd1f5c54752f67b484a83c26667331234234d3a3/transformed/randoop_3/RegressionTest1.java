import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        boolean boolean7 = objKafkaSpout0.initialized;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap8 = objKafkaSpout0.acked;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap8);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer3 = objKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory4 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory4;
        boolean boolean6 = objKafkaSpout0.initialized;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder9;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout11 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        objKafkaSpout11.kafkaSpoutStreams = kafkaSpoutStreams12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = null;
        objKafkaSpout11.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        objKafkaSpout11.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray18 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet19 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet19, kafkaSpoutMessageIdArray18);
        objKafkaSpout11.emitted = kafkaSpoutMessageIdSet19;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet19;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService25 = objKafkaSpout0.retryService;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord26 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService25);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        boolean boolean6 = objKafkaSpout0.consumerAutoCommitMode;
        objKafkaSpout0.initialized = true;
        boolean boolean9 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector10 = null;
        objKafkaSpout0.collector = spoutOutputCollector10;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap8 = null;
        objKafkaSpout0.acked = topicPartitionMap8;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = objKafkaSpout0.emitted;
        int int11 = objKafkaSpout0.maxRetries;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = objKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig6 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig6;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = objKafkaSpout0.kafkaConsumerFactory;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory9);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        long long9 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer10 = objKafkaSpout0.commitTimer;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = objKafkaSpout0.emitted;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout3 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = null;
        objKafkaSpout3.kafkaSpoutStreams = kafkaSpoutStreams4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = null;
        objKafkaSpout3.firstPollOffsetStrategy = firstPollOffsetStrategy6;
        objKafkaSpout3.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer10 = objKafkaSpout3.kafkaConsumer;
        boolean boolean11 = objKafkaSpout3.waitingToEmit();
        boolean boolean12 = objKafkaSpout3.initialized;
        boolean boolean13 = objKafkaSpout3.consumerAutoCommitMode;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.fail((java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = objKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet12 = objKafkaSpout0.emitted;
        boolean boolean13 = objKafkaSpout0.consumerAutoCommitMode;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor14 = objKafkaSpout0.waitingToEmit;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor14);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService7;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = null;
        objKafkaSpout0.collector = spoutOutputCollector9;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder11 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder11;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder13 = objKafkaSpout0.tuplesBuilder;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder13);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        long long9 = objKafkaSpout0.numUncommittedOffsets;
        objKafkaSpout0.consumerAutoCommitMode = false;
        objKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor6 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor6;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = objKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap8 = null;
        objKafkaSpout0.acked = topicPartitionMap8;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = objKafkaSpout0.emitted;
        int int11 = objKafkaSpout0.maxRetries;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector12 = null;
        objKafkaSpout0.collector = spoutOutputCollector12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams6;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        objKafkaSpout0.numUncommittedOffsets = (byte) -1;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = objKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder11 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder11;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor13 = objKafkaSpout0.waitingToEmit;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap14 = null;
        objKafkaSpout0.acked = topicPartitionMap14;
        boolean boolean16 = objKafkaSpout0.waitingToEmit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator1;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator1;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator4 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator4.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator5;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = kafkaSpoutMessageIdComparator1.thenComparing(kafkaSpoutMessageIdComparator5);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator8 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = offsetComparator8.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator9.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = kafkaSpoutMessageIdComparator10.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator12 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = offsetComparator12.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator13;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator13;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator16 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator17 = offsetComparator16.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator17;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator19 = kafkaSpoutMessageIdComparator13.thenComparing(kafkaSpoutMessageIdComparator17);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator20 = kafkaSpoutMessageIdComparator17.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator21 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator22 = offsetComparator21.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = offsetComparator21.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator24 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = offsetComparator24.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = offsetComparator24.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator27 = kafkaSpoutMessageIdComparator23.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator24);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator28 = kafkaSpoutMessageIdComparator20.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator24);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator29 = kafkaSpoutMessageIdComparator10.thenComparing(kafkaSpoutMessageIdComparator20);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator30 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator31 = offsetComparator30.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator32 = offsetComparator30.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator33 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator34 = offsetComparator33.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator35 = offsetComparator33.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator36 = kafkaSpoutMessageIdComparator32.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator33);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator37 = kafkaSpoutMessageIdComparator29.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator33);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator38 = kafkaSpoutMessageIdComparator7.thenComparing(kafkaSpoutMessageIdComparator37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator38);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap8 = null;
        objKafkaSpout0.acked = topicPartitionMap8;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = objKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService11;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet10);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.kafka.common.TopicPartition topicPartition4 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection5 = objKafkaSpout0.toArrayList(topicPartition4);
        java.lang.String str6 = objKafkaSpout0.toString();
        long long7 = objKafkaSpout0.numUncommittedOffsets;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str6.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy6;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory11 = objKafkaSpout0.kafkaConsumerFactory;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory11);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory9;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout11 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        objKafkaSpout11.kafkaSpoutStreams = kafkaSpoutStreams12;
        java.lang.String str14 = objKafkaSpout11.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder15 = null;
        objKafkaSpout11.tuplesBuilder = objKafkaSpoutTuplesBuilder15;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer17 = objKafkaSpout11.commitTimer;
        java.lang.String str18 = objKafkaSpout11.toString();
        objKafkaSpout11.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout21 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams22 = null;
        objKafkaSpout21.kafkaSpoutStreams = kafkaSpoutStreams22;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy24 = null;
        objKafkaSpout21.firstPollOffsetStrategy = firstPollOffsetStrategy24;
        objKafkaSpout21.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig28 = null;
        objKafkaSpout21.kafkaSpoutConfig = objKafkaSpoutConfig28;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory30 = null;
        objKafkaSpout21.kafkaConsumerFactory = kafkaConsumerFactory30;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray32 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet33 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet33, kafkaSpoutMessageIdArray32);
        objKafkaSpout21.emitted = kafkaSpoutMessageIdSet33;
        objKafkaSpout11.emitted = kafkaSpoutMessageIdSet33;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet33;
        objKafkaSpout0.numUncommittedOffsets = 1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str14.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str18.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objKafkaSpout0.firstPollOffsetStrategy;
        objKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder9;
        java.lang.String str11 = objKafkaSpout0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str11.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        objKafkaSpout0.consumerAutoCommitMode = true;
        java.lang.String str9 = objKafkaSpout0.toString();
        java.lang.Class<?> wildcardClass10 = objKafkaSpout0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str9.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = objKafkaSpout0.firstPollOffsetStrategy;
        boolean boolean11 = objKafkaSpout0.consumerAutoCommitMode;
        int int12 = objKafkaSpout0.maxRetries;
        org.apache.kafka.common.TopicPartition topicPartition13 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection14 = objKafkaSpout0.toArrayList(topicPartition13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection14);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder9;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout11 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        objKafkaSpout11.kafkaSpoutStreams = kafkaSpoutStreams12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = null;
        objKafkaSpout11.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        objKafkaSpout11.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray18 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet19 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet19, kafkaSpoutMessageIdArray18);
        objKafkaSpout11.emitted = kafkaSpoutMessageIdSet19;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet19;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = objKafkaSpout0.firstPollOffsetStrategy;
        boolean boolean11 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = objKafkaSpout0.retryService;
        int int13 = objKafkaSpout0.maxRetries;
        java.util.Map map14 = null;
        org.apache.storm.task.TopologyContext topologyContext15 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.open(map14, topologyContext15, spoutOutputCollector16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory7 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory7;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder9;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer11 = objKafkaSpout0.kafkaConsumer;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = objKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer11);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = objKafkaSpout0.collector;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        long long7 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer8 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig10 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig10;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet12 = objKafkaSpout0.emitted;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector13 = objKafkaSpout0.collector;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(spoutOutputCollector4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(spoutOutputCollector13);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer5 = objKafkaSpout0.commitTimer;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap6 = objKafkaSpout0.acked;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap6);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        boolean boolean9 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory10 = objKafkaSpout0.kafkaConsumerFactory;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory10);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory9;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory11 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory11;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory13 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory13;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor15 = objKafkaSpout0.waitingToEmit;
        boolean boolean16 = objKafkaSpout0.consumerAutoCommitMode;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService7;
        boolean boolean9 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.kafka.common.TopicPartition topicPartition10 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection11 = objKafkaSpout0.toArrayList(topicPartition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection11);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objKafkaSpout0.firstPollOffsetStrategy;
        objKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory9;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory11 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy6);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        java.lang.String str7 = objKafkaSpout0.toString();
        objKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout10 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = null;
        objKafkaSpout10.kafkaSpoutStreams = kafkaSpoutStreams11;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = null;
        objKafkaSpout10.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        objKafkaSpout10.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig17 = null;
        objKafkaSpout10.kafkaSpoutConfig = objKafkaSpoutConfig17;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory19 = null;
        objKafkaSpout10.kafkaConsumerFactory = kafkaConsumerFactory19;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray21 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet22 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet22, kafkaSpoutMessageIdArray21);
        objKafkaSpout10.emitted = kafkaSpoutMessageIdSet22;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet22;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords26 = objKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout7 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        objKafkaSpout7.kafkaSpoutStreams = kafkaSpoutStreams8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = null;
        objKafkaSpout7.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        objKafkaSpout7.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer14 = objKafkaSpout7.kafkaConsumer;
        boolean boolean15 = objKafkaSpout7.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder16 = null;
        objKafkaSpout7.tuplesBuilder = objKafkaSpoutTuplesBuilder16;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout18 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams19 = null;
        objKafkaSpout18.kafkaSpoutStreams = kafkaSpoutStreams19;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy21 = null;
        objKafkaSpout18.firstPollOffsetStrategy = firstPollOffsetStrategy21;
        objKafkaSpout18.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray25 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet26 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet26, kafkaSpoutMessageIdArray25);
        objKafkaSpout18.emitted = kafkaSpoutMessageIdSet26;
        objKafkaSpout7.emitted = kafkaSpoutMessageIdSet26;
        boolean boolean30 = objKafkaSpout7.waitingToEmit();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor31 = objKafkaSpout7.waitingToEmit;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.ack((java.lang.Object) objConsumerRecordItor31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor31);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        boolean boolean7 = objKafkaSpout0.initialized;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.nextTuple();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = objKafkaSpout0.collector;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder7 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(spoutOutputCollector4);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        java.util.Map map4 = null;
        org.apache.storm.task.TopologyContext topologyContext5 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.open(map4, topologyContext5, spoutOutputCollector6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        objKafkaSpout0.consumerAutoCommitMode = true;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap9 = null;
        objKafkaSpout0.acked = topicPartitionMap9;
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder9;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout11 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        objKafkaSpout11.kafkaSpoutStreams = kafkaSpoutStreams12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = null;
        objKafkaSpout11.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        objKafkaSpout11.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray18 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet19 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet19, kafkaSpoutMessageIdArray18);
        objKafkaSpout11.emitted = kafkaSpoutMessageIdSet19;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet19;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        org.apache.kafka.common.TopicPartition topicPartition25 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection26 = objKafkaSpout0.toArrayList(topicPartition25);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout27 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams28 = null;
        objKafkaSpout27.kafkaSpoutStreams = kafkaSpoutStreams28;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService30 = null;
        objKafkaSpout27.retryService = kafkaSpoutRetryService30;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet32 = objKafkaSpout27.emitted;
        boolean boolean33 = objKafkaSpout27.waitingToEmit();
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.fail((java.lang.Object) boolean33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, org.apache.storm.topology.IComponent> consumerRebalanceListenerKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, org.apache.storm.topology.IComponent> consumerRebalanceListenerKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, org.apache.storm.topology.IComponent>(consumerRebalanceListenerKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer4 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer4;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap6 = null;
        objKafkaSpout0.acked = topicPartitionMap6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        long long9 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = objKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap11 = null;
        objKafkaSpout0.acked = topicPartitionMap11;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords13 = objKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy10);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap8 = null;
        objKafkaSpout0.acked = topicPartitionMap8;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService10;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory12 = objKafkaSpout0.kafkaConsumerFactory;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory12);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.numUncommittedOffsets = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer7 = objKafkaSpout0.commitTimer;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer7);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory9;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory11 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory11;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory13 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory13;
        objKafkaSpout0.numUncommittedOffsets = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder17 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder17;
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = objKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor9 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor9;
        objKafkaSpout0.initialized = false;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor13 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor13;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = kafkaSpoutMessageIdComparator1.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = kafkaSpoutMessageIdComparator2.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator4 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator4.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator5;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator5;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator8 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = offsetComparator8.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator9;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = kafkaSpoutMessageIdComparator5.thenComparing(kafkaSpoutMessageIdComparator9);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = kafkaSpoutMessageIdComparator9.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator13 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = offsetComparator13.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator13.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator16 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator17 = offsetComparator16.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator18 = offsetComparator16.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator19 = kafkaSpoutMessageIdComparator15.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator16);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator20 = kafkaSpoutMessageIdComparator12.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator16);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator21 = kafkaSpoutMessageIdComparator2.thenComparing(kafkaSpoutMessageIdComparator12);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator22 = kafkaSpoutMessageIdComparator2.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = kafkaSpoutMessageIdComparator22.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator24 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = offsetComparator24.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator25;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator25;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator28 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator29 = offsetComparator28.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator29;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator31 = kafkaSpoutMessageIdComparator25.thenComparing(kafkaSpoutMessageIdComparator29);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator32 = kafkaSpoutMessageIdComparator29.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator33 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator34 = offsetComparator33.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator35 = offsetComparator33.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator36 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator37 = offsetComparator36.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator38 = offsetComparator36.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator39 = kafkaSpoutMessageIdComparator35.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator36);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator40 = kafkaSpoutMessageIdComparator32.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator36);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator41 = kafkaSpoutMessageIdComparator22.thenComparing(kafkaSpoutMessageIdComparator40);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator41;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator43 = kafkaSpoutMessageIdComparator41.reversed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator43);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        objKafkaSpout0.initialized = true;
        java.lang.String str11 = objKafkaSpout0.toString();
        long long12 = objKafkaSpout0.numUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = objKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str11.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        boolean boolean7 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder10 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder10;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        objKafkaSpout0.initialized = true;
        java.lang.String str11 = objKafkaSpout0.toString();
        long long12 = objKafkaSpout0.numUncommittedOffsets;
        boolean boolean13 = objKafkaSpout0.consumerAutoCommitMode;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str11.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService8;
        objKafkaSpout0.numUncommittedOffsets = (short) 100;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer12 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer12;
        int int14 = objKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor15 = objKafkaSpout0.waitingToEmit;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor15);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder5 = objKafkaSpout0.tuplesBuilder;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer8 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = objKafkaSpout0.tuplesBuilder;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder9);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder9;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout11 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        objKafkaSpout11.kafkaSpoutStreams = kafkaSpoutStreams12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = null;
        objKafkaSpout11.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        objKafkaSpout11.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray18 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet19 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet19, kafkaSpoutMessageIdArray18);
        objKafkaSpout11.emitted = kafkaSpoutMessageIdSet19;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet19;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout25 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams26 = null;
        objKafkaSpout25.kafkaSpoutStreams = kafkaSpoutStreams26;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy28 = null;
        objKafkaSpout25.firstPollOffsetStrategy = firstPollOffsetStrategy28;
        objKafkaSpout25.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer32 = objKafkaSpout25.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService33 = null;
        objKafkaSpout25.retryService = kafkaSpoutRetryService33;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap35 = objKafkaSpout25.acked;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig36 = null;
        objKafkaSpout25.kafkaSpoutConfig = objKafkaSpoutConfig36;
        boolean boolean38 = objKafkaSpout25.initialized;
        objKafkaSpout25.maxRetries = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.ack((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer6 = objKafkaSpout0.kafkaConsumer;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer6);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory9;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory11 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory11;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = objKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        boolean boolean6 = objKafkaSpout0.initialized;
        org.apache.kafka.common.TopicPartition topicPartition7 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection8 = objKafkaSpout0.toArrayList(topicPartition7);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams9;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout11 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        objKafkaSpout11.kafkaSpoutStreams = kafkaSpoutStreams12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = null;
        objKafkaSpout11.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        objKafkaSpout11.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer18 = objKafkaSpout11.kafkaConsumer;
        boolean boolean19 = objKafkaSpout11.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder20 = null;
        objKafkaSpout11.tuplesBuilder = objKafkaSpoutTuplesBuilder20;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout22 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams23 = null;
        objKafkaSpout22.kafkaSpoutStreams = kafkaSpoutStreams23;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy25 = null;
        objKafkaSpout22.firstPollOffsetStrategy = firstPollOffsetStrategy25;
        objKafkaSpout22.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray29 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet30 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet30, kafkaSpoutMessageIdArray29);
        objKafkaSpout22.emitted = kafkaSpoutMessageIdSet30;
        objKafkaSpout11.emitted = kafkaSpoutMessageIdSet30;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet30;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams35 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams35;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory9;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer11 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer11;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap13 = objKafkaSpout0.acked;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = topicPartitionMap13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap13);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        boolean boolean5 = objKafkaSpout0.waitingToEmit();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = objKafkaSpout0.collector;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords7 = objKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(spoutOutputCollector6);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        objKafkaSpout0.maxRetries = 10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory11 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory11;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.CharSequence> kafkaSpoutMessageIdCollectionKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.CharSequence> kafkaSpoutMessageIdCollectionKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.CharSequence>(kafkaSpoutMessageIdCollectionKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = objKafkaSpout0.collector;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        long long7 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer8 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer8;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords10 = objKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(spoutOutputCollector4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        long long9 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = objKafkaSpout0.firstPollOffsetStrategy;
        org.apache.kafka.common.TopicPartition topicPartition11 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection12 = objKafkaSpout0.toArrayList(topicPartition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection12);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder9;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout11 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        objKafkaSpout11.kafkaSpoutStreams = kafkaSpoutStreams12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = null;
        objKafkaSpout11.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        objKafkaSpout11.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray18 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet19 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet19, kafkaSpoutMessageIdArray18);
        objKafkaSpout11.emitted = kafkaSpoutMessageIdSet19;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet19;
        boolean boolean23 = objKafkaSpout0.waitingToEmit();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap24 = objKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig9;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = objKafkaSpout0.kafkaSpoutStreams;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap12 = objKafkaSpout0.acked;
        boolean boolean13 = objKafkaSpout0.initialized;
        objKafkaSpout0.numUncommittedOffsets = (byte) 100;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = objKafkaSpout0.emitted;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = null;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet6;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator12 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = offsetComparator12.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = offsetComparator12.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator15 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = offsetComparator15.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator17 = offsetComparator15.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator18 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator19 = offsetComparator18.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator20 = offsetComparator18.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator21 = kafkaSpoutMessageIdComparator17.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator18);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator22 = offsetComparator12.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator18);
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.ack((java.lang.Object) kafkaSpoutMessageIdComparator22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Comparator$$Lambda$213/1215065375 cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator22);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        org.apache.kafka.common.TopicPartition topicPartition5 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection6 = objKafkaSpout0.toArrayList(topicPartition5);
        java.lang.String str7 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = null;
        objKafkaSpout0.collector = spoutOutputCollector8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = objKafkaSpout0.firstPollOffsetStrategy;
        boolean boolean11 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = objKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder13 = objKafkaSpout0.tuplesBuilder;
        boolean boolean14 = objKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy15 = objKafkaSpout0.firstPollOffsetStrategy;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy15);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        boolean boolean9 = objKafkaSpout0.consumerAutoCommitMode;
        objKafkaSpout0.consumerAutoCommitMode = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        boolean boolean9 = objKafkaSpout0.initialized;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer12 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.initialized;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer4 = objKafkaSpout0.kafkaConsumer;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer4);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = null;
        objKafkaSpout0.collector = spoutOutputCollector7;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap9 = objKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        boolean boolean7 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = objKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder10 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = objKafkaSpout0.kafkaSpoutStreams;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap10 = null;
        objKafkaSpout0.acked = topicPartitionMap10;
        objKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        boolean boolean6 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = objKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objKafkaSpout0.retryService;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = null;
        objKafkaSpout0.collector = spoutOutputCollector9;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout11 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        objKafkaSpout11.kafkaSpoutStreams = kafkaSpoutStreams12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = null;
        objKafkaSpout11.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        boolean boolean16 = objKafkaSpout11.initialized;
        boolean boolean17 = objKafkaSpout11.initialized;
        org.apache.kafka.common.TopicPartition topicPartition18 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection19 = objKafkaSpout11.toArrayList(topicPartition18);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams20 = null;
        objKafkaSpout11.kafkaSpoutStreams = kafkaSpoutStreams20;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout22 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams23 = null;
        objKafkaSpout22.kafkaSpoutStreams = kafkaSpoutStreams23;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy25 = null;
        objKafkaSpout22.firstPollOffsetStrategy = firstPollOffsetStrategy25;
        objKafkaSpout22.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer29 = objKafkaSpout22.kafkaConsumer;
        boolean boolean30 = objKafkaSpout22.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder31 = null;
        objKafkaSpout22.tuplesBuilder = objKafkaSpoutTuplesBuilder31;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout33 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams34 = null;
        objKafkaSpout33.kafkaSpoutStreams = kafkaSpoutStreams34;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy36 = null;
        objKafkaSpout33.firstPollOffsetStrategy = firstPollOffsetStrategy36;
        objKafkaSpout33.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray40 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet41 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet41, kafkaSpoutMessageIdArray40);
        objKafkaSpout33.emitted = kafkaSpoutMessageIdSet41;
        objKafkaSpout22.emitted = kafkaSpoutMessageIdSet41;
        objKafkaSpout11.emitted = kafkaSpoutMessageIdSet41;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet41;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig4 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig4;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        objKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector11 = objKafkaSpout0.collector;
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.fail(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(spoutOutputCollector11);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objKafkaSpout0.retryService;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer8 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer8;
        int int10 = objKafkaSpout0.maxRetries;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = objKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig5 = objKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        objKafkaSpout0.numUncommittedOffsets = (byte) 1;
        long long9 = objKafkaSpout0.numUncommittedOffsets;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor10 = objKafkaSpout0.waitingToEmit;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor10);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objKafkaSpout0.firstPollOffsetStrategy;
        objKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder9;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService11;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy6);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder9;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout11 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        objKafkaSpout11.kafkaSpoutStreams = kafkaSpoutStreams12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = null;
        objKafkaSpout11.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        objKafkaSpout11.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray18 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet19 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet19, kafkaSpoutMessageIdArray18);
        objKafkaSpout11.emitted = kafkaSpoutMessageIdSet19;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet19;
        boolean boolean23 = objKafkaSpout0.waitingToEmit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = objKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy6;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService8;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory10 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig5 = objKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = null;
        objKafkaSpout0.collector = spoutOutputCollector9;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray11 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet12 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet12, kafkaSpoutMessageIdArray11);
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = objKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = objKafkaSpout0.retryService;
        objKafkaSpout0.numUncommittedOffsets = (-1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService9);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objKafkaSpout0.retryService;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService5);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        boolean boolean6 = objKafkaSpout0.consumerAutoCommitMode;
        objKafkaSpout0.initialized = true;
        boolean boolean9 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector10 = null;
        objKafkaSpout0.collector = spoutOutputCollector10;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory12 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory12;
        objKafkaSpout0.numUncommittedOffsets = '#';
        boolean boolean16 = objKafkaSpout0.waitingToEmit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = objKafkaSpout0.kafkaSpoutStreams;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap10 = null;
        objKafkaSpout0.acked = topicPartitionMap10;
        objKafkaSpout0.numUncommittedOffsets = '#';
        org.apache.kafka.common.TopicPartition topicPartition14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition14, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        boolean boolean9 = objKafkaSpout0.initialized;
        long long10 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer11 = objKafkaSpout0.commitTimer;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer11);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        objKafkaSpout0.initialized = true;
        java.lang.String str11 = objKafkaSpout0.toString();
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer14 = objKafkaSpout0.kafkaConsumer;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str11.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer14);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService7;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = null;
        objKafkaSpout0.collector = spoutOutputCollector9;
        long long11 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder12 = objKafkaSpout0.tuplesBuilder;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder12);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = kafkaSpoutMessageIdComparator1.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = kafkaSpoutMessageIdComparator2.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator4 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator4.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator5;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator5;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator8 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = offsetComparator8.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator9;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = kafkaSpoutMessageIdComparator5.thenComparing(kafkaSpoutMessageIdComparator9);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = kafkaSpoutMessageIdComparator9.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator13 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = offsetComparator13.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator13.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator16 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator17 = offsetComparator16.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator18 = offsetComparator16.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator19 = kafkaSpoutMessageIdComparator15.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator16);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator20 = kafkaSpoutMessageIdComparator12.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator16);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator21 = kafkaSpoutMessageIdComparator2.thenComparing(kafkaSpoutMessageIdComparator12);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator22 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = offsetComparator22.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator24 = offsetComparator22.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = offsetComparator25.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator27 = offsetComparator25.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator28 = kafkaSpoutMessageIdComparator24.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator29 = kafkaSpoutMessageIdComparator21.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator30 = offsetComparator25.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator31 = kafkaSpoutMessageIdComparator30.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator32 = kafkaSpoutMessageIdComparator31.reversed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator32);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap7 = objKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = objKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector10 = objKafkaSpout0.collector;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(spoutOutputCollector10);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        boolean boolean9 = objKafkaSpout0.initialized;
        long long10 = objKafkaSpout0.numUncommittedOffsets;
        objKafkaSpout0.maxRetries = ' ';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = kafkaSpoutMessageIdComparator1.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = offsetComparator3.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = kafkaSpoutMessageIdComparator4.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator6 = kafkaSpoutMessageIdComparator5.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator5;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator8 = kafkaSpoutMessageIdComparator5.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = kafkaSpoutMessageIdComparator2.thenComparing(kafkaSpoutMessageIdComparator8);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator2.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = offsetComparator11.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = kafkaSpoutMessageIdComparator12.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = kafkaSpoutMessageIdComparator13.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator15 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = offsetComparator15.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator16;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator16;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator19 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator20 = offsetComparator19.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator20;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator22 = kafkaSpoutMessageIdComparator16.thenComparing(kafkaSpoutMessageIdComparator20);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = kafkaSpoutMessageIdComparator20.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator24 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = offsetComparator24.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = offsetComparator24.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator27 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator28 = offsetComparator27.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator29 = offsetComparator27.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator30 = kafkaSpoutMessageIdComparator26.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator27);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator31 = kafkaSpoutMessageIdComparator23.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator27);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator32 = kafkaSpoutMessageIdComparator13.thenComparing(kafkaSpoutMessageIdComparator23);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator33 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator34 = offsetComparator33.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator35 = kafkaSpoutMessageIdComparator34.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator36 = kafkaSpoutMessageIdComparator35.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator37 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator38 = offsetComparator37.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator38;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator38;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator41 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator42 = offsetComparator41.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator42;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator44 = kafkaSpoutMessageIdComparator38.thenComparing(kafkaSpoutMessageIdComparator42);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator45 = kafkaSpoutMessageIdComparator42.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator46 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator47 = offsetComparator46.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator48 = offsetComparator46.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator49 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator50 = offsetComparator49.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator51 = offsetComparator49.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator52 = kafkaSpoutMessageIdComparator48.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator49);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator53 = kafkaSpoutMessageIdComparator45.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator49);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator54 = kafkaSpoutMessageIdComparator35.thenComparing(kafkaSpoutMessageIdComparator45);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator55 = kafkaSpoutMessageIdComparator35.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator56 = kafkaSpoutMessageIdComparator55.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator57 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator58 = offsetComparator57.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator58;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator58;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator61 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator62 = offsetComparator61.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator62;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator64 = kafkaSpoutMessageIdComparator58.thenComparing(kafkaSpoutMessageIdComparator62);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator65 = kafkaSpoutMessageIdComparator62.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator66 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator67 = offsetComparator66.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator68 = offsetComparator66.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator69 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator70 = offsetComparator69.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator71 = offsetComparator69.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator72 = kafkaSpoutMessageIdComparator68.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator69);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator73 = kafkaSpoutMessageIdComparator65.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator69);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator74 = kafkaSpoutMessageIdComparator55.thenComparing(kafkaSpoutMessageIdComparator73);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator74;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator76 = kafkaSpoutMessageIdComparator23.thenComparing(kafkaSpoutMessageIdComparator74);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator77 = kafkaSpoutMessageIdComparator2.thenComparing(kafkaSpoutMessageIdComparator74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator77);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        boolean boolean6 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        long long9 = objKafkaSpout0.numUncommittedOffsets;
        objKafkaSpout0.consumerAutoCommitMode = false;
        objKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder14 = objKafkaSpout0.tuplesBuilder;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder14);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy6;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService8;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor6 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor6;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor9 = objKafkaSpout0.waitingToEmit;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer10 = objKafkaSpout0.kafkaConsumer;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer10);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory1 = objKafkaSpout0.kafkaConsumerFactory;
        objKafkaSpout0.numUncommittedOffsets = (-1);
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor4 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor4;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor6 = objKafkaSpout0.waitingToEmit;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor6);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.numUncommittedOffsets = (short) 1;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.declareOutputFields(outputFieldsDeclarer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer3 = objKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory4 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory4;
        java.lang.String str6 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = null;
        objKafkaSpout0.collector = spoutOutputCollector7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str6.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = objKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor9 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor9;
        boolean boolean11 = objKafkaSpout0.waitingToEmit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        java.lang.String str7 = objKafkaSpout0.toString();
        objKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig10 = objKafkaSpout0.kafkaSpoutConfig;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor11 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig10);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = kafkaSpoutMessageIdComparator1.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = kafkaSpoutMessageIdComparator2.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator4 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator4.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator5;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator5;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator8 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = offsetComparator8.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator9;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = kafkaSpoutMessageIdComparator5.thenComparing(kafkaSpoutMessageIdComparator9);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = kafkaSpoutMessageIdComparator9.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator13 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = offsetComparator13.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator13.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator16 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator17 = offsetComparator16.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator18 = offsetComparator16.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator19 = kafkaSpoutMessageIdComparator15.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator16);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator20 = kafkaSpoutMessageIdComparator12.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator16);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator21 = kafkaSpoutMessageIdComparator2.thenComparing(kafkaSpoutMessageIdComparator12);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator22 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = offsetComparator22.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator24 = offsetComparator22.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = offsetComparator25.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator27 = offsetComparator25.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator28 = kafkaSpoutMessageIdComparator24.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator29 = kafkaSpoutMessageIdComparator21.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator30 = offsetComparator25.reversed();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId31 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = offsetComparator25.compare(kafkaSpoutMessageId31, kafkaSpoutMessageId32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator30);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = objKafkaSpout0.kafkaSpoutStreams;
        java.lang.String str10 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector11 = null;
        objKafkaSpout0.collector = spoutOutputCollector11;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout13 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams14 = null;
        objKafkaSpout13.kafkaSpoutStreams = kafkaSpoutStreams14;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService16 = null;
        objKafkaSpout13.retryService = kafkaSpoutRetryService16;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor18 = objKafkaSpout13.waitingToEmit;
        long long19 = objKafkaSpout13.numUncommittedOffsets;
        boolean boolean20 = objKafkaSpout13.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy21 = null;
        objKafkaSpout13.firstPollOffsetStrategy = firstPollOffsetStrategy21;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer23 = objKafkaSpout13.kafkaConsumer;
        objKafkaSpout13.numUncommittedOffsets = 10L;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder26 = null;
        objKafkaSpout13.tuplesBuilder = objKafkaSpoutTuplesBuilder26;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.ack((java.lang.Object) objKafkaSpoutTuplesBuilder26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str10.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer23);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator1 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator1.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = kafkaSpoutMessageIdComparator2.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = kafkaSpoutMessageIdComparator3.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator3;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator6 = offsetComparator0.thenComparing(kafkaSpoutMessageIdComparator3);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = offsetComparator0.reversed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = objKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet12 = objKafkaSpout0.emitted;
        boolean boolean13 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory9;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer11 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer11;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer13 = objKafkaSpout0.kafkaConsumer;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer13);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory9;
        objKafkaSpout0.consumerAutoCommitMode = true;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor13 = objKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor14 = objKafkaSpout0.waitingToEmit;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor14);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService8;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor10 = objKafkaSpout0.waitingToEmit;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer11 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer11;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector13 = null;
        objKafkaSpout0.collector = spoutOutputCollector13;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = objKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor10);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = objKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer9 = objKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder10 = objKafkaSpout0.tuplesBuilder;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder10);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        java.lang.Class<?> wildcardClass3 = offsetComparator0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig6 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig6;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap8 = objKafkaSpout0.acked;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = null;
        objKafkaSpout0.collector = spoutOutputCollector9;
        boolean boolean11 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder12 = objKafkaSpout0.tuplesBuilder;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder12);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        boolean boolean6 = objKafkaSpout0.initialized;
        org.apache.kafka.common.TopicPartition topicPartition7 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection8 = objKafkaSpout0.toArrayList(topicPartition7);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords9 = objKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection8);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        boolean boolean7 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer10 = objKafkaSpout0.kafkaConsumer;
        objKafkaSpout0.numUncommittedOffsets = 10L;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder13 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder13;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer10);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        boolean boolean7 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder10 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder10;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer12 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = objKafkaSpout0.firstPollOffsetStrategy;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy14);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        boolean boolean6 = objKafkaSpout0.waitingToEmit();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords7 = objKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory1 = objKafkaSpout0.kafkaConsumerFactory;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer2 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer2;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory1);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        boolean boolean6 = objKafkaSpout0.consumerAutoCommitMode;
        objKafkaSpout0.initialized = true;
        java.util.Map map9 = null;
        org.apache.storm.task.TopologyContext topologyContext10 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.open(map9, topologyContext10, spoutOutputCollector11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        boolean boolean7 = objKafkaSpout0.waitingToEmit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams10;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory7 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory7;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder9;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer11 = objKafkaSpout0.kafkaConsumer;
        objKafkaSpout0.initialized = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer11);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        objKafkaSpout0.maxRetries = 10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = objKafkaSpout0.kafkaSpoutConfig;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = objKafkaSpout0.emitted;
        boolean boolean11 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer12 = objKafkaSpout0.kafkaConsumer;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords13 = objKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer12);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory9;
        objKafkaSpout0.consumerAutoCommitMode = true;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor13 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = objKafkaSpout0.retryService;
        int int15 = objKafkaSpout0.maxRetries;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector16 = null;
        objKafkaSpout0.collector = spoutOutputCollector16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = kafkaSpoutMessageIdComparator1.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = offsetComparator3.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = kafkaSpoutMessageIdComparator4.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator6 = kafkaSpoutMessageIdComparator5.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator8 = offsetComparator7.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator8;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator8;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = offsetComparator11.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator12;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = kafkaSpoutMessageIdComparator8.thenComparing(kafkaSpoutMessageIdComparator12);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = kafkaSpoutMessageIdComparator12.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator16 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator17 = offsetComparator16.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator18 = offsetComparator16.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator19 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator20 = offsetComparator19.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator21 = offsetComparator19.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator22 = kafkaSpoutMessageIdComparator18.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator19);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = kafkaSpoutMessageIdComparator15.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator19);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator24 = kafkaSpoutMessageIdComparator5.thenComparing(kafkaSpoutMessageIdComparator15);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = kafkaSpoutMessageIdComparator5.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = kafkaSpoutMessageIdComparator25.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator27 = kafkaSpoutMessageIdComparator25.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator27;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator29 = kafkaSpoutMessageIdComparator1.thenComparing(kafkaSpoutMessageIdComparator27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator29);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        boolean boolean9 = objKafkaSpout0.initialized;
        boolean boolean10 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig11 = objKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory12 = objKafkaSpout0.kafkaConsumerFactory;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory12);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor6 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor6;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService9;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = objKafkaSpout0.kafkaSpoutStreams;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap10 = null;
        objKafkaSpout0.acked = topicPartitionMap10;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet12 = objKafkaSpout0.emitted;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet12);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> kafkaSpoutMessageIdCollectionKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>();
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        boolean boolean11 = objKafkaSpout0.initialized;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = kafkaSpoutMessageIdComparator1.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = kafkaSpoutMessageIdComparator2.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator4 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator4.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator6 = kafkaSpoutMessageIdComparator5.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = kafkaSpoutMessageIdComparator6.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator8 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = offsetComparator8.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator9;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator9;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator12 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = offsetComparator12.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator13;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = kafkaSpoutMessageIdComparator9.thenComparing(kafkaSpoutMessageIdComparator13);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = kafkaSpoutMessageIdComparator13.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator17 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator18 = offsetComparator17.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator19 = offsetComparator17.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator20 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator21 = offsetComparator20.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator22 = offsetComparator20.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = kafkaSpoutMessageIdComparator19.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator20);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator24 = kafkaSpoutMessageIdComparator16.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator20);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = kafkaSpoutMessageIdComparator6.thenComparing(kafkaSpoutMessageIdComparator16);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = kafkaSpoutMessageIdComparator25.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator27 = kafkaSpoutMessageIdComparator3.thenComparing(kafkaSpoutMessageIdComparator26);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator28 = kafkaSpoutMessageIdComparator3.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator29 = kafkaSpoutMessageIdComparator3.reversed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator29);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.maxRetries = (short) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objKafkaSpout0.kafkaSpoutStreams;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords8 = objKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService7;
        boolean boolean9 = objKafkaSpout0.consumerAutoCommitMode;
        java.lang.String str10 = objKafkaSpout0.toString();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor11 = objKafkaSpout0.waitingToEmit;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str10.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor11);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        long long9 = objKafkaSpout0.numUncommittedOffsets;
        objKafkaSpout0.consumerAutoCommitMode = false;
        objKafkaSpout0.maxRetries = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = objKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        boolean boolean7 = objKafkaSpout0.consumerAutoCommitMode;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        objKafkaSpout0.numUncommittedOffsets = (byte) -1;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = objKafkaSpout0.emitted;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = objKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder12 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        org.apache.kafka.common.TopicPartition topicPartition5 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection6 = objKafkaSpout0.toArrayList(topicPartition5);
        java.lang.String str7 = objKafkaSpout0.toString();
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.nextTuple();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig6 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig6;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap8 = objKafkaSpout0.acked;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer11 = objKafkaSpout0.commitTimer;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer11);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet1 = objKafkaSpout0.emitted;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet1);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray7 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet8, kafkaSpoutMessageIdArray7);
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet8;
        boolean boolean11 = objKafkaSpout0.waitingToEmit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory1 = objKafkaSpout0.kafkaConsumerFactory;
        objKafkaSpout0.numUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig4 = objKafkaSpout0.kafkaSpoutConfig;
        long long5 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder6 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory8 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory8;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory10 = objKafkaSpout0.kafkaConsumerFactory;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory10);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator1;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator1;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator1;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator5 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator6 = offsetComparator5.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = offsetComparator5.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator8 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = offsetComparator8.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = offsetComparator8.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = offsetComparator11.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = offsetComparator11.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = kafkaSpoutMessageIdComparator10.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator5.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = kafkaSpoutMessageIdComparator1.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator11);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator17 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator18 = offsetComparator17.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator19 = offsetComparator17.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator20 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator21 = offsetComparator20.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator22 = offsetComparator20.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = kafkaSpoutMessageIdComparator19.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator20);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator24 = kafkaSpoutMessageIdComparator1.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator20);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = kafkaSpoutMessageIdComparator1.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator25;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = objKafkaSpout0.retryService;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor9 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor9;
        objKafkaSpout0.initialized = false;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        objKafkaSpout0.initialized = true;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = objKafkaSpout0.emitted;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap12 = null;
        objKafkaSpout0.acked = topicPartitionMap12;
        org.apache.kafka.common.TopicPartition topicPartition14 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection15 = objKafkaSpout0.toArrayList(topicPartition14);
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap16 = null;
        objKafkaSpout0.acked = topicPartitionMap16;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer18 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer18;
        boolean boolean20 = objKafkaSpout0.initialized;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder6 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder6;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap8 = objKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = objKafkaSpout0.kafkaSpoutStreams;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap10 = null;
        objKafkaSpout0.acked = topicPartitionMap10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = objKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector13 = objKafkaSpout0.collector;
        org.apache.kafka.common.TopicPartition topicPartition14 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection15 = objKafkaSpout0.toArrayList(topicPartition14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(spoutOutputCollector13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection15);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig5 = objKafkaSpout0.kafkaSpoutConfig;
        int int6 = objKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout7 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        objKafkaSpout7.kafkaSpoutStreams = kafkaSpoutStreams8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = null;
        objKafkaSpout7.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        boolean boolean12 = objKafkaSpout7.initialized;
        boolean boolean13 = objKafkaSpout7.initialized;
        org.apache.kafka.common.TopicPartition topicPartition14 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection15 = objKafkaSpout7.toArrayList(topicPartition14);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams16 = null;
        objKafkaSpout7.kafkaSpoutStreams = kafkaSpoutStreams16;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout18 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams19 = null;
        objKafkaSpout18.kafkaSpoutStreams = kafkaSpoutStreams19;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy21 = null;
        objKafkaSpout18.firstPollOffsetStrategy = firstPollOffsetStrategy21;
        objKafkaSpout18.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer25 = objKafkaSpout18.kafkaConsumer;
        boolean boolean26 = objKafkaSpout18.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder27 = null;
        objKafkaSpout18.tuplesBuilder = objKafkaSpoutTuplesBuilder27;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout29 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams30 = null;
        objKafkaSpout29.kafkaSpoutStreams = kafkaSpoutStreams30;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy32 = null;
        objKafkaSpout29.firstPollOffsetStrategy = firstPollOffsetStrategy32;
        objKafkaSpout29.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray36 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet37 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet37, kafkaSpoutMessageIdArray36);
        objKafkaSpout29.emitted = kafkaSpoutMessageIdSet37;
        objKafkaSpout18.emitted = kafkaSpoutMessageIdSet37;
        objKafkaSpout7.emitted = kafkaSpoutMessageIdSet37;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet37;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector43 = objKafkaSpout0.collector;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(spoutOutputCollector43);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService8;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory10 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory10;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout12 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        objKafkaSpout12.kafkaSpoutStreams = kafkaSpoutStreams13;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService15 = null;
        objKafkaSpout12.retryService = kafkaSpoutRetryService15;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory17 = null;
        objKafkaSpout12.kafkaConsumerFactory = kafkaConsumerFactory17;
        boolean boolean19 = objKafkaSpout12.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory20 = objKafkaSpout12.kafkaConsumerFactory;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder21 = null;
        objKafkaSpout12.tuplesBuilder = objKafkaSpoutTuplesBuilder21;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap23 = null;
        objKafkaSpout12.acked = topicPartitionMap23;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.ack((java.lang.Object) objKafkaSpout12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.storm.kafka.spout.KafkaSpout cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory20);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig9;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = objKafkaSpout0.kafkaSpoutStreams;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap12 = objKafkaSpout0.acked;
        boolean boolean13 = objKafkaSpout0.initialized;
        objKafkaSpout0.initialized = true;
        java.lang.String str16 = objKafkaSpout0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str16.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = objKafkaSpout0.collector;
        org.apache.kafka.common.TopicPartition topicPartition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition5, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(spoutOutputCollector4);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = objKafkaSpout0.collector;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        long long7 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer8 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer8;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(spoutOutputCollector4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory9;
        objKafkaSpout0.consumerAutoCommitMode = true;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor13 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = objKafkaSpout0.retryService;
        int int15 = objKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService16 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService16;
        boolean boolean18 = objKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService19 = objKafkaSpout0.retryService;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService19);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams3;
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor5;
        objKafkaSpout0.numUncommittedOffsets = (byte) 100;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        boolean boolean7 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder10 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder10;
        int int12 = objKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        java.lang.String str7 = objKafkaSpout0.toString();
        objKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout10 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = null;
        objKafkaSpout10.kafkaSpoutStreams = kafkaSpoutStreams11;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = null;
        objKafkaSpout10.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        objKafkaSpout10.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig17 = null;
        objKafkaSpout10.kafkaSpoutConfig = objKafkaSpoutConfig17;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory19 = null;
        objKafkaSpout10.kafkaConsumerFactory = kafkaConsumerFactory19;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray21 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet22 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet22, kafkaSpoutMessageIdArray21);
        objKafkaSpout10.emitted = kafkaSpoutMessageIdSet22;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet22;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory26 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory26;
        long long28 = objKafkaSpout0.numUncommittedOffsets;
        objKafkaSpout0.initialized = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap8 = null;
        objKafkaSpout0.acked = topicPartitionMap8;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService10;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory12 = objKafkaSpout0.kafkaConsumerFactory;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig13 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig13;
        objKafkaSpout0.initialized = true;
        objKafkaSpout0.maxRetries = '4';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory12);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = kafkaSpoutMessageIdComparator1.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = kafkaSpoutMessageIdComparator2.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator4 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator4.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator5;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator5;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator8 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = offsetComparator8.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator9;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = kafkaSpoutMessageIdComparator5.thenComparing(kafkaSpoutMessageIdComparator9);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = kafkaSpoutMessageIdComparator9.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator13 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = offsetComparator13.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator13.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator16 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator17 = offsetComparator16.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator18 = offsetComparator16.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator19 = kafkaSpoutMessageIdComparator15.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator16);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator20 = kafkaSpoutMessageIdComparator12.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator16);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator21 = kafkaSpoutMessageIdComparator2.thenComparing(kafkaSpoutMessageIdComparator12);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator22 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = offsetComparator22.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator24 = offsetComparator22.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = offsetComparator25.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator27 = offsetComparator25.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator28 = kafkaSpoutMessageIdComparator24.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator29 = kafkaSpoutMessageIdComparator21.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator30 = offsetComparator25.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator31 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator32 = offsetComparator31.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator33 = kafkaSpoutMessageIdComparator32.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator34 = kafkaSpoutMessageIdComparator33.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator35 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator36 = offsetComparator35.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator36;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator36;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator39 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator40 = offsetComparator39.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator40;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator42 = kafkaSpoutMessageIdComparator36.thenComparing(kafkaSpoutMessageIdComparator40);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator43 = kafkaSpoutMessageIdComparator40.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator44 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator45 = offsetComparator44.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator46 = offsetComparator44.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator47 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator48 = offsetComparator47.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator49 = offsetComparator47.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator50 = kafkaSpoutMessageIdComparator46.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator47);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator51 = kafkaSpoutMessageIdComparator43.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator47);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator52 = kafkaSpoutMessageIdComparator33.thenComparing(kafkaSpoutMessageIdComparator43);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator53 = kafkaSpoutMessageIdComparator33.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator54 = kafkaSpoutMessageIdComparator53.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator55 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator56 = offsetComparator55.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator56;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator56;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator59 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator60 = offsetComparator59.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator60;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator62 = kafkaSpoutMessageIdComparator56.thenComparing(kafkaSpoutMessageIdComparator60);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator63 = kafkaSpoutMessageIdComparator60.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator64 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator65 = offsetComparator64.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator66 = offsetComparator64.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator67 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator68 = offsetComparator67.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator69 = offsetComparator67.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator70 = kafkaSpoutMessageIdComparator66.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator67);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator71 = kafkaSpoutMessageIdComparator63.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator67);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator72 = kafkaSpoutMessageIdComparator53.thenComparing(kafkaSpoutMessageIdComparator71);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator72;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator74 = kafkaSpoutMessageIdComparator30.thenComparing(kafkaSpoutMessageIdComparator72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator74);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer5 = objKafkaSpout0.commitTimer;
        objKafkaSpout0.consumerAutoCommitMode = true;
        java.lang.String str8 = objKafkaSpout0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords9 = objKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str8.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = objKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        objKafkaSpout0.initialized = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig9);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor6 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor6;
        objKafkaSpout0.numUncommittedOffsets = 0L;
        java.util.Map map10 = null;
        org.apache.storm.task.TopologyContext topologyContext11 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.open(map10, topologyContext11, spoutOutputCollector12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = kafkaSpoutMessageIdComparator1.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = kafkaSpoutMessageIdComparator2.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator4 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator4.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator5;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator5;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator8 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = offsetComparator8.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator9;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = kafkaSpoutMessageIdComparator5.thenComparing(kafkaSpoutMessageIdComparator9);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = kafkaSpoutMessageIdComparator9.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator13 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = offsetComparator13.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator13.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator16 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator17 = offsetComparator16.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator18 = offsetComparator16.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator19 = kafkaSpoutMessageIdComparator15.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator16);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator20 = kafkaSpoutMessageIdComparator12.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator16);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator21 = kafkaSpoutMessageIdComparator2.thenComparing(kafkaSpoutMessageIdComparator12);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator22 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = offsetComparator22.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator24 = kafkaSpoutMessageIdComparator23.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = kafkaSpoutMessageIdComparator24.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator26 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator27 = offsetComparator26.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator27;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator27;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator30 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator31 = offsetComparator30.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator31;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator33 = kafkaSpoutMessageIdComparator27.thenComparing(kafkaSpoutMessageIdComparator31);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator34 = kafkaSpoutMessageIdComparator31.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator35 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator36 = offsetComparator35.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator37 = offsetComparator35.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator38 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator39 = offsetComparator38.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator40 = offsetComparator38.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator41 = kafkaSpoutMessageIdComparator37.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator38);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator42 = kafkaSpoutMessageIdComparator34.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator38);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator43 = kafkaSpoutMessageIdComparator24.thenComparing(kafkaSpoutMessageIdComparator34);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator44 = kafkaSpoutMessageIdComparator24.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator45 = kafkaSpoutMessageIdComparator44.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator46 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator47 = offsetComparator46.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator47;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator47;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator50 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator51 = offsetComparator50.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator51;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator53 = kafkaSpoutMessageIdComparator47.thenComparing(kafkaSpoutMessageIdComparator51);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator54 = kafkaSpoutMessageIdComparator51.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator55 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator56 = offsetComparator55.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator57 = offsetComparator55.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator58 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator59 = offsetComparator58.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator60 = offsetComparator58.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator61 = kafkaSpoutMessageIdComparator57.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator58);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator62 = kafkaSpoutMessageIdComparator54.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator58);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator63 = kafkaSpoutMessageIdComparator44.thenComparing(kafkaSpoutMessageIdComparator62);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator63;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator65 = kafkaSpoutMessageIdComparator12.thenComparing(kafkaSpoutMessageIdComparator63);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator66 = kafkaSpoutMessageIdComparator63.reversed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator66);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder5 = objKafkaSpout0.tuplesBuilder;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer8 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = objKafkaSpout0.tuplesBuilder;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer10 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder9);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        boolean boolean7 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig12 = objKafkaSpout0.kafkaSpoutConfig;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig12);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> annotatedElementKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> annotatedElementKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(annotatedElementKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.common.TopicPartition topicPartition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition7, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig4 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig4;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords9 = objKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        boolean boolean6 = objKafkaSpout0.consumerAutoCommitMode;
        objKafkaSpout0.initialized = true;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService7;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = null;
        objKafkaSpout0.collector = spoutOutputCollector9;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder11 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder11;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory13 = objKafkaSpout0.kafkaConsumerFactory;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = objKafkaSpout0.retryService;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService14);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig9;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = objKafkaSpout0.kafkaSpoutStreams;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap12 = objKafkaSpout0.acked;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams13;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout15 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams16 = null;
        objKafkaSpout15.kafkaSpoutStreams = kafkaSpoutStreams16;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy18 = null;
        objKafkaSpout15.firstPollOffsetStrategy = firstPollOffsetStrategy18;
        boolean boolean20 = objKafkaSpout15.initialized;
        boolean boolean21 = objKafkaSpout15.initialized;
        org.apache.kafka.common.TopicPartition topicPartition22 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection23 = objKafkaSpout15.toArrayList(topicPartition22);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams24 = null;
        objKafkaSpout15.kafkaSpoutStreams = kafkaSpoutStreams24;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout26 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams27 = null;
        objKafkaSpout26.kafkaSpoutStreams = kafkaSpoutStreams27;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy29 = null;
        objKafkaSpout26.firstPollOffsetStrategy = firstPollOffsetStrategy29;
        objKafkaSpout26.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer33 = objKafkaSpout26.kafkaConsumer;
        boolean boolean34 = objKafkaSpout26.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder35 = null;
        objKafkaSpout26.tuplesBuilder = objKafkaSpoutTuplesBuilder35;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout37 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams38 = null;
        objKafkaSpout37.kafkaSpoutStreams = kafkaSpoutStreams38;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy40 = null;
        objKafkaSpout37.firstPollOffsetStrategy = firstPollOffsetStrategy40;
        objKafkaSpout37.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray44 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet45 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet45, kafkaSpoutMessageIdArray44);
        objKafkaSpout37.emitted = kafkaSpoutMessageIdSet45;
        objKafkaSpout26.emitted = kafkaSpoutMessageIdSet45;
        objKafkaSpout15.emitted = kafkaSpoutMessageIdSet45;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet45;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap51 = null;
        objKafkaSpout0.acked = topicPartitionMap51;
        objKafkaSpout0.maxRetries = ' ';
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = objKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        boolean boolean9 = objKafkaSpout0.initialized;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        int int6 = objKafkaSpout0.maxRetries;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = objKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objKafkaSpout0.firstPollOffsetStrategy;
        objKafkaSpout0.consumerAutoCommitMode = false;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords9 = objKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy6);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objKafkaSpout0.retryService;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer8 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer8;
        org.apache.kafka.common.TopicPartition topicPartition10 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection11 = objKafkaSpout0.toArrayList(topicPartition10);
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.declareOutputFields(outputFieldsDeclarer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection11);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        boolean boolean6 = objKafkaSpout0.consumerAutoCommitMode;
        objKafkaSpout0.numUncommittedOffsets = 0L;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        objKafkaSpout0.maxRetries = 10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = objKafkaSpout0.kafkaSpoutConfig;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = objKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer11 = objKafkaSpout0.commitTimer;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer11);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams7;
        objKafkaSpout0.consumerAutoCommitMode = true;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout11 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        objKafkaSpout11.kafkaSpoutStreams = kafkaSpoutStreams12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = null;
        objKafkaSpout11.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig16 = objKafkaSpout11.kafkaSpoutConfig;
        int int17 = objKafkaSpout11.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout18 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams19 = null;
        objKafkaSpout18.kafkaSpoutStreams = kafkaSpoutStreams19;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy21 = null;
        objKafkaSpout18.firstPollOffsetStrategy = firstPollOffsetStrategy21;
        boolean boolean23 = objKafkaSpout18.initialized;
        boolean boolean24 = objKafkaSpout18.initialized;
        org.apache.kafka.common.TopicPartition topicPartition25 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection26 = objKafkaSpout18.toArrayList(topicPartition25);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams27 = null;
        objKafkaSpout18.kafkaSpoutStreams = kafkaSpoutStreams27;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout29 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams30 = null;
        objKafkaSpout29.kafkaSpoutStreams = kafkaSpoutStreams30;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy32 = null;
        objKafkaSpout29.firstPollOffsetStrategy = firstPollOffsetStrategy32;
        objKafkaSpout29.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer36 = objKafkaSpout29.kafkaConsumer;
        boolean boolean37 = objKafkaSpout29.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder38 = null;
        objKafkaSpout29.tuplesBuilder = objKafkaSpoutTuplesBuilder38;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout40 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams41 = null;
        objKafkaSpout40.kafkaSpoutStreams = kafkaSpoutStreams41;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy43 = null;
        objKafkaSpout40.firstPollOffsetStrategy = firstPollOffsetStrategy43;
        objKafkaSpout40.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray47 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet48 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet48, kafkaSpoutMessageIdArray47);
        objKafkaSpout40.emitted = kafkaSpoutMessageIdSet48;
        objKafkaSpout29.emitted = kafkaSpoutMessageIdSet48;
        objKafkaSpout18.emitted = kafkaSpoutMessageIdSet48;
        objKafkaSpout11.emitted = kafkaSpoutMessageIdSet48;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet48;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        boolean boolean7 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer8 = objKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout9 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = null;
        objKafkaSpout9.kafkaSpoutStreams = kafkaSpoutStreams10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = null;
        objKafkaSpout9.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        objKafkaSpout9.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer16 = objKafkaSpout9.kafkaConsumer;
        boolean boolean17 = objKafkaSpout9.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder18 = null;
        objKafkaSpout9.tuplesBuilder = objKafkaSpoutTuplesBuilder18;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout20 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams21 = null;
        objKafkaSpout20.kafkaSpoutStreams = kafkaSpoutStreams21;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy23 = null;
        objKafkaSpout20.firstPollOffsetStrategy = firstPollOffsetStrategy23;
        objKafkaSpout20.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray27 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet28 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet28, kafkaSpoutMessageIdArray27);
        objKafkaSpout20.emitted = kafkaSpoutMessageIdSet28;
        objKafkaSpout9.emitted = kafkaSpoutMessageIdSet28;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet28;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer33 = objKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams34 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams34;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer33);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        objKafkaSpout0.numUncommittedOffsets = (byte) -1;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = objKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder11 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder11;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor13 = objKafkaSpout0.waitingToEmit;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap14 = null;
        objKafkaSpout0.acked = topicPartitionMap14;
        objKafkaSpout0.numUncommittedOffsets = (byte) -1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor13);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator2 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = offsetComparator2.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = kafkaSpoutMessageIdComparator3.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = kafkaSpoutMessageIdComparator4.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator6 = kafkaSpoutMessageIdComparator5.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator6;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator8 = offsetComparator0.thenComparing(kafkaSpoutMessageIdComparator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator8);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.kafka.common.TopicPartition topicPartition4 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection5 = objKafkaSpout0.toArrayList(topicPartition4);
        java.lang.String str6 = objKafkaSpout0.toString();
        java.lang.Class<?> wildcardClass7 = objKafkaSpout0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str6.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService7;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = null;
        objKafkaSpout0.collector = spoutOutputCollector9;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder11 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder11;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory13 = objKafkaSpout0.kafkaConsumerFactory;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer14 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory13);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig4 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig4;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.nextTuple();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = objKafkaSpout0.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor6 = objKafkaSpout0.waitingToEmit;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor6);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objKafkaSpout0.firstPollOffsetStrategy;
        objKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder9;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService11;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = objKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy6);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService7;
        boolean boolean9 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        java.lang.String str7 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = objKafkaSpout0.collector;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer9 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer9;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(spoutOutputCollector8);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor7 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig8 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor7);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        java.lang.String str7 = objKafkaSpout0.toString();
        objKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout10 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = null;
        objKafkaSpout10.kafkaSpoutStreams = kafkaSpoutStreams11;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = null;
        objKafkaSpout10.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        objKafkaSpout10.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig17 = null;
        objKafkaSpout10.kafkaSpoutConfig = objKafkaSpoutConfig17;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory19 = null;
        objKafkaSpout10.kafkaConsumerFactory = kafkaConsumerFactory19;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray21 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet22 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet22, kafkaSpoutMessageIdArray21);
        objKafkaSpout10.emitted = kafkaSpoutMessageIdSet22;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet22;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = objKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        boolean boolean7 = objKafkaSpout0.consumerAutoCommitMode;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder10 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = objKafkaSpout0.firstPollOffsetStrategy;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy11);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        objKafkaSpout0.maxRetries = 10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory11 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory11;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector13 = null;
        objKafkaSpout0.collector = spoutOutputCollector13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap8 = null;
        objKafkaSpout0.acked = topicPartitionMap8;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = objKafkaSpout0.emitted;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap11 = objKafkaSpout0.acked;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap11);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        boolean boolean7 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder10 = objKafkaSpout0.tuplesBuilder;
        objKafkaSpout0.numUncommittedOffsets = (byte) 100;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder10);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        boolean boolean7 = objKafkaSpout0.consumerAutoCommitMode;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.common.TopicPartition topicPartition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig6 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig6;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap8 = objKafkaSpout0.acked;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = null;
        objKafkaSpout0.collector = spoutOutputCollector9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy11;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap13 = objKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap8);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = objKafkaSpout0.firstPollOffsetStrategy;
        boolean boolean11 = objKafkaSpout0.consumerAutoCommitMode;
        boolean boolean12 = objKafkaSpout0.waitingToEmit();
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap13 = null;
        objKafkaSpout0.acked = topicPartitionMap13;
        org.apache.kafka.common.TopicPartition topicPartition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition15, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        boolean boolean9 = objKafkaSpout0.initialized;
        boolean boolean10 = objKafkaSpout0.consumerAutoCommitMode;
        boolean boolean11 = objKafkaSpout0.waitingToEmit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService8;
        objKafkaSpout0.numUncommittedOffsets = (short) 100;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer12 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer12;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords14 = objKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        long long9 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = objKafkaSpout0.firstPollOffsetStrategy;
        int int11 = objKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig12 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig6 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig6;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer8 = objKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = objKafkaSpout0.retryService;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService9);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        boolean boolean7 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        boolean boolean10 = objKafkaSpout0.initialized;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap11 = null;
        objKafkaSpout0.acked = topicPartitionMap11;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap13 = null;
        objKafkaSpout0.acked = topicPartitionMap13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory9;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory11 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory11;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory13 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory13;
        objKafkaSpout0.numUncommittedOffsets = (short) 1;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector17 = null;
        objKafkaSpout0.collector = spoutOutputCollector17;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService19 = objKafkaSpout0.retryService;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService19);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = objKafkaSpout0.kafkaSpoutConfig;
        int int4 = objKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        objKafkaSpout0.maxRetries = 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = kafkaSpoutMessageIdComparator1.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator2;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator4 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator4.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator5;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = kafkaSpoutMessageIdComparator2.thenComparing(kafkaSpoutMessageIdComparator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = kafkaSpoutMessageIdComparator1.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = kafkaSpoutMessageIdComparator2.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator4 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator4.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator5;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator5;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator8 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = offsetComparator8.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator9;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = kafkaSpoutMessageIdComparator5.thenComparing(kafkaSpoutMessageIdComparator9);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = kafkaSpoutMessageIdComparator9.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator13 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = offsetComparator13.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator13.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator16 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator17 = offsetComparator16.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator18 = offsetComparator16.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator19 = kafkaSpoutMessageIdComparator15.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator16);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator20 = kafkaSpoutMessageIdComparator12.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator16);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator21 = kafkaSpoutMessageIdComparator2.thenComparing(kafkaSpoutMessageIdComparator12);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator22 = kafkaSpoutMessageIdComparator2.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = kafkaSpoutMessageIdComparator22.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator24 = kafkaSpoutMessageIdComparator22.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = kafkaSpoutMessageIdComparator24.reversed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig5 = objKafkaSpout0.kafkaSpoutConfig;
        int int6 = objKafkaSpout0.maxRetries;
        org.apache.kafka.common.TopicPartition topicPartition7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition7, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        java.lang.String str9 = objKafkaSpout0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = objKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str9.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        long long9 = objKafkaSpout0.numUncommittedOffsets;
        objKafkaSpout0.consumerAutoCommitMode = false;
        objKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig14 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig14;
        org.apache.kafka.common.TopicPartition topicPartition16 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection17 = objKafkaSpout0.toArrayList(topicPartition16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection17);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer5 = objKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig6 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer5);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        long long9 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = objKafkaSpout0.firstPollOffsetStrategy;
        int int11 = objKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = objKafkaSpout0.retryService;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService12);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = objKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = objKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = objKafkaSpout0.firstPollOffsetStrategy;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy13);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig9;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = objKafkaSpout0.kafkaSpoutStreams;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap12 = objKafkaSpout0.acked;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams13;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout15 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams16 = null;
        objKafkaSpout15.kafkaSpoutStreams = kafkaSpoutStreams16;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy18 = null;
        objKafkaSpout15.firstPollOffsetStrategy = firstPollOffsetStrategy18;
        boolean boolean20 = objKafkaSpout15.initialized;
        boolean boolean21 = objKafkaSpout15.initialized;
        org.apache.kafka.common.TopicPartition topicPartition22 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection23 = objKafkaSpout15.toArrayList(topicPartition22);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams24 = null;
        objKafkaSpout15.kafkaSpoutStreams = kafkaSpoutStreams24;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout26 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams27 = null;
        objKafkaSpout26.kafkaSpoutStreams = kafkaSpoutStreams27;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy29 = null;
        objKafkaSpout26.firstPollOffsetStrategy = firstPollOffsetStrategy29;
        objKafkaSpout26.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer33 = objKafkaSpout26.kafkaConsumer;
        boolean boolean34 = objKafkaSpout26.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder35 = null;
        objKafkaSpout26.tuplesBuilder = objKafkaSpoutTuplesBuilder35;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout37 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams38 = null;
        objKafkaSpout37.kafkaSpoutStreams = kafkaSpoutStreams38;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy40 = null;
        objKafkaSpout37.firstPollOffsetStrategy = firstPollOffsetStrategy40;
        objKafkaSpout37.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray44 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet45 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet45, kafkaSpoutMessageIdArray44);
        objKafkaSpout37.emitted = kafkaSpoutMessageIdSet45;
        objKafkaSpout26.emitted = kafkaSpoutMessageIdSet45;
        objKafkaSpout15.emitted = kafkaSpoutMessageIdSet45;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet45;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap51 = null;
        objKafkaSpout0.acked = topicPartitionMap51;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams53 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams53;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        java.lang.String str7 = objKafkaSpout0.toString();
        int int8 = objKafkaSpout0.maxRetries;
        objKafkaSpout0.consumerAutoCommitMode = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = objKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout12 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        objKafkaSpout12.kafkaSpoutStreams = kafkaSpoutStreams13;
        java.lang.String str15 = objKafkaSpout12.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder16 = null;
        objKafkaSpout12.tuplesBuilder = objKafkaSpoutTuplesBuilder16;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer18 = objKafkaSpout12.commitTimer;
        java.lang.String str19 = objKafkaSpout12.toString();
        objKafkaSpout12.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout22 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams23 = null;
        objKafkaSpout22.kafkaSpoutStreams = kafkaSpoutStreams23;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy25 = null;
        objKafkaSpout22.firstPollOffsetStrategy = firstPollOffsetStrategy25;
        objKafkaSpout22.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig29 = null;
        objKafkaSpout22.kafkaSpoutConfig = objKafkaSpoutConfig29;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory31 = null;
        objKafkaSpout22.kafkaConsumerFactory = kafkaConsumerFactory31;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray33 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet34 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet34, kafkaSpoutMessageIdArray33);
        objKafkaSpout22.emitted = kafkaSpoutMessageIdSet34;
        objKafkaSpout12.emitted = kafkaSpoutMessageIdSet34;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet34;
        org.apache.kafka.common.TopicPartition topicPartition39 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection40 = objKafkaSpout0.toArrayList(topicPartition39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str15.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str19.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection40);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        boolean boolean6 = objKafkaSpout0.consumerAutoCommitMode;
        objKafkaSpout0.initialized = true;
        long long9 = objKafkaSpout0.numUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService8;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap10 = objKafkaSpout0.acked;
        boolean boolean11 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout12 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = null;
        objKafkaSpout12.kafkaSpoutStreams = kafkaSpoutStreams13;
        boolean boolean15 = objKafkaSpout12.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy16 = null;
        objKafkaSpout12.firstPollOffsetStrategy = firstPollOffsetStrategy16;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams18 = objKafkaSpout12.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService19 = null;
        objKafkaSpout12.retryService = kafkaSpoutRetryService19;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy21 = null;
        objKafkaSpout12.firstPollOffsetStrategy = firstPollOffsetStrategy21;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor23 = objKafkaSpout12.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout24 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams25 = null;
        objKafkaSpout24.kafkaSpoutStreams = kafkaSpoutStreams25;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy27 = null;
        objKafkaSpout24.firstPollOffsetStrategy = firstPollOffsetStrategy27;
        boolean boolean29 = objKafkaSpout24.initialized;
        boolean boolean30 = objKafkaSpout24.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy31 = null;
        objKafkaSpout24.firstPollOffsetStrategy = firstPollOffsetStrategy31;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray33 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet34 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet34, kafkaSpoutMessageIdArray33);
        objKafkaSpout24.emitted = kafkaSpoutMessageIdSet34;
        objKafkaSpout12.emitted = kafkaSpoutMessageIdSet34;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet34;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor11 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector12 = null;
        objKafkaSpout0.collector = spoutOutputCollector12;
        objKafkaSpout0.numUncommittedOffsets = (byte) 0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor11);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = objKafkaSpout0.firstPollOffsetStrategy;
        boolean boolean11 = objKafkaSpout0.consumerAutoCommitMode;
        objKafkaSpout0.numUncommittedOffsets = 1L;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams14 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams14;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig16 = objKafkaSpout0.kafkaSpoutConfig;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig16);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory7 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory7;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder9;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer11 = objKafkaSpout0.kafkaConsumer;
        objKafkaSpout0.consumerAutoCommitMode = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer11);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = objKafkaSpout0.firstPollOffsetStrategy;
        boolean boolean11 = objKafkaSpout0.consumerAutoCommitMode;
        objKafkaSpout0.numUncommittedOffsets = 1L;
        long long14 = objKafkaSpout0.numUncommittedOffsets;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService8;
        objKafkaSpout0.numUncommittedOffsets = (short) 100;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer12 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer12;
        int int14 = objKafkaSpout0.maxRetries;
        boolean boolean15 = objKafkaSpout0.waitingToEmit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        boolean boolean7 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy8;
        boolean boolean10 = objKafkaSpout0.initialized;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap11 = null;
        objKafkaSpout0.acked = topicPartitionMap11;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords13 = objKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        objKafkaSpout0.maxRetries = 10;
        org.apache.kafka.common.TopicPartition topicPartition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition9, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout6 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        objKafkaSpout6.kafkaSpoutStreams = kafkaSpoutStreams7;
        java.lang.String str9 = objKafkaSpout6.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder10 = null;
        objKafkaSpout6.tuplesBuilder = objKafkaSpoutTuplesBuilder10;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer12 = objKafkaSpout6.commitTimer;
        java.lang.String str13 = objKafkaSpout6.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector14 = objKafkaSpout6.collector;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer15 = null;
        objKafkaSpout6.kafkaConsumer = objKafkaConsumer15;
        objKafkaSpout6.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout19 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams20 = null;
        objKafkaSpout19.kafkaSpoutStreams = kafkaSpoutStreams20;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy22 = null;
        objKafkaSpout19.firstPollOffsetStrategy = firstPollOffsetStrategy22;
        objKafkaSpout19.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer26 = objKafkaSpout19.kafkaConsumer;
        boolean boolean27 = objKafkaSpout19.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder28 = null;
        objKafkaSpout19.tuplesBuilder = objKafkaSpoutTuplesBuilder28;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout30 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams31 = null;
        objKafkaSpout30.kafkaSpoutStreams = kafkaSpoutStreams31;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy33 = null;
        objKafkaSpout30.firstPollOffsetStrategy = firstPollOffsetStrategy33;
        objKafkaSpout30.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray37 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet38 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet38, kafkaSpoutMessageIdArray37);
        objKafkaSpout30.emitted = kafkaSpoutMessageIdSet38;
        objKafkaSpout19.emitted = kafkaSpoutMessageIdSet38;
        objKafkaSpout6.emitted = kafkaSpoutMessageIdSet38;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet38;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str9.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str13.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(spoutOutputCollector14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory9;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory11 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory11;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory13 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory13;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.declareOutputFields(outputFieldsDeclarer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>.Timer timer1 = kafkaSpout0.new Timer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory1 = objKafkaSpout0.kafkaConsumerFactory;
        objKafkaSpout0.numUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig4 = objKafkaSpout0.kafkaSpoutConfig;
        long long5 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        long long7 = objKafkaSpout0.numUncommittedOffsets;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams6;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer8 = objKafkaSpout0.commitTimer;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer8);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = kafkaSpoutMessageIdComparator1.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = offsetComparator3.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = kafkaSpoutMessageIdComparator4.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator6 = kafkaSpoutMessageIdComparator5.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator7 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator8 = offsetComparator7.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = kafkaSpoutMessageIdComparator8.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = kafkaSpoutMessageIdComparator9.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator11 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = offsetComparator11.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator12;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator12;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator15 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = offsetComparator15.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator16;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator18 = kafkaSpoutMessageIdComparator12.thenComparing(kafkaSpoutMessageIdComparator16);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator19 = kafkaSpoutMessageIdComparator16.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator20 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator21 = offsetComparator20.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator22 = offsetComparator20.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator23 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator24 = offsetComparator23.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator25 = offsetComparator23.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = kafkaSpoutMessageIdComparator22.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator23);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator27 = kafkaSpoutMessageIdComparator19.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator23);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator28 = kafkaSpoutMessageIdComparator9.thenComparing(kafkaSpoutMessageIdComparator19);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator29 = kafkaSpoutMessageIdComparator28.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator30 = kafkaSpoutMessageIdComparator6.thenComparing(kafkaSpoutMessageIdComparator29);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator6;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator32 = kafkaSpoutMessageIdComparator2.thenComparing(kafkaSpoutMessageIdComparator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator32);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement> annotatedElementKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.lang.reflect.AnnotatedElement>(annotatedElementKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory9;
        objKafkaSpout0.consumerAutoCommitMode = true;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor13 = objKafkaSpout0.waitingToEmit;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap14 = objKafkaSpout0.acked;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap14);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator1;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator1;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator4 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator4.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator5;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = kafkaSpoutMessageIdComparator1.thenComparing(kafkaSpoutMessageIdComparator5);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator8 = kafkaSpoutMessageIdComparator5.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator9 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = offsetComparator9.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = kafkaSpoutMessageIdComparator10.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = kafkaSpoutMessageIdComparator11.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator13 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = offsetComparator13.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator14;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator14;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator17 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator18 = offsetComparator17.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator18;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator20 = kafkaSpoutMessageIdComparator14.thenComparing(kafkaSpoutMessageIdComparator18);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator21 = kafkaSpoutMessageIdComparator18.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator22 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = offsetComparator22.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator24 = offsetComparator22.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator25 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator26 = offsetComparator25.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator27 = offsetComparator25.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator28 = kafkaSpoutMessageIdComparator24.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator29 = kafkaSpoutMessageIdComparator21.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator25);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator30 = kafkaSpoutMessageIdComparator11.thenComparing(kafkaSpoutMessageIdComparator21);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator31 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator32 = offsetComparator31.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator33 = offsetComparator31.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator34 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator35 = offsetComparator34.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator36 = offsetComparator34.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator37 = kafkaSpoutMessageIdComparator33.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator34);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator38 = kafkaSpoutMessageIdComparator30.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator34);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator39 = kafkaSpoutMessageIdComparator5.thenComparing(kafkaSpoutMessageIdComparator38);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator40 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator41 = offsetComparator40.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator42 = offsetComparator40.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator43 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator44 = offsetComparator43.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator45 = offsetComparator43.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator46 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator47 = offsetComparator46.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator48 = offsetComparator46.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator49 = kafkaSpoutMessageIdComparator45.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator46);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator50 = offsetComparator40.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator46);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator51 = kafkaSpoutMessageIdComparator5.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator40);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator52 = kafkaSpoutMessageIdComparator5.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator53 = kafkaSpoutMessageIdComparator5.reversed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator53);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig9;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = objKafkaSpout0.kafkaSpoutStreams;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap12 = objKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor13 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.declareOutputFields(outputFieldsDeclarer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor13);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.kafka.common.TopicPartition topicPartition7 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection8 = objKafkaSpout0.toArrayList(topicPartition7);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams9;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = objKafkaSpout0.emitted;
        objKafkaSpout0.initialized = true;
        objKafkaSpout0.numUncommittedOffsets = '#';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = objKafkaSpout0.collector;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor10 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(spoutOutputCollector9);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        boolean boolean7 = objKafkaSpout0.initialized;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap8 = objKafkaSpout0.acked;
        java.lang.String str9 = objKafkaSpout0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str9.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig9;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = objKafkaSpout0.kafkaSpoutStreams;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap12 = objKafkaSpout0.acked;
        boolean boolean13 = objKafkaSpout0.initialized;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = objKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap8 = null;
        objKafkaSpout0.acked = topicPartitionMap8;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = objKafkaSpout0.emitted;
        int int11 = objKafkaSpout0.maxRetries;
        long long12 = objKafkaSpout0.numUncommittedOffsets;
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.ack(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig9;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = objKafkaSpout0.kafkaSpoutStreams;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap12 = objKafkaSpout0.acked;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer13 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer13;
        objKafkaSpout0.initialized = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap12);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objKafkaSpout0.firstPollOffsetStrategy;
        objKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder9;
        boolean boolean11 = objKafkaSpout0.waitingToEmit();
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap12 = objKafkaSpout0.acked;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService13 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap12);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        objKafkaSpout0.initialized = false;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
    }
}
