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
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder8 = builder6.setServer("");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder9 = builder7.setLog(log8);
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean11 = logLevel10.log();
        boolean boolean12 = logLevel10.log();
        retrofit.RestAdapter.Builder builder13 = builder7.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder14 = builder6.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder16 = builder14.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean18 = logLevel17.log();
        retrofit.RestAdapter.Builder builder19 = builder16.setLogLevel(logLevel17);
        retrofit.RestAdapter restAdapter20 = builder16.build();
        retrofit.RestAdapter.Builder builder22 = builder16.setServer("hi!");
        retrofit.RestAdapter.Builder builder23 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log24 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder25 = builder23.setLog(log24);
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean27 = logLevel26.log();
        boolean boolean28 = logLevel26.log();
        retrofit.RestAdapter.Builder builder29 = builder23.setLogLevel(logLevel26);
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log31 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder32 = builder30.setLog(log31);
        retrofit.RestAdapter.LogLevel logLevel33 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean34 = logLevel33.log();
        boolean boolean35 = logLevel33.log();
        retrofit.RestAdapter.Builder builder36 = builder30.setLogLevel(logLevel33);
        retrofit.RestAdapter.Builder builder37 = builder29.setLogLevel(logLevel33);
        retrofit.RestAdapter.Builder builder39 = builder37.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel40 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean41 = logLevel40.log();
        retrofit.RestAdapter.Builder builder42 = builder39.setLogLevel(logLevel40);
        retrofit.RestAdapter restAdapter43 = builder39.build();
        retrofit.RestAdapter.LogLevel logLevel44 = restAdapter43.getLogLevel();
        retrofit.RestAdapter.Builder builder45 = builder22.setLogLevel(logLevel44);
        retrofit.RestAdapter.Log log46 = retrofit.RestAdapter.Log.NONE;
        log46.log("hi!");
        retrofit.RestAdapter.Builder builder49 = builder22.setLog(log46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder51 = builder49.setServer("");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder9 = builder7.setLog(log8);
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean11 = logLevel10.log();
        boolean boolean12 = logLevel10.log();
        retrofit.RestAdapter.Builder builder13 = builder7.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder14 = builder6.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder16 = builder6.setServer("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder18 = builder16.setServer("");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder9 = builder7.setLog(log8);
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean11 = logLevel10.log();
        boolean boolean12 = logLevel10.log();
        retrofit.RestAdapter.Builder builder13 = builder7.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder14 = builder6.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder16 = builder14.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean18 = logLevel17.log();
        retrofit.RestAdapter.Builder builder19 = builder16.setLogLevel(logLevel17);
        retrofit.RestAdapter restAdapter20 = builder16.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder22 = builder16.setServer("");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder4 = builder0.setLog(log3);
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log6 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder7 = builder5.setLog(log6);
        retrofit.RestAdapter.LogLevel logLevel8 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean9 = logLevel8.log();
        boolean boolean10 = logLevel8.log();
        retrofit.RestAdapter.Builder builder11 = builder5.setLogLevel(logLevel8);
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log13 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder14 = builder12.setLog(log13);
        retrofit.RestAdapter.LogLevel logLevel15 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean16 = logLevel15.log();
        boolean boolean17 = logLevel15.log();
        retrofit.RestAdapter.Builder builder18 = builder12.setLogLevel(logLevel15);
        retrofit.RestAdapter.Builder builder19 = builder11.setLogLevel(logLevel15);
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log21 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder22 = builder20.setLog(log21);
        retrofit.RestAdapter.Builder builder23 = builder19.setLog(log21);
        retrofit.RestAdapter.Builder builder24 = builder4.setLog(log21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder26 = builder4.setServer("");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder9 = builder7.setLog(log8);
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean11 = logLevel10.log();
        boolean boolean12 = logLevel10.log();
        retrofit.RestAdapter.Builder builder13 = builder7.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder14 = builder6.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder16 = builder14.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean18 = logLevel17.log();
        retrofit.RestAdapter.Builder builder19 = builder16.setLogLevel(logLevel17);
        retrofit.RestAdapter restAdapter20 = builder16.build();
        retrofit.RestAdapter.Builder builder22 = builder16.setServer("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder24 = builder16.setServer("");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder4 = builder0.setLog(log3);
        retrofit.RestAdapter.Builder builder5 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log6 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder7 = builder5.setLog(log6);
        retrofit.RestAdapter.LogLevel logLevel8 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean9 = logLevel8.log();
        boolean boolean10 = logLevel8.log();
        retrofit.RestAdapter.Builder builder11 = builder5.setLogLevel(logLevel8);
        retrofit.RestAdapter.Builder builder12 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log13 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder14 = builder12.setLog(log13);
        retrofit.RestAdapter.LogLevel logLevel15 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean16 = logLevel15.log();
        boolean boolean17 = logLevel15.log();
        retrofit.RestAdapter.Builder builder18 = builder12.setLogLevel(logLevel15);
        retrofit.RestAdapter.Builder builder19 = builder11.setLogLevel(logLevel15);
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log21 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder22 = builder20.setLog(log21);
        retrofit.RestAdapter.Builder builder23 = builder19.setLog(log21);
        retrofit.RestAdapter.Builder builder24 = builder4.setLog(log21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder26 = builder24.setServer("");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder9 = builder7.setLog(log8);
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean11 = logLevel10.log();
        boolean boolean12 = logLevel10.log();
        retrofit.RestAdapter.Builder builder13 = builder7.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder14 = builder6.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log16 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder17 = builder15.setLog(log16);
        retrofit.RestAdapter.LogLevel logLevel18 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean19 = logLevel18.log();
        boolean boolean20 = logLevel18.log();
        retrofit.RestAdapter.Builder builder21 = builder15.setLogLevel(logLevel18);
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log23 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder24 = builder22.setLog(log23);
        retrofit.RestAdapter.LogLevel logLevel25 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean26 = logLevel25.log();
        boolean boolean27 = logLevel25.log();
        retrofit.RestAdapter.Builder builder28 = builder22.setLogLevel(logLevel25);
        retrofit.RestAdapter.Builder builder29 = builder21.setLogLevel(logLevel25);
        retrofit.RestAdapter.Builder builder30 = builder6.setLogLevel(logLevel25);
        retrofit.RestAdapter.Builder builder31 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log32 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder33 = builder31.setLog(log32);
        retrofit.RestAdapter.LogLevel logLevel34 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean35 = logLevel34.log();
        boolean boolean36 = logLevel34.log();
        retrofit.RestAdapter.Builder builder37 = builder31.setLogLevel(logLevel34);
        boolean boolean38 = logLevel34.log();
        retrofit.RestAdapter.Builder builder39 = builder30.setLogLevel(logLevel34);
        retrofit.RestAdapter.LogLevel logLevel40 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder41 = builder30.setLogLevel(logLevel40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder43 = builder30.setServer("");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder9 = builder7.setLog(log8);
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean11 = logLevel10.log();
        boolean boolean12 = logLevel10.log();
        retrofit.RestAdapter.Builder builder13 = builder7.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder14 = builder6.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log16 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder17 = builder15.setLog(log16);
        retrofit.RestAdapter.LogLevel logLevel18 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean19 = logLevel18.log();
        boolean boolean20 = logLevel18.log();
        retrofit.RestAdapter.Builder builder21 = builder15.setLogLevel(logLevel18);
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log23 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder24 = builder22.setLog(log23);
        retrofit.RestAdapter.LogLevel logLevel25 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean26 = logLevel25.log();
        boolean boolean27 = logLevel25.log();
        retrofit.RestAdapter.Builder builder28 = builder22.setLogLevel(logLevel25);
        retrofit.RestAdapter.Builder builder29 = builder21.setLogLevel(logLevel25);
        retrofit.RestAdapter.Builder builder30 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log31 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder32 = builder30.setLog(log31);
        retrofit.RestAdapter.Builder builder33 = builder29.setLog(log31);
        retrofit.RestAdapter.Builder builder34 = builder6.setLog(log31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder36 = builder34.setServer("");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log4 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder5 = builder3.setLog(log4);
        retrofit.RestAdapter.LogLevel logLevel6 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean7 = logLevel6.log();
        boolean boolean8 = logLevel6.log();
        retrofit.RestAdapter.Builder builder9 = builder3.setLogLevel(logLevel6);
        retrofit.RestAdapter.Builder builder10 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log11 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder12 = builder10.setLog(log11);
        retrofit.RestAdapter.LogLevel logLevel13 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean14 = logLevel13.log();
        boolean boolean15 = logLevel13.log();
        retrofit.RestAdapter.Builder builder16 = builder10.setLogLevel(logLevel13);
        retrofit.RestAdapter.Builder builder17 = builder9.setLogLevel(logLevel13);
        retrofit.RestAdapter.Builder builder19 = builder17.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel20 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean21 = logLevel20.log();
        retrofit.RestAdapter.Builder builder22 = builder19.setLogLevel(logLevel20);
        retrofit.RestAdapter restAdapter23 = builder19.build();
        retrofit.RestAdapter.Builder builder25 = builder19.setServer("hi!");
        retrofit.RestAdapter.Builder builder26 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log27 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder28 = builder26.setLog(log27);
        retrofit.RestAdapter.LogLevel logLevel29 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean30 = logLevel29.log();
        boolean boolean31 = logLevel29.log();
        retrofit.RestAdapter.Builder builder32 = builder26.setLogLevel(logLevel29);
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log34 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder35 = builder33.setLog(log34);
        retrofit.RestAdapter.LogLevel logLevel36 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean37 = logLevel36.log();
        boolean boolean38 = logLevel36.log();
        retrofit.RestAdapter.Builder builder39 = builder33.setLogLevel(logLevel36);
        retrofit.RestAdapter.Builder builder40 = builder32.setLogLevel(logLevel36);
        retrofit.RestAdapter.Builder builder42 = builder40.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel43 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean44 = logLevel43.log();
        retrofit.RestAdapter.Builder builder45 = builder42.setLogLevel(logLevel43);
        retrofit.RestAdapter restAdapter46 = builder42.build();
        retrofit.RestAdapter.LogLevel logLevel47 = restAdapter46.getLogLevel();
        retrofit.RestAdapter.Builder builder48 = builder25.setLogLevel(logLevel47);
        retrofit.RestAdapter.Builder builder49 = builder0.setLogLevel(logLevel47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder51 = builder49.setServer("");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel9 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean10 = logLevel9.log();
        boolean boolean11 = logLevel9.log();
        boolean boolean12 = logLevel9.log();
        boolean boolean13 = logLevel9.log();
        retrofit.RestAdapter.Builder builder14 = builder8.setLogLevel(logLevel9);
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log16 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder17 = builder15.setLog(log16);
        retrofit.RestAdapter.Log log18 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder19 = builder15.setLog(log18);
        retrofit.RestAdapter.Builder builder20 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log21 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder22 = builder20.setLog(log21);
        retrofit.RestAdapter.LogLevel logLevel23 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean24 = logLevel23.log();
        boolean boolean25 = logLevel23.log();
        retrofit.RestAdapter.Builder builder26 = builder20.setLogLevel(logLevel23);
        retrofit.RestAdapter.Builder builder27 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log28 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder29 = builder27.setLog(log28);
        retrofit.RestAdapter.LogLevel logLevel30 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean31 = logLevel30.log();
        boolean boolean32 = logLevel30.log();
        retrofit.RestAdapter.Builder builder33 = builder27.setLogLevel(logLevel30);
        retrofit.RestAdapter.Builder builder34 = builder26.setLogLevel(logLevel30);
        retrofit.RestAdapter.Builder builder35 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log36 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder37 = builder35.setLog(log36);
        retrofit.RestAdapter.Builder builder38 = builder34.setLog(log36);
        retrofit.RestAdapter.Builder builder39 = builder19.setLog(log36);
        retrofit.RestAdapter.Log log40 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder41 = builder39.setLog(log40);
        log40.log("");
        retrofit.RestAdapter.Builder builder44 = builder8.setLog(log40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder46 = builder44.setServer("");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder9 = builder7.setLog(log8);
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean11 = logLevel10.log();
        boolean boolean12 = logLevel10.log();
        retrofit.RestAdapter.Builder builder13 = builder7.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder14 = builder6.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder16 = builder14.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean18 = logLevel17.log();
        retrofit.RestAdapter.Builder builder19 = builder16.setLogLevel(logLevel17);
        retrofit.RestAdapter restAdapter20 = builder16.build();
        retrofit.RestAdapter.Builder builder22 = builder16.setServer("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder24 = builder22.setServer("");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder9 = builder7.setLog(log8);
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean11 = logLevel10.log();
        boolean boolean12 = logLevel10.log();
        retrofit.RestAdapter.Builder builder13 = builder7.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder14 = builder6.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log16 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder17 = builder15.setLog(log16);
        retrofit.RestAdapter.LogLevel logLevel18 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean19 = logLevel18.log();
        boolean boolean20 = logLevel18.log();
        retrofit.RestAdapter.Builder builder21 = builder15.setLogLevel(logLevel18);
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log23 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder24 = builder22.setLog(log23);
        retrofit.RestAdapter.LogLevel logLevel25 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean26 = logLevel25.log();
        boolean boolean27 = logLevel25.log();
        retrofit.RestAdapter.Builder builder28 = builder22.setLogLevel(logLevel25);
        retrofit.RestAdapter.Builder builder29 = builder21.setLogLevel(logLevel25);
        retrofit.RestAdapter.Builder builder30 = builder6.setLogLevel(logLevel25);
        retrofit.RestAdapter.Builder builder31 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log32 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder33 = builder31.setLog(log32);
        retrofit.RestAdapter.LogLevel logLevel34 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean35 = logLevel34.log();
        boolean boolean36 = logLevel34.log();
        retrofit.RestAdapter.Builder builder37 = builder31.setLogLevel(logLevel34);
        boolean boolean38 = logLevel34.log();
        retrofit.RestAdapter.Builder builder39 = builder30.setLogLevel(logLevel34);
        retrofit.RestAdapter.Builder builder40 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log41 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder42 = builder40.setLog(log41);
        retrofit.RestAdapter.Log log43 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder44 = builder40.setLog(log43);
        log43.log("hi!");
        log43.log("");
        retrofit.RestAdapter.Builder builder49 = builder39.setLog(log43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder51 = builder39.setServer("");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder10 = builder8.setServer("");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder9 = builder7.setLog(log8);
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean11 = logLevel10.log();
        boolean boolean12 = logLevel10.log();
        retrofit.RestAdapter.Builder builder13 = builder7.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder14 = builder6.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log16 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder17 = builder15.setLog(log16);
        retrofit.RestAdapter.LogLevel logLevel18 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean19 = logLevel18.log();
        boolean boolean20 = logLevel18.log();
        retrofit.RestAdapter.Builder builder21 = builder15.setLogLevel(logLevel18);
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log23 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder24 = builder22.setLog(log23);
        retrofit.RestAdapter.LogLevel logLevel25 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean26 = logLevel25.log();
        boolean boolean27 = logLevel25.log();
        retrofit.RestAdapter.Builder builder28 = builder22.setLogLevel(logLevel25);
        retrofit.RestAdapter.Builder builder29 = builder21.setLogLevel(logLevel25);
        retrofit.RestAdapter.Builder builder30 = builder6.setLogLevel(logLevel25);
        retrofit.RestAdapter.Builder builder31 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log32 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder33 = builder31.setLog(log32);
        retrofit.RestAdapter.LogLevel logLevel34 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean35 = logLevel34.log();
        boolean boolean36 = logLevel34.log();
        retrofit.RestAdapter.Builder builder37 = builder31.setLogLevel(logLevel34);
        boolean boolean38 = logLevel34.log();
        retrofit.RestAdapter.Builder builder39 = builder30.setLogLevel(logLevel34);
        retrofit.RestAdapter.LogLevel logLevel40 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder41 = builder30.setLogLevel(logLevel40);
        retrofit.RestAdapter.Builder builder42 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log43 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder44 = builder42.setLog(log43);
        retrofit.RestAdapter.LogLevel logLevel45 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean46 = logLevel45.log();
        boolean boolean47 = logLevel45.log();
        retrofit.RestAdapter.Builder builder48 = builder42.setLogLevel(logLevel45);
        retrofit.RestAdapter.Log log49 = retrofit.RestAdapter.Log.NONE;
        log49.log("");
        retrofit.RestAdapter.Builder builder52 = builder42.setLog(log49);
        retrofit.RestAdapter.Builder builder53 = builder30.setLog(log49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder55 = builder53.setServer("");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder9 = builder7.setLog(log8);
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean11 = logLevel10.log();
        boolean boolean12 = logLevel10.log();
        retrofit.RestAdapter.Builder builder13 = builder7.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder14 = builder6.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder16 = builder14.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean18 = logLevel17.log();
        retrofit.RestAdapter.Builder builder19 = builder16.setLogLevel(logLevel17);
        retrofit.RestAdapter restAdapter20 = builder16.build();
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log22 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder23 = builder21.setLog(log22);
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean25 = logLevel24.log();
        boolean boolean26 = logLevel24.log();
        retrofit.RestAdapter.Builder builder27 = builder21.setLogLevel(logLevel24);
        retrofit.RestAdapter.Builder builder28 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log29 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder30 = builder28.setLog(log29);
        retrofit.RestAdapter.LogLevel logLevel31 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean32 = logLevel31.log();
        boolean boolean33 = logLevel31.log();
        retrofit.RestAdapter.Builder builder34 = builder28.setLogLevel(logLevel31);
        retrofit.RestAdapter.Builder builder35 = builder27.setLogLevel(logLevel31);
        retrofit.RestAdapter.Builder builder36 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log37 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder38 = builder36.setLog(log37);
        retrofit.RestAdapter.LogLevel logLevel39 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean40 = logLevel39.log();
        boolean boolean41 = logLevel39.log();
        retrofit.RestAdapter.Builder builder42 = builder36.setLogLevel(logLevel39);
        retrofit.RestAdapter.Builder builder43 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log44 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder45 = builder43.setLog(log44);
        retrofit.RestAdapter.LogLevel logLevel46 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean47 = logLevel46.log();
        boolean boolean48 = logLevel46.log();
        retrofit.RestAdapter.Builder builder49 = builder43.setLogLevel(logLevel46);
        retrofit.RestAdapter.Builder builder50 = builder42.setLogLevel(logLevel46);
        retrofit.RestAdapter.Builder builder51 = builder27.setLogLevel(logLevel46);
        retrofit.RestAdapter.Builder builder52 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log53 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder54 = builder52.setLog(log53);
        retrofit.RestAdapter.LogLevel logLevel55 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean56 = logLevel55.log();
        boolean boolean57 = logLevel55.log();
        retrofit.RestAdapter.Builder builder58 = builder52.setLogLevel(logLevel55);
        retrofit.RestAdapter.Log log59 = retrofit.RestAdapter.Log.NONE;
        log59.log("");
        retrofit.RestAdapter.Builder builder62 = builder52.setLog(log59);
        log59.log("hi!");
        retrofit.RestAdapter.Builder builder65 = builder27.setLog(log59);
        log59.log("");
        log59.log("");
        retrofit.RestAdapter.Builder builder70 = builder16.setLog(log59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder72 = builder70.setServer("");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder9 = builder7.setLog(log8);
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean11 = logLevel10.log();
        boolean boolean12 = logLevel10.log();
        retrofit.RestAdapter.Builder builder13 = builder7.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder14 = builder6.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder15 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log16 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder17 = builder15.setLog(log16);
        retrofit.RestAdapter.LogLevel logLevel18 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean19 = logLevel18.log();
        boolean boolean20 = logLevel18.log();
        retrofit.RestAdapter.Builder builder21 = builder15.setLogLevel(logLevel18);
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log23 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder24 = builder22.setLog(log23);
        retrofit.RestAdapter.LogLevel logLevel25 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean26 = logLevel25.log();
        boolean boolean27 = logLevel25.log();
        retrofit.RestAdapter.Builder builder28 = builder22.setLogLevel(logLevel25);
        retrofit.RestAdapter.Builder builder29 = builder21.setLogLevel(logLevel25);
        retrofit.RestAdapter.Builder builder30 = builder6.setLogLevel(logLevel25);
        retrofit.RestAdapter.Builder builder31 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log32 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder33 = builder31.setLog(log32);
        retrofit.RestAdapter.LogLevel logLevel34 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean35 = logLevel34.log();
        boolean boolean36 = logLevel34.log();
        retrofit.RestAdapter.Builder builder37 = builder31.setLogLevel(logLevel34);
        retrofit.RestAdapter.Log log38 = retrofit.RestAdapter.Log.NONE;
        log38.log("");
        retrofit.RestAdapter.Builder builder41 = builder31.setLog(log38);
        log38.log("hi!");
        retrofit.RestAdapter.Builder builder44 = builder6.setLog(log38);
        retrofit.RestAdapter.Log log45 = retrofit.RestAdapter.Log.NONE;
        log45.log("hi!");
        log45.log("");
        retrofit.RestAdapter.Builder builder50 = builder44.setLog(log45);
        retrofit.RestAdapter.Builder builder51 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log52 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder53 = builder51.setLog(log52);
        retrofit.RestAdapter.LogLevel logLevel54 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean55 = logLevel54.log();
        boolean boolean56 = logLevel54.log();
        retrofit.RestAdapter.Builder builder57 = builder51.setLogLevel(logLevel54);
        retrofit.RestAdapter.Builder builder58 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log59 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder60 = builder58.setLog(log59);
        retrofit.RestAdapter.LogLevel logLevel61 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean62 = logLevel61.log();
        boolean boolean63 = logLevel61.log();
        retrofit.RestAdapter.Builder builder64 = builder58.setLogLevel(logLevel61);
        retrofit.RestAdapter.Builder builder65 = builder57.setLogLevel(logLevel61);
        retrofit.RestAdapter.Builder builder67 = builder65.setServer("hi!");
        retrofit.RestAdapter.Builder builder68 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log69 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder70 = builder68.setLog(log69);
        retrofit.RestAdapter.Log log71 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder72 = builder68.setLog(log71);
        retrofit.RestAdapter.Builder builder73 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log74 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder75 = builder73.setLog(log74);
        retrofit.RestAdapter.LogLevel logLevel76 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean77 = logLevel76.log();
        boolean boolean78 = logLevel76.log();
        retrofit.RestAdapter.Builder builder79 = builder73.setLogLevel(logLevel76);
        retrofit.RestAdapter.Builder builder80 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log81 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder82 = builder80.setLog(log81);
        retrofit.RestAdapter.LogLevel logLevel83 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean84 = logLevel83.log();
        boolean boolean85 = logLevel83.log();
        retrofit.RestAdapter.Builder builder86 = builder80.setLogLevel(logLevel83);
        retrofit.RestAdapter.Builder builder87 = builder79.setLogLevel(logLevel83);
        retrofit.RestAdapter.Builder builder88 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log89 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder90 = builder88.setLog(log89);
        retrofit.RestAdapter.Builder builder91 = builder87.setLog(log89);
        retrofit.RestAdapter.Builder builder92 = builder72.setLog(log89);
        retrofit.RestAdapter.Log log93 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder94 = builder92.setLog(log93);
        retrofit.RestAdapter.Builder builder95 = builder67.setLog(log93);
        retrofit.RestAdapter.Builder builder96 = builder44.setLog(log93);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder98 = builder96.setServer("");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
        retrofit.RestAdapter.Builder builder7 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log8 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder9 = builder7.setLog(log8);
        retrofit.RestAdapter.LogLevel logLevel10 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean11 = logLevel10.log();
        boolean boolean12 = logLevel10.log();
        retrofit.RestAdapter.Builder builder13 = builder7.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder14 = builder6.setLogLevel(logLevel10);
        retrofit.RestAdapter.Builder builder16 = builder14.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean18 = logLevel17.log();
        retrofit.RestAdapter.Builder builder19 = builder16.setLogLevel(logLevel17);
        retrofit.RestAdapter restAdapter20 = builder19.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder22 = builder19.setServer("");
    }
}

