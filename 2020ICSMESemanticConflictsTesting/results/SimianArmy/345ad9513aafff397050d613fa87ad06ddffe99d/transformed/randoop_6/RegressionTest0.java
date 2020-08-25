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
        org.slf4j.Logger logger0 = com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.LOGGER;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.LOGGER = logger0;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(logger0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.String str0 = com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY = "";
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.slf4j.Logger logger0 = com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.LOGGER;
        java.lang.Class<?> wildcardClass1 = logger0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(logger0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext basicJanitorMonkeyContext0 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext();
        java.lang.String str1 = basicJanitorMonkeyContext0.accountName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "default" + "'", str1.equals("default"));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.slf4j.Logger logger0 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.LOGGER = logger0;
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.netflix.simianarmy.basic.BasicSimianArmyContext.GLOBAL_OWNER_TAGKEY = "default";
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null;
        basicJanitorContext7.calendar = monkeyCalendar8;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine10;
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine8 = null;
        basicJanitorContext7.ruleEngine = janitorRuleEngine8;
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine1 = null;
        com.netflix.simianarmy.janitor.JanitorCrawler janitorCrawler2 = null;
        com.netflix.simianarmy.janitor.JanitorResourceTracker janitorResourceTracker3 = null;
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar4 = null;
        com.netflix.simianarmy.MonkeyConfiguration monkeyConfiguration5 = null;
        com.netflix.simianarmy.MonkeyRecorder monkeyRecorder6 = null;
        com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext basicJanitorContext7 = new com.netflix.simianarmy.basic.janitor.BasicJanitorMonkeyContext.BasicJanitorContext("", janitorRuleEngine1, janitorCrawler2, janitorResourceTracker3, monkeyCalendar4, monkeyConfiguration5, monkeyRecorder6);
        com.netflix.simianarmy.MonkeyCalendar monkeyCalendar8 = null;
        basicJanitorContext7.calendar = monkeyCalendar8;
        com.netflix.simianarmy.janitor.JanitorRuleEngine janitorRuleEngine10 = basicJanitorContext7.janitorRuleEngine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(janitorRuleEngine10);
    }
}

