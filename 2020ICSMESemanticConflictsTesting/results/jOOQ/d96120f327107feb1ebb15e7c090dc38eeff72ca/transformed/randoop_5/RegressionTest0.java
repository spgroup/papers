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
        org.jooq.Field<java.lang.Integer> intField0 = org.jooq.impl.DSL.two();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        org.jooq.Row22<org.jooq.QueryPart, org.jooq.TableLike<org.jooq.Record>, org.jooq.Field<java.lang.Integer>, org.jooq.Table<org.jooq.Record>, java.io.Serializable, java.lang.Object, java.lang.String, org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer>, org.jooq.Table<org.jooq.Record>, org.jooq.Row, org.jooq.Field<java.lang.Integer>, java.lang.CharSequence, org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer>, org.jooq.SelectField<java.lang.Integer>, java.lang.Object, org.jooq.SelectField<java.lang.Integer>, org.jooq.Row, org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer>, java.io.Serializable, org.jooq.Row, org.jooq.SelectField<java.lang.Integer>, org.jooq.GroupField> queryPartRow22_0 = null;
        org.jooq.Row22[] row22Array2 = new org.jooq.Row22[1];
        @SuppressWarnings("unchecked")
        org.jooq.Row22<org.jooq.QueryPart, org.jooq.TableLike<org.jooq.Record>, org.jooq.Field<java.lang.Integer>, org.jooq.Table<org.jooq.Record>, java.io.Serializable, java.lang.Object, java.lang.String, org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer>, org.jooq.Table<org.jooq.Record>, org.jooq.Row, org.jooq.Field<java.lang.Integer>, java.lang.CharSequence, org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer>, org.jooq.SelectField<java.lang.Integer>, java.lang.Object, org.jooq.SelectField<java.lang.Integer>, org.jooq.Row, org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer>, java.io.Serializable, org.jooq.Row, org.jooq.SelectField<java.lang.Integer>, org.jooq.GroupField>[] queryPartRow22Array3 = (org.jooq.Row22<org.jooq.QueryPart, org.jooq.TableLike<org.jooq.Record>, org.jooq.Field<java.lang.Integer>, org.jooq.Table<org.jooq.Record>, java.io.Serializable, java.lang.Object, java.lang.String, org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer>, org.jooq.Table<org.jooq.Record>, org.jooq.Row, org.jooq.Field<java.lang.Integer>, java.lang.CharSequence, org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer>, org.jooq.SelectField<java.lang.Integer>, java.lang.Object, org.jooq.SelectField<java.lang.Integer>, org.jooq.Row, org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer>, java.io.Serializable, org.jooq.Row, org.jooq.SelectField<java.lang.Integer>, org.jooq.GroupField>[]) row22Array2;
        queryPartRow22Array3[0] = queryPartRow22_0;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record22<org.jooq.QueryPart, org.jooq.TableLike<org.jooq.Record>, org.jooq.Field<java.lang.Integer>, org.jooq.Table<org.jooq.Record>, java.io.Serializable, java.lang.Object, java.lang.String, org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer>, org.jooq.Table<org.jooq.Record>, org.jooq.Row, org.jooq.Field<java.lang.Integer>, java.lang.CharSequence, org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer>, org.jooq.SelectField<java.lang.Integer>, java.lang.Object, org.jooq.SelectField<java.lang.Integer>, org.jooq.Row, org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer>, java.io.Serializable, org.jooq.Row, org.jooq.SelectField<java.lang.Integer>, org.jooq.GroupField>> queryPartRecord22Table6 = org.jooq.impl.DSL.values(queryPartRow22Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row22Array2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(queryPartRow22Array3);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.jooq.Field<java.lang.String> strField0 = org.jooq.impl.DSL.currentUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.sql.Connection connection0 = null;
        org.jooq.SQLDialect sQLDialect1 = null;
        org.jooq.DSLContext dSLContext2 = org.jooq.impl.DSL.using(connection0, sQLDialect1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dSLContext2);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.jooq.Schema schema1 = org.jooq.impl.DSL.schemaByName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.Object[] objArray2 = new java.lang.Object[] { 100, (-1) };
        org.jooq.Table<?> wildcardTable3 = org.jooq.impl.DSL.unnest(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[100, -1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[100, -1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardTable3);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.jooq.Condition condition0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Condition condition1 = org.jooq.impl.DSL.not(condition0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.sql.Timestamp timestamp0 = null;
        org.jooq.DatePart datePart1 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField2 = org.jooq.impl.DSL.trunc(timestamp0, datePart1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.reverse("");
        org.jooq.Field<java.sql.Timestamp> timestampField2 = null;
        java.util.Date date3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = org.jooq.impl.DSL.second(date3);
        java.util.Date date5 = null;
        org.jooq.Field<java.lang.Integer> intField6 = org.jooq.impl.DSL.second(date5);
        java.util.Date date7 = null;
        org.jooq.Field<java.lang.Integer> intField8 = org.jooq.impl.DSL.minute(date7);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_9 = org.jooq.impl.DSL.row(intField4, intField6, intField8);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField10 = org.jooq.impl.DSL.deg(intField4);
        org.jooq.DatePart datePart11 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField12 = org.jooq.impl.DSL.timestampAdd(timestampField2, intField4, datePart11);
        java.util.Date date13 = null;
        org.jooq.Field<java.lang.Integer> intField14 = org.jooq.impl.DSL.second(date13);
        java.util.Date date15 = null;
        org.jooq.Field<java.lang.Integer> intField16 = org.jooq.impl.DSL.second(date15);
        java.util.Date date17 = null;
        org.jooq.Field<java.lang.Integer> intField18 = org.jooq.impl.DSL.minute(date17);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_19 = org.jooq.impl.DSL.row(intField14, intField16, intField18);
        java.util.Date date20 = null;
        org.jooq.Field<java.lang.Integer> intField21 = org.jooq.impl.DSL.minute(date20);
        java.util.Date date22 = null;
        org.jooq.Field<java.lang.Integer> intField23 = org.jooq.impl.DSL.second(date22);
        org.jooq.Field<java.sql.Timestamp> timestampField24 = null;
        java.util.Date date25 = null;
        org.jooq.Field<java.lang.Integer> intField26 = org.jooq.impl.DSL.second(date25);
        java.util.Date date27 = null;
        org.jooq.Field<java.lang.Integer> intField28 = org.jooq.impl.DSL.second(date27);
        java.util.Date date29 = null;
        org.jooq.Field<java.lang.Integer> intField30 = org.jooq.impl.DSL.minute(date29);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_31 = org.jooq.impl.DSL.row(intField26, intField28, intField30);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField32 = org.jooq.impl.DSL.deg(intField26);
        org.jooq.DatePart datePart33 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField34 = org.jooq.impl.DSL.timestampAdd(timestampField24, intField26, datePart33);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord3SelectSelectStep35 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField21, (org.jooq.SelectField<java.lang.Integer>) intField23, (org.jooq.SelectField<java.lang.Integer>) intField26);
        org.jooq.Field[] fieldArray37 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray38 = (org.jooq.Field<?>[]) fieldArray37;
        org.jooq.Field<java.lang.Integer> intField39 = org.jooq.impl.DSL.least(intField21, wildcardFieldArray38);
        org.jooq.Field<java.lang.Integer> intField40 = org.jooq.impl.DSL.greatest(intField14, wildcardFieldArray38);
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.substring(strField1, intField4, intField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord3SelectSelectStep35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField41);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.jooq.WindowOverStep<java.lang.Integer> intWindowOverStep0 = org.jooq.impl.DSL.rowNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intWindowOverStep0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.jooq.WindowOverStep<java.lang.Integer> intWindowOverStep1 = org.jooq.impl.DSL.ntile(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intWindowOverStep1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.minute(date0);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.deg(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.second(date0);
        java.util.Date date2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = org.jooq.impl.DSL.second(date2);
        java.util.Date date4 = null;
        org.jooq.Field<java.lang.Integer> intField5 = org.jooq.impl.DSL.second(date4);
        java.util.Date date6 = null;
        org.jooq.Field<java.lang.Integer> intField7 = org.jooq.impl.DSL.minute(date6);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_8 = org.jooq.impl.DSL.row(intField3, intField5, intField7);
        java.util.Date date9 = null;
        org.jooq.Field<java.lang.Integer> intField10 = org.jooq.impl.DSL.second(date9);
        java.util.Date date11 = null;
        org.jooq.Field<java.lang.Integer> intField12 = org.jooq.impl.DSL.second(date11);
        java.util.Date date13 = null;
        org.jooq.Field<java.lang.Integer> intField14 = org.jooq.impl.DSL.minute(date13);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_15 = org.jooq.impl.DSL.row(intField10, intField12, intField14);
        org.jooq.Field<java.lang.Object> objField17 = org.jooq.impl.DSL.decode((org.jooq.GroupField) intField7, (org.jooq.GroupField) intField12, (java.lang.Object) (byte) 10);
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.Integer, java.lang.Integer>> intRecord2SelectSelectStep18 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField1, (org.jooq.SelectField<java.lang.Integer>) intField7);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField19 = org.jooq.impl.DSL.exp(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objField17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord2SelectSelectStep18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField19);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.second(date0);
        java.util.Date date2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = org.jooq.impl.DSL.second(date2);
        java.util.Date date4 = null;
        org.jooq.Field<java.lang.Integer> intField5 = org.jooq.impl.DSL.second(date4);
        java.util.Date date6 = null;
        org.jooq.Field<java.lang.Integer> intField7 = org.jooq.impl.DSL.minute(date6);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_8 = org.jooq.impl.DSL.row(intField3, intField5, intField7);
        java.util.Date date9 = null;
        org.jooq.Field<java.lang.Integer> intField10 = org.jooq.impl.DSL.second(date9);
        java.util.Date date11 = null;
        org.jooq.Field<java.lang.Integer> intField12 = org.jooq.impl.DSL.second(date11);
        java.util.Date date13 = null;
        org.jooq.Field<java.lang.Integer> intField14 = org.jooq.impl.DSL.minute(date13);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_15 = org.jooq.impl.DSL.row(intField10, intField12, intField14);
        org.jooq.Field<java.lang.Object> objField17 = org.jooq.impl.DSL.decode((org.jooq.GroupField) intField7, (org.jooq.GroupField) intField12, (java.lang.Object) (byte) 10);
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.Integer, java.lang.Integer>> intRecord2SelectSelectStep18 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField1, (org.jooq.SelectField<java.lang.Integer>) intField7);
        org.jooq.Field<java.lang.Integer> intField19 = org.jooq.impl.DSL.ceil(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objField17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord2SelectSelectStep18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField19);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.jooq.Field<java.lang.Boolean> booleanField0 = org.jooq.impl.DSL.connectByIsCycle();
        org.jooq.Condition condition1 = org.jooq.impl.DSL.condition(booleanField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(condition1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.minute(date0);
        java.util.Date date2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = org.jooq.impl.DSL.second(date2);
        org.jooq.Field<java.sql.Timestamp> timestampField4 = null;
        java.util.Date date5 = null;
        org.jooq.Field<java.lang.Integer> intField6 = org.jooq.impl.DSL.second(date5);
        java.util.Date date7 = null;
        org.jooq.Field<java.lang.Integer> intField8 = org.jooq.impl.DSL.second(date7);
        java.util.Date date9 = null;
        org.jooq.Field<java.lang.Integer> intField10 = org.jooq.impl.DSL.minute(date9);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_11 = org.jooq.impl.DSL.row(intField6, intField8, intField10);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = org.jooq.impl.DSL.deg(intField6);
        org.jooq.DatePart datePart13 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField14 = org.jooq.impl.DSL.timestampAdd(timestampField4, intField6, datePart13);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord3SelectSelectStep15 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField1, (org.jooq.SelectField<java.lang.Integer>) intField3, (org.jooq.SelectField<java.lang.Integer>) intField6);
        org.jooq.Field[] fieldArray17 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray18 = (org.jooq.Field<?>[]) fieldArray17;
        org.jooq.Field<java.lang.Integer> intField19 = org.jooq.impl.DSL.least(intField1, wildcardFieldArray18);
        org.jooq.Field<java.lang.Integer> intField21 = org.jooq.impl.DSL.bitXor(intField19, (java.lang.Integer) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord3SelectSelectStep15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField21);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.jooq.CreateTableAsStep<org.jooq.Record> recordCreateTableAsStep1 = org.jooq.impl.DSL.createGlobalTemporaryTable("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordCreateTableAsStep1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.minute(date0);
        org.jooq.AggregateFunction<java.lang.Integer> intAggregateFunction2 = org.jooq.impl.DSL.max(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intAggregateFunction2);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.DSLContext dSLContext3 = org.jooq.impl.DSL.using("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.DataAccessException; message: SQL [Error when initialising Connection]; No suitable driver found for ");
        } catch (org.jooq.exception.DataAccessException e) {
        // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.second(date0);
        java.util.Date date2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = org.jooq.impl.DSL.second(date2);
        java.util.Date date4 = null;
        org.jooq.Field<java.lang.Integer> intField5 = org.jooq.impl.DSL.second(date4);
        java.util.Date date6 = null;
        org.jooq.Field<java.lang.Integer> intField7 = org.jooq.impl.DSL.minute(date6);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_8 = org.jooq.impl.DSL.row(intField3, intField5, intField7);
        java.util.Date date9 = null;
        org.jooq.Field<java.lang.Integer> intField10 = org.jooq.impl.DSL.second(date9);
        java.util.Date date11 = null;
        org.jooq.Field<java.lang.Integer> intField12 = org.jooq.impl.DSL.second(date11);
        java.util.Date date13 = null;
        org.jooq.Field<java.lang.Integer> intField14 = org.jooq.impl.DSL.minute(date13);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_15 = org.jooq.impl.DSL.row(intField10, intField12, intField14);
        org.jooq.Field<java.lang.Object> objField17 = org.jooq.impl.DSL.decode((org.jooq.GroupField) intField7, (org.jooq.GroupField) intField12, (java.lang.Object) (byte) 10);
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.Integer, java.lang.Integer>> intRecord2SelectSelectStep18 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField1, (org.jooq.SelectField<java.lang.Integer>) intField7);
        java.util.Date date19 = null;
        org.jooq.Field<java.lang.Integer> intField20 = org.jooq.impl.DSL.second(date19);
        java.util.Date date21 = null;
        org.jooq.Field<java.lang.Integer> intField22 = org.jooq.impl.DSL.second(date21);
        java.util.Date date23 = null;
        org.jooq.Field<java.lang.Integer> intField24 = org.jooq.impl.DSL.minute(date23);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_25 = org.jooq.impl.DSL.row(intField20, intField22, intField24);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction26 = org.jooq.impl.DSL.regrAvgX(intField7, intField22);
        java.util.Date date27 = null;
        org.jooq.Field<java.lang.Integer> intField28 = org.jooq.impl.DSL.second(date27);
        java.util.Date date29 = null;
        org.jooq.Field<java.lang.Integer> intField30 = org.jooq.impl.DSL.second(date29);
        java.util.Date date31 = null;
        org.jooq.Field<java.lang.Integer> intField32 = org.jooq.impl.DSL.minute(date31);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_33 = org.jooq.impl.DSL.row(intField28, intField30, intField32);
        org.jooq.Row2<java.lang.Integer, java.lang.Integer> intRow2_34 = org.jooq.impl.DSL.row(intField22, intField28);
        org.jooq.Field<java.lang.Integer> intField36 = org.jooq.impl.DSL.bitNor(intField22, (java.lang.Integer) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objField17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord2SelectSelectStep18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow2_34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField36);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.jooq.Table<org.jooq.Record> recordTable1 = org.jooq.impl.DSL.table("hi!");
        org.jooq.CreateTableAsStep<org.jooq.Record> recordCreateTableAsStep2 = org.jooq.impl.DSL.createGlobalTemporaryTable(recordTable1);
        org.jooq.InsertSetStep<org.jooq.Record> recordInsertSetStep3 = org.jooq.impl.DSL.insertInto(recordTable1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordTable1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordCreateTableAsStep2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordInsertSetStep3);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.second(date0);
        java.util.Date date2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = org.jooq.impl.DSL.second(date2);
        java.util.Date date4 = null;
        org.jooq.Field<java.lang.Integer> intField5 = org.jooq.impl.DSL.second(date4);
        java.util.Date date6 = null;
        org.jooq.Field<java.lang.Integer> intField7 = org.jooq.impl.DSL.minute(date6);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_8 = org.jooq.impl.DSL.row(intField3, intField5, intField7);
        java.util.Date date9 = null;
        org.jooq.Field<java.lang.Integer> intField10 = org.jooq.impl.DSL.second(date9);
        java.util.Date date11 = null;
        org.jooq.Field<java.lang.Integer> intField12 = org.jooq.impl.DSL.second(date11);
        java.util.Date date13 = null;
        org.jooq.Field<java.lang.Integer> intField14 = org.jooq.impl.DSL.minute(date13);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_15 = org.jooq.impl.DSL.row(intField10, intField12, intField14);
        org.jooq.Field<java.lang.Object> objField17 = org.jooq.impl.DSL.decode((org.jooq.GroupField) intField7, (org.jooq.GroupField) intField12, (java.lang.Object) (byte) 10);
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.Integer, java.lang.Integer>> intRecord2SelectSelectStep18 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField1, (org.jooq.SelectField<java.lang.Integer>) intField7);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField19 = org.jooq.impl.DSL.ln(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objField17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord2SelectSelectStep18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField19);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.minute(date0);
        java.util.Date date2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = org.jooq.impl.DSL.second(date2);
        org.jooq.Field<java.sql.Timestamp> timestampField4 = null;
        java.util.Date date5 = null;
        org.jooq.Field<java.lang.Integer> intField6 = org.jooq.impl.DSL.second(date5);
        java.util.Date date7 = null;
        org.jooq.Field<java.lang.Integer> intField8 = org.jooq.impl.DSL.second(date7);
        java.util.Date date9 = null;
        org.jooq.Field<java.lang.Integer> intField10 = org.jooq.impl.DSL.minute(date9);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_11 = org.jooq.impl.DSL.row(intField6, intField8, intField10);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = org.jooq.impl.DSL.deg(intField6);
        org.jooq.DatePart datePart13 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField14 = org.jooq.impl.DSL.timestampAdd(timestampField4, intField6, datePart13);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord3SelectSelectStep15 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField1, (org.jooq.SelectField<java.lang.Integer>) intField3, (org.jooq.SelectField<java.lang.Integer>) intField6);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField16 = org.jooq.impl.DSL.exp(intField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord3SelectSelectStep15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField16);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.minute(date0);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField3 = org.jooq.impl.DSL.power(intField1, (java.lang.Number) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField3);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.minute(date0);
        java.util.Date date2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = org.jooq.impl.DSL.second(date2);
        org.jooq.Field<java.sql.Timestamp> timestampField4 = null;
        java.util.Date date5 = null;
        org.jooq.Field<java.lang.Integer> intField6 = org.jooq.impl.DSL.second(date5);
        java.util.Date date7 = null;
        org.jooq.Field<java.lang.Integer> intField8 = org.jooq.impl.DSL.second(date7);
        java.util.Date date9 = null;
        org.jooq.Field<java.lang.Integer> intField10 = org.jooq.impl.DSL.minute(date9);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_11 = org.jooq.impl.DSL.row(intField6, intField8, intField10);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = org.jooq.impl.DSL.deg(intField6);
        org.jooq.DatePart datePart13 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField14 = org.jooq.impl.DSL.timestampAdd(timestampField4, intField6, datePart13);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord3SelectSelectStep15 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField1, (org.jooq.SelectField<java.lang.Integer>) intField3, (org.jooq.SelectField<java.lang.Integer>) intField6);
        org.jooq.Condition condition16 = org.jooq.impl.DSL.notExists((org.jooq.Select<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>) intRecord3SelectSelectStep15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord3SelectSelectStep15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(condition16);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.second(date0);
        java.util.Date date2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = org.jooq.impl.DSL.second(date2);
        java.util.Date date4 = null;
        org.jooq.Field<java.lang.Integer> intField5 = org.jooq.impl.DSL.second(date4);
        java.util.Date date6 = null;
        org.jooq.Field<java.lang.Integer> intField7 = org.jooq.impl.DSL.minute(date6);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_8 = org.jooq.impl.DSL.row(intField3, intField5, intField7);
        java.util.Date date9 = null;
        org.jooq.Field<java.lang.Integer> intField10 = org.jooq.impl.DSL.second(date9);
        java.util.Date date11 = null;
        org.jooq.Field<java.lang.Integer> intField12 = org.jooq.impl.DSL.second(date11);
        java.util.Date date13 = null;
        org.jooq.Field<java.lang.Integer> intField14 = org.jooq.impl.DSL.minute(date13);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_15 = org.jooq.impl.DSL.row(intField10, intField12, intField14);
        org.jooq.Field<java.lang.Object> objField17 = org.jooq.impl.DSL.decode((org.jooq.GroupField) intField7, (org.jooq.GroupField) intField12, (java.lang.Object) (byte) 10);
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.Integer, java.lang.Integer>> intRecord2SelectSelectStep18 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField1, (org.jooq.SelectField<java.lang.Integer>) intField7);
        java.util.Date date19 = null;
        org.jooq.Field<java.lang.Integer> intField20 = org.jooq.impl.DSL.second(date19);
        java.util.Date date21 = null;
        org.jooq.Field<java.lang.Integer> intField22 = org.jooq.impl.DSL.second(date21);
        java.util.Date date23 = null;
        org.jooq.Field<java.lang.Integer> intField24 = org.jooq.impl.DSL.minute(date23);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_25 = org.jooq.impl.DSL.row(intField20, intField22, intField24);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction26 = org.jooq.impl.DSL.regrAvgX(intField7, intField22);
        java.util.Date date27 = null;
        org.jooq.Field<java.lang.Integer> intField28 = org.jooq.impl.DSL.second(date27);
        java.util.Date date29 = null;
        org.jooq.Field<java.lang.Integer> intField30 = org.jooq.impl.DSL.second(date29);
        java.util.Date date31 = null;
        org.jooq.Field<java.lang.Integer> intField32 = org.jooq.impl.DSL.minute(date31);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_33 = org.jooq.impl.DSL.row(intField28, intField30, intField32);
        java.util.Date date34 = null;
        org.jooq.Field<java.lang.Integer> intField35 = org.jooq.impl.DSL.minute(date34);
        java.util.Date date36 = null;
        org.jooq.Field<java.lang.Integer> intField37 = org.jooq.impl.DSL.second(date36);
        org.jooq.Field<java.sql.Timestamp> timestampField38 = null;
        java.util.Date date39 = null;
        org.jooq.Field<java.lang.Integer> intField40 = org.jooq.impl.DSL.second(date39);
        java.util.Date date41 = null;
        org.jooq.Field<java.lang.Integer> intField42 = org.jooq.impl.DSL.second(date41);
        java.util.Date date43 = null;
        org.jooq.Field<java.lang.Integer> intField44 = org.jooq.impl.DSL.minute(date43);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_45 = org.jooq.impl.DSL.row(intField40, intField42, intField44);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField46 = org.jooq.impl.DSL.deg(intField40);
        org.jooq.DatePart datePart47 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField48 = org.jooq.impl.DSL.timestampAdd(timestampField38, intField40, datePart47);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord3SelectSelectStep49 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField35, (org.jooq.SelectField<java.lang.Integer>) intField37, (org.jooq.SelectField<java.lang.Integer>) intField40);
        org.jooq.Field[] fieldArray51 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray52 = (org.jooq.Field<?>[]) fieldArray51;
        org.jooq.Field<java.lang.Integer> intField53 = org.jooq.impl.DSL.least(intField35, wildcardFieldArray52);
        org.jooq.Field<java.lang.Integer> intField54 = org.jooq.impl.DSL.greatest(intField28, wildcardFieldArray52);
        org.jooq.Field<java.lang.Integer> intField55 = org.jooq.impl.DSL.greatest(intField7, wildcardFieldArray52);
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<?> wildcardTable56 = org.jooq.impl.DSL.unnest((java.lang.Object[]) wildcardFieldArray52);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type interface org.jooq.Field is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objField17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord2SelectSelectStep18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord3SelectSelectStep49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField55);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.jooq.Field<java.sql.Timestamp> timestampField0 = null;
        java.util.Date date1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = org.jooq.impl.DSL.second(date1);
        java.util.Date date3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = org.jooq.impl.DSL.second(date3);
        java.util.Date date5 = null;
        org.jooq.Field<java.lang.Integer> intField6 = org.jooq.impl.DSL.minute(date5);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_7 = org.jooq.impl.DSL.row(intField2, intField4, intField6);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.deg(intField2);
        org.jooq.DatePart datePart9 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField10 = org.jooq.impl.DSL.timestampAdd(timestampField0, intField2, datePart9);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = org.jooq.impl.DSL.sinh(intField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField11);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.minute(date0);
        java.util.Date date2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = org.jooq.impl.DSL.second(date2);
        org.jooq.Field<java.sql.Timestamp> timestampField4 = null;
        java.util.Date date5 = null;
        org.jooq.Field<java.lang.Integer> intField6 = org.jooq.impl.DSL.second(date5);
        java.util.Date date7 = null;
        org.jooq.Field<java.lang.Integer> intField8 = org.jooq.impl.DSL.second(date7);
        java.util.Date date9 = null;
        org.jooq.Field<java.lang.Integer> intField10 = org.jooq.impl.DSL.minute(date9);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_11 = org.jooq.impl.DSL.row(intField6, intField8, intField10);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = org.jooq.impl.DSL.deg(intField6);
        org.jooq.DatePart datePart13 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField14 = org.jooq.impl.DSL.timestampAdd(timestampField4, intField6, datePart13);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord3SelectSelectStep15 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField1, (org.jooq.SelectField<java.lang.Integer>) intField3, (org.jooq.SelectField<java.lang.Integer>) intField6);
        org.jooq.Field[] fieldArray17 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray18 = (org.jooq.Field<?>[]) fieldArray17;
        org.jooq.Field<java.lang.Integer> intField19 = org.jooq.impl.DSL.least(intField1, wildcardFieldArray18);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField21 = org.jooq.impl.DSL.power(intField19, (java.lang.Number) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord3SelectSelectStep15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField21);
    }
}

