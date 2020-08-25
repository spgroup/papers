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
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator0 = null;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator0;
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator0 = org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdComparator0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        org.apache.kafka.common.TopicPartition topicPartition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.CharSequence>.OffsetEntry offsetEntry3 = kafkaSpout0.new OffsetEntry(topicPartition1, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$OffsetEntry with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        java.util.concurrent.TimeUnit timeUnit3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.Object>.Timer timer4 = kafkaSpout0.new Timer((long) (byte) 10, 1L, timeUnit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.lang.Comparable<java.lang.String>>.OffsetEntry offsetEntry1 = kafkaSpout0.new OffsetEntry();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$OffsetEntry with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.io.Serializable, java.io.Serializable>.Timer timer1 = kafkaSpout0.new Timer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.lang.CharSequence>.Timer timer1 = kafkaSpout0.new Timer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        org.apache.kafka.common.TopicPartition topicPartition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.io.Serializable>.OffsetEntry offsetEntry3 = kafkaSpout0.new OffsetEntry(topicPartition1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$OffsetEntry with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams2 = null;
        objKafkaSpout1.kafkaSpoutStreams = kafkaSpoutStreams2;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.ack((java.lang.Object) objKafkaSpout1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.storm.kafka.spout.KafkaSpout cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.kafka.common.TopicPartition topicPartition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition5, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setWaitingToEmit(objConsumerRecords3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = objKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.lang.Object obj5 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.fail(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Object cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>(objKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = objKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords6 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setWaitingToEmit(objConsumerRecords6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords7 = objKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>>.OffsetEntry, java.lang.CharSequence> offsetEntryKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>>.OffsetEntry, java.lang.CharSequence> offsetEntryKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>>.OffsetEntry, java.lang.CharSequence>(offsetEntryKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.slf4j.Logger logger0 = null;
        org.apache.storm.kafka.spout.KafkaSpout.LOG = logger0;
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.ack((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.Class<?> wildcardClass3 = objKafkaSpout0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        java.lang.Class<?> wildcardClass3 = kafkaSpoutMessageIdComparator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>>.OffsetEntry, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> offsetEntryKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>>.OffsetEntry, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap5 = objKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = objKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId3 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = offsetComparator0.compare(kafkaSpoutMessageId3, kafkaSpoutMessageId4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        boolean boolean6 = objKafkaSpout0.consumerAutoCommitMode;
        java.util.Map map7 = null;
        org.apache.storm.task.TopologyContext topologyContext8 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.open(map7, topologyContext8, spoutOutputCollector9);
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
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.slf4j.Logger logger0 = org.apache.storm.kafka.spout.KafkaSpout.LOG;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(logger0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = null;
        objKafkaSpout5.kafkaSpoutStreams = kafkaSpoutStreams6;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig8 = null;
        objKafkaSpout5.kafkaSpoutConfig = objKafkaSpoutConfig8;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.ack((java.lang.Object) objKafkaSpoutConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
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
            java.util.Map<java.lang.String, java.lang.Object> strMap9 = objKafkaSpout0.getComponentConfiguration();
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
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        java.util.Map map1 = null;
        org.apache.storm.task.TopologyContext topologyContext2 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.open(map1, topologyContext2, spoutOutputCollector3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer6);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
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
        boolean boolean10 = objKafkaSpout7.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = null;
        objKafkaSpout7.firstPollOffsetStrategy = firstPollOffsetStrategy11;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.fail((java.lang.Object) firstPollOffsetStrategy11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.declareOutputFields(outputFieldsDeclarer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>>.OffsetEntry, org.apache.storm.topology.IRichSpout> offsetEntryKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>>.OffsetEntry, org.apache.storm.topology.IRichSpout>();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        java.util.Map map6 = null;
        org.apache.storm.task.TopologyContext topologyContext7 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.open(map6, topologyContext7, spoutOutputCollector8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder8 = objKafkaSpout0.tuplesBuilder;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = objKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder8);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap9 = objKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = objKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objKafkaSpout0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords8 = objKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord6 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder8 = objKafkaSpout0.tuplesBuilder;
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
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = objKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService8;
        org.apache.kafka.common.TopicPartition topicPartition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition10, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
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
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.shutdown();
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
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> consumerRebalanceListenerKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> consumerRebalanceListenerKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(consumerRebalanceListenerKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = objKafkaSpout0.collector;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = objKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(spoutOutputCollector4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
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
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.fail((java.lang.Object) "KafkaSpout{acked=null, emitted=null}");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
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
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig6 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig6;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
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
            boolean boolean8 = objKafkaSpout0.poll();
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
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        java.util.Map map7 = null;
        org.apache.storm.task.TopologyContext topologyContext8 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.open(map7, topologyContext8, spoutOutputCollector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer5 = objKafkaSpout0.commitTimer;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = objKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig6 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig6;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams8;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords10 = objKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer5 = objKafkaSpout0.commitTimer;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = objKafkaSpout0.toArrayList(topicPartition6);
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId2 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = offsetComparator0.compare(kafkaSpoutMessageId2, kafkaSpoutMessageId3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        boolean boolean7 = objKafkaSpout0.consumerAutoCommitMode;
        objKafkaSpout0.initialized = false;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = objKafkaSpout0.kafkaSpoutStreams;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = objKafkaSpout0.commit();
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
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap7 = objKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        objKafkaSpout0.maxRetries = 10;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.declareOutputFields(outputFieldsDeclarer9);
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
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = objKafkaSpout0.toArrayList(topicPartition6);
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.nextTuple();
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
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.initialized;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = objKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
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
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = objKafkaSpout0.kafkaSpoutStreams;
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
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig4 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig4;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = objKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = objKafkaSpout0.toArrayList(topicPartition6);
        boolean boolean8 = objKafkaSpout0.consumerAutoCommitMode;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objKafkaSpout0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = objKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap8 = null;
        objKafkaSpout0.acked = topicPartitionMap8;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
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
            boolean boolean23 = objKafkaSpout0.commit();
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
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>> kafkaSpoutMessageIdSetKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>> kafkaSpoutMessageIdSetKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>>(kafkaSpoutMessageIdSetKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.kafka.common.TopicPartition topicPartition4 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection5 = objKafkaSpout0.toArrayList(topicPartition4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords6 = objKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder5 = objKafkaSpout0.tuplesBuilder;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.common.TopicPartition topicPartition8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition8, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
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
        int int10 = objKafkaSpout0.maxRetries;
        java.lang.Class<?> wildcardClass11 = objKafkaSpout0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
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
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objKafkaSpout0.retryService;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer8 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer8;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = objKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = objKafkaSpout0.toArrayList(topicPartition6);
        boolean boolean8 = objKafkaSpout0.consumerAutoCommitMode;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap9 = null;
        objKafkaSpout0.acked = topicPartitionMap9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.maxRetries = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = objKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator1;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator1;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator4 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator4.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator5;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = kafkaSpoutMessageIdComparator1.thenComparing(kafkaSpoutMessageIdComparator5);
        java.lang.Class<?> wildcardClass8 = kafkaSpoutMessageIdComparator5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
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
            objKafkaSpout0.activate();
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
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig6 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig6;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams8;
        objKafkaSpout0.maxRetries = 10;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = objKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
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
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector10 = objKafkaSpout0.collector;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.deactivate();
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
        org.junit.Assert.assertNull(spoutOutputCollector10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>>.OffsetEntry> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>>.OffsetEntry>();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objKafkaSpout0.retryService;
        org.apache.kafka.common.TopicPartition topicPartition8 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection9 = objKafkaSpout0.toArrayList(topicPartition8);
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
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
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
        org.junit.Assert.assertNull(objConsumerRecordItor8);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        int int6 = objKafkaSpout0.maxRetries;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId1 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = offsetComparator0.compare(kafkaSpoutMessageId1, kafkaSpoutMessageId2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        java.lang.String str7 = objKafkaSpout0.toString();
        objKafkaSpout0.initialized = false;
        java.lang.String str10 = objKafkaSpout0.toString();
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.declareOutputFields(outputFieldsDeclarer11);
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str10.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.kafka.common.TopicPartition topicPartition4 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection5 = objKafkaSpout0.toArrayList(topicPartition4);
        java.lang.Class<?> wildcardClass6 = objKafkaSpout0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        long long9 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout10 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = null;
        objKafkaSpout10.kafkaSpoutStreams = kafkaSpoutStreams11;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = null;
        objKafkaSpout10.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        boolean boolean15 = objKafkaSpout10.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig16 = null;
        objKafkaSpout10.kafkaSpoutConfig = objKafkaSpoutConfig16;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.ack((java.lang.Object) objKafkaSpoutConfig16);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        boolean boolean9 = objKafkaSpout0.initialized;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = objKafkaSpout0.getComponentConfiguration();
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
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objKafkaSpout0.firstPollOffsetStrategy;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.subscribeKafkaConsumer();
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
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
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
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator10 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = offsetComparator10.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = offsetComparator10.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator13 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = offsetComparator13.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator13.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = kafkaSpoutMessageIdComparator12.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator13);
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.ack((java.lang.Object) kafkaSpoutMessageIdComparator16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Comparator$$Lambda$213/1215065375 cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = offsetComparator3.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator3.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator6 = kafkaSpoutMessageIdComparator2.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator8 = kafkaSpoutMessageIdComparator6.thenComparing(kafkaSpoutMessageIdComparator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        objKafkaSpout0.initialized = true;
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams6;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.declareOutputFields(outputFieldsDeclarer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = objKafkaSpout0.toArrayList(topicPartition6);
        boolean boolean8 = objKafkaSpout0.consumerAutoCommitMode;
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
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord4 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
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
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout11 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        objKafkaSpout11.kafkaSpoutStreams = kafkaSpoutStreams12;
        java.lang.String str14 = objKafkaSpout11.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder15 = null;
        objKafkaSpout11.tuplesBuilder = objKafkaSpoutTuplesBuilder15;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer17 = objKafkaSpout11.commitTimer;
        java.lang.String str18 = objKafkaSpout11.toString();
        objKafkaSpout11.initialized = false;
        java.lang.String str21 = objKafkaSpout11.toString();
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.fail((java.lang.Object) objKafkaSpout11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.storm.kafka.spout.KafkaSpout cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str14.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str18.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str21.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = objKafkaSpout0.commit();
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
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
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
        objKafkaSpout0.consumerAutoCommitMode = false;
        long long14 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        java.util.Map map6 = null;
        org.apache.storm.task.TopologyContext topologyContext7 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.open(map6, topologyContext7, spoutOutputCollector8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        java.lang.String str7 = objKafkaSpout0.toString();
        objKafkaSpout0.initialized = false;
        java.lang.String str10 = objKafkaSpout0.toString();
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
        org.junit.Assert.assertNull(timer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str10.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        objKafkaSpout0.maxRetries = 10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = objKafkaSpout0.kafkaSpoutConfig;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.close();
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
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        objKafkaSpout0.consumerAutoCommitMode = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords9 = objKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor6 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor6;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap3 = objKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder5 = objKafkaSpout0.tuplesBuilder;
        boolean boolean6 = objKafkaSpout0.waitingToEmit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = objKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objKafkaSpout0.kafkaSpoutStreams;
        objKafkaSpout0.initialized = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
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
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = offsetComparator9.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator12 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = offsetComparator12.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = offsetComparator12.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = kafkaSpoutMessageIdComparator11.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = kafkaSpoutMessageIdComparator8.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12);
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId17 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = offsetComparator12.compare(kafkaSpoutMessageId17, kafkaSpoutMessageId18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = objKafkaSpout0.getWildCardTopics();
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
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
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
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        java.lang.String str7 = objKafkaSpout0.toString();
        objKafkaSpout0.initialized = false;
        java.lang.String str10 = objKafkaSpout0.toString();
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.subscribeKafkaConsumer();
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
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str10.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = objKafkaSpout0.collector;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
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
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
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
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout11 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        objKafkaSpout11.kafkaSpoutStreams = kafkaSpoutStreams12;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService14 = null;
        objKafkaSpout11.retryService = kafkaSpoutRetryService14;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor16 = objKafkaSpout11.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor17 = null;
        objKafkaSpout11.waitingToEmit = objConsumerRecordItor17;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor19 = objKafkaSpout11.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService20 = null;
        objKafkaSpout11.retryService = kafkaSpoutRetryService20;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.ack((java.lang.Object) objKafkaSpout11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.storm.kafka.spout.KafkaSpout cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor19);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        java.lang.String str7 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector8 = objKafkaSpout0.collector;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.shutdown();
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
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = objKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        java.lang.String str7 = objKafkaSpout0.toString();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord8 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord8);
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
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap6 = objKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer4 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer4;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
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
            objKafkaSpout0.commitOffsetsForAckedTuples();
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
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = objKafkaSpout0.poll();
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
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        java.lang.Class<?> wildcardClass7 = objKafkaSpout0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig4 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig4;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
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
        org.apache.kafka.common.TopicPartition topicPartition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition11, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.kafka.common.TopicPartition topicPartition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition5, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy7;
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objKafkaSpout0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        org.apache.kafka.common.TopicPartition topicPartition5 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection6 = objKafkaSpout0.toArrayList(topicPartition5);
        java.lang.Class<?> wildcardClass7 = topicPartitionCollection6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
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
        org.apache.kafka.common.TopicPartition topicPartition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition12, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
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
        boolean boolean12 = objKafkaSpout0.consumerAutoCommitMode;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder5 = objKafkaSpout0.tuplesBuilder;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer8 = objKafkaSpout0.kafkaConsumer;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer8);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
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
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emit();
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
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig5 = objKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        objKafkaSpout0.numUncommittedOffsets = (byte) 1;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer6);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
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
        org.junit.Assert.assertNull(firstPollOffsetStrategy6);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig4 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig4;
        java.lang.Class<?> wildcardClass6 = objKafkaSpout0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseRichSpout, org.apache.storm.topology.IRichSpout> baseRichSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseRichSpout, org.apache.storm.topology.IRichSpout>();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
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
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = objKafkaSpout0.kafkaSpoutStreams;
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
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        boolean boolean6 = objKafkaSpout0.consumerAutoCommitMode;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = objKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer10 = objKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout11 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = null;
        objKafkaSpout11.kafkaSpoutStreams = kafkaSpoutStreams12;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = null;
        objKafkaSpout11.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        objKafkaSpout11.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer18 = objKafkaSpout11.kafkaConsumer;
        boolean boolean19 = objKafkaSpout11.waitingToEmit();
        objKafkaSpout11.initialized = true;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.fail((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.kafka.common.TopicPartition topicPartition4 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection5 = objKafkaSpout0.toArrayList(topicPartition4);
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
        org.junit.Assert.assertNotNull(topicPartitionCollection5);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor6 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor6;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator1;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator1;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator4 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator4.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator5;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = kafkaSpoutMessageIdComparator1.thenComparing(kafkaSpoutMessageIdComparator5);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = kafkaSpoutMessageIdComparator5.thenComparing(kafkaSpoutMessageIdComparator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
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
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer11 = objKafkaSpout0.kafkaConsumer;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emit();
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
        org.junit.Assert.assertNull(timer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer11);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.kafka.common.TopicPartition topicPartition7 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection8 = objKafkaSpout0.toArrayList(topicPartition7);
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
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection8);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
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
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray11 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet12 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet12, kafkaSpoutMessageIdArray11);
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet12;
        org.apache.kafka.common.TopicPartition topicPartition15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition15, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.kafka.common.TopicPartition topicPartition4 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection5 = objKafkaSpout0.toArrayList(topicPartition4);
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
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
        int int12 = objKafkaSpout0.maxRetries;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer4 = objKafkaSpout0.kafkaConsumer;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.close();
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
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setWaitingToEmit(objConsumerRecords9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
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
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer11 = objKafkaSpout0.kafkaConsumer;
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
        org.junit.Assert.assertNull(timer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer11);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = objKafkaSpout0.getWildCardTopics();
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
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig6 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig6;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams8;
        objKafkaSpout0.maxRetries = 10;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = objKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams7;
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
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap8 = null;
        objKafkaSpout0.acked = topicPartitionMap8;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = objKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = objKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer6);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        boolean boolean7 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder8 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
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
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setWaitingToEmit(objConsumerRecords11);
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
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory1 = objKafkaSpout0.kafkaConsumerFactory;
        objKafkaSpout0.numUncommittedOffsets = (-1);
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor4 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor4;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        boolean boolean5 = objKafkaSpout0.waitingToEmit();
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.kafka.common.TopicPartition topicPartition7 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection8 = objKafkaSpout0.toArrayList(topicPartition7);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout9 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = null;
        objKafkaSpout9.kafkaSpoutStreams = kafkaSpoutStreams10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy12 = null;
        objKafkaSpout9.firstPollOffsetStrategy = firstPollOffsetStrategy12;
        objKafkaSpout9.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer16 = objKafkaSpout9.kafkaConsumer;
        boolean boolean17 = objKafkaSpout9.waitingToEmit();
        long long18 = objKafkaSpout9.numUncommittedOffsets;
        objKafkaSpout9.consumerAutoCommitMode = false;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.fail((java.lang.Object) objKafkaSpout9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.storm.kafka.spout.KafkaSpout cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = objKafkaSpout0.collector;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        long long7 = objKafkaSpout0.numUncommittedOffsets;
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
        org.junit.Assert.assertNull(spoutOutputCollector4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        boolean boolean6 = objKafkaSpout0.consumerAutoCommitMode;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = objKafkaSpout0.tuplesBuilder;
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
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder9);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
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
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
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
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.shutdown();
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
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory1 = objKafkaSpout0.kafkaConsumerFactory;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords2 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setWaitingToEmit(objConsumerRecords2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.kafka.common.TopicPartition topicPartition5 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition5, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.maxRetries = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor11);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = objKafkaSpout0.toArrayList(topicPartition6);
        boolean boolean8 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setWaitingToEmit(objConsumerRecords9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
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
            objKafkaSpout0.doSeekRetriableTopicPartitions();
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
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        boolean boolean6 = objKafkaSpout0.consumerAutoCommitMode;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = objKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer10 = objKafkaSpout0.commitTimer;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = objKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = objKafkaSpout0.firstPollOffsetStrategy;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy5);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = objKafkaSpout0.emitted;
        boolean boolean6 = objKafkaSpout0.waitingToEmit();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap7 = objKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objKafkaSpout0.retryService;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer8 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService11;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory13 = objKafkaSpout0.kafkaConsumerFactory;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory13);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
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
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.ack(obj11);
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
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = objKafkaSpout0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap9 = objKafkaSpout0.getComponentConfiguration();
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
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = objKafkaSpout0.getWildCardTopics();
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
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
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
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.initialized;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap4 = objKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = kafkaSpoutMessageIdComparator1.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator2;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = kafkaSpoutMessageIdComparator2.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = kafkaSpoutMessageIdComparator4.reversed();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap7 = objKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout9 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = null;
        objKafkaSpout9.kafkaSpoutStreams = kafkaSpoutStreams10;
        boolean boolean12 = objKafkaSpout9.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = null;
        objKafkaSpout9.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = objKafkaSpout9.kafkaSpoutStreams;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.ack((java.lang.Object) objKafkaSpout9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.storm.kafka.spout.KafkaSpout cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams15);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
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
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder5 = objKafkaSpout0.tuplesBuilder;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer8 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = objKafkaSpout0.tuplesBuilder;
        org.apache.kafka.common.TopicPartition topicPartition10 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection11 = objKafkaSpout0.toArrayList(topicPartition10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection11);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
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
        org.apache.kafka.common.TopicPartition topicPartition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition11, 100L);
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
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = objKafkaSpout0.kafkaSpoutStreams;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap5 = objKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = offsetComparator3.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator3.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator6 = kafkaSpoutMessageIdComparator2.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3);
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId7 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = offsetComparator3.compare(kafkaSpoutMessageId7, kafkaSpoutMessageId8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
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
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = objKafkaSpout0.kafkaSpoutStreams;
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
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
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
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.shutdown();
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
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = objKafkaSpout0.kafkaSpoutConfig;
        int int4 = objKafkaSpout0.maxRetries;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.declareOutputFields(outputFieldsDeclarer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        org.apache.kafka.common.TopicPartition topicPartition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition9, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = objKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = objKafkaSpout0.poll();
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
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        boolean boolean7 = objKafkaSpout0.initialized;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = null;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet8;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer10 = objKafkaSpout0.kafkaConsumer;
        java.util.Map map11 = null;
        org.apache.storm.task.TopologyContext topologyContext12 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.open(map11, topologyContext12, spoutOutputCollector13);
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
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
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
            java.lang.String str13 = objKafkaSpout0.getWildCardTopics();
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
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        org.apache.kafka.common.TopicPartition topicPartition5 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection6 = objKafkaSpout0.toArrayList(topicPartition5);
        java.util.Map map7 = null;
        org.apache.storm.task.TopologyContext topologyContext8 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.open(map7, topologyContext8, spoutOutputCollector9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection6);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
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
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector10 = objKafkaSpout0.collector;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setWaitingToEmit(objConsumerRecords11);
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
        org.junit.Assert.assertNull(spoutOutputCollector10);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
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
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.close();
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
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>> annotatedElementKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.lang.Comparable<java.lang.String>>();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap7 = objKafkaSpout0.acked;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap7);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout3 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = null;
        objKafkaSpout3.kafkaSpoutStreams = kafkaSpoutStreams4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = null;
        objKafkaSpout3.firstPollOffsetStrategy = firstPollOffsetStrategy6;
        objKafkaSpout3.initialized = true;
        objKafkaSpout3.consumerAutoCommitMode = true;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.ack((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objKafkaSpout0.retryService;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer8 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = objKafkaSpout0.kafkaSpoutStreams;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet11 = objKafkaSpout0.emitted;
        objKafkaSpout0.initialized = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = objKafkaSpout0.toArrayList(topicPartition6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = objKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        boolean boolean7 = objKafkaSpout0.consumerAutoCommitMode;
        objKafkaSpout0.initialized = false;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.storm.topology.IComponent>.KafkaSpoutConsumerRebalanceListener>.Timer timer1 = kafkaSpout0.new Timer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$Timer with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = objKafkaSpout0.toArrayList(topicPartition6);
        boolean boolean8 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory1 = objKafkaSpout0.kafkaConsumerFactory;
        objKafkaSpout0.numUncommittedOffsets = (-1);
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor4 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor4;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
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
        org.junit.Assert.assertNull(objKafkaSpoutConfig9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet10);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objKafkaSpout0.retryService;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap7 = objKafkaSpout0.acked;
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
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap7);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objKafkaSpout0.kafkaSpoutStreams;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = objKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory1 = objKafkaSpout0.kafkaConsumerFactory;
        objKafkaSpout0.numUncommittedOffsets = (-1);
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor4 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout6 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        objKafkaSpout6.kafkaSpoutStreams = kafkaSpoutStreams7;
        boolean boolean9 = objKafkaSpout6.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig10 = null;
        objKafkaSpout6.kafkaSpoutConfig = objKafkaSpoutConfig10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig12 = null;
        objKafkaSpout6.kafkaSpoutConfig = objKafkaSpoutConfig12;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.fail((java.lang.Object) objKafkaSpoutConfig12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig6 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig6;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout8 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = null;
        objKafkaSpout8.kafkaSpoutStreams = kafkaSpoutStreams9;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        objKafkaSpout8.retryService = kafkaSpoutRetryService11;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor13 = objKafkaSpout8.waitingToEmit;
        long long14 = objKafkaSpout8.numUncommittedOffsets;
        boolean boolean15 = objKafkaSpout8.initialized;
        long long16 = objKafkaSpout8.numUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.ack((java.lang.Object) long16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = kafkaSpoutMessageIdComparator1.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator3 = kafkaSpoutMessageIdComparator2.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator2;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = kafkaSpoutMessageIdComparator2.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator2;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService7;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.deactivate();
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
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.lang.String> annotatedElementKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.lang.String>();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
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
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer11 = objKafkaSpout0.kafkaConsumer;
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer11);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord10);
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
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory1 = objKafkaSpout0.kafkaConsumerFactory;
        org.apache.kafka.common.TopicPartition topicPartition2 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition2, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
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
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = objKafkaSpout0.kafkaSpoutStreams;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = objKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer5 = objKafkaSpout0.commitTimer;
        objKafkaSpout0.consumerAutoCommitMode = true;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer5);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams6;
        boolean boolean8 = objKafkaSpout0.consumerAutoCommitMode;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
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
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.activate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap12);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = offsetComparator3.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator3.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = offsetComparator6.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator8 = offsetComparator6.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = kafkaSpoutMessageIdComparator5.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = offsetComparator0.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6);
        java.lang.Class<?> wildcardClass11 = kafkaSpoutMessageIdComparator10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
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
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer10);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
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
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord12);
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
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = objKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer4 = objKafkaSpout0.kafkaConsumer;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = objKafkaSpout0.commit();
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
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = topicPartitionMap10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap10);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor6 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor6;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        org.apache.kafka.common.TopicPartition topicPartition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition9, (long) (short) 0);
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
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
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
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
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
        org.junit.Assert.assertNull(topicPartitionMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        boolean boolean7 = objKafkaSpout0.consumerAutoCommitMode;
        objKafkaSpout0.initialized = false;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector10 = null;
        objKafkaSpout0.collector = spoutOutputCollector10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = objKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setWaitingToEmit(objConsumerRecords9);
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
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = objKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = objKafkaSpout0.retryService;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords6 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setWaitingToEmit(objConsumerRecords6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(spoutOutputCollector4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService5);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
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
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer11 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer11;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService13 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap10);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        boolean boolean6 = objKafkaSpout0.consumerAutoCommitMode;
        objKafkaSpout0.initialized = true;
        long long9 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator10 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = offsetComparator10.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator12 = offsetComparator10.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator13 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = offsetComparator13.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = offsetComparator13.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator16 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator17 = offsetComparator16.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator18 = offsetComparator16.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator19 = kafkaSpoutMessageIdComparator15.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator16);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator20 = offsetComparator10.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator16);
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.ack((java.lang.Object) offsetComparator10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.storm.kafka.spout.KafkaSpout$OffsetComparator cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
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
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = kafkaSpoutMessageIdComparator1.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator2;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = kafkaSpoutMessageIdComparator2.reversed();
        java.lang.Class<?> wildcardClass5 = kafkaSpoutMessageIdComparator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
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
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.declareOutputFields(outputFieldsDeclarer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor11);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objKafkaSpout0.retryService;
        java.util.Map map8 = null;
        org.apache.storm.task.TopologyContext topologyContext9 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.open(map8, topologyContext9, spoutOutputCollector10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
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
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        boolean boolean6 = objKafkaSpout0.consumerAutoCommitMode;
        objKafkaSpout0.initialized = true;
        boolean boolean9 = objKafkaSpout0.consumerAutoCommitMode;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = objKafkaSpout0.getWildCardTopics();
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
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
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
        int int15 = objKafkaSpout0.maxRetries;
        org.apache.kafka.common.TopicPartition topicPartition16 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition16, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
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
        org.apache.kafka.common.TopicPartition topicPartition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition11, (long) (byte) 100);
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
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
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
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
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
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.commitOffsetsForAckedTuples();
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
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.String, org.apache.storm.topology.IRichSpout> strKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.storm.topology.IRichSpout> strKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.storm.topology.IRichSpout>(strKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = objKafkaSpout0.emitted;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor6 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet5);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
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
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig11 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig11;
        boolean boolean13 = objKafkaSpout0.initialized;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = objKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams7;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap9 = objKafkaSpout0.acked;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder10 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap9);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder5 = objKafkaSpout0.tuplesBuilder;
        objKafkaSpout0.initialized = true;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder5);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdCollectionKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
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
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
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
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = offsetComparator9.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator12 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = offsetComparator12.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = offsetComparator12.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = kafkaSpoutMessageIdComparator11.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = kafkaSpoutMessageIdComparator8.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator8;
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
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator16);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objKafkaSpout0.retryService;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer8 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService11;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
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
        objKafkaSpout0.initialized = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        boolean boolean7 = objKafkaSpout0.consumerAutoCommitMode;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
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
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        boolean boolean6 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray9 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet10, kafkaSpoutMessageIdArray9);
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig13 = objKafkaSpout0.kafkaSpoutConfig;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig13);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.storm.topology.IComponent>.KafkaSpoutConsumerRebalanceListener, org.apache.storm.spout.ISpout> kafkaSpoutConsumerRebalanceListenerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.storm.topology.IComponent>.KafkaSpoutConsumerRebalanceListener, org.apache.storm.spout.ISpout>();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor7 = objKafkaSpout0.waitingToEmit;
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
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor7);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
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
            objKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig6 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig6;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap8 = objKafkaSpout0.acked;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout9 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = null;
        objKafkaSpout9.kafkaSpoutStreams = kafkaSpoutStreams10;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = null;
        objKafkaSpout9.retryService = kafkaSpoutRetryService12;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory14 = null;
        objKafkaSpout9.kafkaConsumerFactory = kafkaConsumerFactory14;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory16 = null;
        objKafkaSpout9.kafkaConsumerFactory = kafkaConsumerFactory16;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.fail((java.lang.Object) kafkaConsumerFactory16);
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
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
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
            objKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = objKafkaSpout0.poll();
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
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
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
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder12 = objKafkaSpout0.tuplesBuilder;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.declareOutputFields(outputFieldsDeclarer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder12);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer3 = objKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory4 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout6 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        objKafkaSpout6.kafkaSpoutStreams = kafkaSpoutStreams7;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = null;
        objKafkaSpout6.retryService = kafkaSpoutRetryService9;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory11 = null;
        objKafkaSpout6.kafkaConsumerFactory = kafkaConsumerFactory11;
        objKafkaSpout6.numUncommittedOffsets = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.fail((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Short cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer3);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>>.OffsetEntry, org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.storm.topology.IComponent>.KafkaSpoutConsumerRebalanceListener> offsetEntryKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>>.OffsetEntry, org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.storm.topology.IComponent>.KafkaSpoutConsumerRebalanceListener>();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor6 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor6;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap9 = objKafkaSpout0.acked;
        objKafkaSpout0.maxRetries = ' ';
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap9);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
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
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams14 = objKafkaSpout0.kafkaSpoutStreams;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = objKafkaSpout0.getNamedTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams14);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
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
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig11 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig11;
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
        org.junit.Assert.assertNull(topicPartitionMap10);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = objKafkaSpout0.firstPollOffsetStrategy;
        objKafkaSpout0.initialized = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy8);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
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
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig13 = objKafkaSpout0.kafkaSpoutConfig;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap14 = objKafkaSpout0.getComponentConfiguration();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig13);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        objKafkaSpout0.maxRetries = 10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = objKafkaSpout0.kafkaSpoutConfig;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.shutdown();
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
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
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
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.declareOutputFields(outputFieldsDeclarer11);
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
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder5 = objKafkaSpout0.tuplesBuilder;
        objKafkaSpout0.initialized = true;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = objKafkaSpout0.emitted;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet8);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
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
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord15);
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
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        org.apache.kafka.common.TopicPartition topicPartition5 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection6 = objKafkaSpout0.toArrayList(topicPartition5);
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        org.apache.kafka.common.TopicPartition topicPartition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition9, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection6);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>, java.lang.CharSequence>.KafkaSpoutConsumerRebalanceListener kafkaSpoutConsumerRebalanceListener1 = kafkaSpout0.new KafkaSpoutConsumerRebalanceListener();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$KafkaSpoutConsumerRebalanceListener with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
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
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId30 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId31 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int32 = offsetComparator25.compare(kafkaSpoutMessageId30, kafkaSpoutMessageId31);
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
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = objKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = objKafkaSpout0.retryService;
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
        org.junit.Assert.assertNull(kafkaSpoutRetryService8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService9);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        boolean boolean7 = objKafkaSpout0.initialized;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = null;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet8;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout10 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = null;
        objKafkaSpout10.kafkaSpoutStreams = kafkaSpoutStreams11;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = null;
        objKafkaSpout10.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig15 = objKafkaSpout10.kafkaSpoutConfig;
        int int16 = objKafkaSpout10.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout17 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams18 = null;
        objKafkaSpout17.kafkaSpoutStreams = kafkaSpoutStreams18;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy20 = null;
        objKafkaSpout17.firstPollOffsetStrategy = firstPollOffsetStrategy20;
        boolean boolean22 = objKafkaSpout17.initialized;
        boolean boolean23 = objKafkaSpout17.initialized;
        org.apache.kafka.common.TopicPartition topicPartition24 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection25 = objKafkaSpout17.toArrayList(topicPartition24);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams26 = null;
        objKafkaSpout17.kafkaSpoutStreams = kafkaSpoutStreams26;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout28 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams29 = null;
        objKafkaSpout28.kafkaSpoutStreams = kafkaSpoutStreams29;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy31 = null;
        objKafkaSpout28.firstPollOffsetStrategy = firstPollOffsetStrategy31;
        objKafkaSpout28.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer35 = objKafkaSpout28.kafkaConsumer;
        boolean boolean36 = objKafkaSpout28.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder37 = null;
        objKafkaSpout28.tuplesBuilder = objKafkaSpoutTuplesBuilder37;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout39 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams40 = null;
        objKafkaSpout39.kafkaSpoutStreams = kafkaSpoutStreams40;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy42 = null;
        objKafkaSpout39.firstPollOffsetStrategy = firstPollOffsetStrategy42;
        objKafkaSpout39.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray46 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet47 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet47, kafkaSpoutMessageIdArray46);
        objKafkaSpout39.emitted = kafkaSpoutMessageIdSet47;
        objKafkaSpout28.emitted = kafkaSpoutMessageIdSet47;
        objKafkaSpout17.emitted = kafkaSpoutMessageIdSet47;
        objKafkaSpout10.emitted = kafkaSpoutMessageIdSet47;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet47;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
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
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy13;
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
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        java.lang.Class<?> wildcardClass4 = objKafkaSpout0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
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
        java.util.Map map11 = null;
        org.apache.storm.task.TopologyContext topologyContext12 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.open(map11, topologyContext12, spoutOutputCollector13);
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
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer4 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout6 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        objKafkaSpout6.kafkaSpoutStreams = kafkaSpoutStreams7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        objKafkaSpout6.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        boolean boolean11 = objKafkaSpout6.initialized;
        boolean boolean12 = objKafkaSpout6.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = null;
        objKafkaSpout6.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray15 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet16 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet16, kafkaSpoutMessageIdArray15);
        objKafkaSpout6.emitted = kafkaSpoutMessageIdSet16;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet16;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = objKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig6 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig6;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams8;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, org.apache.storm.topology.base.BaseComponent> iSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, org.apache.storm.topology.base.BaseComponent>();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = objKafkaSpout0.collector;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord7 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord7);
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
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams7;
        org.apache.kafka.common.TopicPartition topicPartition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition9, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objKafkaSpout0.retryService;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer8 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer8;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService11 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService11;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy13;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer15 = objKafkaSpout0.kafkaConsumer;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer15);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        objKafkaSpout0.consumerAutoCommitMode = true;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = objKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService10 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(spoutOutputCollector9);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = null;
        objKafkaSpout0.collector = spoutOutputCollector6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
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
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = objKafkaSpout0.firstPollOffsetStrategy;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy14);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objKafkaSpout0.retryService;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = null;
        objKafkaSpout0.collector = spoutOutputCollector7;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.nextTuple();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
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
        java.util.Map map12 = null;
        org.apache.storm.task.TopologyContext topologyContext13 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.open(map12, topologyContext13, spoutOutputCollector14);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory1 = objKafkaSpout0.kafkaConsumerFactory;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap2 = null;
        objKafkaSpout0.acked = topicPartitionMap2;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory1);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
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
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet10);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> annotatedElementKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService6 = objKafkaSpout0.retryService;
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
        org.junit.Assert.assertNull(kafkaSpoutRetryService6);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.storm.kafka.spout.KafkaSpout kafkaSpout0 = null;
        org.apache.kafka.common.TopicPartition topicPartition1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, java.io.Serializable>.OffsetEntry offsetEntry3 = kafkaSpout0.new OffsetEntry(topicPartition1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.apache.storm.kafka.spout.KafkaSpout$OffsetEntry with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
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
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService13 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(spoutOutputCollector4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet12);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        boolean boolean6 = objKafkaSpout0.initialized;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.deactivate();
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
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig5 = objKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        objKafkaSpout0.numUncommittedOffsets = (byte) 1;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder9;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = objKafkaSpout0.kafkaSpoutStreams;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = objKafkaSpout0.kafkaSpoutConfig;
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
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig9);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.maxRetries = (short) -1;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.kafka.common.TopicPartition topicPartition8 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection9 = objKafkaSpout0.toArrayList(topicPartition8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection9);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig6 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig6;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = objKafkaSpout0.kafkaSpoutStreams;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = objKafkaSpout0.emitted;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet9);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
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
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams14 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer15 = objKafkaSpout0.kafkaConsumer;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer15);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
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
        java.lang.Class<?> wildcardClass13 = objKafkaSpout0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
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
            java.lang.String str13 = objKafkaSpout0.getWildCardTopics();
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
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = objKafkaSpout0.retryService;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutRetryService7);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = objKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
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
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig11 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig11;
        boolean boolean13 = objKafkaSpout0.initialized;
        boolean boolean14 = objKafkaSpout0.consumerAutoCommitMode;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
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
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory14 = objKafkaSpout0.kafkaConsumerFactory;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory14);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
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
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.declareOutputFields(outputFieldsDeclarer14);
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
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer3 = objKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory4 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory4;
        boolean boolean6 = objKafkaSpout0.initialized;
        java.lang.String str7 = objKafkaSpout0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        boolean boolean7 = objKafkaSpout0.consumerAutoCommitMode;
        objKafkaSpout0.initialized = false;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords10 = objKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
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
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId17 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = offsetComparator11.compare(kafkaSpoutMessageId17, kafkaSpoutMessageId18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = objKafkaSpout0.firstPollOffsetStrategy;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection7 = objKafkaSpout0.toArrayList(topicPartition6);
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection7);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        objKafkaSpout0.maxRetries = 10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = objKafkaSpout0.kafkaSpoutConfig;
        org.apache.kafka.common.TopicPartition topicPartition10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition10, (long) (short) 10);
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
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
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
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder12 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder12;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer14 = objKafkaSpout0.commitTimer;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer14);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
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
        objKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy14 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str11.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
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
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy23 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy23;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer25 = objKafkaSpout0.commitTimer;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer25);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
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
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.declareOutputFields(outputFieldsDeclarer14);
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
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.spout.ISpout, java.lang.CharSequence> iSpoutKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.lang.CharSequence> iSpoutKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.lang.CharSequence>(iSpoutKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        objKafkaSpout0.numUncommittedOffsets = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = objKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
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
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = objKafkaSpout0.kafkaSpoutStreams;
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
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
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
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId25 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = offsetComparator20.compare(kafkaSpoutMessageId25, kafkaSpoutMessageId26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
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
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray11 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet12 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet12, kafkaSpoutMessageIdArray11);
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet12;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords15 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setWaitingToEmit(objConsumerRecords15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
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
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdCollectionKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        boolean boolean7 = objKafkaSpout0.initialized;
        long long8 = objKafkaSpout0.numUncommittedOffsets;
        objKafkaSpout0.maxRetries = (-1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory1 = objKafkaSpout0.kafkaConsumerFactory;
        objKafkaSpout0.numUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams4;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory1);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
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
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.declareOutputFields(outputFieldsDeclarer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
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
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator2;
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
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
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
        org.apache.kafka.common.TopicPartition topicPartition12 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection13 = objKafkaSpout0.toArrayList(topicPartition12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection13);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams7;
        java.lang.Class<?> wildcardClass9 = objKafkaSpout0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
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
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector10 = objKafkaSpout0.collector;
        boolean boolean11 = objKafkaSpout0.waitingToEmit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(spoutOutputCollector10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
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
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator11 = offsetComparator9.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator12 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator13 = offsetComparator12.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator14 = offsetComparator12.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator15 = kafkaSpoutMessageIdComparator11.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator16 = kafkaSpoutMessageIdComparator8.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator12);
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator17 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator18 = offsetComparator17.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator19 = offsetComparator17.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator20 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator21 = offsetComparator20.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator22 = offsetComparator20.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator23 = kafkaSpoutMessageIdComparator19.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator20);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator24 = offsetComparator12.thenComparing(kafkaSpoutMessageIdComparator19);
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId25 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = offsetComparator12.compare(kafkaSpoutMessageId25, kafkaSpoutMessageId26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        java.lang.String str9 = objKafkaSpout0.toString();
        objKafkaSpout0.consumerAutoCommitMode = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str9.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords12 = objKafkaSpout0.pollKafkaBroker();
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
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        boolean boolean7 = objKafkaSpout0.initialized;
        long long8 = objKafkaSpout0.numUncommittedOffsets;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = objKafkaSpout0.commit();
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
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
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
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector26 = objKafkaSpout0.collector;
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
        org.junit.Assert.assertNull(spoutOutputCollector26);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords15 = objKafkaSpout0.pollKafkaBroker();
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
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        long long9 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory10 = objKafkaSpout0.kafkaConsumerFactory;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaConsumerFactory10);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = offsetComparator3.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator3.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator6 = kafkaSpoutMessageIdComparator2.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator3);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator2;
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
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder5 = objKafkaSpout0.tuplesBuilder;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer8 = objKafkaSpout0.kafkaConsumer;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setWaitingToEmit(objConsumerRecords9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer8);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
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
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer11 = objKafkaSpout0.kafkaConsumer;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer11);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
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
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor11 = objKafkaSpout0.waitingToEmit;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor11);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        boolean boolean7 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer8 = objKafkaSpout0.commitTimer;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer8);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords13 = objKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = kafkaSpoutMessageIdSet11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        boolean boolean7 = objKafkaSpout0.initialized;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = null;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet8;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder10 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder10;
        org.apache.kafka.common.TopicPartition topicPartition12 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition12, (long) ' ');
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
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        objKafkaSpout0.numUncommittedOffsets = (byte) -1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout10 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams11 = null;
        objKafkaSpout10.kafkaSpoutStreams = kafkaSpoutStreams11;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer13 = objKafkaSpout10.commitTimer;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory14 = null;
        objKafkaSpout10.kafkaConsumerFactory = kafkaConsumerFactory14;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.fail((java.lang.Object) objKafkaSpout10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.storm.kafka.spout.KafkaSpout cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer13);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = objKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout6 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        objKafkaSpout6.kafkaSpoutStreams = kafkaSpoutStreams7;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = null;
        objKafkaSpout6.firstPollOffsetStrategy = firstPollOffsetStrategy9;
        objKafkaSpout6.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer13 = objKafkaSpout6.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor14 = objKafkaSpout6.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = objKafkaSpout6.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams16 = null;
        objKafkaSpout6.kafkaSpoutStreams = kafkaSpoutStreams16;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.ack((java.lang.Object) objKafkaSpout6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.storm.kafka.spout.KafkaSpout cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams15);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
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
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setWaitingToEmit(objConsumerRecords13);
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
        org.junit.Assert.assertNull(firstPollOffsetStrategy12);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
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
        boolean boolean11 = objKafkaSpout0.initialized;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer3 = objKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory4 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory4;
        java.lang.String str6 = objKafkaSpout0.toString();
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str6.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = objKafkaSpout0.kafkaSpoutConfig;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord10);
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
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
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
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap12 = objKafkaSpout0.acked;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.declareOutputFields(outputFieldsDeclarer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap12);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        boolean boolean5 = objKafkaSpout0.waitingToEmit();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = objKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        boolean boolean6 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray9 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet10, kafkaSpoutMessageIdArray9);
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig13 = objKafkaSpout0.kafkaSpoutConfig;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = objKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig13);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator1;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator1;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator4 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator4.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator5;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = kafkaSpoutMessageIdComparator1.thenComparing(kafkaSpoutMessageIdComparator5);
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer5 = objKafkaSpout0.commitTimer;
        org.apache.kafka.common.TopicPartition topicPartition6 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition6, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer5);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout6 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = null;
        objKafkaSpout6.kafkaSpoutStreams = kafkaSpoutStreams7;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = null;
        objKafkaSpout6.retryService = kafkaSpoutRetryService9;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory11 = null;
        objKafkaSpout6.kafkaConsumerFactory = kafkaConsumerFactory11;
        boolean boolean13 = objKafkaSpout6.consumerAutoCommitMode;
        objKafkaSpout6.initialized = true;
        objKafkaSpout6.initialized = true;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.ack((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        boolean boolean6 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray9 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet10, kafkaSpoutMessageIdArray9);
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet10;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig13 = objKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.declareOutputFields(outputFieldsDeclarer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig13);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.storm.topology.base.BaseComponent> offsetComparatorKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.storm.topology.base.BaseComponent> offsetComparatorKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, org.apache.storm.topology.base.BaseComponent>(offsetComparatorKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
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
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = objKafkaSpout0.firstPollOffsetStrategy;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy13);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        java.lang.String str7 = objKafkaSpout0.toString();
        int int8 = objKafkaSpout0.maxRetries;
        boolean boolean9 = objKafkaSpout0.waitingToEmit();
        boolean boolean10 = objKafkaSpout0.initialized;
        java.util.Map map11 = null;
        org.apache.storm.task.TopologyContext topologyContext12 = null;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector13 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.open(map11, topologyContext12, spoutOutputCollector13);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService1;
        objKafkaSpout0.initialized = true;
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
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
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap13 = null;
        objKafkaSpout0.acked = topicPartitionMap13;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor15 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector16 = objKafkaSpout0.collector;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(spoutOutputCollector16);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        boolean boolean9 = objKafkaSpout0.initialized;
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Cloneable, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> cloneableKafkaSpoutConfig0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> cloneableKafkaSpout1 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>(cloneableKafkaSpoutConfig0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
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
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator23 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator24 = offsetComparator23.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator24;
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator24;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator27 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator28 = offsetComparator27.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator28;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator30 = kafkaSpoutMessageIdComparator24.thenComparing(kafkaSpoutMessageIdComparator28);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator31 = kafkaSpoutMessageIdComparator2.thenComparing(kafkaSpoutMessageIdComparator28);
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
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator31);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
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
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy10);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        boolean boolean6 = objKafkaSpout0.consumerAutoCommitMode;
        objKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = objKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer10 = objKafkaSpout0.commitTimer;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords11 = objKafkaSpout0.pollKafkaBroker();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer10);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig4 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig6 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig6;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer8 = null;
        objKafkaSpout0.kafkaConsumer = objKafkaConsumer8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
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
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.close();
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
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, java.lang.reflect.GenericDeclaration> offsetComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator, java.lang.reflect.GenericDeclaration>();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        objKafkaSpout0.initialized = true;
        boolean boolean11 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService12 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService12;
        long long14 = objKafkaSpout0.numUncommittedOffsets;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer3 = objKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory4 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory4;
        java.lang.String str6 = objKafkaSpout0.toString();
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str6.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        java.lang.String str9 = objKafkaSpout0.toString();
        java.lang.String str10 = objKafkaSpout0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str9.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str10.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = objKafkaSpout0.getWildCardTopics();
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
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator0 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator1 = offsetComparator0.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator2 = offsetComparator0.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator3 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator4 = offsetComparator3.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator5 = offsetComparator3.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator6 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator7 = offsetComparator6.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator8 = offsetComparator6.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator9 = kafkaSpoutMessageIdComparator5.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator10 = offsetComparator0.thenComparing((java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) offsetComparator6);
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId11 = null;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId kafkaSpoutMessageId12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = offsetComparator0.compare(kafkaSpoutMessageId11, kafkaSpoutMessageId12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator10);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
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
        objKafkaSpout0.initialized = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig9);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
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
        org.apache.kafka.common.TopicPartition topicPartition11 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection12 = objKafkaSpout0.toArrayList(topicPartition11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection12);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
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
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable> objConsumerRecord10 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emitTupleIfNotEmitted(objConsumerRecord10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy6;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams5);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder5 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder5;
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
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
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
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
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = objKafkaSpout0.kafkaSpoutStreams;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = kafkaSpoutStreams15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams15);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
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
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder12 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder12;
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
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
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
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService13 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService13;
        objKafkaSpout0.numUncommittedOffsets = (byte) 10;
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
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        java.lang.String str5 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector6 = objKafkaSpout0.collector;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap7 = objKafkaSpout0.acked;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str5.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(spoutOutputCollector6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap7);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig4 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig6 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig6;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = objKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
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
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = objKafkaSpout0.kafkaSpoutStreams;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor16 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor16;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder18 = objKafkaSpout0.tuplesBuilder;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder18);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
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
        java.lang.String str13 = objKafkaSpout0.toString();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet14 = objKafkaSpout0.emitted;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str13.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet14);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
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
            java.util.Map<java.lang.String, java.lang.Object> strMap10 = objKafkaSpout0.getComponentConfiguration();
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
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig7 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
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
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap13 = objKafkaSpout0.acked;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout14 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = null;
        objKafkaSpout14.kafkaSpoutStreams = kafkaSpoutStreams15;
        java.lang.String str17 = objKafkaSpout14.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder18 = null;
        objKafkaSpout14.tuplesBuilder = objKafkaSpoutTuplesBuilder18;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer20 = objKafkaSpout14.commitTimer;
        java.lang.String str21 = objKafkaSpout14.toString();
        objKafkaSpout14.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout24 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams25 = null;
        objKafkaSpout24.kafkaSpoutStreams = kafkaSpoutStreams25;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy27 = null;
        objKafkaSpout24.firstPollOffsetStrategy = firstPollOffsetStrategy27;
        objKafkaSpout24.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig31 = null;
        objKafkaSpout24.kafkaSpoutConfig = objKafkaSpoutConfig31;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory33 = null;
        objKafkaSpout24.kafkaConsumerFactory = kafkaConsumerFactory33;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray35 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet36 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet36, kafkaSpoutMessageIdArray35);
        objKafkaSpout24.emitted = kafkaSpoutMessageIdSet36;
        objKafkaSpout14.emitted = kafkaSpoutMessageIdSet36;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet36;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str17.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str21.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords6 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setWaitingToEmit(objConsumerRecords6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        objKafkaSpout0.consumerAutoCommitMode = true;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
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
            objKafkaSpout0.deactivate();
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
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer3 = objKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory4 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory4;
        boolean boolean6 = objKafkaSpout0.initialized;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.deactivate();
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
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap8 = null;
        objKafkaSpout0.acked = topicPartitionMap8;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig5 = objKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        objKafkaSpout0.numUncommittedOffsets = (byte) 1;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder9;
        org.apache.kafka.common.TopicPartition topicPartition11 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition11, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer6);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor6 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor6;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap9 = objKafkaSpout0.acked;
        objKafkaSpout0.maxRetries = ' ';
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = objKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap9);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig4 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder4 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder4;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        java.lang.String str7 = objKafkaSpout0.toString();
        objKafkaSpout0.initialized = false;
        java.lang.String str10 = objKafkaSpout0.toString();
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
        org.junit.Assert.assertNull(timer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str10.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
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
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy11 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy11;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = objKafkaSpout0.poll();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy10);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        org.apache.kafka.common.TopicPartition topicPartition7 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection8 = objKafkaSpout0.toArrayList(topicPartition7);
        org.apache.kafka.common.TopicPartition topicPartition9 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.setAcked(topicPartition9, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection8);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        objKafkaSpout0.numUncommittedOffsets = (short) 10;
        java.lang.String str9 = objKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig10 = objKafkaSpout0.kafkaSpoutConfig;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str9.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig10);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
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
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy13 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy13;
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
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
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
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig11 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig11;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory13 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory13;
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
        org.junit.Assert.assertNull(topicPartitionMap10);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
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
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator24;
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
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig5 = objKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = objKafkaSpout0.getWildCardTopics();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer6);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap7 = objKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = null;
        objKafkaSpout0.collector = spoutOutputCollector9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
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
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer11 = objKafkaSpout0.kafkaConsumer;
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer11);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
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
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator26;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator29 = kafkaSpoutMessageIdComparator26.reversed();
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
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator29);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory7 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory7;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.commitOffsetsForAckedTuples();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = objKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory6 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy5);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory7 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory7;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.subscribeKafkaConsumer();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
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
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams13 = objKafkaSpout0.kafkaSpoutStreams;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams13);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
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
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout13 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams14 = null;
        objKafkaSpout13.kafkaSpoutStreams = kafkaSpoutStreams14;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy16 = null;
        objKafkaSpout13.firstPollOffsetStrategy = firstPollOffsetStrategy16;
        objKafkaSpout13.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer20 = objKafkaSpout13.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService21 = null;
        objKafkaSpout13.retryService = kafkaSpoutRetryService21;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap23 = objKafkaSpout13.acked;
        boolean boolean24 = objKafkaSpout13.consumerAutoCommitMode;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.fail((java.lang.Object) objKafkaSpout13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.apache.storm.kafka.spout.KafkaSpout cannot be cast to org.apache.storm.kafka.spout.KafkaSpoutMessageId");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNull(objKafkaConsumer20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
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
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator22 = kafkaSpoutMessageIdComparator21.reversed();
        java.lang.Class<?> wildcardClass23 = kafkaSpoutMessageIdComparator21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        org.apache.kafka.common.TopicPartition topicPartition5 = null;
        java.util.Collection<org.apache.kafka.common.TopicPartition> topicPartitionCollection6 = objKafkaSpout0.toArrayList(topicPartition5);
        java.lang.String str7 = objKafkaSpout0.toString();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor8;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = objKafkaSpout0.firstPollOffsetStrategy;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str7.equals("KafkaSpout{acked=null, emitted=null}"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(firstPollOffsetStrategy10);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.topology.OutputFieldsDeclarer outputFieldsDeclarer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.declareOutputFields(outputFieldsDeclarer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams4);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        java.lang.String str3 = objKafkaSpout0.toString();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = null;
        objKafkaSpout0.collector = spoutOutputCollector4;
        objKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService8 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str3.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder5 = objKafkaSpout0.tuplesBuilder;
        objKafkaSpout0.initialized = true;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder5);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
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
            java.lang.String str12 = objKafkaSpout0.getWildCardTopics();
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
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = objKafkaSpout0.commit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap12);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig4 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig4;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        objKafkaSpout0.numUncommittedOffsets = '#';
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        java.lang.String str5 = objKafkaSpout0.toString();
        objKafkaSpout0.numUncommittedOffsets = 1;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "KafkaSpout{acked=null, emitted=null}" + "'", str5.equals("KafkaSpout{acked=null, emitted=null}"));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
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
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = kafkaSpoutMessageIdComparator3;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator29 = kafkaSpoutMessageIdComparator3.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator30 = kafkaSpoutMessageIdComparator29.reversed();
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
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(kafkaSpoutMessageIdComparator30);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        objKafkaSpout0.initialized = true;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer7 = objKafkaSpout0.kafkaConsumer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig9 = objKafkaSpout0.kafkaSpoutConfig;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = objKafkaSpout0.getWildCardTopics();
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
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.lang.Class<?>> annotatedElementKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.lang.Class<?>>();
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.String>.Timer> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.String>.Timer>();
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService7;
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
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
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
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = objKafkaSpout0.kafkaSpoutStreams;
        objKafkaSpout0.maxRetries = (short) 100;
        boolean boolean15 = objKafkaSpout0.consumerAutoCommitMode;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        long long6 = objKafkaSpout0.numUncommittedOffsets;
        boolean boolean7 = objKafkaSpout0.initialized;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = null;
        objKafkaSpout0.emitted = kafkaSpoutMessageIdSet8;
        boolean boolean10 = objKafkaSpout0.consumerAutoCommitMode;
        boolean boolean11 = objKafkaSpout0.initialized;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
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
            java.lang.Class<?> wildcardClass13 = kafkaSpoutMessageIdSet12.getClass();
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
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(topicPartitionCollection15);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = objKafkaSpout0.commit();
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
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig3 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig3;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder5 = objKafkaSpout0.tuplesBuilder;
        objKafkaSpout0.initialized = true;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = objKafkaSpout0.emitted;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.shutdown();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutTuplesBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutMessageIdSet8);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor5 = objKafkaSpout0.waitingToEmit;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor6 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor6;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor8 = objKafkaSpout0.waitingToEmit;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap9 = objKafkaSpout0.acked;
        objKafkaSpout0.maxRetries = ' ';
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.doSeekRetriableTopicPartitions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(topicPartitionMap9);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig5 = objKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer6 = objKafkaSpout0.commitTimer;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor7 = null;
        objKafkaSpout0.waitingToEmit = objConsumerRecordItor7;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.emit();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaSpoutConfig5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer6);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.kafka.common.TopicPartition>, java.util.Collection<org.apache.kafka.common.TopicPartition>> topicPartitionCollectionKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.kafka.common.TopicPartition>, java.util.Collection<org.apache.kafka.common.TopicPartition>>();
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Object> strMap5 = objKafkaSpout0.getComponentConfiguration();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
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
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Object, java.io.Serializable>> objConsumerRecordItor38 = objKafkaSpout0.waitingToEmit;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor38);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy3;
        boolean boolean5 = objKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig6 = null;
        objKafkaSpout0.kafkaSpoutConfig = objKafkaSpoutConfig6;
        boolean boolean8 = objKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Object, java.io.Serializable> objKafkaSpoutTuplesBuilder9 = null;
        objKafkaSpout0.tuplesBuilder = objKafkaSpoutTuplesBuilder9;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.Timer timer11 = objKafkaSpout0.commitTimer;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(timer11);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
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
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Object, java.io.Serializable> objKafkaConsumer12 = objKafkaSpout0.kafkaConsumer;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objConsumerRecordItor5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objKafkaConsumer12);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = null;
        objKafkaSpout0.retryService = kafkaSpoutRetryService3;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory5;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory7 = null;
        objKafkaSpout0.kafkaConsumerFactory = kafkaConsumerFactory7;
        // The following exception was thrown during execution in test generation
        try {
            objKafkaSpout0.deactivate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = null;
        objKafkaSpout0.kafkaSpoutStreams = kafkaSpoutStreams1;
        boolean boolean3 = objKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = null;
        objKafkaSpout0.firstPollOffsetStrategy = firstPollOffsetStrategy4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = objKafkaSpout0.kafkaSpoutStreams;
        objKafkaSpout0.maxRetries = 10;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>.OffsetEntry> topicPartitionMap9 = null;
        objKafkaSpout0.acked = topicPartitionMap9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(kafkaSpoutStreams6);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
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
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
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
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
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
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
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
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
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
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
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
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
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
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
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
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
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
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
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
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
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
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
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
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
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
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
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
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
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
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
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
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
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
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
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
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
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
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
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
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
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
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
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
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
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
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
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
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
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
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
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
}

