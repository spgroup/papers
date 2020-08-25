import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
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
        retrofit.RestAdapter.Builder builder51 = builder49.setServer("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + logLevel40 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel40.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter43);
        org.junit.Assert.assertTrue("'" + logLevel44 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel44.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
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
        retrofit.RestAdapter.LogLevel logLevel73 = retrofit.RestAdapter.LogLevel.HEADERS;
        retrofit.RestAdapter.Builder builder74 = builder72.setLogLevel(logLevel73);
        retrofit.RestAdapter.Log log75 = retrofit.RestAdapter.Log.NONE;
        log75.log("hi!");
        log75.log("");
        log75.log("hi!");
        log75.log("");
        retrofit.RestAdapter.Builder builder84 = builder72.setLog(log75);
        retrofit.Server server85 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder86 = builder84.setServer(server85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertTrue("'" + logLevel53 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel53.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertTrue("'" + logLevel60 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel60.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertTrue("'" + logLevel73 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel73.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder84);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
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
        retrofit.RestAdapter.Builder builder49 = builder47.setServer("hi!");
        retrofit.RestAdapter restAdapter50 = builder47.build();
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
        retrofit.RestAdapter.Builder builder66 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log67 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder68 = builder66.setLog(log67);
        retrofit.RestAdapter.LogLevel logLevel69 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean70 = logLevel69.log();
        boolean boolean71 = logLevel69.log();
        retrofit.RestAdapter.Builder builder72 = builder66.setLogLevel(logLevel69);
        retrofit.RestAdapter.Builder builder73 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log74 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder75 = builder73.setLog(log74);
        retrofit.RestAdapter.LogLevel logLevel76 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean77 = logLevel76.log();
        boolean boolean78 = logLevel76.log();
        retrofit.RestAdapter.Builder builder79 = builder73.setLogLevel(logLevel76);
        retrofit.RestAdapter.Builder builder80 = builder72.setLogLevel(logLevel76);
        retrofit.RestAdapter.Builder builder81 = builder57.setLogLevel(logLevel76);
        restAdapter50.setLogLevel(logLevel76);
        retrofit.RestAdapter.LogLevel logLevel83 = retrofit.RestAdapter.LogLevel.BASIC;
        restAdapter50.setLogLevel(logLevel83);
        retrofit.RestAdapter.Builder builder85 = builder32.setLogLevel(logLevel83);
        retrofit.client.Client.Provider provider86 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder87 = builder85.setClient(provider86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + logLevel43 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel43.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + logLevel54 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel54.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertTrue("'" + logLevel61 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel61.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertTrue("'" + logLevel69 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel69.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertTrue("'" + logLevel76 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel76.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertTrue("'" + logLevel83 + "' != '" + retrofit.RestAdapter.LogLevel.BASIC + "'", logLevel83.equals(retrofit.RestAdapter.LogLevel.BASIC));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder85);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
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
        retrofit.Server server20 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder21 = builder6.setServer(server20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
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
        retrofit.RestAdapter restAdapter17 = builder14.build();
        retrofit.RestAdapter restAdapter18 = builder14.build();
        retrofit.RestAdapter.LogLevel logLevel19 = restAdapter18.getLogLevel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter18);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
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
        retrofit.RestAdapter restAdapter17 = builder14.build();
        retrofit.client.Client client18 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder19 = builder14.setClient(client18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter17);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
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
        retrofit.RestAdapter.Log log25 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder26 = builder24.setLog(log25);
        retrofit.RestAdapter.Builder builder27 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log28 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder29 = builder27.setLog(log28);
        retrofit.RestAdapter.LogLevel logLevel30 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean31 = logLevel30.log();
        boolean boolean32 = logLevel30.log();
        retrofit.RestAdapter.Builder builder33 = builder27.setLogLevel(logLevel30);
        retrofit.RestAdapter.Builder builder34 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log35 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder36 = builder34.setLog(log35);
        retrofit.RestAdapter.LogLevel logLevel37 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean38 = logLevel37.log();
        boolean boolean39 = logLevel37.log();
        retrofit.RestAdapter.Builder builder40 = builder34.setLogLevel(logLevel37);
        retrofit.RestAdapter.Builder builder41 = builder33.setLogLevel(logLevel37);
        retrofit.RestAdapter.Builder builder43 = builder41.setServer("hi!");
        retrofit.RestAdapter.Builder builder44 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log45 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder46 = builder44.setLog(log45);
        retrofit.RestAdapter.Log log47 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder48 = builder44.setLog(log47);
        retrofit.RestAdapter.Builder builder49 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log50 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder51 = builder49.setLog(log50);
        retrofit.RestAdapter.LogLevel logLevel52 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean53 = logLevel52.log();
        boolean boolean54 = logLevel52.log();
        retrofit.RestAdapter.Builder builder55 = builder49.setLogLevel(logLevel52);
        retrofit.RestAdapter.Builder builder56 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log57 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder58 = builder56.setLog(log57);
        retrofit.RestAdapter.LogLevel logLevel59 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean60 = logLevel59.log();
        boolean boolean61 = logLevel59.log();
        retrofit.RestAdapter.Builder builder62 = builder56.setLogLevel(logLevel59);
        retrofit.RestAdapter.Builder builder63 = builder55.setLogLevel(logLevel59);
        retrofit.RestAdapter.Builder builder64 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log65 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder66 = builder64.setLog(log65);
        retrofit.RestAdapter.Builder builder67 = builder63.setLog(log65);
        retrofit.RestAdapter.Builder builder68 = builder48.setLog(log65);
        retrofit.RestAdapter.Log log69 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder70 = builder68.setLog(log69);
        retrofit.RestAdapter.Builder builder71 = builder43.setLog(log69);
        log69.log("");
        retrofit.RestAdapter.Builder builder74 = builder24.setLog(log69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + logLevel37 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel37.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + logLevel52 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel52.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertTrue("'" + logLevel59 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel59.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder74);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
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
        java.util.concurrent.Executor executor63 = null;
        java.util.concurrent.Executor executor64 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder65 = builder62.setExecutors(executor63, executor64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + logLevel27 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel27.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + logLevel42 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel42.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertTrue("'" + logLevel51 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel51.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder62);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
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
        retrofit.RestAdapter.Builder builder45 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log46 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder47 = builder45.setLog(log46);
        retrofit.RestAdapter.LogLevel logLevel48 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean49 = logLevel48.log();
        boolean boolean50 = logLevel48.log();
        retrofit.RestAdapter.Builder builder51 = builder45.setLogLevel(logLevel48);
        retrofit.RestAdapter.Builder builder52 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log53 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder54 = builder52.setLog(log53);
        retrofit.RestAdapter.LogLevel logLevel55 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean56 = logLevel55.log();
        boolean boolean57 = logLevel55.log();
        retrofit.RestAdapter.Builder builder58 = builder52.setLogLevel(logLevel55);
        retrofit.RestAdapter.Builder builder59 = builder51.setLogLevel(logLevel55);
        retrofit.RestAdapter.Builder builder61 = builder59.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel62 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean63 = logLevel62.log();
        retrofit.RestAdapter.Builder builder64 = builder61.setLogLevel(logLevel62);
        retrofit.RestAdapter restAdapter65 = builder61.build();
        retrofit.RestAdapter.Builder builder67 = builder61.setServer("hi!");
        retrofit.RestAdapter.Builder builder68 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log69 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder70 = builder68.setLog(log69);
        retrofit.RestAdapter.LogLevel logLevel71 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean72 = logLevel71.log();
        boolean boolean73 = logLevel71.log();
        retrofit.RestAdapter.Builder builder74 = builder68.setLogLevel(logLevel71);
        retrofit.RestAdapter.Builder builder75 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log76 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder77 = builder75.setLog(log76);
        retrofit.RestAdapter.LogLevel logLevel78 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean79 = logLevel78.log();
        boolean boolean80 = logLevel78.log();
        retrofit.RestAdapter.Builder builder81 = builder75.setLogLevel(logLevel78);
        retrofit.RestAdapter.Builder builder82 = builder74.setLogLevel(logLevel78);
        retrofit.RestAdapter.Builder builder84 = builder82.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel85 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean86 = logLevel85.log();
        retrofit.RestAdapter.Builder builder87 = builder84.setLogLevel(logLevel85);
        retrofit.RestAdapter restAdapter88 = builder84.build();
        retrofit.RestAdapter.LogLevel logLevel89 = restAdapter88.getLogLevel();
        retrofit.RestAdapter.Builder builder90 = builder67.setLogLevel(logLevel89);
        retrofit.RestAdapter.Log log91 = retrofit.RestAdapter.Log.NONE;
        log91.log("hi!");
        retrofit.RestAdapter.Builder builder94 = builder67.setLog(log91);
        log91.log("hi!");
        retrofit.RestAdapter.Builder builder97 = builder44.setLog(log91);
        retrofit.Server server98 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder99 = builder97.setServer(server98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertTrue("'" + logLevel48 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel48.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertTrue("'" + logLevel55 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel55.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertTrue("'" + logLevel62 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel62.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertTrue("'" + logLevel71 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel71.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertTrue("'" + logLevel78 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel78.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertTrue("'" + logLevel85 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel85.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter88);
        org.junit.Assert.assertTrue("'" + logLevel89 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel89.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder97);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
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
        retrofit.RestAdapter.LogLevel logLevel31 = restAdapter29.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel32 = restAdapter29.getLogLevel();
        retrofit.RestAdapter.Builder builder33 = builder8.setLogLevel(logLevel32);
        retrofit.RestAdapter.Builder builder34 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log35 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder36 = builder34.setLog(log35);
        retrofit.RestAdapter.LogLevel logLevel37 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean38 = logLevel37.log();
        boolean boolean39 = logLevel37.log();
        retrofit.RestAdapter.Builder builder40 = builder34.setLogLevel(logLevel37);
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log42 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder43 = builder41.setLog(log42);
        retrofit.RestAdapter.LogLevel logLevel44 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean45 = logLevel44.log();
        boolean boolean46 = logLevel44.log();
        retrofit.RestAdapter.Builder builder47 = builder41.setLogLevel(logLevel44);
        retrofit.RestAdapter.Builder builder48 = builder40.setLogLevel(logLevel44);
        retrofit.RestAdapter.Builder builder49 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log50 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder51 = builder49.setLog(log50);
        retrofit.RestAdapter.LogLevel logLevel52 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean53 = logLevel52.log();
        boolean boolean54 = logLevel52.log();
        retrofit.RestAdapter.Builder builder55 = builder49.setLogLevel(logLevel52);
        retrofit.RestAdapter.Builder builder56 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log57 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder58 = builder56.setLog(log57);
        retrofit.RestAdapter.LogLevel logLevel59 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean60 = logLevel59.log();
        boolean boolean61 = logLevel59.log();
        retrofit.RestAdapter.Builder builder62 = builder56.setLogLevel(logLevel59);
        retrofit.RestAdapter.Builder builder63 = builder55.setLogLevel(logLevel59);
        retrofit.RestAdapter.Builder builder64 = builder40.setLogLevel(logLevel59);
        retrofit.RestAdapter.Builder builder65 = builder33.setLogLevel(logLevel59);
        retrofit.Server server66 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder67 = builder33.setServer(server66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter29);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel31 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel31.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + logLevel37 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel37.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + logLevel44 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel44.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + logLevel52 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel52.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertTrue("'" + logLevel59 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel59.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder65);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
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
        retrofit.RestAdapter.Builder builder63 = builder61.setServer("hi!");
        retrofit.client.Client.Provider provider64 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder65 = builder63.setClient(provider64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + logLevel40 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel40.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder63);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
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
        retrofit.client.Client client21 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder22 = builder18.setClient(client21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
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
        retrofit.Server server25 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder26 = builder24.setServer(server25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + logLevel8 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel8.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + logLevel15 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel15.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
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
        retrofit.ErrorHandler errorHandler15 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder16 = builder14.setErrorHandler(errorHandler15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Error handler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
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
        retrofit.RestAdapter.Log log54 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder55 = builder53.setLog(log54);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter56 = builder55.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + logLevel40 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel40.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + logLevel45 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel45.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
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
        retrofit.client.Client.Provider provider48 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder49 = builder45.setClient(provider48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + logLevel40 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel40.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter43);
        org.junit.Assert.assertTrue("'" + logLevel44 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel44.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
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
        retrofit.RestAdapter.Builder builder31 = builder29.setServer("hi!");
        retrofit.RestAdapter restAdapter32 = builder29.build();
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
        restAdapter32.setLogLevel(logLevel58);
        retrofit.RestAdapter.Builder builder65 = builder6.setLogLevel(logLevel58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + logLevel43 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel43.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertTrue("'" + logLevel51 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel51.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertTrue("'" + logLevel58 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel58.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder65);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter7 = builder6.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
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
        retrofit.RestAdapter.Log log45 = retrofit.RestAdapter.Log.NONE;
        log45.log("hi!");
        log45.log("");
        retrofit.RestAdapter.Builder builder50 = builder16.setLog(log45);
        java.util.concurrent.Executor executor51 = null;
        java.util.concurrent.Executor executor52 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder53 = builder50.setExecutors(executor51, executor52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
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
        retrofit.RestAdapter restAdapter45 = builder44.build();
        retrofit.RestAdapter restAdapter46 = builder44.build();
        retrofit.RestAdapter.LogLevel logLevel47 = retrofit.RestAdapter.LogLevel.FULL;
        boolean boolean48 = logLevel47.log();
        boolean boolean49 = logLevel47.log();
        boolean boolean50 = logLevel47.log();
        restAdapter46.setLogLevel(logLevel47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter46);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.FULL));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
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
        retrofit.RestAdapter.Log log50 = retrofit.RestAdapter.Log.NONE;
        log50.log("hi!");
        log50.log("");
        log50.log("hi!");
        retrofit.RestAdapter.Builder builder57 = builder22.setLog(log50);
        retrofit.RestAdapter.Log log58 = retrofit.RestAdapter.Log.NONE;
        log58.log("hi!");
        log58.log("");
        log58.log("hi!");
        log58.log("");
        retrofit.RestAdapter.Builder builder67 = builder57.setLog(log58);
        retrofit.RestAdapter restAdapter68 = builder57.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + logLevel40 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel40.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter43);
        org.junit.Assert.assertTrue("'" + logLevel44 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel44.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter68);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
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
        retrofit.RestAdapter.Log log54 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder55 = builder53.setLog(log54);
        retrofit.client.Client client56 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder57 = builder55.setClient(client56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + logLevel40 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel40.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + logLevel45 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel45.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
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
        retrofit.Server server23 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder24 = builder16.setServer(server23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
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
        retrofit.RestAdapter.Builder builder58 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log59 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder60 = builder58.setLog(log59);
        retrofit.RestAdapter.Log log61 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder62 = builder58.setLog(log61);
        retrofit.RestAdapter.Builder builder63 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log64 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder65 = builder63.setLog(log64);
        retrofit.RestAdapter.LogLevel logLevel66 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean67 = logLevel66.log();
        boolean boolean68 = logLevel66.log();
        retrofit.RestAdapter.Builder builder69 = builder63.setLogLevel(logLevel66);
        retrofit.RestAdapter.Builder builder70 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log71 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder72 = builder70.setLog(log71);
        retrofit.RestAdapter.LogLevel logLevel73 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean74 = logLevel73.log();
        boolean boolean75 = logLevel73.log();
        retrofit.RestAdapter.Builder builder76 = builder70.setLogLevel(logLevel73);
        retrofit.RestAdapter.Builder builder77 = builder69.setLogLevel(logLevel73);
        retrofit.RestAdapter.Builder builder78 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log79 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder80 = builder78.setLog(log79);
        retrofit.RestAdapter.Builder builder81 = builder77.setLog(log79);
        retrofit.RestAdapter.Builder builder82 = builder62.setLog(log79);
        retrofit.RestAdapter.Builder builder83 = builder53.setLog(log79);
        retrofit.RestAdapter.Builder builder84 = builder36.setLog(log79);
        retrofit.converter.Converter converter85 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder86 = builder84.setConverter(converter85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Converter may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + logLevel14 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel14.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + logLevel28 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel28.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter31);
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + logLevel40 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel40.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + logLevel54 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel54.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertTrue("'" + logLevel66 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel66.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertTrue("'" + logLevel73 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel73.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder84);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
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
        retrofit.RestAdapter restAdapter17 = builder14.build();
        retrofit.RestAdapter.Builder builder19 = builder14.setServer("hi!");
        retrofit.RestAdapter restAdapter20 = builder14.build();
        retrofit.RestAdapter.LogLevel logLevel21 = restAdapter20.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel22 = restAdapter20.getLogLevel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter20);
        org.junit.Assert.assertTrue("'" + logLevel21 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel21.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.NONE));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
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
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter restAdapter11 = builder0.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Server may not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
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
        java.lang.Class<?> wildcardClass62 = builder61.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + logLevel40 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel40.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.LogLevel logLevel3 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean4 = logLevel3.log();
        boolean boolean5 = logLevel3.log();
        retrofit.RestAdapter.Builder builder6 = builder0.setLogLevel(logLevel3);
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
        retrofit.RestAdapter.LogLevel logLevel31 = restAdapter29.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel32 = restAdapter29.getLogLevel();
        retrofit.RestAdapter.Builder builder33 = builder8.setLogLevel(logLevel32);
        retrofit.RestAdapter.Builder builder34 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log35 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder36 = builder34.setLog(log35);
        retrofit.RestAdapter.LogLevel logLevel37 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean38 = logLevel37.log();
        boolean boolean39 = logLevel37.log();
        retrofit.RestAdapter.Builder builder40 = builder34.setLogLevel(logLevel37);
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log42 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder43 = builder41.setLog(log42);
        retrofit.RestAdapter.LogLevel logLevel44 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean45 = logLevel44.log();
        boolean boolean46 = logLevel44.log();
        retrofit.RestAdapter.Builder builder47 = builder41.setLogLevel(logLevel44);
        retrofit.RestAdapter.Builder builder48 = builder40.setLogLevel(logLevel44);
        retrofit.RestAdapter.Builder builder49 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log50 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder51 = builder49.setLog(log50);
        retrofit.RestAdapter.LogLevel logLevel52 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean53 = logLevel52.log();
        boolean boolean54 = logLevel52.log();
        retrofit.RestAdapter.Builder builder55 = builder49.setLogLevel(logLevel52);
        retrofit.RestAdapter.Builder builder56 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log57 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder58 = builder56.setLog(log57);
        retrofit.RestAdapter.LogLevel logLevel59 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean60 = logLevel59.log();
        boolean boolean61 = logLevel59.log();
        retrofit.RestAdapter.Builder builder62 = builder56.setLogLevel(logLevel59);
        retrofit.RestAdapter.Builder builder63 = builder55.setLogLevel(logLevel59);
        retrofit.RestAdapter.Builder builder64 = builder40.setLogLevel(logLevel59);
        retrofit.RestAdapter.Builder builder65 = builder33.setLogLevel(logLevel59);
        java.util.concurrent.Executor executor66 = null;
        java.util.concurrent.Executor executor67 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder68 = builder33.setExecutors(executor66, executor67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter29);
        org.junit.Assert.assertTrue("'" + logLevel30 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel30.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel31 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel31.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + logLevel37 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel37.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + logLevel44 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel44.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + logLevel52 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel52.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertTrue("'" + logLevel59 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel59.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder65);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
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
        retrofit.RestAdapter.Log log45 = retrofit.RestAdapter.Log.NONE;
        log45.log("hi!");
        log45.log("");
        log45.log("hi!");
        retrofit.RestAdapter.Builder builder52 = builder44.setLog(log45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
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
        retrofit.converter.Converter converter66 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder67 = builder64.setConverter(converter66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Converter may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + logLevel27 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel27.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + logLevel42 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel42.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertTrue("'" + logLevel51 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel51.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter65);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
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
        retrofit.RestAdapter.Builder builder54 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log55 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder56 = builder54.setLog(log55);
        retrofit.RestAdapter.LogLevel logLevel57 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean58 = logLevel57.log();
        boolean boolean59 = logLevel57.log();
        retrofit.RestAdapter.Builder builder60 = builder54.setLogLevel(logLevel57);
        retrofit.RestAdapter.Log log61 = retrofit.RestAdapter.Log.NONE;
        log61.log("");
        retrofit.RestAdapter.Builder builder64 = builder54.setLog(log61);
        log61.log("hi!");
        retrofit.RestAdapter.Builder builder67 = builder30.setLog(log61);
        retrofit.converter.Converter converter68 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder69 = builder30.setConverter(converter68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Converter may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + logLevel40 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel40.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + logLevel45 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel45.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertTrue("'" + logLevel57 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel57.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
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
        retrofit.RequestInterceptor requestInterceptor17 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder18 = builder6.setRequestInterceptor(requestInterceptor17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Request interceptor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
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
        retrofit.RestAdapter restAdapter62 = builder61.build();
        retrofit.ErrorHandler errorHandler63 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder64 = builder61.setErrorHandler(errorHandler63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Error handler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + logLevel40 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel40.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter62);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
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
        retrofit.Profiler profiler50 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder51 = builder49.setProfiler(profiler50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
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
        retrofit.client.Client.Provider provider62 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder63 = builder8.setClient(provider62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + logLevel12 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel12.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + logLevel35 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel35.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + logLevel42 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel42.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertTrue("'" + logLevel49 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel49.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter52);
        org.junit.Assert.assertTrue("'" + logLevel53 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel53.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder61);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
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
        retrofit.RestAdapter.Builder builder50 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log51 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder52 = builder50.setLog(log51);
        retrofit.RestAdapter.Log log53 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder54 = builder50.setLog(log53);
        retrofit.RestAdapter.Builder builder55 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log56 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder57 = builder55.setLog(log56);
        retrofit.RestAdapter.LogLevel logLevel58 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean59 = logLevel58.log();
        boolean boolean60 = logLevel58.log();
        retrofit.RestAdapter.Builder builder61 = builder55.setLogLevel(logLevel58);
        retrofit.RestAdapter.Builder builder62 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log63 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder64 = builder62.setLog(log63);
        retrofit.RestAdapter.LogLevel logLevel65 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean66 = logLevel65.log();
        boolean boolean67 = logLevel65.log();
        retrofit.RestAdapter.Builder builder68 = builder62.setLogLevel(logLevel65);
        retrofit.RestAdapter.Builder builder69 = builder61.setLogLevel(logLevel65);
        retrofit.RestAdapter.Builder builder70 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log71 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder72 = builder70.setLog(log71);
        retrofit.RestAdapter.Builder builder73 = builder69.setLog(log71);
        retrofit.RestAdapter.Builder builder74 = builder54.setLog(log71);
        retrofit.RestAdapter.Builder builder75 = builder49.setLog(log71);
        retrofit.RestAdapter.Builder builder77 = builder49.setServer("hi!");
        retrofit.Server server78 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder79 = builder77.setServer(server78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Server may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + logLevel6 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel6.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + logLevel13 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel13.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + logLevel20 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel20.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + logLevel43 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel43.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter46);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertTrue("'" + logLevel58 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel58.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertTrue("'" + logLevel65 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel65.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder77);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
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
        retrofit.Profiler profiler40 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder41 = builder39.setProfiler(profiler40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
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
        retrofit.RestAdapter restAdapter17 = builder14.build();
        retrofit.RestAdapter restAdapter18 = builder14.build();
        retrofit.RestAdapter.Builder builder19 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log20 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder21 = builder19.setLog(log20);
        retrofit.RestAdapter.LogLevel logLevel22 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean23 = logLevel22.log();
        boolean boolean24 = logLevel22.log();
        retrofit.RestAdapter.Builder builder25 = builder19.setLogLevel(logLevel22);
        boolean boolean26 = logLevel22.log();
        retrofit.RestAdapter.Builder builder27 = builder14.setLogLevel(logLevel22);
        retrofit.Profiler profiler28 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder29 = builder27.setProfiler(profiler28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Profiler may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + logLevel22 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel22.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
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
        retrofit.converter.Converter converter37 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder38 = builder8.setConverter(converter37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Converter may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + logLevel9 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel9.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + logLevel32 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel32.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
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
        retrofit.RestAdapter restAdapter17 = builder14.build();
        retrofit.converter.Converter converter18 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder19 = builder14.setConverter(converter18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Converter may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter17);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
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
        retrofit.RestAdapter.Builder builder51 = builder47.setLog(log49);
        retrofit.RestAdapter.LogLevel logLevel52 = retrofit.RestAdapter.LogLevel.NONE;
        retrofit.RestAdapter.Builder builder53 = builder51.setLogLevel(logLevel52);
        boolean boolean54 = logLevel52.log();
        retrofit.RestAdapter.Builder builder55 = builder32.setLogLevel(logLevel52);
        retrofit.client.Client.Provider provider56 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder57 = builder55.setClient(provider56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Client provider may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + logLevel43 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel43.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + logLevel52 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel52.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
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
        retrofit.RestAdapter.Log log35 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder36 = builder34.setLog(log35);
        retrofit.RestAdapter.LogLevel logLevel37 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean38 = logLevel37.log();
        boolean boolean39 = logLevel37.log();
        retrofit.RestAdapter.Builder builder40 = builder34.setLogLevel(logLevel37);
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log42 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder43 = builder41.setLog(log42);
        retrofit.RestAdapter.LogLevel logLevel44 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean45 = logLevel44.log();
        boolean boolean46 = logLevel44.log();
        retrofit.RestAdapter.Builder builder47 = builder41.setLogLevel(logLevel44);
        retrofit.RestAdapter.Builder builder48 = builder40.setLogLevel(logLevel44);
        retrofit.RestAdapter.Builder builder49 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log50 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder51 = builder49.setLog(log50);
        retrofit.RestAdapter.LogLevel logLevel52 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean53 = logLevel52.log();
        boolean boolean54 = logLevel52.log();
        retrofit.RestAdapter.Builder builder55 = builder49.setLogLevel(logLevel52);
        retrofit.RestAdapter.Builder builder56 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log57 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder58 = builder56.setLog(log57);
        retrofit.RestAdapter.LogLevel logLevel59 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean60 = logLevel59.log();
        boolean boolean61 = logLevel59.log();
        retrofit.RestAdapter.Builder builder62 = builder56.setLogLevel(logLevel59);
        retrofit.RestAdapter.Builder builder63 = builder55.setLogLevel(logLevel59);
        retrofit.RestAdapter.Builder builder64 = builder40.setLogLevel(logLevel59);
        retrofit.RestAdapter.Builder builder65 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log66 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder67 = builder65.setLog(log66);
        retrofit.RestAdapter.LogLevel logLevel68 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean69 = logLevel68.log();
        boolean boolean70 = logLevel68.log();
        retrofit.RestAdapter.Builder builder71 = builder65.setLogLevel(logLevel68);
        retrofit.RestAdapter.Log log72 = retrofit.RestAdapter.Log.NONE;
        log72.log("");
        retrofit.RestAdapter.Builder builder75 = builder65.setLog(log72);
        log72.log("hi!");
        retrofit.RestAdapter.Builder builder78 = builder40.setLog(log72);
        log72.log("");
        log72.log("");
        log72.log("");
        retrofit.RestAdapter.Builder builder85 = builder6.setLog(log72);
        retrofit.converter.Converter converter86 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder87 = builder85.setConverter(converter86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Converter may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + logLevel37 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel37.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + logLevel44 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel44.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + logLevel52 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel52.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertTrue("'" + logLevel59 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel59.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertTrue("'" + logLevel68 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel68.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder85);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
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
        retrofit.RequestInterceptor requestInterceptor15 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder16 = builder14.setRequestInterceptor(requestInterceptor15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Request interceptor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
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
        retrofit.RestAdapter.Log log24 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder25 = builder21.setLog(log24);
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
        retrofit.RestAdapter.Builder builder41 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log42 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder43 = builder41.setLog(log42);
        retrofit.RestAdapter.Builder builder44 = builder40.setLog(log42);
        retrofit.RestAdapter.Builder builder45 = builder25.setLog(log42);
        retrofit.RestAdapter.Builder builder46 = builder16.setLog(log42);
        retrofit.RestAdapter.Log log47 = retrofit.RestAdapter.Log.NONE;
        log47.log("");
        log47.log("");
        retrofit.RestAdapter.Builder builder52 = builder16.setLog(log47);
        retrofit.RestAdapter.Log log53 = retrofit.RestAdapter.Log.NONE;
        log53.log("hi!");
        log53.log("");
        log53.log("hi!");
        retrofit.RestAdapter.Builder builder60 = builder16.setLog(log53);
        java.util.concurrent.Executor executor61 = null;
        java.util.concurrent.Executor executor62 = null;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.RestAdapter.Builder builder63 = builder60.setExecutors(executor61, executor62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: HTTP executor may not be null.");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder60);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
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
        retrofit.RestAdapter.LogLevel logLevel68 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean69 = logLevel68.log();
        retrofit.RestAdapter.Builder builder70 = builder67.setLogLevel(logLevel68);
        retrofit.RestAdapter restAdapter71 = builder67.build();
        retrofit.RestAdapter.LogLevel logLevel72 = restAdapter71.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel73 = restAdapter71.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel74 = restAdapter71.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel75 = retrofit.RestAdapter.LogLevel.FULL;
        restAdapter71.setLogLevel(logLevel75);
        retrofit.RestAdapter.LogLevel logLevel77 = restAdapter71.getLogLevel();
        boolean boolean78 = logLevel77.log();
        retrofit.RestAdapter.Builder builder79 = builder50.setLogLevel(logLevel77);
        boolean boolean80 = logLevel77.log();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + logLevel54 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel54.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertTrue("'" + logLevel61 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel61.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertTrue("'" + logLevel68 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel68.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter71);
        org.junit.Assert.assertTrue("'" + logLevel72 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel72.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel73 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel73.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel74 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel74.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel75 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel75.equals(retrofit.RestAdapter.LogLevel.FULL));
        org.junit.Assert.assertTrue("'" + logLevel77 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel77.equals(retrofit.RestAdapter.LogLevel.FULL));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + logLevel40 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel40.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter62);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + logLevel40 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel40.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter43);
        org.junit.Assert.assertTrue("'" + logLevel44 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel44.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertTrue("'" + logLevel51 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel51.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertTrue("'" + logLevel58 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel58.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder71);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
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
        retrofit.RestAdapter restAdapter17 = builder14.build();
        retrofit.RestAdapter restAdapter18 = builder14.build();
        retrofit.RestAdapter.LogLevel logLevel19 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean20 = logLevel19.log();
        boolean boolean21 = logLevel19.log();
        boolean boolean22 = logLevel19.log();
        boolean boolean23 = logLevel19.log();
        boolean boolean24 = logLevel19.log();
        restAdapter18.setLogLevel(logLevel19);
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
        retrofit.RestAdapter.LogLevel logLevel48 = restAdapter46.getLogLevel();
        restAdapter18.setLogLevel(logLevel48);
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
        retrofit.RestAdapter.Builder builder66 = builder64.setServer("hi!");
        retrofit.RestAdapter.LogLevel logLevel67 = retrofit.RestAdapter.LogLevel.NONE;
        boolean boolean68 = logLevel67.log();
        retrofit.RestAdapter.Builder builder69 = builder66.setLogLevel(logLevel67);
        retrofit.RestAdapter restAdapter70 = builder66.build();
        retrofit.RestAdapter.LogLevel logLevel71 = restAdapter70.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel72 = restAdapter70.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel73 = restAdapter70.getLogLevel();
        retrofit.RestAdapter.LogLevel logLevel74 = retrofit.RestAdapter.LogLevel.FULL;
        restAdapter70.setLogLevel(logLevel74);
        restAdapter18.setLogLevel(logLevel74);
        boolean boolean77 = logLevel74.log();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter18);
        org.junit.Assert.assertTrue("'" + logLevel19 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel19.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + logLevel29 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel29.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + logLevel36 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel36.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + logLevel43 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel43.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter46);
        org.junit.Assert.assertTrue("'" + logLevel47 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel47.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel48 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel48.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertTrue("'" + logLevel53 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel53.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertTrue("'" + logLevel60 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel60.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertTrue("'" + logLevel67 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel67.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter70);
        org.junit.Assert.assertTrue("'" + logLevel71 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel71.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel72 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel72.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel73 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel73.equals(retrofit.RestAdapter.LogLevel.NONE));
        org.junit.Assert.assertTrue("'" + logLevel74 + "' != '" + retrofit.RestAdapter.LogLevel.FULL + "'", logLevel74.equals(retrofit.RestAdapter.LogLevel.FULL));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
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
        log49.log("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + logLevel18 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel18.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + logLevel25 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel25.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + logLevel34 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel34.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + logLevel40 + "' != '" + retrofit.RestAdapter.LogLevel.HEADERS + "'", logLevel40.equals(retrofit.RestAdapter.LogLevel.HEADERS));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + logLevel45 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel45.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
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
        retrofit.RestAdapter.Log log50 = retrofit.RestAdapter.Log.NONE;
        log50.log("hi!");
        log50.log("");
        log50.log("hi!");
        retrofit.RestAdapter.Builder builder57 = builder22.setLog(log50);
        retrofit.RestAdapter.Log log58 = retrofit.RestAdapter.Log.NONE;
        log58.log("hi!");
        log58.log("");
        log58.log("hi!");
        log58.log("");
        retrofit.RestAdapter.Builder builder67 = builder57.setLog(log58);
        java.lang.Class<?> wildcardClass68 = builder57.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + logLevel3 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel3.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + logLevel10 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel10.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + logLevel17 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel17.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + logLevel26 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel26.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + logLevel33 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel33.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + logLevel40 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel40.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(restAdapter43);
        org.junit.Assert.assertTrue("'" + logLevel44 + "' != '" + retrofit.RestAdapter.LogLevel.NONE + "'", logLevel44.equals(retrofit.RestAdapter.LogLevel.NONE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        retrofit.RestAdapter.Builder builder0 = new retrofit.RestAdapter.Builder();
        retrofit.RestAdapter.Log log1 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder2 = builder0.setLog(log1);
        retrofit.RestAdapter.Log log3 = retrofit.RestAdapter.Log.NONE;
        retrofit.RestAdapter.Builder builder4 = builder0.setLog(log3);
        log3.log("hi!");
        log3.log("");
        log3.log("");
        log3.log("hi!");
        log3.log("");
        log3.log("");
        log3.log("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(log3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(builder4);
    }
}

