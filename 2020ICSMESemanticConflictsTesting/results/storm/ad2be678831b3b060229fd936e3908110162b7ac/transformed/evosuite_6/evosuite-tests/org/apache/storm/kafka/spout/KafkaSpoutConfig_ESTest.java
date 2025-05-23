/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 07:36:42 GMT 2020
 */

package org.apache.storm.kafka.spout;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import clojure.lang.IPersistentMap;
import clojure.lang.ISeq;
import clojure.lang.MapEntry;
import clojure.lang.PersistentArrayMap;
import clojure.lang.PersistentHashMap;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.storm.kafka.spout.KafkaSpoutConfig;
import org.apache.storm.kafka.spout.KafkaSpoutRetryExponentialBackoff;
import org.apache.storm.kafka.spout.KafkaSpoutRetryService;
import org.apache.storm.kafka.spout.KafkaSpoutStreams;
import org.apache.storm.kafka.spout.KafkaSpoutStreamsNamedTopics;
import org.apache.storm.kafka.spout.KafkaSpoutStreamsWildcardTopics;
import org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder;
import org.apache.storm.kafka.spout.SerializableDeserializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class KafkaSpoutConfig_ESTest extends KafkaSpoutConfig_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      KafkaSpoutConfig<String, String> kafkaSpoutConfig0 = new KafkaSpoutConfig<String, String>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>(kafkaSpoutConfig0.maxUncommittedOffsets, kafkaSpoutConfig0.DEFAULT_POLL_TIMEOUT_MS);
      long long0 = 0L;
      kafkaSpoutConfig0.pollTimeoutMs = long0;
      Map<String, Object> map0 = kafkaSpoutConfig0.setDefaultsAndGetKafkaProps(hashMap0);
      KafkaSpoutConfig.Builder<Object, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Object, KafkaSpoutStreamsWildcardTopics>(map0, kafkaSpoutConfig0.kafkaSpoutStreams, kafkaSpoutConfig0.tuplesBuilder);
      } catch(IllegalArgumentException e) {
         //
         // Must specify stream associated with each topic. Multiple topics can emit to the same stream
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      KafkaSpoutConfig<Object, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig0 = new KafkaSpoutConfig<Object, KafkaSpoutStreamsNamedTopics>();
      KafkaSpoutRetryService kafkaSpoutRetryService0 = kafkaSpoutConfig0.getRetryService();
      KafkaSpoutConfig<Object, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig1 = new KafkaSpoutConfig<Object, KafkaSpoutStreamsWildcardTopics>();
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy0 = kafkaSpoutConfig1.getFirstPollOffsetStrategy();
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Object, Object>();
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setOffsetCommitPeriodMs(kafkaSpoutConfig1.DEFAULT_MAX_UNCOMMITTED_OFFSETS);
      long long0 = 0L;
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setPollTimeoutMs(long0);
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder3 = kafkaSpoutConfig_Builder0.setOffsetCommitPeriodMs(kafkaSpoutConfig1.DEFAULT_MAX_UNCOMMITTED_OFFSETS);
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder4 = kafkaSpoutConfig_Builder2.setKeyDeserializer(kafkaSpoutConfig_Builder0.keyDeserializer);
      KafkaSpoutConfig<Object, Object> kafkaSpoutConfig2 = null;
      try {
        kafkaSpoutConfig2 = new KafkaSpoutConfig<Object, Object>(kafkaSpoutConfig_Builder4);
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, Object> kafkaSpoutConfig0 = new KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, Object>();
      KafkaSpoutConfig<String, Locale.Category> kafkaSpoutConfig1 = new KafkaSpoutConfig<String, Locale.Category>();
      KafkaSpoutStreams kafkaSpoutStreams0 = kafkaSpoutConfig1.getKafkaSpoutStreams();
      kafkaSpoutConfig0.kafkaSpoutStreams = kafkaSpoutStreams0;
      // Undeclared exception!
      try { 
        kafkaSpoutConfig0.isConsumerAutoCommitMode();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig0 = new KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, KafkaSpoutStreamsWildcardTopics>();
      long long0 = 2147483647L;
      kafkaSpoutConfig0.offsetCommitPeriodMs = long0;
      Deserializer<KafkaSpoutStreamsWildcardTopics> deserializer0 = (Deserializer<KafkaSpoutStreamsWildcardTopics>) mock(Deserializer.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(deserializer0).toString();
      kafkaSpoutConfig0.valueDeserializer = deserializer0;
      String string0 = kafkaSpoutConfig0.toString();
      String string1 = kafkaSpoutConfig0.toString();
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy0 = kafkaSpoutConfig0.getFirstPollOffsetStrategy();
      KafkaSpoutConfig.Builder<Object, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Object, KafkaSpoutStreamsNamedTopics>();
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy1 = KafkaSpoutConfig.FirstPollOffsetStrategy.LATEST;
      KafkaSpoutConfig.Builder<Object, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy1);
      KafkaSpoutConfig<Object, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig1 = null;
      try {
        kafkaSpoutConfig1 = new KafkaSpoutConfig<Object, KafkaSpoutStreamsNamedTopics>(kafkaSpoutConfig_Builder1);
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      KafkaSpoutConfig<Object, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig0 = new KafkaSpoutConfig<Object, KafkaSpoutStreamsNamedTopics>();
      Deserializer<KafkaSpoutStreamsNamedTopics> deserializer0 = kafkaSpoutConfig0.getValueDeserializer();
      int int0 = 0;
      KafkaSpoutConfig.Builder<MapEntry, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<MapEntry, KafkaSpoutStreamsNamedTopics>();
      long long0 = 1351L;
      KafkaSpoutConfig.Builder<MapEntry, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setOffsetCommitPeriodMs(long0);
      long long1 = 1425L;
      KafkaSpoutConfig.Builder<MapEntry, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setPollTimeoutMs(long1);
      KafkaSpoutConfig.Builder<MapEntry, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder3 = kafkaSpoutConfig_Builder2.setKeyDeserializer(kafkaSpoutConfig_Builder0.keyDeserializer);
      KafkaSpoutConfig<MapEntry, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig1 = null;
      try {
        kafkaSpoutConfig1 = new KafkaSpoutConfig<MapEntry, KafkaSpoutStreamsNamedTopics>(kafkaSpoutConfig_Builder3);
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, String> kafkaSpoutConfig0 = new KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, String>();
      Map<String, Object> map0 = kafkaSpoutConfig0.getKafkaProps();
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval0 = KafkaSpoutRetryExponentialBackoff.TimeInterval.milliSeconds(kafkaSpoutConfig0.DEFAULT_MAX_RETRIES);
      int int0 = 0;
      KafkaSpoutRetryExponentialBackoff kafkaSpoutRetryExponentialBackoff0 = new KafkaSpoutRetryExponentialBackoff(kafkaSpoutRetryExponentialBackoff_TimeInterval0, kafkaSpoutRetryExponentialBackoff_TimeInterval0, int0, kafkaSpoutRetryExponentialBackoff_TimeInterval0);
      KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, Object> kafkaSpoutConfig1 = new KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, Object>();
      long long0 = kafkaSpoutConfig1.getOffsetsCommitPeriodMs();
      long long1 = 349L;
      KafkaSpoutRetryExponentialBackoff.TimeInterval kafkaSpoutRetryExponentialBackoff_TimeInterval1 = KafkaSpoutRetryExponentialBackoff.TimeInterval.seconds(long1);
      KafkaSpoutConfig.Builder<Integer, Object> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Integer, Object>();
      long long2 = 0L;
      KafkaSpoutConfig.Builder<Integer, Object> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setOffsetCommitPeriodMs(long2);
      KafkaSpoutConfig<Integer, Object> kafkaSpoutConfig2 = null;
      try {
        kafkaSpoutConfig2 = new KafkaSpoutConfig<Integer, Object>(kafkaSpoutConfig_Builder1);
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      KafkaSpoutConfig.Builder<Object, Integer> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Object, Integer>();
      SerializableDeserializer<Integer> serializableDeserializer0 = (SerializableDeserializer<Integer>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<Object, Integer> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setValueDeserializer(serializableDeserializer0);
      KafkaSpoutConfig<Object, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig0 = new KafkaSpoutConfig<Object, KafkaSpoutStreamsWildcardTopics>();
      List<String> list0 = kafkaSpoutConfig0.getSubscribedTopics();
      KafkaSpoutConfig<String, Locale.Category> kafkaSpoutConfig1 = new KafkaSpoutConfig<String, Locale.Category>();
      int int0 = kafkaSpoutConfig1.getMaxUncommittedOffsets();
      KafkaSpoutConfig<Integer, String> kafkaSpoutConfig2 = new KafkaSpoutConfig<Integer, String>();
      KafkaSpoutTuplesBuilder<Integer, String> kafkaSpoutTuplesBuilder0 = kafkaSpoutConfig2.getTuplesBuilder();
      KafkaSpoutConfig.Builder<Integer, Integer> kafkaSpoutConfig_Builder2 = null;
      try {
        kafkaSpoutConfig_Builder2 = new KafkaSpoutConfig.Builder<Integer, Integer>(kafkaSpoutConfig0.kafkaProps, kafkaSpoutConfig_Builder1.kafkaSpoutStreams, kafkaSpoutConfig2.tuplesBuilder, kafkaSpoutConfig_Builder0.retryService);
      } catch(IllegalArgumentException e) {
         //
         // Properties defining consumer connection to Kafka broker are required: null
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, String> kafkaSpoutConfig0 = new KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, String>();
      int int0 = kafkaSpoutConfig0.getMaxUncommittedOffsets();
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy0 = KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, Object> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, Object>();
      KafkaSpoutConfig<Object, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig0 = new KafkaSpoutConfig<Object, KafkaSpoutStreamsWildcardTopics>();
      long long0 = 1017L;
      long long1 = (-1618L);
      kafkaSpoutConfig0.offsetCommitPeriodMs = long1;
      KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = long0;
      kafkaSpoutConfig0.valueDeserializer = (Deserializer<KafkaSpoutStreamsWildcardTopics>) kafkaSpoutConfig_Builder0.keyDeserializer;
      // Undeclared exception!
      try { 
        kafkaSpoutConfig0.getConsumerGroupId();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, String> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, String>();
      long long0 = 100L;
      kafkaSpoutConfig_Builder0.pollTimeoutMs = long0;
      // Undeclared exception!
      try { 
        kafkaSpoutConfig_Builder0.build();
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      long long0 = 65L;
      System.setCurrentTimeMillis(long0);
      Object[] objectArray0 = null;
      PersistentArrayMap persistentArrayMap0 = new PersistentArrayMap(objectArray0);
      KafkaSpoutConfig.Builder<String, Integer> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<String, Integer>();
      int int0 = (-4);
      KafkaSpoutConfig.Builder<String, Integer> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setMaxUncommittedOffsets(int0);
      KafkaSpoutConfig.Builder<String, Integer> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setPollTimeoutMs(kafkaSpoutConfig_Builder0.maxUncommittedOffsets);
      KafkaSpoutConfig.Builder<String, Integer> kafkaSpoutConfig_Builder3 = kafkaSpoutConfig_Builder2.setKeyDeserializer(kafkaSpoutConfig_Builder1.keyDeserializer);
      KafkaSpoutStreams kafkaSpoutStreams0 = kafkaSpoutConfig_Builder3.kafkaSpoutStreams;
      KafkaSpoutConfig.Builder<Object, String> kafkaSpoutConfig_Builder4 = null;
      try {
        kafkaSpoutConfig_Builder4 = new KafkaSpoutConfig.Builder<Object, String>(kafkaSpoutConfig_Builder0.kafkaProps, kafkaSpoutConfig_Builder1.kafkaSpoutStreams, kafkaSpoutConfig_Builder3.tuplesBuilder);
      } catch(IllegalArgumentException e) {
         //
         // Properties defining consumer connection to Kafka broker are required: null
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, String> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, String>();
      int int0 = (-1129);
      int int1 = 0;
      kafkaSpoutConfig_Builder0.maxUncommittedOffsets = int1;
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, String> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setMaxUncommittedOffsets(int0);
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, String> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setMaxUncommittedOffsets(int0);
      String string0 = "2p)vp?Kdd";
      // Undeclared exception!
      try { 
        KafkaSpoutConfig.FirstPollOffsetStrategy.valueOf(string0);
      } catch(IllegalArgumentException e) {
         //
         // No enum constant org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy.2p)vp?Kdd
         //
         verifyException("java.lang.Enum", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      KafkaSpoutConfig<Integer, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig0 = new KafkaSpoutConfig<Integer, KafkaSpoutStreamsNamedTopics>();
      long long0 = (-1119L);
      kafkaSpoutConfig0.pollTimeoutMs = long0;
      long long1 = kafkaSpoutConfig0.getPollTimeoutMs();
      KafkaSpoutConfig.Builder<Integer, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Integer, KafkaSpoutStreamsNamedTopics>();
      KafkaSpoutConfig.Builder<Integer, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setFirstPollOffsetStrategy(kafkaSpoutConfig0.firstPollOffsetStrategy);
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, String> kafkaSpoutConfig_Builder0 = null;
      KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, String> kafkaSpoutConfig0 = null;
      try {
        kafkaSpoutConfig0 = new KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, String>(kafkaSpoutConfig_Builder0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      KafkaSpoutConfig.Builder<Object, Integer> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Object, Integer>();
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy0 = KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_EARLIEST;
      KafkaSpoutConfig.Builder<Object, Integer> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setFirstPollOffsetStrategy(kafkaSpoutConfig_FirstPollOffsetStrategy0);
      KafkaSpoutConfig.Builder<Object, Integer> kafkaSpoutConfig_Builder2 = kafkaSpoutConfig_Builder1.setKeyDeserializer(kafkaSpoutConfig_Builder0.keyDeserializer);
      int int0 = (-1475);
      KafkaSpoutConfig.Builder<Object, Integer> kafkaSpoutConfig_Builder3 = kafkaSpoutConfig_Builder2.setMaxUncommittedOffsets(int0);
      KafkaSpoutConfig.Builder<Integer, Integer> kafkaSpoutConfig_Builder4 = new KafkaSpoutConfig.Builder<Integer, Integer>();
      kafkaSpoutConfig_Builder4.kafkaProps = kafkaSpoutConfig_Builder3.kafkaProps;
      KafkaSpoutConfig.Builder<Integer, Integer> kafkaSpoutConfig_Builder5 = kafkaSpoutConfig_Builder4.setValueDeserializer(kafkaSpoutConfig_Builder3.keyDeserializer);
      KafkaSpoutConfig.Builder<Integer, Integer> kafkaSpoutConfig_Builder6 = kafkaSpoutConfig_Builder4.setMaxUncommittedOffsets(kafkaSpoutConfig_Builder3.maxUncommittedOffsets);
      KafkaSpoutConfig<Object, Integer> kafkaSpoutConfig0 = new KafkaSpoutConfig<Object, Integer>();
      // Undeclared exception!
      try { 
        kafkaSpoutConfig0.getConsumerGroupId();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      KafkaSpoutConfig.Builder<String, KafkaSpoutStreamsNamedTopics> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<String, KafkaSpoutStreamsNamedTopics>();
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder1 = new KafkaSpoutConfig.Builder<String, Object>();
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder2 = null;
      try {
        kafkaSpoutConfig_Builder2 = new KafkaSpoutConfig.Builder<Object, Object>(kafkaSpoutConfig_Builder0.kafkaProps, kafkaSpoutConfig_Builder1.kafkaSpoutStreams, kafkaSpoutConfig_Builder1.tuplesBuilder);
      } catch(IllegalArgumentException e) {
         //
         // Properties defining consumer connection to Kafka broker are required: null
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Object object1 = new Object();
      objectArray0[1] = object1;
      Object object2 = new Object();
      objectArray0[2] = object2;
      Object object3 = new Object();
      objectArray0[3] = object3;
      Object object4 = new Object();
      objectArray0[4] = object4;
      Object object5 = new Object();
      objectArray0[5] = object5;
      PersistentArrayMap persistentArrayMap0 = PersistentArrayMap.createAsIfByAssoc(objectArray0);
      KafkaSpoutConfig<Object, String> kafkaSpoutConfig0 = new KafkaSpoutConfig<Object, String>();
      KafkaSpoutStreams kafkaSpoutStreams0 = kafkaSpoutConfig0.kafkaSpoutStreams;
      KafkaSpoutConfig.Builder<Object, Integer> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Object, Integer>(persistentArrayMap0, kafkaSpoutStreams0, kafkaSpoutConfig0.tuplesBuilder);
      } catch(IllegalArgumentException e) {
         //
         // Must specify stream associated with each topic. Multiple topics can emit to the same stream
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      KafkaSpoutConfig<Object, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig0 = new KafkaSpoutConfig<Object, KafkaSpoutStreamsWildcardTopics>();
      long long0 = (-1L);
      kafkaSpoutConfig0.offsetCommitPeriodMs = long0;
      Map<String, Object> map0 = kafkaSpoutConfig0.getKafkaProps();
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      KafkaSpoutConfig<Locale.Category, String> kafkaSpoutConfig0 = new KafkaSpoutConfig<Locale.Category, String>();
      Pattern pattern0 = kafkaSpoutConfig0.getTopicWildcardPattern();
      KafkaSpoutStreams kafkaSpoutStreams0 = kafkaSpoutConfig0.getKafkaSpoutStreams();
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      ISeq iSeq0 = null;
      PersistentHashMap persistentHashMap0 = PersistentHashMap.createWithCheck(iSeq0);
      IPersistentMap iPersistentMap0 = null;
      PersistentHashMap persistentHashMap1 = persistentHashMap0.withMeta(iPersistentMap0);
      KafkaSpoutConfig<Object, Object> kafkaSpoutConfig0 = new KafkaSpoutConfig<Object, Object>();
      KafkaSpoutStreams kafkaSpoutStreams0 = kafkaSpoutConfig0.getKafkaSpoutStreams();
      KafkaSpoutConfig.Builder<Object, Object> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Object, Object>(persistentHashMap1, kafkaSpoutStreams0, kafkaSpoutConfig0.tuplesBuilder, kafkaSpoutConfig0.retryService);
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class clojure.lang.RT
         //
         verifyException("clojure.lang.APersistentMap", e);
      }
  }

  @Test(timeout = 11000)
  public void test20()  throws Throwable  {
      KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, Object> kafkaSpoutConfig0 = new KafkaSpoutConfig<KafkaSpoutStreamsNamedTopics, Object>();
      // Undeclared exception!
      try { 
        kafkaSpoutConfig0.isConsumerAutoCommitMode();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig", e);
      }
  }

  @Test(timeout = 11000)
  public void test21()  throws Throwable  {
      KafkaSpoutConfig.Builder<Integer, Integer> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Integer, Integer>();
      SerializableDeserializer<Integer> serializableDeserializer0 = (SerializableDeserializer<Integer>) mock(SerializableDeserializer.class, new ViolatedAssumptionAnswer());
      KafkaSpoutConfig.Builder<Integer, Integer> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setKeyDeserializer(serializableDeserializer0);
      KafkaSpoutConfig<Integer, Integer> kafkaSpoutConfig0 = new KafkaSpoutConfig<Integer, Integer>();
      kafkaSpoutConfig0.kafkaProps = kafkaSpoutConfig_Builder0.kafkaProps;
      kafkaSpoutConfig0.keyDeserializer = (Deserializer<Integer>) kafkaSpoutConfig_Builder0.valueDeserializer;
      // Undeclared exception!
      try { 
        kafkaSpoutConfig0.isConsumerAutoCommitMode();
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig", e);
      }
  }

  @Test(timeout = 11000)
  public void test22()  throws Throwable  {
      KafkaSpoutConfig<Object, String> kafkaSpoutConfig0 = new KafkaSpoutConfig<Object, String>();
      Deserializer<Object> deserializer0 = kafkaSpoutConfig0.getKeyDeserializer();
      KafkaSpoutConfig.Builder<MapEntry, Integer> kafkaSpoutConfig_Builder0 = null;
      KafkaSpoutConfig<MapEntry, Integer> kafkaSpoutConfig1 = null;
      try {
        kafkaSpoutConfig1 = new KafkaSpoutConfig<MapEntry, Integer>(kafkaSpoutConfig_Builder0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig", e);
      }
  }

  @Test(timeout = 11000)
  public void test23()  throws Throwable  {
      KafkaSpoutConfig<Object, Integer> kafkaSpoutConfig0 = new KafkaSpoutConfig<Object, Integer>();
      Pattern pattern0 = kafkaSpoutConfig0.getTopicWildcardPattern();
      long long0 = kafkaSpoutConfig0.getOffsetsCommitPeriodMs();
  }

  @Test(timeout = 11000)
  public void test24()  throws Throwable  {
      KafkaSpoutConfig<String, String> kafkaSpoutConfig0 = new KafkaSpoutConfig<String, String>();
      Deserializer<String> deserializer0 = kafkaSpoutConfig0.getValueDeserializer();
  }

  @Test(timeout = 11000)
  public void test25()  throws Throwable  {
      KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, Integer> kafkaSpoutConfig0 = new KafkaSpoutConfig<KafkaSpoutStreamsWildcardTopics, Integer>();
      Deserializer<KafkaSpoutStreamsWildcardTopics> deserializer0 = (Deserializer<KafkaSpoutStreamsWildcardTopics>) mock(Deserializer.class, new ViolatedAssumptionAnswer());
      kafkaSpoutConfig0.keyDeserializer = deserializer0;
      Map<String, Object> map0 = null;
      // Undeclared exception!
      try { 
        kafkaSpoutConfig0.setDefaultsAndGetKafkaProps(map0);
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 11000)
  public void test26()  throws Throwable  {
      KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, String> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<KafkaSpoutStreamsWildcardTopics, String>();
      long long0 = 100L;
      kafkaSpoutConfig_Builder0.pollTimeoutMs = long0;
      // Undeclared exception!
      try { 
        kafkaSpoutConfig_Builder0.build();
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 11000)
  public void test27()  throws Throwable  {
      KafkaSpoutConfig<Object, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig0 = new KafkaSpoutConfig<Object, KafkaSpoutStreamsWildcardTopics>();
      PersistentHashMap persistentHashMap0 = PersistentHashMap.EMPTY;
      // Undeclared exception!
      try { 
        kafkaSpoutConfig0.setDefaultsAndGetKafkaProps(persistentHashMap0);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("clojure.lang.APersistentMap", e);
      }
  }

  @Test(timeout = 11000)
  public void test28()  throws Throwable  {
      KafkaSpoutConfig<String, Object> kafkaSpoutConfig0 = new KafkaSpoutConfig<String, Object>();
      Object[] objectArray0 = new Object[6];
      Object object0 = new Object();
      objectArray0[0] = object0;
      Object object1 = new Object();
      objectArray0[1] = object1;
      objectArray0[2] = (Object) kafkaSpoutConfig0;
      objectArray0[3] = (Object) kafkaSpoutConfig0;
      objectArray0[4] = (Object) kafkaSpoutConfig0;
      objectArray0[5] = (Object) kafkaSpoutConfig0;
      PersistentArrayMap persistentArrayMap0 = new PersistentArrayMap(objectArray0);
      // Undeclared exception!
      try { 
        kafkaSpoutConfig0.setDefaultsAndGetKafkaProps(persistentArrayMap0);
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("clojure.lang.APersistentMap", e);
      }
  }

  @Test(timeout = 11000)
  public void test29()  throws Throwable  {
      KafkaSpoutConfig<String, String> kafkaSpoutConfig0 = new KafkaSpoutConfig<String, String>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>(kafkaSpoutConfig0.maxUncommittedOffsets, kafkaSpoutConfig0.DEFAULT_POLL_TIMEOUT_MS);
      Map<String, Object> map0 = kafkaSpoutConfig0.setDefaultsAndGetKafkaProps(hashMap0);
      KafkaSpoutConfig.Builder<Object, KafkaSpoutStreamsWildcardTopics> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<Object, KafkaSpoutStreamsWildcardTopics>(map0, kafkaSpoutConfig0.kafkaSpoutStreams, kafkaSpoutConfig0.tuplesBuilder);
      } catch(IllegalArgumentException e) {
         //
         // Must specify stream associated with each topic. Multiple topics can emit to the same stream
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test30()  throws Throwable  {
      KafkaSpoutConfig<String, String> kafkaSpoutConfig0 = new KafkaSpoutConfig<String, String>();
      StringDeserializer stringDeserializer0 = new StringDeserializer();
      kafkaSpoutConfig0.valueDeserializer = (Deserializer<String>) stringDeserializer0;
      KafkaSpoutConfig.DEFAULT_OFFSET_COMMIT_PERIOD_MS = (long) kafkaSpoutConfig0.maxUncommittedOffsets;
      Deserializer<String> deserializer0 = kafkaSpoutConfig0.getValueDeserializer();
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder0 = null;
      try {
        kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<String, Object>(kafkaSpoutConfig0.kafkaProps, kafkaSpoutConfig0.kafkaSpoutStreams, kafkaSpoutConfig0.tuplesBuilder);
      } catch(IllegalArgumentException e) {
         //
         // Properties defining consumer connection to Kafka broker are required: null
         //
         verifyException("org.apache.storm.kafka.spout.KafkaSpoutConfig$Builder", e);
      }
  }

  @Test(timeout = 11000)
  public void test31()  throws Throwable  {
      KafkaSpoutConfig<Object, MapEntry> kafkaSpoutConfig0 = new KafkaSpoutConfig<Object, MapEntry>();
      KafkaSpoutConfig.FirstPollOffsetStrategy kafkaSpoutConfig_FirstPollOffsetStrategy0 = KafkaSpoutConfig.FirstPollOffsetStrategy.UNCOMMITTED_LATEST;
      kafkaSpoutConfig0.firstPollOffsetStrategy = kafkaSpoutConfig_FirstPollOffsetStrategy0;
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) kafkaSpoutConfig0;
      objectArray0[1] = (Object) kafkaSpoutConfig0;
      PersistentArrayMap persistentArrayMap0 = new PersistentArrayMap(objectArray0);
      kafkaSpoutConfig0.kafkaProps = (Map<String, Object>) persistentArrayMap0;
      long long0 = (-1L);
      Pattern pattern0 = kafkaSpoutConfig0.getTopicWildcardPattern();
      kafkaSpoutConfig0.pollTimeoutMs = long0;
      KafkaSpoutConfig.DEFAULT_POLL_TIMEOUT_MS = kafkaSpoutConfig0.offsetCommitPeriodMs;
      String string0 = kafkaSpoutConfig0.getConsumerGroupId();
      KafkaSpoutConfig<Object, String> kafkaSpoutConfig1 = new KafkaSpoutConfig<Object, String>();
      Deserializer<Object> deserializer0 = kafkaSpoutConfig1.getKeyDeserializer();
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder0 = new KafkaSpoutConfig.Builder<String, Object>();
      long long1 = 0L;
      KafkaSpoutConfig.Builder<String, Object> kafkaSpoutConfig_Builder1 = kafkaSpoutConfig_Builder0.setPollTimeoutMs(long1);
      KafkaSpoutConfig<String, Object> kafkaSpoutConfig2 = null;
      try {
        kafkaSpoutConfig2 = new KafkaSpoutConfig<String, Object>(kafkaSpoutConfig_Builder1);
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 11000)
  public void test32()  throws Throwable  {
      KafkaSpoutConfig<String, String> kafkaSpoutConfig0 = new KafkaSpoutConfig<String, String>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>(kafkaSpoutConfig0.DEFAULT_MAX_RETRIES);
      // Undeclared exception!
      kafkaSpoutConfig0.setDefaultsAndGetKafkaProps(hashMap0);
  }
}
