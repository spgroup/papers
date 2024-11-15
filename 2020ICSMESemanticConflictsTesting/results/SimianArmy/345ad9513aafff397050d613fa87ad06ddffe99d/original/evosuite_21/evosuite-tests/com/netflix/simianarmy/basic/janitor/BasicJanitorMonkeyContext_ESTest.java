/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 30 21:52:22 GMT 2020
 */

package com.netflix.simianarmy.basic.janitor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.ClasspathPropertiesFileCredentialsProvider;
import com.netflix.simianarmy.MonkeyCalendar;
import com.netflix.simianarmy.MonkeyConfiguration;
import com.netflix.simianarmy.MonkeyRecorder;
import com.netflix.simianarmy.aws.SimpleDBRecorder;
import com.netflix.simianarmy.aws.janitor.SimpleDBJanitorResourceTracker;
import com.netflix.simianarmy.aws.janitor.crawler.ASGJanitorCrawler;
import com.netflix.simianarmy.aws.janitor.crawler.EBSSnapshotJanitorCrawler;
import com.netflix.simianarmy.aws.janitor.crawler.EBSVolumeJanitorCrawler;
import com.netflix.simianarmy.aws.janitor.crawler.LaunchConfigJanitorCrawler;
import com.netflix.simianarmy.aws.janitor.rule.asg.ASGInstanceValidator;
import com.netflix.simianarmy.aws.janitor.rule.asg.OldEmptyASGRule;
import com.netflix.simianarmy.basic.BasicCalendar;
import com.netflix.simianarmy.basic.BasicChaosMonkeyContext;
import com.netflix.simianarmy.basic.BasicConfiguration;
import com.netflix.simianarmy.basic.BasicSimianArmyContext;
import com.netflix.simianarmy.basic.LocalDbRecorder;
import com.netflix.simianarmy.basic.conformity.BasicConformityMonkeyContext;
import com.netflix.simianarmy.basic.janitor.BasicJanitorMonkey;
import com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext;
import com.netflix.simianarmy.basic.janitor.BasicJanitorRuleEngine;
import com.netflix.simianarmy.basic.janitor.BasicVolumeTaggingMonkeyContext;
import com.netflix.simianarmy.client.aws.AWSClient;
import com.netflix.simianarmy.janitor.AbstractJanitor;
import com.netflix.simianarmy.janitor.JanitorCrawler;
import com.netflix.simianarmy.janitor.JanitorEmailNotifier;
import com.netflix.simianarmy.janitor.JanitorResourceTracker;
import com.netflix.simianarmy.janitor.JanitorRuleEngine;
import com.netflix.simianarmy.janitor.Rule;
import com.vmware.vim25.DVSConfigSpec;
import java.util.List;
import java.util.Properties;
import java.util.SimpleTimeZone;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jcp.xml.dsig.internal.dom.XMLDSigRI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BasicJanitorMonkeyContext_ESTest extends BasicJanitorMonkeyContext_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      BasicJanitorMonkey basicJanitorMonkey0 = new BasicJanitorMonkey(basicJanitorMonkeyContext0);
      String string0 = "";
      // Undeclared exception!
      try { 
        basicJanitorMonkey0.optInResource(string0);
      } catch(IllegalArgumentException e) {
         //
         // The validated string is empty
         //
         verifyException("org.apache.commons.lang.Validate", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      String string0 = "com.amazonaws.services.kms.model.EncryptRequest";
      BasicJanitorRuleEngine basicJanitorRuleEngine0 = new BasicJanitorRuleEngine();
      String string1 = ">L!(eKI)).>?T9-E";
      ClientConfiguration clientConfiguration0 = new ClientConfiguration();
      AWSClient aWSClient0 = new AWSClient(string1, clientConfiguration0);
      LaunchConfigJanitorCrawler launchConfigJanitorCrawler0 = new LaunchConfigJanitorCrawler(aWSClient0);
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      JanitorResourceTracker janitorResourceTracker0 = basicJanitorMonkeyContext0.resourceTracker();
      int int0 = (-1759);
      int int1 = 1;
      String string2 = "zSGF}{v";
      int int2 = 172;
      int int3 = (-500);
      int int4 = 153;
      int int5 = (-2113);
      int int6 = 3;
      int int7 = (-572);
      SimpleTimeZone simpleTimeZone0 = null;
      try {
        simpleTimeZone0 = new SimpleTimeZone(int1, string2, int2, int3, clientConfiguration0.DEFAULT_SOCKET_TIMEOUT, int0, int4, int5, int6, int7);
      } catch(IllegalArgumentException e) {
         //
         // Illegal start month 172
         //
         verifyException("java.util.SimpleTimeZone", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      JanitorEmailNotifier janitorEmailNotifier0 = basicJanitorMonkeyContext0.emailNotifier();
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      String string0 = null;
      BasicJanitorRuleEngine basicJanitorRuleEngine0 = new BasicJanitorRuleEngine();
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      AWSClient aWSClient0 = basicJanitorMonkeyContext0.awsClient();
      EBSSnapshotJanitorCrawler eBSSnapshotJanitorCrawler0 = new EBSSnapshotJanitorCrawler(aWSClient0);
      SimpleDBJanitorResourceTracker simpleDBJanitorResourceTracker0 = new SimpleDBJanitorResourceTracker(aWSClient0, basicJanitorMonkeyContext0.GLOBAL_OWNER_TAGKEY);
      BasicChaosMonkeyContext basicChaosMonkeyContext0 = new BasicChaosMonkeyContext();
      MonkeyConfiguration monkeyConfiguration0 = basicChaosMonkeyContext0.configuration();
      BasicCalendar basicCalendar0 = new BasicCalendar(monkeyConfiguration0);
      LocalDbRecorder localDbRecorder0 = new LocalDbRecorder(monkeyConfiguration0);
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext(string0, basicJanitorRuleEngine0, eBSSnapshotJanitorCrawler0, simpleDBJanitorResourceTracker0, basicCalendar0, monkeyConfiguration0, localDbRecorder0);
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      String string0 = "com.vmware.vim25.ResourceConfigSpec";
      BasicJanitorRuleEngine basicJanitorRuleEngine0 = new BasicJanitorRuleEngine();
      JanitorCrawler janitorCrawler0 = null;
      JanitorResourceTracker janitorResourceTracker0 = null;
      MonkeyCalendar monkeyCalendar0 = null;
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      MonkeyConfiguration monkeyConfiguration0 = basicJanitorMonkeyContext0.configuration();
      AWSClient aWSClient0 = basicJanitorMonkeyContext0.awsClient();
      String string1 = "hD_av)q?W]s:9M";
      SimpleDBRecorder simpleDBRecorder0 = new SimpleDBRecorder(aWSClient0, string1);
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext(string0, basicJanitorRuleEngine0, janitorCrawler0, janitorResourceTracker0, monkeyCalendar0, monkeyConfiguration0, simpleDBRecorder0);
      JanitorRuleEngine janitorRuleEngine0 = basicJanitorMonkeyContext_BasicJanitorContext0.janitorRuleEngine();
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      String string0 = "HYHgS|_zsS$";
      BasicJanitorRuleEngine basicJanitorRuleEngine0 = new BasicJanitorRuleEngine();
      Rule rule0 = null;
      BasicJanitorRuleEngine basicJanitorRuleEngine1 = basicJanitorRuleEngine0.addRule(rule0);
      JanitorCrawler janitorCrawler0 = null;
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      JanitorResourceTracker janitorResourceTracker0 = basicJanitorMonkeyContext0.resourceTracker();
      MonkeyCalendar monkeyCalendar0 = basicJanitorMonkeyContext0.calendar();
      MonkeyConfiguration monkeyConfiguration0 = basicJanitorMonkeyContext0.configuration();
      ClasspathPropertiesFileCredentialsProvider classpathPropertiesFileCredentialsProvider0 = new ClasspathPropertiesFileCredentialsProvider();
      ClientConfiguration clientConfiguration0 = new ClientConfiguration();
      AWSClient aWSClient0 = new AWSClient(basicJanitorMonkeyContext0.GLOBAL_OWNER_TAGKEY, classpathPropertiesFileCredentialsProvider0, clientConfiguration0);
      SimpleDBRecorder simpleDBRecorder0 = new SimpleDBRecorder(aWSClient0, clientConfiguration0.DEFAULT_USER_AGENT);
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext(string0, basicJanitorRuleEngine1, janitorCrawler0, janitorResourceTracker0, monkeyCalendar0, monkeyConfiguration0, simpleDBRecorder0);
      JanitorCrawler janitorCrawler1 = basicJanitorMonkeyContext_BasicJanitorContext0.janitorCrawler();
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      List<AbstractJanitor> list0 = basicJanitorMonkeyContext0.janitors();
      JanitorResourceTracker janitorResourceTracker0 = basicJanitorMonkeyContext0.resourceTracker();
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      JanitorEmailNotifier.Context janitorEmailNotifier_Context0 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      String string0 = "(";
      BasicJanitorRuleEngine basicJanitorRuleEngine0 = new BasicJanitorRuleEngine();
      String string1 = "";
      AWSCredentialsProvider aWSCredentialsProvider0 = null;
      ClientConfiguration clientConfiguration0 = new ClientConfiguration();
      AWSClient aWSClient0 = new AWSClient(string1, aWSCredentialsProvider0, clientConfiguration0);
      EBSVolumeJanitorCrawler eBSVolumeJanitorCrawler0 = new EBSVolumeJanitorCrawler(aWSClient0);
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      JanitorResourceTracker janitorResourceTracker0 = basicJanitorMonkeyContext0.resourceTracker();
      BasicConformityMonkeyContext basicConformityMonkeyContext0 = new BasicConformityMonkeyContext();
      MonkeyConfiguration monkeyConfiguration0 = basicConformityMonkeyContext0.configuration();
      BasicCalendar basicCalendar0 = new BasicCalendar(monkeyConfiguration0);
      XMLDSigRI xMLDSigRI0 = new XMLDSigRI();
      BasicConfiguration basicConfiguration0 = new BasicConfiguration(xMLDSigRI0);
      LocalDbRecorder localDbRecorder0 = new LocalDbRecorder(basicConfiguration0);
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext(string0, basicJanitorRuleEngine0, eBSVolumeJanitorCrawler0, janitorResourceTracker0, basicCalendar0, basicConfiguration0, localDbRecorder0);
      JanitorResourceTracker janitorResourceTracker1 = basicJanitorMonkeyContext_BasicJanitorContext0.janitorResourceTracker();
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      String string0 = null;
      BasicJanitorRuleEngine basicJanitorRuleEngine0 = new BasicJanitorRuleEngine();
      String string1 = "[6wtAkw";
      ClientConfiguration clientConfiguration0 = new ClientConfiguration();
      AWSClient aWSClient0 = new AWSClient(string1, clientConfiguration0);
      ASGJanitorCrawler aSGJanitorCrawler0 = new ASGJanitorCrawler(aWSClient0);
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      JanitorResourceTracker janitorResourceTracker0 = basicJanitorMonkeyContext0.resourceTracker();
      MonkeyCalendar monkeyCalendar0 = basicJanitorMonkeyContext0.calendar();
      BasicConformityMonkeyContext basicConformityMonkeyContext0 = new BasicConformityMonkeyContext();
      MonkeyConfiguration monkeyConfiguration0 = basicConformityMonkeyContext0.configuration();
      LocalDbRecorder localDbRecorder0 = new LocalDbRecorder(monkeyConfiguration0);
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext(string0, basicJanitorRuleEngine0, aSGJanitorCrawler0, janitorResourceTracker0, monkeyCalendar0, monkeyConfiguration0, localDbRecorder0);
      String string2 = basicJanitorMonkeyContext_BasicJanitorContext0.region();
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      String string0 = "com.google.inject.internal.ProviderMethodsModule$LogProvider";
      JanitorRuleEngine janitorRuleEngine0 = null;
      String string1 = null;
      ClientConfiguration clientConfiguration0 = new ClientConfiguration();
      AWSClient aWSClient0 = new AWSClient(string1, clientConfiguration0);
      EBSVolumeJanitorCrawler eBSVolumeJanitorCrawler0 = new EBSVolumeJanitorCrawler(aWSClient0);
      String string2 = "_aWbwk";
      SimpleDBJanitorResourceTracker simpleDBJanitorResourceTracker0 = new SimpleDBJanitorResourceTracker(aWSClient0, string2);
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      MonkeyCalendar monkeyCalendar0 = basicJanitorMonkeyContext0.calendar();
      BasicConformityMonkeyContext basicConformityMonkeyContext0 = new BasicConformityMonkeyContext();
      MonkeyConfiguration monkeyConfiguration0 = basicConformityMonkeyContext0.configuration();
      MonkeyRecorder monkeyRecorder0 = basicJanitorMonkeyContext0.recorder();
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext(string0, janitorRuleEngine0, eBSVolumeJanitorCrawler0, simpleDBJanitorResourceTracker0, monkeyCalendar0, monkeyConfiguration0, monkeyRecorder0);
      MonkeyConfiguration monkeyConfiguration1 = basicJanitorMonkeyContext_BasicJanitorContext0.configuration();
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      String string0 = "";
      BasicJanitorRuleEngine basicJanitorRuleEngine0 = new BasicJanitorRuleEngine();
      String string1 = "],dLVZlq&{pM6a*(GSD";
      AWSClient aWSClient0 = new AWSClient(string1);
      LaunchConfigJanitorCrawler launchConfigJanitorCrawler0 = new LaunchConfigJanitorCrawler(aWSClient0);
      BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new BasicJanitorMonkeyContext();
      JanitorResourceTracker janitorResourceTracker0 = basicJanitorMonkeyContext0.resourceTracker();
      MonkeyCalendar monkeyCalendar0 = null;
      BasicChaosMonkeyContext basicChaosMonkeyContext0 = new BasicChaosMonkeyContext();
      MonkeyConfiguration monkeyConfiguration0 = basicChaosMonkeyContext0.configuration();
      MonkeyRecorder monkeyRecorder0 = basicJanitorMonkeyContext0.recorder();
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext(string0, basicJanitorRuleEngine0, launchConfigJanitorCrawler0, janitorResourceTracker0, monkeyCalendar0, monkeyConfiguration0, monkeyRecorder0);
      MonkeyRecorder monkeyRecorder1 = basicJanitorMonkeyContext_BasicJanitorContext0.recorder();
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      String string0 = "";
      JanitorRuleEngine janitorRuleEngine0 = null;
      String string1 = "com.netflix.servo.monitor.AbstractMonitor";
      ClientConfiguration clientConfiguration0 = null;
      AWSClient aWSClient0 = new AWSClient(string1, clientConfiguration0);
      EBSVolumeJanitorCrawler eBSVolumeJanitorCrawler0 = new EBSVolumeJanitorCrawler(aWSClient0);
      SimpleDBJanitorResourceTracker simpleDBJanitorResourceTracker0 = new SimpleDBJanitorResourceTracker(aWSClient0, string1);
      BasicVolumeTaggingMonkeyContext basicVolumeTaggingMonkeyContext0 = new BasicVolumeTaggingMonkeyContext();
      MonkeyConfiguration monkeyConfiguration0 = basicVolumeTaggingMonkeyContext0.configuration();
      BasicCalendar basicCalendar0 = new BasicCalendar(monkeyConfiguration0);
      SimpleDBRecorder simpleDBRecorder0 = new SimpleDBRecorder(aWSClient0, string0);
      BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorMonkeyContext_BasicJanitorContext0 = new BasicJanitorMonkeyContext.BasicJanitorContext(string0, janitorRuleEngine0, eBSVolumeJanitorCrawler0, simpleDBJanitorResourceTracker0, basicCalendar0, monkeyConfiguration0, simpleDBRecorder0);
      MonkeyCalendar monkeyCalendar0 = basicJanitorMonkeyContext_BasicJanitorContext0.calendar();
  }
}
