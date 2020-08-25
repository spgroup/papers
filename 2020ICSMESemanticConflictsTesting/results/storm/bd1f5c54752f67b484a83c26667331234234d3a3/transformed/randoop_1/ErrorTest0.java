import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory1 = objKafkaSpout0.kafkaConsumerFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        objKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Object, java.io.Serializable> objConsumerRecords1 = objKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = objKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.io.Serializable>();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory1 = objKafkaSpout0.kafkaConsumerFactory;
        objKafkaSpout0.numUncommittedOffsets = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Object, java.io.Serializable> objKafkaSpoutConfig4 = objKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        objKafkaSpout0.activate();
    }
}

