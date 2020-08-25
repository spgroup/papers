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

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
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
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log18 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder19 = builder17.setLog(log18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder21 = builder17.setLog(log20);
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log23 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder24 = builder22.setLog(log23);
        retrofit.RestAdapter.LogLevel logLevel25 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean26 = logLevel25.log();
        boolean boolean27 = logLevel25.log();
        retrofit.RestAdapter.Builder builder28 = builder22.setLogLevel(logLevel25);
        retrofit.RestAdapter.Builder builder29 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log30 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder31 = builder29.setLog(log30);
        retrofit.RestAdapter.LogLevel logLevel32 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean33 = logLevel32.log();
        boolean boolean34 = logLevel32.log();
        retrofit.RestAdapter.Builder builder35 = builder29.setLogLevel(logLevel32);
        retrofit.RestAdapter.Builder builder36 = builder28.setLogLevel(logLevel32);
        retrofit.RestAdapter.Builder builder37 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log38 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder39 = builder37.setLog(log38);
        retrofit.RestAdapter.Builder builder40 = builder36.setLog(log38);
        retrofit.RestAdapter.Builder builder41 = builder21.setLog(log38);
        retrofit.RestAdapter.Log log42 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder43 = builder41.setLog(log42);
        retrofit.RestAdapter.Builder builder44 = builder16.setLog(log42);
        retrofit.RestAdapter.Builder builder45 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log46 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder47 = builder45.setLog(log46);
        retrofit.RestAdapter.Log log48 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder49 = builder45.setLog(log48);
        retrofit.RestAdapter.Builder builder50 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log51 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder52 = builder50.setLog(log51);
        retrofit.RestAdapter.LogLevel logLevel53 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean54 = logLevel53.log();
        boolean boolean55 = logLevel53.log();
        retrofit.RestAdapter.Builder builder56 = builder50.setLogLevel(logLevel53);
        retrofit.RestAdapter.Builder builder57 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log58 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder59 = builder57.setLog(log58);
        retrofit.RestAdapter.LogLevel logLevel60 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean61 = logLevel60.log();
        boolean boolean62 = logLevel60.log();
        retrofit.RestAdapter.Builder builder63 = builder57.setLogLevel(logLevel60);
        retrofit.RestAdapter.Builder builder64 = builder56.setLogLevel(logLevel60);
        retrofit.RestAdapter.Builder builder65 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log66 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder67 = builder65.setLog(log66);
        retrofit.RestAdapter.Builder builder68 = builder64.setLog(log66);
        retrofit.RestAdapter.Builder builder69 = builder49.setLog(log66);
        retrofit.RestAdapter.Log log70 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder71 = builder69.setLog(log70);
        retrofit.RestAdapter.Builder builder72 = builder16.setLog(log70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder74 = builder72.setServer("");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder46 = builder6.setServer("");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
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
        retrofit.RestAdapter.Builder builder31 = builder29.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel32 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean33 = logLevel32.log();
        retrofit.RestAdapter.Builder builder34 = builder31.setLogLevel(logLevel32);
        boolean boolean35 = logLevel32.log();
        retrofit.RestAdapter.Builder builder36 = builder8.setLogLevel(logLevel32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder38 = builder8.setServer("");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log4 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder5 = builder3.setLog(log4);
        retrofit.RestAdapter.Log log6 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder7 = builder3.setLog(log6);
        retrofit.RestAdapter.Builder builder8 = builder0.setLog(log6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder10 = builder8.setServer("");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder4 = builder0.setLog(log3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder11 = builder9.setLog(log10);
        retrofit.RestAdapter.LogLevel logLevel12 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean13 = logLevel12.log();
        boolean boolean14 = logLevel12.log();
        retrofit.RestAdapter.Builder builder15 = builder9.setLogLevel(logLevel12);
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder18 = builder16.setLog(log17);
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean20 = logLevel19.log();
        boolean boolean21 = logLevel19.log();
        retrofit.RestAdapter.Builder builder22 = builder16.setLogLevel(logLevel19);
        retrofit.RestAdapter.Builder builder23 = builder15.setLogLevel(logLevel19);
        retrofit.RestAdapter.Builder builder25 = builder23.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean27 = logLevel26.log();
        retrofit.RestAdapter.Builder builder28 = builder25.setLogLevel(logLevel26);
        retrofit.RestAdapter restAdapter29 = builder25.build();
        retrofit.RestAdapter.Builder builder31 = builder25.setServer("hi!");
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log33 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder34 = builder32.setLog(log33);
        retrofit.RestAdapter.LogLevel logLevel35 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean36 = logLevel35.log();
        boolean boolean37 = logLevel35.log();
        retrofit.RestAdapter.Builder builder38 = builder32.setLogLevel(logLevel35);
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log40 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder41 = builder39.setLog(log40);
        retrofit.RestAdapter.LogLevel logLevel42 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean43 = logLevel42.log();
        boolean boolean44 = logLevel42.log();
        retrofit.RestAdapter.Builder builder45 = builder39.setLogLevel(logLevel42);
        retrofit.RestAdapter.Builder builder46 = builder38.setLogLevel(logLevel42);
        retrofit.RestAdapter.Builder builder48 = builder46.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel49 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean50 = logLevel49.log();
        retrofit.RestAdapter.Builder builder51 = builder48.setLogLevel(logLevel49);
        retrofit.RestAdapter restAdapter52 = builder48.build();
        retrofit.RestAdapter.LogLevel logLevel53 = restAdapter52.getLogLevel();
        retrofit.RestAdapter.Builder builder54 = builder31.setLogLevel(logLevel53);
        retrofit.RestAdapter.Log log55 = retrofit.RestAdapter.Log.NONE;
        log55.log("hi!");
        retrofit.RestAdapter.Builder builder58 = builder31.setLog(log55);
        log55.log("hi!");
        retrofit.RestAdapter.Builder builder61 = builder8.setLog(log55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder63 = builder8.setServer("");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
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
        retrofit.RestAdapter.Builder builder18 = builder14.setLog(log16);
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder20 = builder18.setLogLevel(logLevel19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder22 = builder20.setServer("");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder32 = builder6.setServer("");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
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
        retrofit.RestAdapter.Builder builder32 = builder6.setServer("hi!");
        retrofit.RestAdapter restAdapter33 = builder6.build();
        retrofit.RestAdapter.Builder builder34 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder36 = builder34.setServer("hi!");
        retrofit.RestAdapter.Builder builder37 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log38 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder39 = builder37.setLog(log38);
        retrofit.RestAdapter.LogLevel logLevel40 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean41 = logLevel40.log();
        boolean boolean42 = logLevel40.log();
        retrofit.RestAdapter.Builder builder43 = builder37.setLogLevel(logLevel40);
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log45 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder46 = builder44.setLog(log45);
        retrofit.RestAdapter.LogLevel logLevel47 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean48 = logLevel47.log();
        boolean boolean49 = logLevel47.log();
        retrofit.RestAdapter.Builder builder50 = builder44.setLogLevel(logLevel47);
        retrofit.RestAdapter.Builder builder51 = builder43.setLogLevel(logLevel47);
        retrofit.RestAdapter.Builder builder52 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log53 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder54 = builder52.setLog(log53);
        retrofit.RestAdapter.Builder builder55 = builder51.setLog(log53);
        log53.log("");
        log53.log("");
        retrofit.RestAdapter.Builder builder60 = builder36.setLog(log53);
        retrofit.RestAdapter.Builder builder61 = builder6.setLog(log53);
        retrofit.RestAdapter restAdapter62 = builder6.build();
        retrofit.RestAdapter.Builder builder63 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log64 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder65 = builder63.setLog(log64);
        retrofit.RestAdapter.LogLevel logLevel66 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean67 = logLevel66.log();
        boolean boolean68 = logLevel66.log();
        retrofit.RestAdapter.Builder builder69 = builder63.setLogLevel(logLevel66);
        retrofit.RestAdapter.Builder builder71 = builder63.setServer("hi!");
        retrofit.RestAdapter restAdapter72 = builder63.build();
        retrofit.RestAdapter.LogLevel logLevel73 = restAdapter72.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel74 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean75 = logLevel74.log();
        boolean boolean76 = logLevel74.log();
        boolean boolean77 = logLevel74.log();
        restAdapter72.setLogLevel(logLevel74);
        retrofit.RestAdapter.Builder builder79 = builder6.setLogLevel(logLevel74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder81 = builder79.setServer("");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
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
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log18 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder19 = builder17.setLog(log18);
        retrofit.RestAdapter.LogLevel logLevel20 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean21 = logLevel20.log();
        boolean boolean22 = logLevel20.log();
        retrofit.RestAdapter.Builder builder23 = builder17.setLogLevel(logLevel20);
        retrofit.RestAdapter.Builder builder24 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log25 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder26 = builder24.setLog(log25);
        retrofit.RestAdapter.LogLevel logLevel27 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean28 = logLevel27.log();
        boolean boolean29 = logLevel27.log();
        retrofit.RestAdapter.Builder builder30 = builder24.setLogLevel(logLevel27);
        retrofit.RestAdapter.Builder builder31 = builder23.setLogLevel(logLevel27);
        retrofit.RestAdapter.Builder builder32 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log33 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder34 = builder32.setLog(log33);
        retrofit.RestAdapter.LogLevel logLevel35 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean36 = logLevel35.log();
        boolean boolean37 = logLevel35.log();
        retrofit.RestAdapter.Builder builder38 = builder32.setLogLevel(logLevel35);
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log40 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder41 = builder39.setLog(log40);
        retrofit.RestAdapter.LogLevel logLevel42 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean43 = logLevel42.log();
        boolean boolean44 = logLevel42.log();
        retrofit.RestAdapter.Builder builder45 = builder39.setLogLevel(logLevel42);
        retrofit.RestAdapter.Builder builder46 = builder38.setLogLevel(logLevel42);
        retrofit.RestAdapter.Builder builder47 = builder23.setLogLevel(logLevel42);
        retrofit.RestAdapter.Builder builder48 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log49 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder50 = builder48.setLog(log49);
        retrofit.RestAdapter.LogLevel logLevel51 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean52 = logLevel51.log();
        boolean boolean53 = logLevel51.log();
        retrofit.RestAdapter.Builder builder54 = builder48.setLogLevel(logLevel51);
        retrofit.RestAdapter.Log log55 = retrofit.RestAdapter.Log.NONE;
        log55.log("");
        retrofit.RestAdapter.Builder builder58 = builder48.setLog(log55);
        log55.log("hi!");
        retrofit.RestAdapter.Builder builder61 = builder23.setLog(log55);
        retrofit.RestAdapter.Builder builder62 = builder14.setLog(log55);
        retrofit.RestAdapter.Builder builder64 = builder14.setServer("hi!");
        retrofit.RestAdapter restAdapter65 = builder64.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder67 = builder64.setServer("");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
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
        retrofit.RestAdapter.Builder builder31 = builder29.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel32 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean33 = logLevel32.log();
        retrofit.RestAdapter.Builder builder34 = builder31.setLogLevel(logLevel32);
        boolean boolean35 = logLevel32.log();
        retrofit.RestAdapter.Builder builder36 = builder8.setLogLevel(logLevel32);
        retrofit.RestAdapter.Builder builder38 = builder8.setServer("hi!");
        retrofit.RestAdapter.Builder builder39 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log40 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder41 = builder39.setLog(log40);
        retrofit.RestAdapter.LogLevel logLevel42 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean43 = logLevel42.log();
        boolean boolean44 = logLevel42.log();
        retrofit.RestAdapter.Builder builder45 = builder39.setLogLevel(logLevel42);
        retrofit.RestAdapter.Builder builder46 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log47 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder48 = builder46.setLog(log47);
        retrofit.RestAdapter.LogLevel logLevel49 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean50 = logLevel49.log();
        boolean boolean51 = logLevel49.log();
        retrofit.RestAdapter.Builder builder52 = builder46.setLogLevel(logLevel49);
        retrofit.RestAdapter.Builder builder53 = builder45.setLogLevel(logLevel49);
        retrofit.RestAdapter.Builder builder55 = builder53.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel56 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean57 = logLevel56.log();
        retrofit.RestAdapter.Builder builder58 = builder55.setLogLevel(logLevel56);
        retrofit.RestAdapter restAdapter59 = builder55.build();
        retrofit.RestAdapter.LogLevel logLevel60 = restAdapter59.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel61 = restAdapter59.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel62 = restAdapter59.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel63 = retrofit.RestAdapter.LogLevel.FULL;
        restAdapter59.setLogLevel(logLevel63);
        boolean boolean65 = logLevel63.log();
        boolean boolean66 = logLevel63.log();
        retrofit.RestAdapter.Builder builder67 = builder8.setLogLevel(logLevel63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder69 = builder67.setServer("");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
        retrofit.RestAdapter.Log log7 = retrofit.RestAdapter.Log.NONE;
        log7.log("");
        retrofit.RestAdapter.Builder builder10 = builder0.setLog(log7);
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log12 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder13 = builder11.setLog(log12);
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean15 = logLevel14.log();
        boolean boolean16 = logLevel14.log();
        retrofit.RestAdapter.Builder builder17 = builder11.setLogLevel(logLevel14);
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log19 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder20 = builder18.setLog(log19);
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean22 = logLevel21.log();
        boolean boolean23 = logLevel21.log();
        retrofit.RestAdapter.Builder builder24 = builder18.setLogLevel(logLevel21);
        retrofit.RestAdapter.Builder builder25 = builder17.setLogLevel(logLevel21);
        retrofit.RestAdapter.Builder builder27 = builder25.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean29 = logLevel28.log();
        retrofit.RestAdapter.Builder builder30 = builder27.setLogLevel(logLevel28);
        retrofit.RestAdapter restAdapter31 = builder27.build();
        retrofit.RestAdapter.LogLevel logLevel32 = restAdapter31.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel33 = restAdapter31.getLogLevel();
        retrofit.RestAdapter.Builder builder34 = builder0.setLogLevel(logLevel33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder36 = builder34.setServer("");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test31");
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
        retrofit.RestAdapter.Builder builder16 = builder14.setServer("hi!");
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log18 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder19 = builder17.setLog(log18);
        retrofit.RestAdapter.LogLevel logLevel20 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean21 = logLevel20.log();
        boolean boolean22 = logLevel20.log();
        retrofit.RestAdapter.Builder builder23 = builder17.setLogLevel(logLevel20);
        retrofit.RestAdapter.Builder builder24 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log25 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder26 = builder24.setLog(log25);
        retrofit.RestAdapter.LogLevel logLevel27 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean28 = logLevel27.log();
        boolean boolean29 = logLevel27.log();
        retrofit.RestAdapter.Builder builder30 = builder24.setLogLevel(logLevel27);
        retrofit.RestAdapter.Builder builder31 = builder23.setLogLevel(logLevel27);
        retrofit.RestAdapter.Builder builder33 = builder31.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel34 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean35 = logLevel34.log();
        retrofit.RestAdapter.Builder builder36 = builder33.setLogLevel(logLevel34);
        retrofit.RestAdapter restAdapter37 = builder33.build();
        retrofit.RestAdapter.Builder builder39 = builder33.setServer("hi!");
        retrofit.RestAdapter.Builder builder40 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log41 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder42 = builder40.setLog(log41);
        retrofit.RestAdapter.LogLevel logLevel43 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean44 = logLevel43.log();
        boolean boolean45 = logLevel43.log();
        retrofit.RestAdapter.Builder builder46 = builder40.setLogLevel(logLevel43);
        retrofit.RestAdapter.Builder builder47 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log48 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder49 = builder47.setLog(log48);
        retrofit.RestAdapter.LogLevel logLevel50 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean51 = logLevel50.log();
        boolean boolean52 = logLevel50.log();
        retrofit.RestAdapter.Builder builder53 = builder47.setLogLevel(logLevel50);
        retrofit.RestAdapter.Builder builder54 = builder46.setLogLevel(logLevel50);
        retrofit.RestAdapter.Builder builder56 = builder54.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel57 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean58 = logLevel57.log();
        retrofit.RestAdapter.Builder builder59 = builder56.setLogLevel(logLevel57);
        retrofit.RestAdapter restAdapter60 = builder56.build();
        retrofit.RestAdapter.LogLevel logLevel61 = restAdapter60.getLogLevel();
        retrofit.RestAdapter.Builder builder62 = builder39.setLogLevel(logLevel61);
        retrofit.RestAdapter.Log log63 = retrofit.RestAdapter.Log.NONE;
        log63.log("hi!");
        retrofit.RestAdapter.Builder builder66 = builder39.setLog(log63);
        retrofit.RestAdapter.Log log67 = retrofit.RestAdapter.Log.NONE;
        log67.log("hi!");
        log67.log("");
        log67.log("hi!");
        retrofit.RestAdapter.Builder builder74 = builder39.setLog(log67);
        retrofit.RestAdapter.Builder builder75 = builder16.setLog(log67);
        retrofit.RestAdapter.Log log76 = retrofit.RestAdapter.Log.NONE;
        log76.log("hi!");
        log76.log("hi!");
        retrofit.RestAdapter.Builder builder81 = builder16.setLog(log76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder83 = builder81.setServer("");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test32");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder41 = builder39.setServer("");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test33");
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
        retrofit.RestAdapter.Builder builder46 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log47 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder48 = builder46.setLog(log47);
        retrofit.RestAdapter.LogLevel logLevel49 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean50 = logLevel49.log();
        boolean boolean51 = logLevel49.log();
        retrofit.RestAdapter.Builder builder52 = builder46.setLogLevel(logLevel49);
        retrofit.RestAdapter.Builder builder53 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log54 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder55 = builder53.setLog(log54);
        retrofit.RestAdapter.LogLevel logLevel56 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean57 = logLevel56.log();
        boolean boolean58 = logLevel56.log();
        retrofit.RestAdapter.Builder builder59 = builder53.setLogLevel(logLevel56);
        retrofit.RestAdapter.Builder builder60 = builder52.setLogLevel(logLevel56);
        retrofit.RestAdapter.Builder builder62 = builder60.setServer("hi!");
        retrofit.RestAdapter restAdapter63 = builder60.build();
        retrofit.RestAdapter restAdapter64 = builder60.build();
        retrofit.RestAdapter.Builder builder65 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log66 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder67 = builder65.setLog(log66);
        retrofit.RestAdapter.LogLevel logLevel68 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean69 = logLevel68.log();
        boolean boolean70 = logLevel68.log();
        retrofit.RestAdapter.Builder builder71 = builder65.setLogLevel(logLevel68);
        boolean boolean72 = logLevel68.log();
        retrofit.RestAdapter.Builder builder73 = builder60.setLogLevel(logLevel68);
        retrofit.RestAdapter.Builder builder74 = builder22.setLogLevel(logLevel68);
        retrofit.RestAdapter restAdapter75 = builder74.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder77 = builder74.setServer("");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test34");
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
        retrofit.RestAdapter.Builder builder47 = builder45.setServer("hi!");
        retrofit.RestAdapter restAdapter48 = builder45.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder50 = builder45.setServer("");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test35");
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
        retrofit.RestAdapter.Builder builder36 = builder34.setServer("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder38 = builder36.setServer("");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test36");
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
        log18.log("hi!");
        log18.log("");
        log18.log("");
        log18.log("hi!");
        log18.log("");
        log18.log("");
        log18.log("hi!");
        retrofit.RestAdapter.Builder builder34 = builder14.setLog(log18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder36 = builder14.setServer("");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test37");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
        retrofit.RestAdapter.Log log7 = retrofit.RestAdapter.Log.NONE;
        log7.log("");
        retrofit.RestAdapter.Builder builder10 = builder0.setLog(log7);
        retrofit.RestAdapter.Builder builder12 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder13 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log14 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder15 = builder13.setLog(log14);
        retrofit.RestAdapter.Log log16 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder17 = builder13.setLog(log16);
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log19 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder20 = builder18.setLog(log19);
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean22 = logLevel21.log();
        boolean boolean23 = logLevel21.log();
        retrofit.RestAdapter.Builder builder24 = builder18.setLogLevel(logLevel21);
        retrofit.RestAdapter.Builder builder25 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log26 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder27 = builder25.setLog(log26);
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean29 = logLevel28.log();
        boolean boolean30 = logLevel28.log();
        retrofit.RestAdapter.Builder builder31 = builder25.setLogLevel(logLevel28);
        retrofit.RestAdapter.Builder builder32 = builder24.setLogLevel(logLevel28);
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log34 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder35 = builder33.setLog(log34);
        retrofit.RestAdapter.Builder builder36 = builder32.setLog(log34);
        retrofit.RestAdapter.Builder builder37 = builder17.setLog(log34);
        retrofit.RestAdapter.Log log38 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder39 = builder37.setLog(log38);
        log38.log("");
        retrofit.RestAdapter.Builder builder42 = builder12.setLog(log38);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder44 = builder12.setServer("");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test38");
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
        retrofit.RestAdapter.Builder builder47 = builder45.setServer("hi!");
        retrofit.RestAdapter.Builder builder48 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log49 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder50 = builder48.setLog(log49);
        retrofit.RestAdapter.LogLevel logLevel51 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean52 = logLevel51.log();
        boolean boolean53 = logLevel51.log();
        retrofit.RestAdapter.Builder builder54 = builder48.setLogLevel(logLevel51);
        retrofit.RestAdapter.Builder builder55 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log56 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder57 = builder55.setLog(log56);
        retrofit.RestAdapter.LogLevel logLevel58 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean59 = logLevel58.log();
        boolean boolean60 = logLevel58.log();
        retrofit.RestAdapter.Builder builder61 = builder55.setLogLevel(logLevel58);
        retrofit.RestAdapter.Builder builder62 = builder54.setLogLevel(logLevel58);
        retrofit.RestAdapter.Builder builder63 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log64 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder65 = builder63.setLog(log64);
        retrofit.RestAdapter.Builder builder66 = builder62.setLog(log64);
        log64.log("");
        log64.log("");
        retrofit.RestAdapter.Builder builder71 = builder47.setLog(log64);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder73 = builder71.setServer("");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test39");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
        retrofit.RestAdapter.Log log7 = retrofit.RestAdapter.Log.NONE;
        log7.log("");
        retrofit.RestAdapter.Builder builder10 = builder0.setLog(log7);
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log12 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder13 = builder11.setLog(log12);
        retrofit.RestAdapter.LogLevel logLevel14 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean15 = logLevel14.log();
        boolean boolean16 = logLevel14.log();
        retrofit.RestAdapter.Builder builder17 = builder11.setLogLevel(logLevel14);
        retrofit.RestAdapter.Builder builder18 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log19 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder20 = builder18.setLog(log19);
        retrofit.RestAdapter.LogLevel logLevel21 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean22 = logLevel21.log();
        boolean boolean23 = logLevel21.log();
        retrofit.RestAdapter.Builder builder24 = builder18.setLogLevel(logLevel21);
        retrofit.RestAdapter.Builder builder25 = builder17.setLogLevel(logLevel21);
        retrofit.RestAdapter.Builder builder27 = builder25.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel28 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean29 = logLevel28.log();
        retrofit.RestAdapter.Builder builder30 = builder27.setLogLevel(logLevel28);
        retrofit.RestAdapter restAdapter31 = builder27.build();
        retrofit.RestAdapter.LogLevel logLevel32 = restAdapter31.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel33 = restAdapter31.getLogLevel();
        retrofit.RestAdapter.Builder builder34 = builder0.setLogLevel(logLevel33);
        retrofit.RestAdapter.Builder builder36 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder37 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log38 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder39 = builder37.setLog(log38);
        retrofit.RestAdapter.LogLevel logLevel40 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean41 = logLevel40.log();
        boolean boolean42 = logLevel40.log();
        retrofit.RestAdapter.Builder builder43 = builder37.setLogLevel(logLevel40);
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log45 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder46 = builder44.setLog(log45);
        retrofit.RestAdapter.LogLevel logLevel47 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean48 = logLevel47.log();
        boolean boolean49 = logLevel47.log();
        retrofit.RestAdapter.Builder builder50 = builder44.setLogLevel(logLevel47);
        retrofit.RestAdapter.Builder builder51 = builder43.setLogLevel(logLevel47);
        retrofit.RestAdapter.Builder builder53 = builder51.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel54 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean55 = logLevel54.log();
        retrofit.RestAdapter.Builder builder56 = builder53.setLogLevel(logLevel54);
        retrofit.RestAdapter restAdapter57 = builder53.build();
        retrofit.RestAdapter.LogLevel logLevel58 = restAdapter57.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel59 = restAdapter57.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel60 = restAdapter57.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel61 = retrofit.RestAdapter.LogLevel.FULL;
        restAdapter57.setLogLevel(logLevel61);
        retrofit.RestAdapter.LogLevel logLevel63 = restAdapter57.getLogLevel();
        boolean boolean64 = logLevel63.log();
        retrofit.RestAdapter.Builder builder65 = builder0.setLogLevel(logLevel63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder67 = builder0.setServer("");
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test40");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RestAdapter restAdapter3 = builder2.build();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder5 = builder2.setServer("");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test41");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder2 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder3 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log4 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder5 = builder3.setLog(log4);
        retrofit.RestAdapter.Log log6 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder7 = builder3.setLog(log6);
        retrofit.RestAdapter.Builder builder8 = builder0.setLog(log6);
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder11 = builder9.setLog(log10);
        retrofit.RestAdapter.LogLevel logLevel12 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean13 = logLevel12.log();
        boolean boolean14 = logLevel12.log();
        retrofit.RestAdapter.Builder builder15 = builder9.setLogLevel(logLevel12);
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder18 = builder16.setLog(log17);
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean20 = logLevel19.log();
        boolean boolean21 = logLevel19.log();
        retrofit.RestAdapter.Builder builder22 = builder16.setLogLevel(logLevel19);
        retrofit.RestAdapter.Builder builder23 = builder15.setLogLevel(logLevel19);
        retrofit.RestAdapter.Builder builder25 = builder23.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean27 = logLevel26.log();
        retrofit.RestAdapter.Builder builder28 = builder25.setLogLevel(logLevel26);
        retrofit.RestAdapter restAdapter29 = builder25.build();
        retrofit.RestAdapter.LogLevel logLevel30 = restAdapter29.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel31 = restAdapter29.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel32 = restAdapter29.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel33 = retrofit.RestAdapter.LogLevel.FULL;
        restAdapter29.setLogLevel(logLevel33);
        retrofit.RestAdapter.Builder builder35 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log36 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder37 = builder35.setLog(log36);
        retrofit.RestAdapter.LogLevel logLevel38 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean39 = logLevel38.log();
        boolean boolean40 = logLevel38.log();
        retrofit.RestAdapter.Builder builder41 = builder35.setLogLevel(logLevel38);
        retrofit.RestAdapter.Builder builder42 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log43 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder44 = builder42.setLog(log43);
        retrofit.RestAdapter.LogLevel logLevel45 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean46 = logLevel45.log();
        boolean boolean47 = logLevel45.log();
        retrofit.RestAdapter.Builder builder48 = builder42.setLogLevel(logLevel45);
        retrofit.RestAdapter.Builder builder49 = builder41.setLogLevel(logLevel45);
        retrofit.RestAdapter.Builder builder50 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log51 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder52 = builder50.setLog(log51);
        retrofit.RestAdapter.Builder builder53 = builder49.setLog(log51);
        retrofit.RestAdapter.LogLevel logLevel54 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder55 = builder53.setLogLevel(logLevel54);
        restAdapter29.setLogLevel(logLevel54);
        retrofit.RestAdapter.LogLevel logLevel57 = retrofit.RestAdapter.LogLevel.FULL;
        boolean boolean58 = logLevel57.log();
        boolean boolean59 = logLevel57.log();
        boolean boolean60 = logLevel57.log();
        restAdapter29.setLogLevel(logLevel57);
        retrofit.RestAdapter.Builder builder62 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log63 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder64 = builder62.setLog(log63);
        retrofit.RestAdapter.Log log65 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder66 = builder62.setLog(log65);
        retrofit.RestAdapter.Builder builder68 = builder62.setServer("hi!");
        retrofit.RestAdapter.Builder builder70 = builder62.setServer("hi!");
        retrofit.RestAdapter restAdapter71 = builder70.build();
        retrofit.RestAdapter.LogLevel logLevel72 = restAdapter71.getLogLevel();
        restAdapter29.setLogLevel(logLevel72);
        retrofit.RestAdapter.Builder builder74 = builder8.setLogLevel(logLevel72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder76 = builder74.setServer("");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test42");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder4 = builder0.setLog(log3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter restAdapter7 = builder6.build();
        retrofit.RestAdapter.Builder builder9 = builder6.setServer("hi!");
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        log10.log("hi!");
        log10.log("");
        log10.log("hi!");
        log10.log("");
        retrofit.RestAdapter.Builder builder19 = builder6.setLog(log10);
        retrofit.RestAdapter.Builder builder21 = builder19.setServer("hi!");
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log23 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder24 = builder22.setLog(log23);
        retrofit.RestAdapter.Log log25 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder26 = builder22.setLog(log25);
        retrofit.RestAdapter.Builder builder28 = builder22.setServer("hi!");
        retrofit.RestAdapter.Builder builder30 = builder22.setServer("hi!");
        retrofit.RestAdapter restAdapter31 = builder30.build();
        retrofit.RestAdapter restAdapter32 = builder30.build();
        retrofit.RestAdapter.LogLevel logLevel33 = restAdapter32.getLogLevel();
        retrofit.RestAdapter.Builder builder34 = builder21.setLogLevel(logLevel33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder36 = builder34.setServer("");
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test43");
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
        retrofit.RestAdapter.Builder builder17 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log18 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder19 = builder17.setLog(log18);
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder21 = builder17.setLog(log20);
        retrofit.RestAdapter.Builder builder22 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log23 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder24 = builder22.setLog(log23);
        retrofit.RestAdapter.LogLevel logLevel25 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean26 = logLevel25.log();
        boolean boolean27 = logLevel25.log();
        retrofit.RestAdapter.Builder builder28 = builder22.setLogLevel(logLevel25);
        retrofit.RestAdapter.Builder builder29 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log30 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder31 = builder29.setLog(log30);
        retrofit.RestAdapter.LogLevel logLevel32 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean33 = logLevel32.log();
        boolean boolean34 = logLevel32.log();
        retrofit.RestAdapter.Builder builder35 = builder29.setLogLevel(logLevel32);
        retrofit.RestAdapter.Builder builder36 = builder28.setLogLevel(logLevel32);
        retrofit.RestAdapter.Builder builder37 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log38 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder39 = builder37.setLog(log38);
        retrofit.RestAdapter.Builder builder40 = builder36.setLog(log38);
        retrofit.RestAdapter.Builder builder41 = builder21.setLog(log38);
        retrofit.RestAdapter.Log log42 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder43 = builder41.setLog(log42);
        retrofit.RestAdapter.Builder builder44 = builder16.setLog(log42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder46 = builder16.setServer("");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test44");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
        retrofit.RestAdapter.Log log7 = retrofit.RestAdapter.Log.NONE;
        log7.log("");
        retrofit.RestAdapter.Builder builder10 = builder0.setLog(log7);
        retrofit.RestAdapter.Builder builder11 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Builder builder13 = builder11.setServer("hi!");
        retrofit.RestAdapter.Builder builder14 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log15 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder16 = builder14.setLog(log15);
        retrofit.RestAdapter.LogLevel logLevel17 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean18 = logLevel17.log();
        boolean boolean19 = logLevel17.log();
        retrofit.RestAdapter.Builder builder20 = builder14.setLogLevel(logLevel17);
        retrofit.RestAdapter.Builder builder21 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log22 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder23 = builder21.setLog(log22);
        retrofit.RestAdapter.LogLevel logLevel24 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean25 = logLevel24.log();
        boolean boolean26 = logLevel24.log();
        retrofit.RestAdapter.Builder builder27 = builder21.setLogLevel(logLevel24);
        retrofit.RestAdapter.Builder builder28 = builder20.setLogLevel(logLevel24);
        retrofit.RestAdapter.Builder builder29 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log30 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder31 = builder29.setLog(log30);
        retrofit.RestAdapter.Builder builder32 = builder28.setLog(log30);
        log30.log("");
        log30.log("");
        retrofit.RestAdapter.Builder builder37 = builder13.setLog(log30);
        retrofit.RestAdapter.Builder builder38 = builder0.setLog(log30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder40 = builder0.setServer("");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test45");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder4 = builder0.setLog(log3);
        retrofit.RestAdapter.Builder builder6 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("hi!");
        retrofit.RestAdapter.Builder builder9 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log10 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder11 = builder9.setLog(log10);
        retrofit.RestAdapter.LogLevel logLevel12 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean13 = logLevel12.log();
        boolean boolean14 = logLevel12.log();
        retrofit.RestAdapter.Builder builder15 = builder9.setLogLevel(logLevel12);
        retrofit.RestAdapter.Builder builder16 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log17 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder18 = builder16.setLog(log17);
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean20 = logLevel19.log();
        boolean boolean21 = logLevel19.log();
        retrofit.RestAdapter.Builder builder22 = builder16.setLogLevel(logLevel19);
        retrofit.RestAdapter.Builder builder23 = builder15.setLogLevel(logLevel19);
        retrofit.RestAdapter.Builder builder25 = builder23.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel26 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean27 = logLevel26.log();
        retrofit.RestAdapter.Builder builder28 = builder25.setLogLevel(logLevel26);
        retrofit.RestAdapter restAdapter29 = builder25.build();
        retrofit.RestAdapter.LogLevel logLevel30 = restAdapter29.getLogLevel();
        retrofit.RestAdapter.Builder builder31 = builder0.setLogLevel(logLevel30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder33 = builder31.setServer("");
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test46");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder41 = builder30.setServer("");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test47");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
        retrofit.RestAdapter.Builder builder8 = builder0.setServer("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder10 = builder0.setServer("");
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test48");
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
        retrofit.RestAdapter.Builder builder32 = builder6.setServer("hi!");
        retrofit.RestAdapter.Builder builder33 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log34 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder35 = builder33.setLog(log34);
        retrofit.RestAdapter.LogLevel logLevel36 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean37 = logLevel36.log();
        boolean boolean38 = logLevel36.log();
        retrofit.RestAdapter.Builder builder39 = builder33.setLogLevel(logLevel36);
        retrofit.RestAdapter.Builder builder40 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log41 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder42 = builder40.setLog(log41);
        retrofit.RestAdapter.LogLevel logLevel43 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean44 = logLevel43.log();
        boolean boolean45 = logLevel43.log();
        retrofit.RestAdapter.Builder builder46 = builder40.setLogLevel(logLevel43);
        retrofit.RestAdapter.Builder builder47 = builder39.setLogLevel(logLevel43);
        retrofit.RestAdapter.Builder builder48 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log49 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder50 = builder48.setLog(log49);
        retrofit.RestAdapter.LogLevel logLevel51 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean52 = logLevel51.log();
        boolean boolean53 = logLevel51.log();
        retrofit.RestAdapter.Builder builder54 = builder48.setLogLevel(logLevel51);
        retrofit.RestAdapter.Builder builder55 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log56 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder57 = builder55.setLog(log56);
        retrofit.RestAdapter.LogLevel logLevel58 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean59 = logLevel58.log();
        boolean boolean60 = logLevel58.log();
        retrofit.RestAdapter.Builder builder61 = builder55.setLogLevel(logLevel58);
        retrofit.RestAdapter.Builder builder62 = builder54.setLogLevel(logLevel58);
        retrofit.RestAdapter.Builder builder63 = builder39.setLogLevel(logLevel58);
        retrofit.RestAdapter.Builder builder64 = builder32.setLogLevel(logLevel58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        retrofit.RestAdapter.Builder builder66 = builder32.setServer("");
    }
}

