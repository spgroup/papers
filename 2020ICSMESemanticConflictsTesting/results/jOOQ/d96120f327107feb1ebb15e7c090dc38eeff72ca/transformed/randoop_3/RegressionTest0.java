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
        org.jooq.WindowOverStep<java.lang.Integer> intWindowOverStep0 = org.jooq.impl.DSL.rowNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intWindowOverStep0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.jooq.WindowOverStep<java.lang.Integer> intWindowOverStep1 = org.jooq.impl.DSL.ntile(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intWindowOverStep1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
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
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.jooq.Field<java.lang.Boolean> booleanField0 = org.jooq.impl.DSL.connectByIsCycle();
        org.jooq.Condition condition1 = org.jooq.impl.DSL.condition(booleanField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(condition1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.jooq.CreateTableAsStep<org.jooq.Record> recordCreateTableAsStep1 = org.jooq.impl.DSL.createGlobalTemporaryTable("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordCreateTableAsStep1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.minute(date0);
        org.jooq.AggregateFunction<java.lang.Integer> intAggregateFunction2 = org.jooq.impl.DSL.max(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intAggregateFunction2);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.DSLContext dSLContext3 = org.jooq.impl.DSL.using("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.DataAccessException; message: SQL [Error when initialising Connection]; No suitable driver found for ");
        } catch (org.jooq.exception.DataAccessException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
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
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
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
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.minute(date0);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField3 = org.jooq.impl.DSL.power(intField1, (java.lang.Number) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField3);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
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
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
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

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.jooq.Row22[] row22Array1 = new org.jooq.Row22[0];
        @SuppressWarnings("unchecked")
        org.jooq.Row22<org.jooq.FieldLike, org.jooq.TableLike<org.jooq.Record>, org.jooq.Condition, org.jooq.SelectDistinctOnStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, java.io.Serializable, org.jooq.SelectOptionStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.Table<org.jooq.Record>, org.jooq.Table<org.jooq.Record>, org.jooq.WindowBeforeOverStep<java.math.BigDecimal>, org.jooq.SelectUnionStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, java.lang.String, org.jooq.Schema, org.jooq.ResultQuery<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.Schema, org.jooq.Scope, org.jooq.SelectFromStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.Row, org.jooq.Query>[] fieldLikeRow22Array2 = (org.jooq.Row22<org.jooq.FieldLike, org.jooq.TableLike<org.jooq.Record>, org.jooq.Condition, org.jooq.SelectDistinctOnStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, java.io.Serializable, org.jooq.SelectOptionStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.Table<org.jooq.Record>, org.jooq.Table<org.jooq.Record>, org.jooq.WindowBeforeOverStep<java.math.BigDecimal>, org.jooq.SelectUnionStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, java.lang.String, org.jooq.Schema, org.jooq.ResultQuery<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.Schema, org.jooq.Scope, org.jooq.SelectFromStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.Row, org.jooq.Query>[]) row22Array1;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record22<org.jooq.FieldLike, org.jooq.TableLike<org.jooq.Record>, org.jooq.Condition, org.jooq.SelectDistinctOnStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, java.io.Serializable, org.jooq.SelectOptionStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.Table<org.jooq.Record>, org.jooq.Table<org.jooq.Record>, org.jooq.WindowBeforeOverStep<java.math.BigDecimal>, org.jooq.SelectUnionStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, java.lang.String, org.jooq.Schema, org.jooq.ResultQuery<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.Schema, org.jooq.Scope, org.jooq.SelectFromStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.SelectIntoStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.Row, org.jooq.Query>> fieldLikeRecord22Table3 = org.jooq.impl.DSL.values(fieldLikeRow22Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row22Array1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldLikeRow22Array2);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.month(date0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.util.Date date1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = org.jooq.impl.DSL.minute(date1);
        java.util.Date date3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = org.jooq.impl.DSL.second(date3);
        org.jooq.Field<java.sql.Timestamp> timestampField5 = null;
        java.util.Date date6 = null;
        org.jooq.Field<java.lang.Integer> intField7 = org.jooq.impl.DSL.second(date6);
        java.util.Date date8 = null;
        org.jooq.Field<java.lang.Integer> intField9 = org.jooq.impl.DSL.second(date8);
        java.util.Date date10 = null;
        org.jooq.Field<java.lang.Integer> intField11 = org.jooq.impl.DSL.minute(date10);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_12 = org.jooq.impl.DSL.row(intField7, intField9, intField11);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = org.jooq.impl.DSL.deg(intField7);
        org.jooq.DatePart datePart14 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField15 = org.jooq.impl.DSL.timestampAdd(timestampField5, intField7, datePart14);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord3SelectSelectStep16 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField2, (org.jooq.SelectField<java.lang.Integer>) intField4, (org.jooq.SelectField<java.lang.Integer>) intField7);
        org.jooq.Field[] fieldArray18 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray19 = (org.jooq.Field<?>[]) fieldArray18;
        org.jooq.Field<java.lang.Integer> intField20 = org.jooq.impl.DSL.least(intField2, wildcardFieldArray19);
        org.jooq.GroupField groupField21 = org.jooq.impl.DSL.rollup(wildcardFieldArray19);
        org.jooq.QueryPart queryPart22 = org.jooq.impl.DSL.queryPart("", (java.lang.Object[]) wildcardFieldArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord3SelectSelectStep16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(groupField21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(queryPart22);
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
        java.util.Date date17 = null;
        org.jooq.Field<java.lang.Integer> intField18 = org.jooq.impl.DSL.minute(date17);
        java.util.Date date19 = null;
        org.jooq.Field<java.lang.Integer> intField20 = org.jooq.impl.DSL.second(date19);
        org.jooq.Field<java.sql.Timestamp> timestampField21 = null;
        java.util.Date date22 = null;
        org.jooq.Field<java.lang.Integer> intField23 = org.jooq.impl.DSL.second(date22);
        java.util.Date date24 = null;
        org.jooq.Field<java.lang.Integer> intField25 = org.jooq.impl.DSL.second(date24);
        java.util.Date date26 = null;
        org.jooq.Field<java.lang.Integer> intField27 = org.jooq.impl.DSL.minute(date26);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_28 = org.jooq.impl.DSL.row(intField23, intField25, intField27);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField29 = org.jooq.impl.DSL.deg(intField23);
        org.jooq.DatePart datePart30 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField31 = org.jooq.impl.DSL.timestampAdd(timestampField21, intField23, datePart30);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord3SelectSelectStep32 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField18, (org.jooq.SelectField<java.lang.Integer>) intField20, (org.jooq.SelectField<java.lang.Integer>) intField23);
        org.jooq.Condition condition33 = org.jooq.impl.DSL.notExists((org.jooq.Select<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>) intRecord3SelectSelectStep32);
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Row2<org.jooq.SelectWindowStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.SelectUnionStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>> intRecord3SelectWindowStepRow2_34 = org.jooq.impl.DSL.row((org.jooq.SelectWindowStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>) intRecord3SelectSelectStep15, (org.jooq.SelectUnionStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>) intRecord3SelectSelectStep32);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        // Expected exception.
        }
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord3SelectSelectStep32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(condition33);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.jooq.QueryPart queryPart1 = org.jooq.impl.DSL.queryPart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(queryPart1);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.sql.Timestamp timestamp0 = null;
        java.sql.Timestamp timestamp1 = null;
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField2 = org.jooq.impl.DSL.timestampDiff(timestamp0, timestamp1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dayToSecondField2);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.util.Date date1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = org.jooq.impl.DSL.second(date1);
        java.util.Date date3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = org.jooq.impl.DSL.second(date3);
        java.util.Date date5 = null;
        org.jooq.Field<java.lang.Integer> intField6 = org.jooq.impl.DSL.second(date5);
        java.util.Date date7 = null;
        org.jooq.Field<java.lang.Integer> intField8 = org.jooq.impl.DSL.minute(date7);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_9 = org.jooq.impl.DSL.row(intField4, intField6, intField8);
        java.util.Date date10 = null;
        org.jooq.Field<java.lang.Integer> intField11 = org.jooq.impl.DSL.second(date10);
        java.util.Date date12 = null;
        org.jooq.Field<java.lang.Integer> intField13 = org.jooq.impl.DSL.second(date12);
        java.util.Date date14 = null;
        org.jooq.Field<java.lang.Integer> intField15 = org.jooq.impl.DSL.minute(date14);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_16 = org.jooq.impl.DSL.row(intField11, intField13, intField15);
        org.jooq.Field<java.lang.Object> objField18 = org.jooq.impl.DSL.decode((org.jooq.GroupField) intField8, (org.jooq.GroupField) intField13, (java.lang.Object) (byte) 10);
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.Integer, java.lang.Integer>> intRecord2SelectSelectStep19 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField2, (org.jooq.SelectField<java.lang.Integer>) intField8);
        java.util.Date date20 = null;
        org.jooq.Field<java.lang.Integer> intField21 = org.jooq.impl.DSL.second(date20);
        java.util.Date date22 = null;
        org.jooq.Field<java.lang.Integer> intField23 = org.jooq.impl.DSL.second(date22);
        java.util.Date date24 = null;
        org.jooq.Field<java.lang.Integer> intField25 = org.jooq.impl.DSL.minute(date24);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_26 = org.jooq.impl.DSL.row(intField21, intField23, intField25);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction27 = org.jooq.impl.DSL.regrAvgX(intField8, intField23);
        java.util.Date date28 = null;
        org.jooq.Field<java.lang.Integer> intField29 = org.jooq.impl.DSL.second(date28);
        java.util.Date date30 = null;
        org.jooq.Field<java.lang.Integer> intField31 = org.jooq.impl.DSL.second(date30);
        java.util.Date date32 = null;
        org.jooq.Field<java.lang.Integer> intField33 = org.jooq.impl.DSL.minute(date32);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_34 = org.jooq.impl.DSL.row(intField29, intField31, intField33);
        org.jooq.Row2<java.lang.Integer, java.lang.Integer> intRow2_35 = org.jooq.impl.DSL.row(intField23, intField29);
        org.jooq.Field<java.lang.Integer> intField37 = org.jooq.impl.DSL.bitNor(intField23, (java.lang.Integer) 10);
        org.jooq.Field<java.lang.Integer> intField38 = org.jooq.impl.DSL.bitXor((java.lang.Integer) 1, intField37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objField18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord2SelectSelectStep19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow2_35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField38);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
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
        org.jooq.Field<java.math.BigDecimal> bigDecimalField20 = org.jooq.impl.DSL.cos(intField1);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField20);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.reverse("");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.reverse(strField1);
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.escape(strField1, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField4);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.sql.Timestamp timestamp0 = null;
        org.jooq.DatePart datePart1 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField2 = org.jooq.impl.DSL.trunc(timestamp0, datePart1);
        java.util.Date date3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = org.jooq.impl.DSL.second(date3);
        org.jooq.DatePart datePart5 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField6 = org.jooq.impl.DSL.timestampAdd(timestampField2, intField4, datePart5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField6);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.minute(date0);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.deg(intField1);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField3 = org.jooq.impl.DSL.coth(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField3);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.reverse("");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.reverse(strField1);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.replace(strField1, "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField5);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.jooq.Table<org.jooq.Record> recordTable0 = null;
        org.jooq.MergeUsingStep<org.jooq.Record> recordMergeUsingStep1 = org.jooq.impl.DSL.mergeInto(recordTable0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordMergeUsingStep1);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.reverse("hi!");
        org.jooq.Field<java.lang.Integer> intField2 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField1, intField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField3);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep1 = org.jooq.impl.DSL.alterSequence("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep1);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.jooq.Table<org.jooq.Record> recordTable1 = org.jooq.impl.DSL.table("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordTable1);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.jooq.Field<java.sql.Date> dateField0 = null;
        java.sql.Date date1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = org.jooq.impl.DSL.dateDiff(dateField0, date1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField2);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
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
        org.jooq.Field<java.lang.String> strField23 = org.jooq.impl.DSL.reverse("");
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
        java.util.Date date35 = null;
        org.jooq.Field<java.lang.Integer> intField36 = org.jooq.impl.DSL.second(date35);
        java.util.Date date37 = null;
        org.jooq.Field<java.lang.Integer> intField38 = org.jooq.impl.DSL.second(date37);
        java.util.Date date39 = null;
        org.jooq.Field<java.lang.Integer> intField40 = org.jooq.impl.DSL.minute(date39);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_41 = org.jooq.impl.DSL.row(intField36, intField38, intField40);
        java.util.Date date42 = null;
        org.jooq.Field<java.lang.Integer> intField43 = org.jooq.impl.DSL.minute(date42);
        java.util.Date date44 = null;
        org.jooq.Field<java.lang.Integer> intField45 = org.jooq.impl.DSL.second(date44);
        org.jooq.Field<java.sql.Timestamp> timestampField46 = null;
        java.util.Date date47 = null;
        org.jooq.Field<java.lang.Integer> intField48 = org.jooq.impl.DSL.second(date47);
        java.util.Date date49 = null;
        org.jooq.Field<java.lang.Integer> intField50 = org.jooq.impl.DSL.second(date49);
        java.util.Date date51 = null;
        org.jooq.Field<java.lang.Integer> intField52 = org.jooq.impl.DSL.minute(date51);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_53 = org.jooq.impl.DSL.row(intField48, intField50, intField52);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField54 = org.jooq.impl.DSL.deg(intField48);
        org.jooq.DatePart datePart55 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField56 = org.jooq.impl.DSL.timestampAdd(timestampField46, intField48, datePart55);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord3SelectSelectStep57 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField43, (org.jooq.SelectField<java.lang.Integer>) intField45, (org.jooq.SelectField<java.lang.Integer>) intField48);
        org.jooq.Field[] fieldArray59 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray60 = (org.jooq.Field<?>[]) fieldArray59;
        org.jooq.Field<java.lang.Integer> intField61 = org.jooq.impl.DSL.least(intField43, wildcardFieldArray60);
        org.jooq.Field<java.lang.Integer> intField62 = org.jooq.impl.DSL.greatest(intField36, wildcardFieldArray60);
        org.jooq.Field<java.lang.String> strField63 = org.jooq.impl.DSL.substring(strField23, intField26, intField36);
        org.jooq.Param<java.lang.Integer> intParam64 = org.jooq.impl.DSL.val((java.lang.Object) intField19, intField36);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField23);
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
        org.junit.Assert.assertNotNull(intField36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord3SelectSelectStep57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intParam64);
    }
}

