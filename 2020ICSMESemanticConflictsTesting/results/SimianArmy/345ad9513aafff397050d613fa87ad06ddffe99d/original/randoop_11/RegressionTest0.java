import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.String str0 = com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY = "";
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY = "hi!";
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        basicJanitorMonkeyContext0.exportCredentials("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier janitorEmailNotifier2 = basicJanitorMonkeyContext0.emailNotifier();
        java.lang.Class<?> wildcardClass3 = basicJanitorMonkeyContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(janitorEmailNotifier2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = basicJanitorMonkeyContext0.janitors();
        basicJanitorMonkeyContext0.exportCredentials("", "");
        java.lang.Class<?> wildcardClass6 = basicJanitorMonkeyContext0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractJanitorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = basicJanitorMonkeyContext0.janitors();
        basicJanitorMonkeyContext0.exportCredentials("", "");
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context6 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractJanitorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(context6);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = basicJanitorMonkeyContext0.janitors();
        java.lang.String str3 = basicJanitorMonkeyContext0.getEventReport();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractJanitorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = basicJanitorMonkeyContext0.accountName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "default" + "'", str2.equals("default"));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = basicJanitorMonkeyContext0.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider3 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = basicJanitorMonkeyContext0.awsClient();
        java.lang.String str5 = basicJanitorMonkeyContext0.accountName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSCredentialsProvider3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "default" + "'", str5.equals("default"));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = basicJanitorMonkeyContext0.janitors();
        basicJanitorMonkeyContext0.exportCredentials("", "");
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = basicJanitorMonkeyContext0.calendar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractJanitorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(monkeyCalendar6);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = basicJanitorMonkeyContext0.janitors();
        basicJanitorMonkeyContext0.exportCredentials("", "");
        java.lang.String str6 = basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration7 = basicJanitorMonkeyContext0.configuration();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractJanitorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(monkeyConfiguration7);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.janitor.JanitorEmailNotifier.Context context3 = basicJanitorMonkeyContext0.getJanitorEmailNotifierContext();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = basicJanitorMonkeyContext0.awsClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(context3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSClient4);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient4 = basicJanitorMonkeyContext3.cloudClient();
        java.lang.String str5 = basicJanitorMonkeyContext3.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = basicJanitorMonkeyContext3.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker7, monkeyCalendar8, monkeyConfiguration9, monkeyRecorder10);
        java.lang.String str12 = basicJanitorContext11.region();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSCredentialsProvider6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(janitorResourceTracker7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient4 = basicJanitorMonkeyContext3.cloudClient();
        java.lang.String str5 = basicJanitorMonkeyContext3.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = basicJanitorMonkeyContext3.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker7, monkeyCalendar8, monkeyConfiguration9, monkeyRecorder10);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext11.janitorCrawler();
        java.lang.String str13 = basicJanitorContext11.region();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = basicJanitorContext11.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = basicJanitorContext11.recorder();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler16 = basicJanitorContext11.janitorCrawler();
        java.lang.String str17 = basicJanitorContext11.region();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSCredentialsProvider6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(janitorResourceTracker7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(janitorCrawler12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(janitorRuleEngine14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(monkeyRecorder15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(janitorCrawler16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = basicJanitorMonkeyContext0.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider3 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = basicJanitorMonkeyContext0.configuration();
        com.netflix.simianarmy.MonkeyScheduler monkeyScheduler6 = basicJanitorMonkeyContext0.scheduler();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = basicJanitorMonkeyContext0.calendar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSCredentialsProvider3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(monkeyConfiguration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(monkeyScheduler6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(monkeyCalendar7);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = basicJanitorMonkeyContext0.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider3 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker4 = basicJanitorMonkeyContext0.resourceTracker();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider5 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker6 = basicJanitorMonkeyContext0.resourceTracker();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSCredentialsProvider3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(janitorResourceTracker4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSCredentialsProvider5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(janitorResourceTracker6);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker2 = basicJanitorMonkeyContext0.resourceTracker();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(janitorResourceTracker2);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        basicJanitorMonkeyContext0.exportCredentials("default", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = basicJanitorMonkeyContext0.getEventReport();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar3 = basicJanitorMonkeyContext0.calendar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(monkeyCalendar3);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient4 = basicJanitorMonkeyContext3.cloudClient();
        java.lang.String str5 = basicJanitorMonkeyContext3.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = basicJanitorMonkeyContext3.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext8 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient9 = basicJanitorMonkeyContext8.cloudClient();
        java.lang.String str10 = basicJanitorMonkeyContext8.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider11 = basicJanitorMonkeyContext8.getAwsCredentialsProvider();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider12 = basicJanitorMonkeyContext8.getAwsCredentialsProvider();
        java.lang.String str13 = basicJanitorMonkeyContext8.accountName();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar14 = basicJanitorMonkeyContext8.calendar();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext15 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient16 = basicJanitorMonkeyContext15.cloudClient();
        java.lang.String str17 = basicJanitorMonkeyContext15.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider18 = basicJanitorMonkeyContext15.getAwsCredentialsProvider();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient19 = basicJanitorMonkeyContext15.awsClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration20 = basicJanitorMonkeyContext15.configuration();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext21 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient22 = basicJanitorMonkeyContext21.cloudClient();
        java.lang.String str23 = basicJanitorMonkeyContext21.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider24 = basicJanitorMonkeyContext21.getAwsCredentialsProvider();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient25 = basicJanitorMonkeyContext21.awsClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration26 = basicJanitorMonkeyContext21.configuration();
        basicJanitorMonkeyContext21.exportCredentials("hi!", "");
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder30 = basicJanitorMonkeyContext21.recorder();
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext31 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("hi!", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker7, monkeyCalendar14, monkeyConfiguration20, monkeyRecorder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSCredentialsProvider6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(janitorResourceTracker7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSCredentialsProvider11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSCredentialsProvider12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "default" + "'", str13.equals("default"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(monkeyCalendar14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSCredentialsProvider18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSClient19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(monkeyConfiguration20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "" + "'", str23.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSCredentialsProvider24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSClient25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(monkeyConfiguration26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(monkeyRecorder30);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient4 = basicJanitorMonkeyContext3.cloudClient();
        java.lang.String str5 = basicJanitorMonkeyContext3.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = basicJanitorMonkeyContext3.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker7, monkeyCalendar8, monkeyConfiguration9, monkeyRecorder10);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext11.janitorCrawler();
        java.lang.String str13 = basicJanitorContext11.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext11.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = basicJanitorContext11.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext11.calendar();
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler17 = basicJanitorContext11.janitorCrawler();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSCredentialsProvider6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(janitorResourceTracker7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(janitorCrawler12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(monkeyRecorder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(janitorRuleEngine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(monkeyCalendar16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(janitorCrawler17);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient4 = basicJanitorMonkeyContext3.cloudClient();
        java.lang.String str5 = basicJanitorMonkeyContext3.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = basicJanitorMonkeyContext3.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker7, monkeyCalendar8, monkeyConfiguration9, monkeyRecorder10);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext11.janitorCrawler();
        java.lang.String str13 = basicJanitorContext11.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext11.recorder();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar15 = basicJanitorContext11.calendar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSCredentialsProvider6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(janitorResourceTracker7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(janitorCrawler12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(monkeyRecorder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(monkeyCalendar15);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient4 = basicJanitorMonkeyContext3.cloudClient();
        java.lang.String str5 = basicJanitorMonkeyContext3.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = basicJanitorMonkeyContext3.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker7, monkeyCalendar8, monkeyConfiguration9, monkeyRecorder10);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext11.janitorCrawler();
        java.lang.String str13 = basicJanitorContext11.region();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine14 = basicJanitorContext11.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder15 = basicJanitorContext11.recorder();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder16 = basicJanitorContext11.recorder();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker17 = basicJanitorContext11.janitorResourceTracker();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder18 = basicJanitorContext11.recorder();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSCredentialsProvider6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(janitorResourceTracker7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(janitorCrawler12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(janitorRuleEngine14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(monkeyRecorder15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(monkeyRecorder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(janitorResourceTracker17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(monkeyRecorder18);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = basicJanitorMonkeyContext0.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider3 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider4 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        java.lang.String str5 = basicJanitorMonkeyContext0.accountName();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar6 = basicJanitorMonkeyContext0.calendar();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar7 = basicJanitorMonkeyContext0.calendar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSCredentialsProvider3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSCredentialsProvider4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "default" + "'", str5.equals("default"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(monkeyCalendar6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(monkeyCalendar7);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        java.lang.String str2 = basicJanitorMonkeyContext0.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider3 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient4 = basicJanitorMonkeyContext0.awsClient();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = basicJanitorMonkeyContext0.configuration();
        basicJanitorMonkeyContext0.exportCredentials("hi!", "");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider9 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        com.netflix.simianarmy.CloudClient cloudClient10 = basicJanitorMonkeyContext0.cloudClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSCredentialsProvider3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(monkeyConfiguration5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSCredentialsProvider9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient10);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext3 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient4 = basicJanitorMonkeyContext3.cloudClient();
        java.lang.String str5 = basicJanitorMonkeyContext3.getEventReport();
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = basicJanitorMonkeyContext3.getAwsCredentialsProvider();
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker7 = basicJanitorMonkeyContext3.resourceTracker();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration9 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder10 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext11 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker7, monkeyCalendar8, monkeyConfiguration9, monkeyRecorder10);
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler12 = basicJanitorContext11.janitorCrawler();
        java.lang.String str13 = basicJanitorContext11.region();
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder14 = basicJanitorContext11.recorder();
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine15 = basicJanitorContext11.janitorRuleEngine();
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar16 = basicJanitorContext11.calendar();
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration17 = basicJanitorContext11.configuration();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSCredentialsProvider6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(janitorResourceTracker7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(janitorCrawler12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(monkeyRecorder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(janitorRuleEngine15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(monkeyCalendar16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(monkeyConfiguration17);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = basicJanitorMonkeyContext0.janitors();
        basicJanitorMonkeyContext0.exportCredentials("", "");
        com.amazonaws.auth.AWSCredentialsProvider aWSCredentialsProvider6 = basicJanitorMonkeyContext0.getAwsCredentialsProvider();
        basicJanitorMonkeyContext0.resetEventReport();
        com.netflix.simianarmy.CloudClient cloudClient8 = basicJanitorMonkeyContext0.cloudClient();
        java.lang.Class<?> wildcardClass9 = cloudClient8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractJanitorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSCredentialsProvider6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        com.netflix.simianarmy.CloudClient cloudClient1 = basicJanitorMonkeyContext0.cloudClient();
        java.util.List<com.netflix.simianarmy.janitor.AbstractJanitor> abstractJanitorList2 = basicJanitorMonkeyContext0.janitors();
        com.netflix.simianarmy.client.aws.AWSClient aWSClient3 = basicJanitorMonkeyContext0.awsClient();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(cloudClient1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(abstractJanitorList2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(aWSClient3);
    }
}

