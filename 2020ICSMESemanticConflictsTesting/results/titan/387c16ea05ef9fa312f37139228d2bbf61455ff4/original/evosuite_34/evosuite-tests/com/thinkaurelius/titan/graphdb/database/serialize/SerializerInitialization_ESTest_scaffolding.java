/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun May 03 05:52:33 GMT 2020
 */

package com.thinkaurelius.titan.graphdb.database.serialize;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SerializerInitialization_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 10000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "BR"); 
    java.lang.System.setProperty("user.dir", "/server/study-execution/new-nimrod/nimrod-hunoroutput-test-dest/titan/387c16ea05ef9fa312f37139228d2bbf61455ff4/evosuite_34"); 
    java.lang.System.setProperty("user.home", "/server"); 
    java.lang.System.setProperty("user.language", "pt"); 
    java.lang.System.setProperty("user.name", "author-name"); 
    java.lang.System.setProperty("user.timezone", "Europe/Stockholm"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SerializerInitialization_ESTest_scaffolding.class.getClassLoader() ,
      "com.esotericsoftware.kryo.serializers.FieldSerializer$BooleanField",
      "org.apache.commons.lang.StringUtils",
      "com.spatial4j.core.distance.DistanceCalculator",
      "com.google.common.base.Suppliers$SupplierOfInstance",
      "com.google.common.cache.AbstractCache$StatsCounter",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.CharacterSerializer",
      "com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoAttributeSerializerAdapter",
      "com.google.common.collect.PeekingIterator",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.BooleanSerializer",
      "com.spatial4j.core.shape.Shape",
      "com.thinkaurelius.titan.graphdb.database.serialize.AttributeHandling",
      "com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization",
      "com.thinkaurelius.titan.diskstorage.util.ReadByteBuffer$1",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.FullFloatHandler",
      "org.apache.commons.io.filefilter.EmptyFileFilter",
      "com.spatial4j.core.shape.Point",
      "com.thinkaurelius.titan.graphdb.types.TypeAttributeType",
      "org.apache.commons.io.filefilter.TrueFileFilter",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$TreeMapSerializer",
      "com.google.common.cache.Weigher",
      "com.thinkaurelius.titan.core.attribute.Geoshape$Type",
      "org.apache.commons.io.filefilter.AgeFileFilter",
      "com.google.common.collect.ImmutableSet$ArrayImmutableSet",
      "com.thinkaurelius.titan.diskstorage.ReadBuffer",
      "com.thinkaurelius.titan.diskstorage.util.WriteByteBuffer",
      "com.thinkaurelius.titan.diskstorage.util.StaticByteBuffer",
      "com.spatial4j.core.context.SpatialContext",
      "com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer$TypeRegistration",
      "com.google.common.cache.LocalCache$EntryFactory$6",
      "com.google.common.cache.LocalCache$EntryFactory$7",
      "com.google.common.cache.LocalCache$EntryFactory$8",
      "org.apache.commons.io.filefilter.DirectoryFileFilter",
      "com.esotericsoftware.kryo.util.ObjectMap",
      "com.google.common.cache.LocalCache$EntryFactory$2",
      "com.google.common.cache.LocalCache$EntryFactory$3",
      "com.google.common.cache.LocalCache$EntryFactory$4",
      "com.google.common.collect.Iterators$12",
      "org.apache.commons.io.filefilter.SuffixFileFilter",
      "com.google.common.cache.LocalCache$LocalManualCache",
      "com.google.common.cache.LocalCache$EntryFactory$5",
      "com.google.common.collect.Iterators$11",
      "com.google.common.base.Predicate",
      "com.google.common.cache.LocalCache$EntryFactory$1",
      "com.esotericsoftware.kryo.util.Util",
      "com.thinkaurelius.titan.core.AttributeHandler",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$IntSerializer",
      "org.apache.commons.io.filefilter.AndFileFilter",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$CollectionsEmptyListSerializer",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$LongSerializer",
      "com.esotericsoftware.kryo.serializers.DefaultArraySerializers$ByteArraySerializer",
      "com.google.common.util.concurrent.ExecutionError",
      "com.thinkaurelius.titan.diskstorage.util.ReadByteBuffer",
      "com.google.common.cache.LocalCache$ValueReference",
      "com.google.common.collect.Iterators$14",
      "com.google.common.collect.Iterators$13",
      "com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoDataOutput",
      "com.esotericsoftware.kryo.Kryo$1",
      "com.esotericsoftware.reflectasm.FieldAccess",
      "com.google.common.cache.LocalCache",
      "org.apache.commons.io.filefilter.NameFileFilter",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.io.PatternFilenameFilter",
      "com.google.common.cache.LocalCache$StrongAccessEntry",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$EnumSerializer",
      "com.esotericsoftware.kryo.serializers.FieldSerializer$FloatField",
      "com.esotericsoftware.kryo.Serializer",
      "com.esotericsoftware.shaded.org.objenesis.instantiator.ObjectInstantiator",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.ShortSerializer",
      "com.google.common.cache.LocalCache$LocalManualCache$1",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$DateSerializer",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$TimeZoneSerializer",
      "com.thinkaurelius.titan.core.attribute.Geoshape$Point",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.DoubleSerializer",
      "com.google.common.cache.LocalCache$StrongValueReference",
      "com.thinkaurelius.titan.graphdb.database.serialize.DataOutput",
      "com.google.common.base.Equivalence$Equals",
      "com.esotericsoftware.kryo.serializers.DefaultArraySerializers$ObjectArraySerializer",
      "com.spatial4j.core.shape.Circle",
      "com.esotericsoftware.reflectasm.shaded.org.objectweb.asm.FieldVisitor",
      "com.esotericsoftware.kryo.serializers.DefaultArraySerializers$IntArraySerializer",
      "com.esotericsoftware.kryo.serializers.DefaultArraySerializers$LongArraySerializer",
      "org.apache.commons.io.filefilter.WildcardFilter",
      "com.esotericsoftware.kryo.util.IntArray",
      "com.esotericsoftware.kryo.serializers.FieldSerializer$CharField",
      "com.google.common.base.Preconditions",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$StringBufferSerializer",
      "com.google.common.collect.EmptyImmutableList",
      "com.thinkaurelius.titan.core.attribute.Geoshape",
      "com.esotericsoftware.kryo.util.MapReferenceResolver",
      "com.esotericsoftware.reflectasm.shaded.org.objectweb.asm.AnnotationWriter",
      "org.apache.commons.io.filefilter.IOFileFilter",
      "com.esotericsoftware.kryo.serializers.DefaultArraySerializers$StringArraySerializer",
      "org.apache.commons.io.filefilter.MagicNumberFileFilter",
      "com.google.common.collect.ImmutableCollection",
      "com.esotericsoftware.kryo.serializers.FieldSerializer$StringField",
      "com.google.common.cache.LocalCache$AccessQueue",
      "com.esotericsoftware.reflectasm.shaded.org.objectweb.asm.ByteVector",
      "com.esotericsoftware.reflectasm.shaded.org.objectweb.asm.MethodWriter",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.LongSerializer",
      "com.google.common.cache.LocalCache$WeightedWeakValueReference",
      "com.thinkaurelius.titan.diskstorage.StaticBuffer$Factory",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$CalendarSerializer",
      "com.esotericsoftware.kryo.serializers.FieldSerializer$LongField",
      "com.google.common.base.Objects",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.Iterators$7",
      "com.google.common.collect.ImmutableSet",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$CharSerializer",
      "com.thinkaurelius.titan.graphdb.database.serialize.Serializer",
      "org.apache.commons.io.filefilter.AbstractFileFilter",
      "com.thinkaurelius.titan.graphdb.types.IndexParameters",
      "com.spatial4j.core.exception.InvalidShapeException",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$FloatSerializer",
      "com.google.common.collect.Iterators$3",
      "org.apache.commons.io.filefilter.HiddenFileFilter",
      "com.google.common.cache.CacheLoader",
      "com.thinkaurelius.titan.core.attribute.FullFloat",
      "com.thinkaurelius.titan.diskstorage.util.StaticArrayBuffer",
      "org.apache.commons.io.filefilter.FalseFileFilter",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$ShortSerializer",
      "com.thinkaurelius.titan.graphdb.types.TitanTypeClass",
      "com.google.common.base.Ticker$1",
      "com.google.common.cache.LocalCache$SoftValueReference",
      "com.esotericsoftware.kryo.util.IntMap",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$CollectionsSingletonSetSerializer",
      "com.thinkaurelius.titan.diskstorage.StaticBuffer$1",
      "com.esotericsoftware.kryo.io.Output",
      "com.google.common.util.concurrent.MoreExecutors",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$BigDecimalSerializer",
      "com.google.common.cache.LocalCache$WeightedSoftValueReference",
      "com.google.common.base.Equivalence$Identity",
      "com.google.common.util.concurrent.ListenableFuture",
      "com.google.common.base.Supplier",
      "com.esotericsoftware.kryo.serializers.FieldSerializer$ShortField",
      "com.thinkaurelius.titan.diskstorage.WriteBuffer",
      "com.esotericsoftware.kryo.KryoSerializable",
      "com.google.common.collect.EmptyImmutableSet",
      "com.tinkerpop.blueprints.Vertex",
      "org.apache.commons.io.filefilter.OrFileFilter",
      "com.esotericsoftware.reflectasm.AccessClassLoader",
      "com.google.common.collect.ImmutableList",
      "com.google.common.util.concurrent.UncheckedExecutionException",
      "com.google.common.cache.LocalCache$2",
      "com.esotericsoftware.kryo.io.Input",
      "com.tinkerpop.blueprints.Element",
      "com.google.common.cache.CacheBuilder$NullListener",
      "com.google.common.cache.LocalCache$1",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$BigIntegerSerializer",
      "com.google.common.cache.LocalCache$StrongEntry",
      "com.esotericsoftware.kryo.DefaultSerializer",
      "com.google.common.cache.LocalCache$Strength$3",
      "com.google.common.cache.LocalCache$Strength$2",
      "com.google.common.cache.LocalCache$Strength$1",
      "com.google.common.cache.LocalCache$Segment",
      "com.google.common.cache.LocalCache$ReferenceEntry",
      "com.esotericsoftware.kryo.serializers.DefaultArraySerializers$CharArraySerializer",
      "com.thinkaurelius.titan.core.Parameter",
      "com.google.common.cache.Cache",
      "org.apache.commons.io.filefilter.CanWriteFileFilter",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$CurrencySerializer",
      "com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer$1",
      "com.google.common.collect.Hashing",
      "com.google.common.cache.LocalCache$WeightedStrongValueReference",
      "com.google.common.cache.LoadingCache",
      "com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer",
      "com.esotericsoftware.kryo.serializers.FieldSerializer$Optional",
      "com.google.common.collect.ImmutableList$SubList",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.IntegerSerializer",
      "com.google.common.base.FunctionalEquivalence",
      "com.thinkaurelius.titan.graphdb.database.serialize.kryo.InputScanBuffer",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.FloatSerializer",
      "com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer$2",
      "com.esotericsoftware.kryo.serializers.CollectionSerializer",
      "com.esotericsoftware.kryo.serializers.FieldSerializer$IntField",
      "com.google.common.collect.RegularImmutableList",
      "com.esotericsoftware.reflectasm.MethodAccess",
      "com.google.common.cache.CacheBuilder$OneWeigher",
      "com.esotericsoftware.kryo.serializers.DefaultArraySerializers$ShortArraySerializer",
      "com.google.common.cache.CacheLoader$UnsupportedLoadingOperationException",
      "org.apache.commons.io.filefilter.NotFileFilter",
      "com.google.common.cache.LocalCache$EntryFactory",
      "com.spatial4j.core.distance.DistanceUtils",
      "com.google.common.cache.CacheLoader$InvalidCacheLoadException",
      "com.thinkaurelius.titan.diskstorage.ScanBuffer",
      "com.thinkaurelius.titan.diskstorage.StaticBuffer",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.DateSerializer",
      "com.google.common.cache.LocalCache$WeakValueReference",
      "com.esotericsoftware.kryo.serializers.DefaultArraySerializers$FloatArraySerializer",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$EnumSetSerializer",
      "com.esotericsoftware.kryo.Registration",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$ClassSerializer",
      "org.apache.commons.io.filefilter.ConditionalFileFilter",
      "com.google.common.base.Ticker",
      "com.google.common.collect.RegularImmutableSet",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$StringSerializer",
      "com.esotericsoftware.kryo.NotNull",
      "com.thinkaurelius.titan.diskstorage.util.ReadArrayBuffer$1",
      "com.esotericsoftware.reflectasm.shaded.org.objectweb.asm.ClassVisitor",
      "com.thinkaurelius.titan.graphdb.types.IndexType",
      "com.esotericsoftware.kryo.serializers.FieldSerializer",
      "com.google.common.cache.CacheStats",
      "com.google.common.util.concurrent.ListeningExecutorService",
      "com.google.common.cache.RemovalCause$4",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.ByteSerializer",
      "com.google.common.cache.RemovalCause$5",
      "org.apache.commons.io.filefilter.DelegateFileFilter",
      "com.google.common.collect.ImmutableAsList",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$CollectionsEmptySetSerializer",
      "com.google.common.cache.RemovalCause$1",
      "com.google.common.cache.RemovalCause$2",
      "com.google.common.cache.RemovalCause$3",
      "com.google.common.collect.RegularImmutableAsList",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$DoubleSerializer",
      "com.thinkaurelius.titan.graphdb.database.serialize.DefaultAttributeHandling",
      "com.google.common.collect.SingletonImmutableSet",
      "com.thinkaurelius.titan.diskstorage.util.ReadArrayBuffer",
      "com.thinkaurelius.titan.core.AttributeSerializer",
      "com.esotericsoftware.kryo.serializers.FieldSerializer$ByteField",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$StringBuilderSerializer",
      "com.google.common.util.concurrent.AbstractListeningExecutorService",
      "com.google.common.util.concurrent.ListeningScheduledExecutorService",
      "com.esotericsoftware.kryo.ReferenceResolver",
      "com.esotericsoftware.kryo.serializers.FieldSerializer$DoubleField",
      "com.esotericsoftware.kryo.serializers.FieldSerializer$CachedField",
      "com.google.common.collect.ObjectArrays",
      "com.tinkerpop.blueprints.Edge",
      "com.google.common.collect.AbstractIterator",
      "com.esotericsoftware.kryo.serializers.DefaultArraySerializers$DoubleArraySerializer",
      "com.google.common.collect.ImmutableList$1",
      "com.esotericsoftware.reflectasm.shaded.org.objectweb.asm.MethodVisitor",
      "com.esotericsoftware.kryo.ClassResolver",
      "com.thinkaurelius.titan.graphdb.types.TypeAttribute",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$CollectionsEmptyMapSerializer",
      "org.apache.commons.io.filefilter.WildcardFileFilter",
      "com.google.common.cache.RemovalListener",
      "com.google.common.collect.UnmodifiableIterator",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.GeoshapeHandler",
      "com.esotericsoftware.kryo.serializers.DefaultArraySerializers$BooleanArraySerializer",
      "com.esotericsoftware.kryo.Kryo",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$ByteSerializer",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.collect.SingletonImmutableList",
      "com.spatial4j.core.distance.AbstractDistanceCalculator",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.FullDoubleHandler",
      "com.google.common.base.Function",
      "com.spatial4j.core.shape.Rectangle",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.StringSerializer",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.thinkaurelius.titan.graphdb.types.TypeAttribute$Map",
      "com.thinkaurelius.titan.core.Order",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$CollectionsSingletonMapSerializer",
      "org.apache.commons.io.filefilter.FileFileFilter",
      "com.esotericsoftware.kryo.util.IdentityObjectIntMap",
      "com.esotericsoftware.reflectasm.shaded.org.objectweb.asm.AnnotationVisitor",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$CollectionsSingletonListSerializer",
      "com.google.common.cache.CacheBuilder",
      "com.spatial4j.core.distance.GeodesicSphereDistCalc$Haversine",
      "org.apache.commons.io.filefilter.CanReadFileFilter",
      "com.google.common.util.concurrent.MoreExecutors$SameThreadExecutorService",
      "com.spatial4j.core.distance.GeodesicSphereDistCalc",
      "com.google.common.cache.LocalCache$AccessQueue$1",
      "com.google.common.cache.LocalCache$Strength",
      "org.apache.commons.io.IOCase",
      "com.google.common.cache.LocalCache$NullEntry",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$BooleanSerializer",
      "com.esotericsoftware.kryo.serializers.FieldSerializer$AsmCachedField",
      "com.esotericsoftware.kryo.util.DefaultClassResolver",
      "com.spatial4j.core.io.ShapeReadWriter",
      "com.esotericsoftware.kryo.Kryo$DefaultSerializerEntry",
      "com.google.common.collect.Iterators",
      "com.esotericsoftware.reflectasm.ConstructorAccess",
      "com.esotericsoftware.reflectasm.shaded.org.objectweb.asm.ClassWriter",
      "org.apache.commons.io.filefilter.SizeFileFilter",
      "com.esotericsoftware.kryo.KryoException",
      "com.spatial4j.core.shape.impl.RectangleImpl",
      "com.google.common.base.PairwiseEquivalence",
      "com.thinkaurelius.titan.core.attribute.FullDouble",
      "com.esotericsoftware.reflectasm.shaded.org.objectweb.asm.Item",
      "com.google.common.base.Suppliers",
      "com.spatial4j.core.shape.SpatialRelation",
      "com.esotericsoftware.kryo.serializers.FieldSerializer$ObjectField",
      "com.esotericsoftware.minlog.Log$Logger",
      "org.apache.commons.io.filefilter.RegexFileFilter",
      "com.google.common.cache.LocalCache$AbstractReferenceEntry",
      "com.google.common.base.Equivalence",
      "com.thinkaurelius.titan.diskstorage.util.ByteBufferUtil",
      "com.esotericsoftware.kryo.serializers.MapSerializer",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$KryoSerializableSerializer",
      "com.esotericsoftware.reflectasm.shaded.org.objectweb.asm.FieldWriter",
      "org.apache.commons.io.filefilter.PrefixFileFilter",
      "com.google.common.cache.RemovalCause",
      "com.google.common.cache.CacheBuilder$1",
      "com.esotericsoftware.minlog.Log",
      "com.spatial4j.core.distance.CartesianDistCalc",
      "com.google.common.cache.CacheBuilder$3",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.cache.CacheBuilder$2"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SerializerInitialization_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.thinkaurelius.titan.graphdb.database.serialize.SerializerInitialization",
      "com.thinkaurelius.titan.graphdb.database.serialize.DefaultAttributeHandling",
      "com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer$1",
      "com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer",
      "com.google.common.cache.CacheBuilder$1",
      "com.google.common.base.Suppliers",
      "com.google.common.base.Suppliers$SupplierOfInstance",
      "com.google.common.cache.CacheStats",
      "com.google.common.base.Preconditions",
      "com.google.common.cache.CacheBuilder$2",
      "com.google.common.base.Ticker$1",
      "com.google.common.base.Ticker",
      "com.google.common.cache.CacheBuilder$3",
      "com.google.common.cache.CacheBuilder",
      "com.google.common.cache.LocalCache$LocalManualCache",
      "com.google.common.util.concurrent.MoreExecutors",
      "com.google.common.util.concurrent.AbstractListeningExecutorService",
      "com.google.common.util.concurrent.MoreExecutors$SameThreadExecutorService",
      "com.google.common.cache.LocalCache$1",
      "com.google.common.cache.LocalCache$2",
      "com.google.common.cache.LocalCache",
      "com.google.common.cache.LocalCache$Strength",
      "com.google.common.base.Objects",
      "com.google.common.base.Equivalence",
      "com.google.common.base.Equivalence$Equals",
      "com.google.common.cache.CacheBuilder$OneWeigher",
      "com.google.common.cache.CacheBuilder$NullListener",
      "com.google.common.cache.LocalCache$EntryFactory",
      "com.google.common.cache.LocalCache$Segment",
      "com.google.common.cache.LocalCache$AccessQueue",
      "com.google.common.cache.LocalCache$AbstractReferenceEntry",
      "com.google.common.cache.LocalCache$AccessQueue$1",
      "com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer$2",
      "com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoSerializer$TypeRegistration",
      "com.google.common.cache.LocalCache$StrongEntry",
      "com.google.common.cache.LocalCache$StrongAccessEntry",
      "com.google.common.cache.LocalCache$NullEntry",
      "com.google.common.cache.LocalCache$StrongValueReference",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.StringSerializer",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.CharacterSerializer",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.ShortSerializer",
      "com.esotericsoftware.kryo.Serializer",
      "com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoAttributeSerializerAdapter",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.DateSerializer",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.LongSerializer",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.IntegerSerializer",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.DoubleSerializer",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.FloatSerializer",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.GeoshapeHandler",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.ByteSerializer",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.BooleanSerializer",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.FullFloatHandler",
      "com.thinkaurelius.titan.graphdb.database.serialize.attribute.FullDoubleHandler",
      "com.thinkaurelius.titan.diskstorage.util.StaticByteBuffer",
      "com.thinkaurelius.titan.diskstorage.util.ReadByteBuffer",
      "com.esotericsoftware.kryo.io.Input",
      "com.esotericsoftware.kryo.Kryo",
      "com.esotericsoftware.kryo.util.DefaultClassResolver",
      "com.esotericsoftware.kryo.util.IntMap",
      "com.esotericsoftware.kryo.util.ObjectMap",
      "com.esotericsoftware.kryo.util.MapReferenceResolver",
      "com.esotericsoftware.kryo.util.IdentityObjectIntMap",
      "com.esotericsoftware.kryo.util.IntArray",
      "com.esotericsoftware.kryo.Kryo$DefaultSerializerEntry",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$IntSerializer",
      "com.esotericsoftware.kryo.Registration",
      "com.esotericsoftware.minlog.Log$Logger",
      "com.esotericsoftware.minlog.Log",
      "com.esotericsoftware.kryo.util.Util",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$StringSerializer",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$FloatSerializer",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$BooleanSerializer",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$ByteSerializer",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$CharSerializer",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$ShortSerializer",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$LongSerializer",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$DoubleSerializer",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$ClassSerializer",
      "com.esotericsoftware.kryo.serializers.FieldSerializer",
      "com.esotericsoftware.kryo.serializers.FieldSerializer$CachedField",
      "com.esotericsoftware.kryo.serializers.FieldSerializer$ObjectField",
      "com.esotericsoftware.kryo.serializers.DefaultArraySerializers$CharArraySerializer",
      "com.esotericsoftware.kryo.serializers.DefaultArraySerializers$ShortArraySerializer",
      "com.esotericsoftware.kryo.serializers.DefaultArraySerializers$FloatArraySerializer",
      "com.esotericsoftware.kryo.serializers.DefaultArraySerializers$ObjectArraySerializer",
      "com.esotericsoftware.kryo.serializers.DefaultArraySerializers$StringArraySerializer",
      "com.esotericsoftware.kryo.serializers.DefaultSerializers$EnumSerializer",
      "com.esotericsoftware.kryo.serializers.CollectionSerializer",
      "com.esotericsoftware.kryo.serializers.MapSerializer",
      "com.esotericsoftware.kryo.serializers.DefaultArraySerializers$IntArraySerializer",
      "com.esotericsoftware.kryo.serializers.DefaultArraySerializers$DoubleArraySerializer",
      "com.esotericsoftware.kryo.serializers.DefaultArraySerializers$LongArraySerializer",
      "com.esotericsoftware.kryo.serializers.DefaultArraySerializers$ByteArraySerializer",
      "com.esotericsoftware.kryo.serializers.DefaultArraySerializers$BooleanArraySerializer",
      "com.thinkaurelius.titan.graphdb.types.TitanTypeClass",
      "com.thinkaurelius.titan.diskstorage.util.StaticArrayBuffer",
      "com.thinkaurelius.titan.diskstorage.util.ReadArrayBuffer",
      "com.thinkaurelius.titan.diskstorage.util.WriteByteBuffer",
      "com.esotericsoftware.kryo.io.Output",
      "com.thinkaurelius.titan.graphdb.database.serialize.kryo.KryoDataOutput",
      "com.thinkaurelius.titan.diskstorage.StaticBuffer$1",
      "com.thinkaurelius.titan.diskstorage.StaticBuffer",
      "com.esotericsoftware.kryo.KryoException",
      "com.thinkaurelius.titan.graphdb.types.IndexType",
      "com.google.common.cache.RemovalCause",
      "com.thinkaurelius.titan.core.attribute.FullDouble",
      "com.thinkaurelius.titan.graphdb.types.TypeAttribute",
      "com.thinkaurelius.titan.core.Parameter",
      "org.apache.commons.lang.StringUtils",
      "com.thinkaurelius.titan.graphdb.types.IndexParameters",
      "com.thinkaurelius.titan.diskstorage.util.ByteBufferUtil",
      "com.spatial4j.core.distance.AbstractDistanceCalculator",
      "com.spatial4j.core.distance.DistanceUtils",
      "com.spatial4j.core.distance.GeodesicSphereDistCalc",
      "com.spatial4j.core.distance.GeodesicSphereDistCalc$Haversine",
      "com.spatial4j.core.shape.impl.RectangleImpl",
      "com.spatial4j.core.io.ShapeReadWriter",
      "com.spatial4j.core.context.SpatialContext",
      "com.thinkaurelius.titan.core.attribute.Geoshape",
      "com.thinkaurelius.titan.graphdb.database.serialize.kryo.InputScanBuffer",
      "com.thinkaurelius.titan.core.attribute.FullFloat",
      "com.thinkaurelius.titan.diskstorage.util.ReadArrayBuffer$1",
      "com.thinkaurelius.titan.graphdb.types.TypeAttribute$Map",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$12",
      "com.esotericsoftware.reflectasm.ConstructorAccess",
      "com.esotericsoftware.reflectasm.AccessClassLoader",
      "com.esotericsoftware.reflectasm.shaded.org.objectweb.asm.ClassVisitor",
      "com.esotericsoftware.reflectasm.shaded.org.objectweb.asm.ClassWriter",
      "com.esotericsoftware.reflectasm.shaded.org.objectweb.asm.ByteVector",
      "com.esotericsoftware.reflectasm.shaded.org.objectweb.asm.Item",
      "com.esotericsoftware.reflectasm.shaded.org.objectweb.asm.MethodVisitor",
      "com.esotericsoftware.reflectasm.shaded.org.objectweb.asm.MethodWriter",
      "com.esotericsoftware.kryo.Kryo$1",
      "com.thinkaurelius.titan.diskstorage.util.ReadByteBuffer$1"
    );
  }
}
