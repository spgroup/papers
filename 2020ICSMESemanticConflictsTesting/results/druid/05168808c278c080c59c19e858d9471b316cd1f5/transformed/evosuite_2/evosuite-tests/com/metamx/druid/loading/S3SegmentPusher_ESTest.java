/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 29 21:02:52 GMT 2020
 */

package com.metamx.druid.loading;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Multimap;
import com.metamx.druid.client.DataSegment;
import com.metamx.druid.loading.S3SegmentPusher;
import com.metamx.druid.loading.S3SegmentPusherConfig;
import com.metamx.druid.query.segment.SegmentDescriptor;
import com.metamx.druid.shard.ShardSpec;
import com.metamx.druid.shard.SingleDimensionShardSpec;
import com.metamx.emitter.service.AlertEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.format.TextStyle;
import java.util.List;
import java.util.Map;
import org.apache.hadoop.fs.LocalFileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.RawLocalFileSystem;
import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.BeanDescription;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.map.module.SimpleModule;
import org.codehaus.jackson.map.ser.BeanSerializerFactory;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.map.type.TypeModifier;
import org.codehaus.jackson.type.JavaType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.hyperic.sigar.cmd.Shell;
import org.hyperic.sigar.pager.ListPageFetcher;
import org.hyperic.sigar.pager.PageControl;
import org.hyperic.sigar.pager.PageList;
import org.jets3t.service.impl.rest.httpclient.RestS3Service;
import org.jets3t.service.security.AWSDevPayCredentials;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.YearMonth;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class S3SegmentPusher_ESTest extends S3SegmentPusher_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      RestS3Service restS3Service0 = null;
      String string0 = "";
      S3SegmentPusherConfig s3SegmentPusherConfig0 = mock(S3SegmentPusherConfig.class, new ViolatedAssumptionAnswer());
      doReturn(string0).when(s3SegmentPusherConfig0).getBaseKey();
      ObjectMapper objectMapper0 = new ObjectMapper();
      JsonFactory jsonFactory0 = new JsonFactory(objectMapper0);
      ObjectMapper objectMapper1 = new ObjectMapper(jsonFactory0);
      SerializationConfig.Feature serializationConfig_Feature0 = SerializationConfig.Feature.INDENT_OUTPUT;
      boolean boolean0 = true;
      AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
      AnnotationIntrospector.Pair annotationIntrospector_Pair0 = new AnnotationIntrospector.Pair(annotationIntrospector0, annotationIntrospector0);
      AnnotationIntrospector annotationIntrospector1 = AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector_Pair0);
      AnnotationIntrospector annotationIntrospector2 = AnnotationIntrospector.Pair.create(annotationIntrospector1, annotationIntrospector1);
      ObjectMapper objectMapper2 = objectMapper0.setAnnotationIntrospector(annotationIntrospector2);
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      TypeModifier typeModifier0 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
      TypeFactory typeFactory1 = typeFactory0.withModifier(typeModifier0);
      ObjectMapper objectMapper3 = objectMapper2.setTypeFactory(typeFactory1);
      S3SegmentPusher s3SegmentPusher0 = new S3SegmentPusher(restS3Service0, s3SegmentPusherConfig0, objectMapper3);
      LocalFileSystem localFileSystem0 = new LocalFileSystem();
      RawLocalFileSystem rawLocalFileSystem0 = new RawLocalFileSystem();
      Path path0 = rawLocalFileSystem0.getWorkingDirectory();
      MockFile mockFile0 = new MockFile(path0.SEPARATOR, string0);
      YearMonth yearMonth0 = YearMonth.now();
      int int0 = 138;
      YearMonth yearMonth1 = yearMonth0.minusMonths(int0);
      Interval interval0 = yearMonth1.toInterval();
      Map<String, Object> map0 = null;
      PeriodType periodType0 = PeriodType.time();
      Period period0 = interval0.toPeriod(periodType0);
      List<String> list0 = null;
      ShardSpec shardSpec0 = null;
      long long0 = 15778800000L;
      DataSegment dataSegment0 = new DataSegment(path0.CUR_DIR, interval0, path0.CUR_DIR, map0, list0, list0, shardSpec0, (Integer) yearMonth0.YEAR, long0);
      SegmentDescriptor segmentDescriptor0 = dataSegment0.toDescriptor();
      try { 
        s3SegmentPusher0.push(mockFile0, dataSegment0);
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      RestS3Service restS3Service0 = null;
      String string0 = "zd[Syu";
      String string1 = "V+St";
      S3SegmentPusherConfig s3SegmentPusherConfig0 = mock(S3SegmentPusherConfig.class, new ViolatedAssumptionAnswer());
      doReturn(string0, string1).when(s3SegmentPusherConfig0).getBaseKey();
      doReturn(string0).when(s3SegmentPusherConfig0).getBucket();
      ObjectMapper objectMapper0 = new ObjectMapper();
      JsonFactory jsonFactory0 = new JsonFactory(objectMapper0);
      ObjectMapper objectMapper1 = new ObjectMapper(jsonFactory0);
      SerializationConfig.Feature serializationConfig_Feature0 = SerializationConfig.Feature.INDENT_OUTPUT;
      boolean boolean0 = true;
      ObjectMapper objectMapper2 = objectMapper1.configure(serializationConfig_Feature0, boolean0);
      AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
      AnnotationIntrospector.Pair annotationIntrospector_Pair0 = new AnnotationIntrospector.Pair(annotationIntrospector0, annotationIntrospector0);
      AnnotationIntrospector annotationIntrospector1 = AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector_Pair0);
      AnnotationIntrospector annotationIntrospector2 = AnnotationIntrospector.Pair.create(annotationIntrospector1, annotationIntrospector1);
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      TypeModifier typeModifier0 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
      S3SegmentPusher s3SegmentPusher0 = new S3SegmentPusher(restS3Service0, s3SegmentPusherConfig0, objectMapper1);
      LocalFileSystem localFileSystem0 = new LocalFileSystem();
      RawLocalFileSystem rawLocalFileSystem0 = new RawLocalFileSystem();
      Path path0 = rawLocalFileSystem0.getWorkingDirectory();
      File file0 = localFileSystem0.pathToFile(path0);
      YearMonth yearMonth0 = new YearMonth();
      int int0 = 138;
      YearMonth yearMonth1 = yearMonth0.minusMonths(int0);
      Interval interval0 = yearMonth1.toInterval();
      Map<String, Object> map0 = null;
      PeriodType periodType0 = PeriodType.time();
      Period period0 = interval0.toPeriod(periodType0);
      YearMonth yearMonth2 = yearMonth1.minus(period0);
      List<String> list0 = null;
      ShardSpec shardSpec0 = null;
      long long0 = 2147483633L;
      DataSegment dataSegment0 = new DataSegment(path0.CUR_DIR, interval0, path0.CUR_DIR, map0, list0, list0, shardSpec0, (Integer) yearMonth0.YEAR, long0);
      MockFile mockFile0 = new MockFile(file0, dataSegment0.delimiter);
      boolean boolean1 = mockFile0.mkdirs();
      // Undeclared exception!
      try { 
        s3SegmentPusher0.push(mockFile0, dataSegment0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.metamx.druid.loading.S3SegmentPusher", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      S3SegmentPusher s3SegmentPusher0 = new S3SegmentPusher();
      String string0 = "";
      String string1 = "EYCN{\\\"8Q^G";
      MockFile mockFile0 = new MockFile(string0, string1);
      DataSegment dataSegment0 = null;
      String string2 = "<Y";
      S3SegmentPusherConfig s3SegmentPusherConfig0 = mock(S3SegmentPusherConfig.class, new ViolatedAssumptionAnswer());
      doReturn(string2, string0).when(s3SegmentPusherConfig0).getBaseKey();
      s3SegmentPusher0.config = s3SegmentPusherConfig0;
      long long0 = 501L;
      System.setCurrentTimeMillis(long0);
      LinkedListMultimap<BeanDescription, TextStyle> linkedListMultimap0 = LinkedListMultimap.create();
      DataSegment dataSegment1 = null;
      List<TextStyle> list0 = linkedListMultimap0.removeAll(dataSegment1);
      ListPageFetcher listPageFetcher0 = new ListPageFetcher(list0);
      Shell shell0 = new Shell();
      PageControl pageControl0 = shell0.getDefaultPageControl();
      PageList pageList0 = listPageFetcher0.getPage(pageControl0);
      // Undeclared exception!
      try { 
        s3SegmentPusher0.push(mockFile0, dataSegment0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.metamx.druid.loading.S3SegmentPusher", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      S3SegmentPusher s3SegmentPusher0 = new S3SegmentPusher();
      String string0 = "";
      MockFile mockFile0 = new MockFile(string0);
      S3SegmentPusher s3SegmentPusher1 = new S3SegmentPusher(s3SegmentPusher0.s3Client, s3SegmentPusher0.config, s3SegmentPusher0.jsonMapper);
      Interval interval0 = null;
      try {
        interval0 = new Interval(s3SegmentPusher1);
      } catch(IllegalArgumentException e) {
         //
         // No interval converter found for type: com.metamx.druid.loading.S3SegmentPusher
         //
         verifyException("org.joda.time.convert.ConverterManager", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      S3SegmentPusher s3SegmentPusher0 = new S3SegmentPusher();
      String string0 = "Qu J!I-2m~;S";
      MockFile mockFile0 = new MockFile(string0);
      DataSegment dataSegment0 = null;
      // Undeclared exception!
      try { 
        s3SegmentPusher0.push(mockFile0, dataSegment0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.metamx.druid.loading.S3SegmentPusher", e);
      }
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      String string0 = "os-az|8N:Y+VHAcT";
      String string1 = "/descriptor.json";
      String string2 = "4+#A";
      AWSDevPayCredentials aWSDevPayCredentials0 = new AWSDevPayCredentials(string0, string0, string1, string0, string2);
      RestS3Service restS3Service0 = new RestS3Service(aWSDevPayCredentials0);
      S3SegmentPusherConfig s3SegmentPusherConfig0 = mock(S3SegmentPusherConfig.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(s3SegmentPusherConfig0).getBaseKey();
      JsonFactory jsonFactory0 = new JsonFactory();
      ObjectMapper objectMapper0 = new ObjectMapper(jsonFactory0);
      String string3 = "era";
      int int0 = 2313;
      int int1 = (-975);
      String string4 = null;
      Version version0 = new Version(restS3Service0.BUCKET_STATUS__MY_BUCKET, int0, int1, string4);
      SimpleModule simpleModule0 = new SimpleModule(string3, version0);
      ObjectMapper objectMapper1 = objectMapper0.withModule(simpleModule0);
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      ObjectMapper objectMapper2 = objectMapper1.setTypeFactory(typeFactory0);
      BeanSerializerFactory beanSerializerFactory0 = BeanSerializerFactory.instance;
      ObjectMapper objectMapper3 = objectMapper2.setSerializerFactory(beanSerializerFactory0);
      SerializationConfig.Feature[] serializationConfig_FeatureArray0 = new SerializationConfig.Feature[4];
      SerializationConfig.Feature serializationConfig_Feature0 = SerializationConfig.Feature.WRITE_ENUMS_USING_TO_STRING;
      serializationConfig_FeatureArray0[0] = serializationConfig_Feature0;
      SerializationConfig.Feature serializationConfig_Feature1 = SerializationConfig.Feature.INDENT_OUTPUT;
      serializationConfig_FeatureArray0[1] = serializationConfig_Feature1;
      SerializationConfig.Feature serializationConfig_Feature2 = SerializationConfig.Feature.WRITE_ENUMS_USING_TO_STRING;
      serializationConfig_FeatureArray0[2] = serializationConfig_Feature2;
      SerializationConfig.Feature serializationConfig_Feature3 = SerializationConfig.Feature.WRITE_EMPTY_JSON_ARRAYS;
      serializationConfig_FeatureArray0[3] = serializationConfig_Feature3;
      ObjectMapper objectMapper4 = objectMapper3.disable(serializationConfig_FeatureArray0);
      S3SegmentPusher s3SegmentPusher0 = new S3SegmentPusher(restS3Service0, s3SegmentPusherConfig0, objectMapper4);
      MockFile mockFile0 = new MockFile(string2);
      DataSegment dataSegment0 = null;
      // Undeclared exception!
      try { 
        s3SegmentPusher0.push(mockFile0, dataSegment0);
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      RestS3Service restS3Service0 = null;
      String string0 = "";
      S3SegmentPusherConfig s3SegmentPusherConfig0 = mock(S3SegmentPusherConfig.class, new ViolatedAssumptionAnswer());
      doReturn(string0).when(s3SegmentPusherConfig0).getBaseKey();
      doReturn((String) null).when(s3SegmentPusherConfig0).getBucket();
      ObjectMapper objectMapper0 = new ObjectMapper();
      JsonFactory jsonFactory0 = new JsonFactory(objectMapper0);
      ObjectMapper objectMapper1 = new ObjectMapper(jsonFactory0);
      SerializationConfig.Feature serializationConfig_Feature0 = SerializationConfig.Feature.INDENT_OUTPUT;
      boolean boolean0 = true;
      ObjectMapper objectMapper2 = objectMapper1.configure(serializationConfig_Feature0, boolean0);
      AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
      AnnotationIntrospector.Pair annotationIntrospector_Pair0 = new AnnotationIntrospector.Pair(annotationIntrospector0, annotationIntrospector0);
      AnnotationIntrospector annotationIntrospector1 = AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector_Pair0);
      AnnotationIntrospector annotationIntrospector2 = AnnotationIntrospector.Pair.create(annotationIntrospector1, annotationIntrospector1);
      ObjectMapper objectMapper3 = objectMapper2.setAnnotationIntrospector(annotationIntrospector2);
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      TypeModifier typeModifier0 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
      TypeFactory typeFactory1 = typeFactory0.withModifier(typeModifier0);
      Class<DateTime> class0 = DateTime.class;
      JavaType javaType0 = typeFactory0.uncheckedSimpleType(class0);
      ObjectMapper objectMapper4 = objectMapper3.setTypeFactory(typeFactory1);
      S3SegmentPusher s3SegmentPusher0 = new S3SegmentPusher(restS3Service0, s3SegmentPusherConfig0, objectMapper4);
      LocalFileSystem localFileSystem0 = new LocalFileSystem();
      RawLocalFileSystem rawLocalFileSystem0 = new RawLocalFileSystem();
      Path path0 = rawLocalFileSystem0.getWorkingDirectory();
      File file0 = localFileSystem0.pathToFile(path0);
      YearMonth yearMonth0 = YearMonth.now();
      int int0 = 138;
      YearMonth yearMonth1 = yearMonth0.minusMonths(int0);
      Interval interval0 = yearMonth1.toInterval();
      Map<String, Object> map0 = null;
      PeriodType periodType0 = PeriodType.time();
      Period period0 = interval0.toPeriod(periodType0);
      YearMonth yearMonth2 = yearMonth1.minus(period0);
      List<String> list0 = null;
      ShardSpec shardSpec0 = null;
      long long0 = 15778800000L;
      DataSegment dataSegment0 = new DataSegment(path0.CUR_DIR, interval0, path0.CUR_DIR, map0, list0, list0, shardSpec0, (Integer) yearMonth0.YEAR, long0);
      SegmentDescriptor segmentDescriptor0 = dataSegment0.toDescriptor();
      // Undeclared exception!
      try { 
        s3SegmentPusher0.push(file0, dataSegment0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.metamx.druid.loading.S3SegmentPusher", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      S3SegmentPusher s3SegmentPusher0 = new S3SegmentPusher();
      String string0 = "";
      String string1 = "EYCN{\\\"8Q^G";
      MockFile mockFile0 = new MockFile(string0, string1);
      DataSegment dataSegment0 = null;
      String string2 = "<YA";
      S3SegmentPusherConfig s3SegmentPusherConfig0 = mock(S3SegmentPusherConfig.class, new ViolatedAssumptionAnswer());
      doReturn(string2, (String) null).when(s3SegmentPusherConfig0).getBaseKey();
      s3SegmentPusher0.config = s3SegmentPusherConfig0;
      long long0 = 501L;
      System.setCurrentTimeMillis(long0);
      // Undeclared exception!
      try { 
        s3SegmentPusher0.push(mockFile0, dataSegment0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.metamx.druid.loading.S3SegmentPusher", e);
      }
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      RestS3Service restS3Service0 = null;
      String string0 = "zd[Syu";
      String string1 = "V+St";
      String string2 = "&";
      S3SegmentPusherConfig s3SegmentPusherConfig0 = mock(S3SegmentPusherConfig.class, new ViolatedAssumptionAnswer());
      doReturn(string0, string1).when(s3SegmentPusherConfig0).getBaseKey();
      ObjectMapper objectMapper0 = new ObjectMapper();
      JsonFactory jsonFactory0 = new JsonFactory(objectMapper0);
      ObjectMapper objectMapper1 = new ObjectMapper(jsonFactory0);
      SerializationConfig.Feature serializationConfig_Feature0 = SerializationConfig.Feature.INDENT_OUTPUT;
      boolean boolean0 = true;
      ObjectMapper objectMapper2 = objectMapper1.configure(serializationConfig_Feature0, boolean0);
      AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
      AnnotationIntrospector.Pair annotationIntrospector_Pair0 = new AnnotationIntrospector.Pair(annotationIntrospector0, annotationIntrospector0);
      AnnotationIntrospector annotationIntrospector1 = AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector_Pair0);
      AnnotationIntrospector annotationIntrospector2 = AnnotationIntrospector.Pair.create(annotationIntrospector1, annotationIntrospector1);
      ObjectMapper objectMapper3 = objectMapper2.setAnnotationIntrospector(annotationIntrospector2);
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      TypeModifier typeModifier0 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
      TypeFactory typeFactory1 = typeFactory0.withModifier(typeModifier0);
      Class<DateTime> class0 = DateTime.class;
      JavaType javaType0 = typeFactory0.uncheckedSimpleType(class0);
      ObjectMapper objectMapper4 = objectMapper3.setTypeFactory(typeFactory1);
      S3SegmentPusher s3SegmentPusher0 = new S3SegmentPusher(restS3Service0, s3SegmentPusherConfig0, objectMapper4);
      LocalFileSystem localFileSystem0 = new LocalFileSystem();
      RawLocalFileSystem rawLocalFileSystem0 = new RawLocalFileSystem();
      Path path0 = rawLocalFileSystem0.getWorkingDirectory();
      File file0 = localFileSystem0.pathToFile(path0);
      YearMonth yearMonth0 = YearMonth.now();
      int int0 = 138;
      YearMonth yearMonth1 = yearMonth0.minusMonths(int0);
      Interval interval0 = yearMonth1.toInterval();
      Map<String, Object> map0 = null;
      PeriodType periodType0 = PeriodType.time();
      Period period0 = interval0.toPeriod(periodType0);
      YearMonth yearMonth2 = yearMonth1.minus(period0);
      List<String> list0 = null;
      ShardSpec shardSpec0 = null;
      long long0 = 15778800000L;
      DataSegment dataSegment0 = new DataSegment(path0.CUR_DIR, interval0, path0.CUR_DIR, map0, list0, list0, shardSpec0, (Integer) yearMonth0.YEAR, long0);
      MockFile mockFile0 = new MockFile(file0, dataSegment0.delimiter);
      // Undeclared exception!
      try { 
        s3SegmentPusher0.push(mockFile0, dataSegment0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.metamx.druid.loading.S3SegmentPusher", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      RestS3Service restS3Service0 = null;
      String string0 = "";
      S3SegmentPusherConfig s3SegmentPusherConfig0 = mock(S3SegmentPusherConfig.class, new ViolatedAssumptionAnswer());
      doReturn(string0).when(s3SegmentPusherConfig0).getBaseKey();
      ObjectMapper objectMapper0 = new ObjectMapper();
      JsonFactory jsonFactory0 = new JsonFactory(objectMapper0);
      ObjectMapper objectMapper1 = new ObjectMapper(jsonFactory0);
      SerializationConfig.Feature serializationConfig_Feature0 = SerializationConfig.Feature.INDENT_OUTPUT;
      boolean boolean0 = true;
      AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
      AnnotationIntrospector.Pair annotationIntrospector_Pair0 = new AnnotationIntrospector.Pair(annotationIntrospector0, annotationIntrospector0);
      AnnotationIntrospector annotationIntrospector1 = AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector_Pair0);
      AnnotationIntrospector annotationIntrospector2 = AnnotationIntrospector.Pair.create(annotationIntrospector1, annotationIntrospector1);
      ObjectMapper objectMapper2 = objectMapper0.setAnnotationIntrospector(annotationIntrospector2);
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      TypeModifier typeModifier0 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
      TypeFactory typeFactory1 = typeFactory0.withModifier(typeModifier0);
      Class<DateTime> class0 = DateTime.class;
      JavaType javaType0 = typeFactory0.uncheckedSimpleType(class0);
      ObjectMapper objectMapper3 = objectMapper2.setTypeFactory(typeFactory1);
      S3SegmentPusher s3SegmentPusher0 = new S3SegmentPusher(restS3Service0, s3SegmentPusherConfig0, objectMapper3);
      LocalFileSystem localFileSystem0 = new LocalFileSystem();
      RawLocalFileSystem rawLocalFileSystem0 = new RawLocalFileSystem();
      Path path0 = rawLocalFileSystem0.getWorkingDirectory();
      File file0 = localFileSystem0.pathToFile(path0);
      YearMonth yearMonth0 = YearMonth.now();
      int int0 = 138;
      YearMonth yearMonth1 = yearMonth0.minusMonths(int0);
      Interval interval0 = yearMonth1.toInterval();
      Map<String, Object> map0 = null;
      PeriodType periodType0 = PeriodType.time();
      Period period0 = interval0.toPeriod(periodType0);
      YearMonth yearMonth2 = yearMonth1.minus(period0);
      boolean boolean1 = FileSystemHandling.shouldAllThrowIOExceptions();
      List<String> list0 = null;
      ShardSpec shardSpec0 = null;
      long long0 = 15778800000L;
      DataSegment dataSegment0 = new DataSegment(path0.CUR_DIR, interval0, path0.CUR_DIR, map0, list0, list0, shardSpec0, (Integer) yearMonth0.YEAR, long0);
      SegmentDescriptor segmentDescriptor0 = dataSegment0.toDescriptor();
      try { 
        s3SegmentPusher0.push(file0, dataSegment0);
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      RestS3Service restS3Service0 = null;
      String string0 = "";
      S3SegmentPusherConfig s3SegmentPusherConfig0 = mock(S3SegmentPusherConfig.class, new ViolatedAssumptionAnswer());
      doReturn(string0).when(s3SegmentPusherConfig0).getBaseKey();
      ObjectMapper objectMapper0 = new ObjectMapper();
      JsonFactory jsonFactory0 = new JsonFactory(objectMapper0);
      ObjectMapper objectMapper1 = new ObjectMapper(jsonFactory0);
      SerializationConfig.Feature serializationConfig_Feature0 = SerializationConfig.Feature.INDENT_OUTPUT;
      boolean boolean0 = true;
      AnnotationIntrospector annotationIntrospector0 = AnnotationIntrospector.nopInstance();
      AnnotationIntrospector.Pair annotationIntrospector_Pair0 = new AnnotationIntrospector.Pair(annotationIntrospector0, annotationIntrospector0);
      AnnotationIntrospector annotationIntrospector1 = AnnotationIntrospector.pair(annotationIntrospector0, annotationIntrospector_Pair0);
      AnnotationIntrospector annotationIntrospector2 = AnnotationIntrospector.Pair.create(annotationIntrospector1, annotationIntrospector1);
      ObjectMapper objectMapper2 = objectMapper0.setAnnotationIntrospector(annotationIntrospector2);
      TypeFactory typeFactory0 = TypeFactory.defaultInstance();
      TypeModifier typeModifier0 = mock(TypeModifier.class, new ViolatedAssumptionAnswer());
      TypeFactory typeFactory1 = typeFactory0.withModifier(typeModifier0);
      Class<DateTime> class0 = DateTime.class;
      JavaType javaType0 = typeFactory0.uncheckedSimpleType(class0);
      ObjectMapper objectMapper3 = objectMapper2.setTypeFactory(typeFactory1);
      S3SegmentPusher s3SegmentPusher0 = new S3SegmentPusher(restS3Service0, s3SegmentPusherConfig0, objectMapper3);
      LocalFileSystem localFileSystem0 = new LocalFileSystem();
      RawLocalFileSystem rawLocalFileSystem0 = new RawLocalFileSystem();
      Path path0 = rawLocalFileSystem0.getWorkingDirectory();
      MockFile mockFile0 = new MockFile(path0.SEPARATOR, string0);
      YearMonth yearMonth0 = YearMonth.now();
      int int0 = 138;
      YearMonth yearMonth1 = yearMonth0.minusMonths(int0);
      Interval interval0 = yearMonth1.toInterval();
      Map<String, Object> map0 = null;
      PeriodType periodType0 = PeriodType.time();
      Period period0 = interval0.toPeriod(periodType0);
      YearMonth yearMonth2 = yearMonth1.minus(period0);
      List<String> list0 = null;
      ShardSpec shardSpec0 = null;
      long long0 = 15778800000L;
      DataSegment dataSegment0 = new DataSegment(path0.CUR_DIR, interval0, path0.CUR_DIR, map0, list0, list0, shardSpec0, (Integer) yearMonth0.YEAR, long0);
      SegmentDescriptor segmentDescriptor0 = dataSegment0.toDescriptor();
      try { 
        s3SegmentPusher0.push(mockFile0, dataSegment0);
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }
}
