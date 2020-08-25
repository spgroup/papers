import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.jooq.Field<java.lang.String> strField0 = org.jooq.impl.DSL.currentUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.sql.Connection connection0 = null;
        org.jooq.SQLDialect sQLDialect1 = null;
        org.jooq.DSLContext dSLContext2 = org.jooq.impl.DSL.using(connection0, sQLDialect1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dSLContext2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.jooq.Schema schema1 = org.jooq.impl.DSL.schemaByName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(schema1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.jooq.WindowOverStep<java.lang.Integer> intWindowOverStep0 = org.jooq.impl.DSL.rowNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intWindowOverStep0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.jooq.WindowOverStep<java.lang.Integer> intWindowOverStep1 = org.jooq.impl.DSL.ntile(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intWindowOverStep1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.jooq.Field<java.lang.Boolean> booleanField0 = org.jooq.impl.DSL.connectByIsCycle();
        org.jooq.Condition condition1 = org.jooq.impl.DSL.condition(booleanField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(condition1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.DSLContext dSLContext3 = org.jooq.impl.DSL.using("", "hi!", "");
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.DataAccessException; message: SQL [Error when initialising Connection]; No suitable driver found for ");
        } catch (org.jooq.exception.DataAccessException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
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
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.minute(date0);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField3 = org.jooq.impl.DSL.power(intField1, (java.lang.Number) 0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
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
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.jooq.QueryPart queryPart1 = org.jooq.impl.DSL.queryPart("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(queryPart1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.sql.Timestamp timestamp0 = null;
        java.sql.Timestamp timestamp1 = null;
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField2 = org.jooq.impl.DSL.timestampDiff(timestamp0, timestamp1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dayToSecondField2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
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
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
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
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
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
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.jooq.AlterSequenceRestartStep<java.math.BigInteger> bigIntegerAlterSequenceRestartStep1 = org.jooq.impl.DSL.alterSequence("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigIntegerAlterSequenceRestartStep1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.jooq.Table<org.jooq.Record> recordTable1 = org.jooq.impl.DSL.table("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordTable1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.concat(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jooq.Field<java.sql.Date> dateField0 = null;
        java.sql.Date date1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = org.jooq.impl.DSL.dateDiff(dateField0, date1);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField3 = org.jooq.impl.DSL.asin(intField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
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
        org.jooq.Table<org.jooq.Record> recordTable16 = null;
        org.jooq.MergeUsingStep<org.jooq.Record> recordMergeUsingStep17 = org.jooq.impl.DSL.mergeInto(recordTable16);
        java.util.Date date18 = null;
        org.jooq.Field<java.lang.Integer> intField19 = org.jooq.impl.DSL.minute(date18);
        java.util.Date date20 = null;
        org.jooq.Field<java.lang.Integer> intField21 = org.jooq.impl.DSL.second(date20);
        org.jooq.Field<java.sql.Timestamp> timestampField22 = null;
        java.util.Date date23 = null;
        org.jooq.Field<java.lang.Integer> intField24 = org.jooq.impl.DSL.second(date23);
        java.util.Date date25 = null;
        org.jooq.Field<java.lang.Integer> intField26 = org.jooq.impl.DSL.second(date25);
        java.util.Date date27 = null;
        org.jooq.Field<java.lang.Integer> intField28 = org.jooq.impl.DSL.minute(date27);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_29 = org.jooq.impl.DSL.row(intField24, intField26, intField28);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField30 = org.jooq.impl.DSL.deg(intField24);
        org.jooq.DatePart datePart31 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField32 = org.jooq.impl.DSL.timestampAdd(timestampField22, intField24, datePart31);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord3SelectSelectStep33 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField19, (org.jooq.SelectField<java.lang.Integer>) intField21, (org.jooq.SelectField<java.lang.Integer>) intField24);
        org.jooq.Condition condition34 = org.jooq.impl.DSL.notExists((org.jooq.Select<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>) intRecord3SelectSelectStep33);
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Row3<org.jooq.SelectGroupByStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.MergeKeyStepN<org.jooq.Record>, org.jooq.SelectWindowStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>> intRecord3SelectGroupByStepRow3_35 = org.jooq.impl.DSL.row((org.jooq.SelectGroupByStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>) intRecord3SelectSelectStep15, (org.jooq.MergeKeyStepN<org.jooq.Record>) recordMergeUsingStep17, (org.jooq.SelectWindowStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>) intRecord3SelectSelectStep33);
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
        org.junit.Assert.assertNotNull(recordMergeUsingStep17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord3SelectSelectStep33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(condition34);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.jooq.Case case0 = org.jooq.impl.DSL.choose();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(case0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.reverse("");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.reverse(strField1);
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.escape(strField1, '4');
        org.jooq.Field<java.lang.Integer> intField5 = org.jooq.impl.DSL.charLength(strField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
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
        org.jooq.Condition condition22 = org.jooq.impl.DSL.condition("", (org.jooq.QueryPart[]) wildcardFieldArray19);
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
        org.junit.Assert.assertNotNull(condition22);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        org.jooq.Field<java.lang.Object> objField3 = org.jooq.impl.DSL.fieldByName(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objField3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.jooq.Param<java.lang.Object> objParam0 = org.jooq.impl.DSL.param();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objParam0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.jooq.Keyword keyword1 = org.jooq.impl.DSL.keyword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyword1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        javax.sql.DataSource dataSource0 = null;
        org.jooq.SQLDialect sQLDialect1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.impl.DSL dSL2 = new org.jooq.impl.DSL(dataSource0, sQLDialect1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.Date date1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = org.jooq.impl.DSL.second(date1);
        java.util.Date date3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = org.jooq.impl.DSL.second(date3);
        java.util.Date date5 = null;
        org.jooq.Field<java.lang.Integer> intField6 = org.jooq.impl.DSL.minute(date5);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_7 = org.jooq.impl.DSL.row(intField2, intField4, intField6);
        org.jooq.Field<java.lang.Integer> intField8 = org.jooq.impl.DSL.shr((java.lang.Integer) 0, intField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        javax.sql.DataSource dataSource0 = null;
        org.jooq.SQLDialect sQLDialect1 = null;
        org.jooq.conf.Settings settings2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.impl.DSL dSL3 = new org.jooq.impl.DSL(dataSource0, sQLDialect1, settings2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.reverse("");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.reverse(strField1);
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.trim(strField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Row1<java.lang.Integer> intRow1_1 = org.jooq.impl.DSL.row(intField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow1_1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.sql.Date date0 = null;
        org.jooq.Field<java.sql.Date> dateField2 = org.jooq.impl.DSL.dateAdd(date0, (java.lang.Number) (-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateField2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.jooq.CreateTableAsStep<org.jooq.Record> recordCreateTableAsStep1 = org.jooq.impl.DSL.createTable("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordCreateTableAsStep1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
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
        org.jooq.Field<java.math.BigDecimal> bigDecimalField20 = org.jooq.impl.DSL.log(intField7, (int) (short) -1);
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
        org.junit.Assert.assertNotNull(bigDecimalField20);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.jooq.RowN rowN0 = null;
        org.jooq.RowN[] rowNArray1 = new org.jooq.RowN[] { rowN0 };
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record> recordTable2 = org.jooq.impl.DSL.values(rowNArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rowNArray1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.jooq.Table<org.jooq.Record> recordTable1 = org.jooq.impl.DSL.table("hi!");
        org.jooq.CreateTableAsStep<org.jooq.Record> recordCreateTableAsStep2 = org.jooq.impl.DSL.createGlobalTemporaryTable(recordTable1);
        org.jooq.DropTableStep dropTableStep3 = org.jooq.impl.DSL.dropTableIfExists(recordTable1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordTable1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordCreateTableAsStep2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dropTableStep3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jooq.SQLDialect sQLDialect0 = null;
        org.jooq.DSLContext dSLContext1 = org.jooq.impl.DSL.using(sQLDialect0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dSLContext1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
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
        org.jooq.WindowIgnoreNullsStep<java.lang.Integer> intWindowIgnoreNullsStep20 = org.jooq.impl.DSL.lastValue(intField1);
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
        org.junit.Assert.assertNotNull(intWindowIgnoreNullsStep20);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.left("", (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField2);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
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
        org.jooq.Field<java.math.BigDecimal> bigDecimalField22 = org.jooq.impl.DSL.coth(intField19);
        java.util.Date date23 = null;
        org.jooq.Field<java.lang.Integer> intField24 = org.jooq.impl.DSL.minute(date23);
        java.util.Date date25 = null;
        org.jooq.Field<java.lang.Integer> intField26 = org.jooq.impl.DSL.second(date25);
        org.jooq.Field<java.sql.Timestamp> timestampField27 = null;
        java.util.Date date28 = null;
        org.jooq.Field<java.lang.Integer> intField29 = org.jooq.impl.DSL.second(date28);
        java.util.Date date30 = null;
        org.jooq.Field<java.lang.Integer> intField31 = org.jooq.impl.DSL.second(date30);
        java.util.Date date32 = null;
        org.jooq.Field<java.lang.Integer> intField33 = org.jooq.impl.DSL.minute(date32);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_34 = org.jooq.impl.DSL.row(intField29, intField31, intField33);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField35 = org.jooq.impl.DSL.deg(intField29);
        org.jooq.DatePart datePart36 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField37 = org.jooq.impl.DSL.timestampAdd(timestampField27, intField29, datePart36);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord3SelectSelectStep38 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField24, (org.jooq.SelectField<java.lang.Integer>) intField26, (org.jooq.SelectField<java.lang.Integer>) intField29);
        org.jooq.Field<java.lang.Integer> intField39 = org.jooq.impl.DSL.bitOr(intField19, intField24);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord3SelectSelectStep38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField39);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.jooq.Row2<org.jooq.DDLQuery, org.jooq.Row> dDLQueryRow2_0 = null;
        org.jooq.Row2[] row2Array2 = new org.jooq.Row2[1];
        @SuppressWarnings("unchecked")
        org.jooq.Row2<org.jooq.DDLQuery, org.jooq.Row>[] dDLQueryRow2Array3 = (org.jooq.Row2<org.jooq.DDLQuery, org.jooq.Row>[]) row2Array2;
        dDLQueryRow2Array3[0] = dDLQueryRow2_0;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record2<org.jooq.DDLQuery, org.jooq.Row>> dDLQueryRecord2Table6 = org.jooq.impl.DSL.values(dDLQueryRow2Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row2Array2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dDLQueryRow2Array3);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
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
        java.util.Date date16 = null;
        org.jooq.Field<java.lang.Integer> intField17 = org.jooq.impl.DSL.minute(date16);
        java.util.Date date18 = null;
        org.jooq.Field<java.lang.Integer> intField19 = org.jooq.impl.DSL.second(date18);
        org.jooq.Field<java.sql.Timestamp> timestampField20 = null;
        java.util.Date date21 = null;
        org.jooq.Field<java.lang.Integer> intField22 = org.jooq.impl.DSL.second(date21);
        java.util.Date date23 = null;
        org.jooq.Field<java.lang.Integer> intField24 = org.jooq.impl.DSL.second(date23);
        java.util.Date date25 = null;
        org.jooq.Field<java.lang.Integer> intField26 = org.jooq.impl.DSL.minute(date25);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_27 = org.jooq.impl.DSL.row(intField22, intField24, intField26);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField28 = org.jooq.impl.DSL.deg(intField22);
        org.jooq.DatePart datePart29 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField30 = org.jooq.impl.DSL.timestampAdd(timestampField20, intField22, datePart29);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord3SelectSelectStep31 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField17, (org.jooq.SelectField<java.lang.Integer>) intField19, (org.jooq.SelectField<java.lang.Integer>) intField22);
        org.jooq.Field[] fieldArray33 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray34 = (org.jooq.Field<?>[]) fieldArray33;
        org.jooq.Field<java.lang.Integer> intField35 = org.jooq.impl.DSL.least(intField17, wildcardFieldArray34);
        org.jooq.Field<java.lang.Integer> intField37 = org.jooq.impl.DSL.bitXor(intField35, (java.lang.Integer) 1);
        org.jooq.SelectField<java.lang.Integer> intSelectField38 = null;
        java.util.Date date39 = null;
        org.jooq.Field<java.lang.Integer> intField40 = org.jooq.impl.DSL.minute(date39);
        java.util.Date date41 = null;
        org.jooq.Field<java.lang.Integer> intField42 = org.jooq.impl.DSL.second(date41);
        org.jooq.Field<java.sql.Timestamp> timestampField43 = null;
        java.util.Date date44 = null;
        org.jooq.Field<java.lang.Integer> intField45 = org.jooq.impl.DSL.second(date44);
        java.util.Date date46 = null;
        org.jooq.Field<java.lang.Integer> intField47 = org.jooq.impl.DSL.second(date46);
        java.util.Date date48 = null;
        org.jooq.Field<java.lang.Integer> intField49 = org.jooq.impl.DSL.minute(date48);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_50 = org.jooq.impl.DSL.row(intField45, intField47, intField49);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField51 = org.jooq.impl.DSL.deg(intField45);
        org.jooq.DatePart datePart52 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField53 = org.jooq.impl.DSL.timestampAdd(timestampField43, intField45, datePart52);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord3SelectSelectStep54 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField40, (org.jooq.SelectField<java.lang.Integer>) intField42, (org.jooq.SelectField<java.lang.Integer>) intField45);
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.SelectSelectStep<org.jooq.Record4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord4SelectSelectStep55 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField6, (org.jooq.SelectField<java.lang.Integer>) intField37, intSelectField38, (org.jooq.SelectField<java.lang.Integer>) intField45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(intField17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord3SelectSelectStep31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord3SelectSelectStep54);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.ascii(strField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.jooq.Field<java.sql.Time> timeField0 = org.jooq.impl.DSL.currentTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeField0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.jooq.Row19<org.jooq.Field<java.lang.Integer>, org.jooq.DSLContext, org.jooq.MergeKeyStepN<org.jooq.Record>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.ResultQuery<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.SelectWhereStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.DropTableStep, org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.SelectFromStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.WindowOverStep<java.math.BigDecimal>, org.jooq.SelectFinalStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.WindowOverStep<java.math.BigDecimal>, org.jooq.InsertSetStep<org.jooq.Record>, org.jooq.SelectOptionStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.WindowOverStep<java.math.BigDecimal>, org.jooq.Table<org.jooq.Record>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, java.lang.CharSequence> intFieldRow19_0 = null;
        org.jooq.Row19[] row19Array2 = new org.jooq.Row19[1];
        @SuppressWarnings("unchecked")
        org.jooq.Row19<org.jooq.Field<java.lang.Integer>, org.jooq.DSLContext, org.jooq.MergeKeyStepN<org.jooq.Record>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.ResultQuery<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.SelectWhereStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.DropTableStep, org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.SelectFromStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.WindowOverStep<java.math.BigDecimal>, org.jooq.SelectFinalStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.WindowOverStep<java.math.BigDecimal>, org.jooq.InsertSetStep<org.jooq.Record>, org.jooq.SelectOptionStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.WindowOverStep<java.math.BigDecimal>, org.jooq.Table<org.jooq.Record>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, java.lang.CharSequence>[] intFieldRow19Array3 = (org.jooq.Row19<org.jooq.Field<java.lang.Integer>, org.jooq.DSLContext, org.jooq.MergeKeyStepN<org.jooq.Record>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.ResultQuery<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.SelectWhereStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.DropTableStep, org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.SelectFromStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.WindowOverStep<java.math.BigDecimal>, org.jooq.SelectFinalStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.WindowOverStep<java.math.BigDecimal>, org.jooq.InsertSetStep<org.jooq.Record>, org.jooq.SelectOptionStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.WindowOverStep<java.math.BigDecimal>, org.jooq.Table<org.jooq.Record>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, java.lang.CharSequence>[]) row19Array2;
        intFieldRow19Array3[0] = intFieldRow19_0;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record19<org.jooq.Field<java.lang.Integer>, org.jooq.DSLContext, org.jooq.MergeKeyStepN<org.jooq.Record>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.ResultQuery<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.SelectWhereStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.DropTableStep, org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.SelectFromStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.WindowOverStep<java.math.BigDecimal>, org.jooq.SelectFinalStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.WindowOverStep<java.math.BigDecimal>, org.jooq.InsertSetStep<org.jooq.Record>, org.jooq.SelectOptionStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.WindowOverStep<java.math.BigDecimal>, org.jooq.Table<org.jooq.Record>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, java.lang.CharSequence>> intFieldRecord19Table6 = org.jooq.impl.DSL.values(intFieldRow19Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row19Array2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intFieldRow19Array3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.tanh((java.lang.Number) 1.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.Date date0 = null;
        org.jooq.Field<java.sql.Time> timeField1 = org.jooq.impl.DSL.time(date0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeField1);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
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
        org.jooq.Field<java.sql.Date> dateField35 = null;
        java.sql.Date date36 = null;
        org.jooq.Field<java.sql.Date> dateField38 = org.jooq.impl.DSL.dateSub(date36, (java.lang.Number) 1L);
        java.util.Date date39 = null;
        org.jooq.Field<java.lang.Integer> intField40 = org.jooq.impl.DSL.minute(date39);
        java.util.Date date41 = null;
        org.jooq.Field<java.lang.Integer> intField42 = org.jooq.impl.DSL.second(date41);
        org.jooq.Field<java.sql.Timestamp> timestampField43 = null;
        java.util.Date date44 = null;
        org.jooq.Field<java.lang.Integer> intField45 = org.jooq.impl.DSL.second(date44);
        java.util.Date date46 = null;
        org.jooq.Field<java.lang.Integer> intField47 = org.jooq.impl.DSL.second(date46);
        java.util.Date date48 = null;
        org.jooq.Field<java.lang.Integer> intField49 = org.jooq.impl.DSL.minute(date48);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_50 = org.jooq.impl.DSL.row(intField45, intField47, intField49);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField51 = org.jooq.impl.DSL.deg(intField45);
        org.jooq.DatePart datePart52 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField53 = org.jooq.impl.DSL.timestampAdd(timestampField43, intField45, datePart52);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord3SelectSelectStep54 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField40, (org.jooq.SelectField<java.lang.Integer>) intField42, (org.jooq.SelectField<java.lang.Integer>) intField45);
        org.jooq.Field<java.sql.Date> dateField55 = org.jooq.impl.DSL.dateAdd(dateField38, intField45);
        org.jooq.Field<java.lang.Integer> intField56 = org.jooq.impl.DSL.dateDiff(dateField35, dateField38);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction57 = org.jooq.impl.DSL.regrCount(intField28, intField56);
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
        org.junit.Assert.assertNotNull(dateField38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord3SelectSelectStep54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateField55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction57);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
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
        java.util.Date date56 = null;
        org.jooq.Field<java.lang.Integer> intField57 = org.jooq.impl.DSL.second(date56);
        java.util.Date date58 = null;
        org.jooq.Field<java.lang.Integer> intField59 = org.jooq.impl.DSL.second(date58);
        java.util.Date date60 = null;
        org.jooq.Field<java.lang.Integer> intField61 = org.jooq.impl.DSL.second(date60);
        java.util.Date date62 = null;
        org.jooq.Field<java.lang.Integer> intField63 = org.jooq.impl.DSL.minute(date62);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_64 = org.jooq.impl.DSL.row(intField59, intField61, intField63);
        java.util.Date date65 = null;
        org.jooq.Field<java.lang.Integer> intField66 = org.jooq.impl.DSL.second(date65);
        java.util.Date date67 = null;
        org.jooq.Field<java.lang.Integer> intField68 = org.jooq.impl.DSL.second(date67);
        java.util.Date date69 = null;
        org.jooq.Field<java.lang.Integer> intField70 = org.jooq.impl.DSL.minute(date69);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_71 = org.jooq.impl.DSL.row(intField66, intField68, intField70);
        org.jooq.Field<java.lang.Object> objField73 = org.jooq.impl.DSL.decode((org.jooq.GroupField) intField63, (org.jooq.GroupField) intField68, (java.lang.Object) (byte) 10);
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.Integer, java.lang.Integer>> intRecord2SelectSelectStep74 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField57, (org.jooq.SelectField<java.lang.Integer>) intField63);
        java.util.Date date75 = null;
        org.jooq.Field<java.lang.Integer> intField76 = org.jooq.impl.DSL.second(date75);
        java.util.Date date77 = null;
        org.jooq.Field<java.lang.Integer> intField78 = org.jooq.impl.DSL.second(date77);
        java.util.Date date79 = null;
        org.jooq.Field<java.lang.Integer> intField80 = org.jooq.impl.DSL.minute(date79);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_81 = org.jooq.impl.DSL.row(intField76, intField78, intField80);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction82 = org.jooq.impl.DSL.regrAvgX(intField63, intField78);
        org.jooq.Field<java.lang.Integer> intField83 = org.jooq.impl.DSL.bitXor(intField7, intField63);
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep84 = org.jooq.impl.DSL.groupConcat(intField7);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objField73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord2SelectSelectStep74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(groupConcatOrderByStep84);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.tanh(intField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.jooq.QueryPart queryPart1 = org.jooq.impl.DSL.queryPart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(queryPart1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.upper("");
        org.jooq.Field<java.lang.String> strField4 = org.jooq.impl.DSL.rpad(strField1, (int) (short) 100, ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jooq.SelectUnionStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord3SelectUnionStep0 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Field<org.jooq.SelectUnionStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>> intRecord3SelectUnionStepField17 = org.jooq.impl.DSL.isnull(intRecord3SelectUnionStep0, (org.jooq.SelectUnionStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>) intRecord3SelectSelectStep16);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jooq.Row6[] row6Array1 = new org.jooq.Row6[0];
        @SuppressWarnings("unchecked")
        org.jooq.Row6<org.jooq.SelectConnectByStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, java.lang.CharSequence, org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.InsertSetStep<org.jooq.Record>, org.jooq.FieldLike>[] record3SelectConnectByStepRow6Array2 = (org.jooq.Row6<org.jooq.SelectConnectByStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, java.lang.CharSequence, org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.InsertSetStep<org.jooq.Record>, org.jooq.FieldLike>[]) row6Array1;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record6<org.jooq.SelectConnectByStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, java.lang.CharSequence, org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.InsertSetStep<org.jooq.Record>, org.jooq.FieldLike>> record3SelectConnectByStepRecord6Table3 = org.jooq.impl.DSL.values(record3SelectConnectByStepRow6Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row6Array1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(record3SelectConnectByStepRow6Array2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jooq.WithAsStep withAsStep1 = org.jooq.impl.DSL.withRecursive("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(withAsStep1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
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
        org.jooq.DropTableStep dropTableStep56 = null;
        java.util.Date date57 = null;
        org.jooq.Field<java.lang.Integer> intField58 = org.jooq.impl.DSL.minute(date57);
        java.util.Date date59 = null;
        org.jooq.Field<java.lang.Integer> intField60 = org.jooq.impl.DSL.second(date59);
        org.jooq.Field<java.sql.Timestamp> timestampField61 = null;
        java.util.Date date62 = null;
        org.jooq.Field<java.lang.Integer> intField63 = org.jooq.impl.DSL.second(date62);
        java.util.Date date64 = null;
        org.jooq.Field<java.lang.Integer> intField65 = org.jooq.impl.DSL.second(date64);
        java.util.Date date66 = null;
        org.jooq.Field<java.lang.Integer> intField67 = org.jooq.impl.DSL.minute(date66);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_68 = org.jooq.impl.DSL.row(intField63, intField65, intField67);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField69 = org.jooq.impl.DSL.deg(intField63);
        org.jooq.DatePart datePart70 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField71 = org.jooq.impl.DSL.timestampAdd(timestampField61, intField63, datePart70);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord3SelectSelectStep72 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField58, (org.jooq.SelectField<java.lang.Integer>) intField60, (org.jooq.SelectField<java.lang.Integer>) intField63);
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Row3<java.lang.Object[], org.jooq.DropTableStep, org.jooq.SelectConnectByStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>> objArrayRow3_73 = org.jooq.impl.DSL.row((java.lang.Object[]) wildcardFieldArray52, dropTableStep56, (org.jooq.SelectConnectByStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>) intRecord3SelectSelectStep72);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord3SelectSelectStep72);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jooq.Row9<org.jooq.Query, org.jooq.SelectIntoStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.Keyword, org.jooq.SelectGroupByStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.MergeUsingStep<org.jooq.Record>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Condition, java.lang.CharSequence, org.jooq.OrderedAggregateFunction<java.math.BigDecimal>> queryRow9_0 = null;
        org.jooq.Row9[] row9Array2 = new org.jooq.Row9[1];
        @SuppressWarnings("unchecked")
        org.jooq.Row9<org.jooq.Query, org.jooq.SelectIntoStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.Keyword, org.jooq.SelectGroupByStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.MergeUsingStep<org.jooq.Record>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Condition, java.lang.CharSequence, org.jooq.OrderedAggregateFunction<java.math.BigDecimal>>[] queryRow9Array3 = (org.jooq.Row9<org.jooq.Query, org.jooq.SelectIntoStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.Keyword, org.jooq.SelectGroupByStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.MergeUsingStep<org.jooq.Record>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Condition, java.lang.CharSequence, org.jooq.OrderedAggregateFunction<java.math.BigDecimal>>[]) row9Array2;
        queryRow9Array3[0] = queryRow9_0;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record9<org.jooq.Query, org.jooq.SelectIntoStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.Keyword, org.jooq.SelectGroupByStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.MergeUsingStep<org.jooq.Record>, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Condition, java.lang.CharSequence, org.jooq.OrderedAggregateFunction<java.math.BigDecimal>>> queryRecord9Table6 = org.jooq.impl.DSL.values(queryRow9Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row9Array2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(queryRow9Array3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.Date date1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = org.jooq.impl.DSL.second(date1);
        java.util.Date date3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = org.jooq.impl.DSL.second(date3);
        java.util.Date date5 = null;
        org.jooq.Field<java.lang.Integer> intField6 = org.jooq.impl.DSL.minute(date5);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_7 = org.jooq.impl.DSL.row(intField2, intField4, intField6);
        java.util.Date date8 = null;
        org.jooq.Field<java.lang.Integer> intField9 = org.jooq.impl.DSL.second(date8);
        java.util.Date date10 = null;
        org.jooq.Field<java.lang.Integer> intField11 = org.jooq.impl.DSL.second(date10);
        java.util.Date date12 = null;
        org.jooq.Field<java.lang.Integer> intField13 = org.jooq.impl.DSL.minute(date12);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_14 = org.jooq.impl.DSL.row(intField9, intField11, intField13);
        org.jooq.Field<java.lang.Object> objField16 = org.jooq.impl.DSL.decode((org.jooq.GroupField) intField6, (org.jooq.GroupField) intField11, (java.lang.Object) (byte) 10);
        org.jooq.Field<java.lang.Integer> intField17 = org.jooq.impl.DSL.nvl((java.lang.Integer) 0, intField11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objField16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField17);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.second(date0);
        java.util.Date date2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = org.jooq.impl.DSL.second(date2);
        java.util.Date date4 = null;
        org.jooq.Field<java.lang.Integer> intField5 = org.jooq.impl.DSL.minute(date4);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_6 = org.jooq.impl.DSL.row(intField1, intField3, intField5);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField7 = org.jooq.impl.DSL.deg(intField1);
        org.jooq.Row1<org.jooq.QueryPart> queryPartRow1_8 = org.jooq.impl.DSL.row((org.jooq.QueryPart) bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(queryPartRow1_8);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Param<java.lang.Iterable<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>> intRecord3IterableParam17 = org.jooq.impl.DSL.value((java.lang.Iterable<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>) intRecord3SelectSelectStep15);
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
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
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
        org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep56 = org.jooq.impl.DSL.partitionBy(wildcardFieldArray52);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationOrderByStep56);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.ascii("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.jooq.DropTableStep dropTableStep1 = org.jooq.impl.DSL.dropTableIfExists("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dropTableStep1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField0 = org.jooq.impl.DSL.rand();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.sql.Date date0 = null;
        java.util.Date date1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = org.jooq.impl.DSL.month(date1);
        org.jooq.DatePart datePart3 = null;
        org.jooq.Field<java.sql.Date> dateField4 = org.jooq.impl.DSL.dateSub(date0, intField2, datePart3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateField4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.jooq.Field<java.lang.Boolean> booleanField0 = org.jooq.impl.DSL.connectByIsLeaf();
        org.jooq.AggregateFunction<java.lang.Boolean> booleanAggregateFunction1 = org.jooq.impl.DSL.every(booleanField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanAggregateFunction1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
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
        org.jooq.Field<java.lang.Integer> intField16 = org.jooq.impl.DSL.prior(intField3);
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
        org.junit.Assert.assertNotNull(intField16);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
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
        org.jooq.Field<java.lang.Integer> intField65 = org.jooq.impl.DSL.prior(intField19);
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep66 = org.jooq.impl.DSL.groupConcat(intField65);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(groupConcatOrderByStep66);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.reverse("hi!");
        org.jooq.Field<java.lang.Integer> intField2 = null;
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lpad(strField1, intField2);
        org.jooq.Field<java.lang.String> strField6 = org.jooq.impl.DSL.replace(strField1, "", "");
        org.jooq.Field<java.lang.String> strField7 = org.jooq.impl.DSL.ltrim(strField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep0 = org.jooq.impl.DSL.rowsBetweenUnboundedFollowing();
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Field<org.jooq.WindowSpecificationRowsAndStep> windowSpecificationRowsAndStepField2 = org.jooq.impl.DSL.nvl(windowSpecificationRowsAndStep0, windowSpecificationRowsAndStep1);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.WindowSpecificationImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jooq.Condition condition1 = org.jooq.impl.DSL.condition("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(condition1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.jooq.Field<java.lang.Integer> intField0 = org.jooq.impl.DSL.two();
        org.jooq.WindowIgnoreNullsStep<java.lang.Integer> intWindowIgnoreNullsStep1 = org.jooq.impl.DSL.lag(intField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intWindowIgnoreNullsStep1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.sql.Connection connection0 = null;
        org.jooq.SQLDialect sQLDialect1 = null;
        org.jooq.conf.Settings settings2 = null;
        org.jooq.DSLContext dSLContext3 = org.jooq.impl.DSL.using(connection0, sQLDialect1, settings2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dSLContext3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.impl.DSL dSL0 = new org.jooq.impl.DSL();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "", "hi!" };
        org.jooq.Table<org.jooq.Record> recordTable7 = org.jooq.impl.DSL.tableByName(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordTable7);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
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
        org.jooq.Field<java.lang.Integer> intField12 = org.jooq.impl.DSL.one();
        java.util.Date date13 = null;
        org.jooq.Field<java.lang.Integer> intField14 = org.jooq.impl.DSL.second(date13);
        java.util.Date date15 = null;
        org.jooq.Field<java.lang.Integer> intField16 = org.jooq.impl.DSL.second(date15);
        java.util.Date date17 = null;
        org.jooq.Field<java.lang.Integer> intField18 = org.jooq.impl.DSL.second(date17);
        java.util.Date date19 = null;
        org.jooq.Field<java.lang.Integer> intField20 = org.jooq.impl.DSL.minute(date19);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_21 = org.jooq.impl.DSL.row(intField16, intField18, intField20);
        java.util.Date date22 = null;
        org.jooq.Field<java.lang.Integer> intField23 = org.jooq.impl.DSL.second(date22);
        java.util.Date date24 = null;
        org.jooq.Field<java.lang.Integer> intField25 = org.jooq.impl.DSL.second(date24);
        java.util.Date date26 = null;
        org.jooq.Field<java.lang.Integer> intField27 = org.jooq.impl.DSL.minute(date26);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_28 = org.jooq.impl.DSL.row(intField23, intField25, intField27);
        org.jooq.Field<java.lang.Object> objField30 = org.jooq.impl.DSL.decode((org.jooq.GroupField) intField20, (org.jooq.GroupField) intField25, (java.lang.Object) (byte) 10);
        org.jooq.SelectSelectStep<org.jooq.Record2<java.lang.Integer, java.lang.Integer>> intRecord2SelectSelectStep31 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField14, (org.jooq.SelectField<java.lang.Integer>) intField20);
        java.util.Date date32 = null;
        org.jooq.Field<java.lang.Integer> intField33 = org.jooq.impl.DSL.second(date32);
        java.util.Date date34 = null;
        org.jooq.Field<java.lang.Integer> intField35 = org.jooq.impl.DSL.second(date34);
        java.util.Date date36 = null;
        org.jooq.Field<java.lang.Integer> intField37 = org.jooq.impl.DSL.minute(date36);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_38 = org.jooq.impl.DSL.row(intField33, intField35, intField37);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction39 = org.jooq.impl.DSL.regrAvgX(intField20, intField35);
        java.util.Date date40 = null;
        org.jooq.Field<java.lang.Integer> intField41 = org.jooq.impl.DSL.second(date40);
        java.util.Date date42 = null;
        org.jooq.Field<java.lang.Integer> intField43 = org.jooq.impl.DSL.second(date42);
        java.util.Date date44 = null;
        org.jooq.Field<java.lang.Integer> intField45 = org.jooq.impl.DSL.minute(date44);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_46 = org.jooq.impl.DSL.row(intField41, intField43, intField45);
        org.jooq.Row2<java.lang.Integer, java.lang.Integer> intRow2_47 = org.jooq.impl.DSL.row(intField35, intField41);
        org.jooq.Field<java.lang.Integer> intField49 = org.jooq.impl.DSL.bitNor(intField35, (java.lang.Integer) 10);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction50 = org.jooq.impl.DSL.regrSXX(intField12, intField49);
        org.jooq.Field<java.lang.Integer> intField51 = org.jooq.impl.DSL.cast((java.lang.Object) intField2, intField49);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord2SelectSelectStep31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow2_47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField51);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jooq.Row9[] row9Array1 = new org.jooq.Row9[0];
        @SuppressWarnings("unchecked")
        org.jooq.Row9<org.jooq.Condition, org.jooq.SelectLimitStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.Row2<java.lang.Integer, java.lang.Integer>, org.jooq.Schema, org.jooq.OrderedAggregateFunction<java.math.BigDecimal>, org.jooq.Attachable, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.TableLike<org.jooq.Record>, org.jooq.SelectOrderByStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>>[] conditionRow9Array2 = (org.jooq.Row9<org.jooq.Condition, org.jooq.SelectLimitStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.Row2<java.lang.Integer, java.lang.Integer>, org.jooq.Schema, org.jooq.OrderedAggregateFunction<java.math.BigDecimal>, org.jooq.Attachable, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.TableLike<org.jooq.Record>, org.jooq.SelectOrderByStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>>[]) row9Array1;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record9<org.jooq.Condition, org.jooq.SelectLimitStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>, org.jooq.Row2<java.lang.Integer, java.lang.Integer>, org.jooq.Schema, org.jooq.OrderedAggregateFunction<java.math.BigDecimal>, org.jooq.Attachable, org.jooq.AlterSequenceRestartStep<java.math.BigInteger>, org.jooq.TableLike<org.jooq.Record>, org.jooq.SelectOrderByStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>>> conditionRecord9Table3 = org.jooq.impl.DSL.values(conditionRow9Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row9Array1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(conditionRow9Array2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
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
        org.jooq.Field<java.lang.Integer> intField36 = org.jooq.impl.DSL.shl(intField28, (java.lang.Integer) 10);
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
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.jooq.ConnectionProvider connectionProvider0 = null;
        org.jooq.SQLDialect sQLDialect1 = null;
        org.jooq.conf.Settings settings2 = null;
        org.jooq.DSLContext dSLContext3 = org.jooq.impl.DSL.using(connectionProvider0, sQLDialect1, settings2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dSLContext3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
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
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction21 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray19);
        org.jooq.Field<java.lang.Object> objField22 = org.jooq.impl.DSL.field("", (org.jooq.QueryPart[]) wildcardFieldArray19);
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
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objField22);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.jooq.Row1<org.jooq.SelectLimitStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>> intRecord3SelectLimitStepRow1_0 = null;
        org.jooq.Row1[] row1Array2 = new org.jooq.Row1[1];
        @SuppressWarnings("unchecked")
        org.jooq.Row1<org.jooq.SelectLimitStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>>[] record3SelectLimitStepRow1Array3 = (org.jooq.Row1<org.jooq.SelectLimitStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>>[]) row1Array2;
        record3SelectLimitStepRow1Array3[0] = intRecord3SelectLimitStepRow1_0;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record1<org.jooq.SelectLimitStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>>> record3SelectLimitStepRecord1Table6 = org.jooq.impl.DSL.values(record3SelectLimitStepRow1Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row1Array2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(record3SelectLimitStepRow1Array3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.castNull(intField0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.sqrt((java.lang.Number) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.hour(date0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.jooq.Operator operator0 = null;
        org.jooq.Field<java.lang.Boolean> booleanField1 = org.jooq.impl.DSL.connectByIsCycle();
        org.jooq.Condition condition2 = org.jooq.impl.DSL.condition(booleanField1);
        java.util.Date date3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = org.jooq.impl.DSL.minute(date3);
        java.util.Date date5 = null;
        org.jooq.Field<java.lang.Integer> intField6 = org.jooq.impl.DSL.second(date5);
        org.jooq.Field<java.sql.Timestamp> timestampField7 = null;
        java.util.Date date8 = null;
        org.jooq.Field<java.lang.Integer> intField9 = org.jooq.impl.DSL.second(date8);
        java.util.Date date10 = null;
        org.jooq.Field<java.lang.Integer> intField11 = org.jooq.impl.DSL.second(date10);
        java.util.Date date12 = null;
        org.jooq.Field<java.lang.Integer> intField13 = org.jooq.impl.DSL.minute(date12);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_14 = org.jooq.impl.DSL.row(intField9, intField11, intField13);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.deg(intField9);
        org.jooq.DatePart datePart16 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField17 = org.jooq.impl.DSL.timestampAdd(timestampField7, intField9, datePart16);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord3SelectSelectStep18 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField4, (org.jooq.SelectField<java.lang.Integer>) intField6, (org.jooq.SelectField<java.lang.Integer>) intField9);
        org.jooq.Condition condition19 = org.jooq.impl.DSL.notExists((org.jooq.Select<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>>) intRecord3SelectSelectStep18);
        org.jooq.Condition condition21 = org.jooq.impl.DSL.condition("hi!");
        java.util.Date date23 = null;
        org.jooq.Field<java.lang.Integer> intField24 = org.jooq.impl.DSL.minute(date23);
        java.util.Date date25 = null;
        org.jooq.Field<java.lang.Integer> intField26 = org.jooq.impl.DSL.second(date25);
        org.jooq.Field<java.sql.Timestamp> timestampField27 = null;
        java.util.Date date28 = null;
        org.jooq.Field<java.lang.Integer> intField29 = org.jooq.impl.DSL.second(date28);
        java.util.Date date30 = null;
        org.jooq.Field<java.lang.Integer> intField31 = org.jooq.impl.DSL.second(date30);
        java.util.Date date32 = null;
        org.jooq.Field<java.lang.Integer> intField33 = org.jooq.impl.DSL.minute(date32);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_34 = org.jooq.impl.DSL.row(intField29, intField31, intField33);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField35 = org.jooq.impl.DSL.deg(intField29);
        org.jooq.DatePart datePart36 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField37 = org.jooq.impl.DSL.timestampAdd(timestampField27, intField29, datePart36);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord3SelectSelectStep38 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField24, (org.jooq.SelectField<java.lang.Integer>) intField26, (org.jooq.SelectField<java.lang.Integer>) intField29);
        org.jooq.Field[] fieldArray40 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray41 = (org.jooq.Field<?>[]) fieldArray40;
        org.jooq.Field<java.lang.Integer> intField42 = org.jooq.impl.DSL.least(intField24, wildcardFieldArray41);
        org.jooq.GroupField groupField43 = org.jooq.impl.DSL.rollup(wildcardFieldArray41);
        org.jooq.Condition condition44 = org.jooq.impl.DSL.condition("", (org.jooq.QueryPart[]) wildcardFieldArray41);
        org.jooq.Field<java.lang.Boolean> booleanField45 = org.jooq.impl.DSL.connectByIsCycle();
        org.jooq.Condition condition46 = org.jooq.impl.DSL.condition(booleanField45);
        org.jooq.Field<java.lang.Boolean> booleanField47 = org.jooq.impl.DSL.connectByIsCycle();
        org.jooq.Condition condition48 = org.jooq.impl.DSL.condition(booleanField47);
        org.jooq.Condition[] conditionArray49 = new org.jooq.Condition[] { condition2, condition19, condition21, condition44, condition46, condition48 };
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Condition condition50 = org.jooq.impl.DSL.condition(operator0, conditionArray49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The argument 'operator' must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(condition2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord3SelectSelectStep18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(condition19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(condition21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord3SelectSelectStep38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(groupField43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(condition44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanField45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(condition46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanField47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(condition48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(conditionArray49);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.jooq.CommonTableExpression[] commonTableExpressionArray1 = new org.jooq.CommonTableExpression[0];
        @SuppressWarnings("unchecked")
        org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray2 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray1;
        org.jooq.WithStep withStep3 = org.jooq.impl.DSL.withRecursive(wildcardCommonTableExpressionArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(commonTableExpressionArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(withStep3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.sql.Date date0 = null;
        java.sql.Date date1 = null;
        org.jooq.Field<java.sql.Date> dateField3 = org.jooq.impl.DSL.dateSub(date1, (java.lang.Number) 1L);
        org.jooq.DatePart datePart5 = null;
        org.jooq.Field<java.sql.Date> dateField6 = org.jooq.impl.DSL.dateSub(dateField3, (java.lang.Number) (byte) 1, datePart5);
        org.jooq.Field<java.lang.Integer> intField7 = org.jooq.impl.DSL.dateDiff(date0, dateField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.deg((java.lang.Number) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.sql.Date date0 = null;
        org.jooq.DatePart datePart2 = null;
        org.jooq.Field<java.sql.Date> dateField3 = org.jooq.impl.DSL.dateAdd(date0, (java.lang.Number) 1L, datePart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateField3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.jooq.Table<org.jooq.Record> recordTable1 = org.jooq.impl.DSL.table("hi!");
        org.jooq.CreateTableAsStep<org.jooq.Record> recordCreateTableAsStep2 = org.jooq.impl.DSL.createGlobalTemporaryTable(recordTable1);
        org.jooq.InsertSetStep<org.jooq.Record> recordInsertSetStep3 = org.jooq.impl.DSL.insertInto(recordTable1);
        java.util.Date date5 = null;
        org.jooq.Field<java.lang.Integer> intField6 = org.jooq.impl.DSL.second(date5);
        java.util.Date date7 = null;
        org.jooq.Field<java.lang.Integer> intField8 = org.jooq.impl.DSL.second(date7);
        java.util.Date date9 = null;
        org.jooq.Field<java.lang.Integer> intField10 = org.jooq.impl.DSL.minute(date9);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_11 = org.jooq.impl.DSL.row(intField6, intField8, intField10);
        java.util.Date date12 = null;
        org.jooq.Field<java.lang.Integer> intField13 = org.jooq.impl.DSL.minute(date12);
        java.util.Date date14 = null;
        org.jooq.Field<java.lang.Integer> intField15 = org.jooq.impl.DSL.second(date14);
        org.jooq.Field<java.sql.Timestamp> timestampField16 = null;
        java.util.Date date17 = null;
        org.jooq.Field<java.lang.Integer> intField18 = org.jooq.impl.DSL.second(date17);
        java.util.Date date19 = null;
        org.jooq.Field<java.lang.Integer> intField20 = org.jooq.impl.DSL.second(date19);
        java.util.Date date21 = null;
        org.jooq.Field<java.lang.Integer> intField22 = org.jooq.impl.DSL.minute(date21);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_23 = org.jooq.impl.DSL.row(intField18, intField20, intField22);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField24 = org.jooq.impl.DSL.deg(intField18);
        org.jooq.DatePart datePart25 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField26 = org.jooq.impl.DSL.timestampAdd(timestampField16, intField18, datePart25);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord3SelectSelectStep27 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField13, (org.jooq.SelectField<java.lang.Integer>) intField15, (org.jooq.SelectField<java.lang.Integer>) intField18);
        org.jooq.Field[] fieldArray29 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray30 = (org.jooq.Field<?>[]) fieldArray29;
        org.jooq.Field<java.lang.Integer> intField31 = org.jooq.impl.DSL.least(intField13, wildcardFieldArray30);
        org.jooq.Field<java.lang.Integer> intField32 = org.jooq.impl.DSL.greatest(intField6, wildcardFieldArray30);
        org.jooq.Table<org.jooq.Record> recordTable33 = org.jooq.impl.DSL.table("", (java.lang.Object[]) wildcardFieldArray30);
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction34 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray30);
        org.jooq.InsertValuesStepN<org.jooq.Record> recordInsertValuesStepN35 = org.jooq.impl.DSL.insertInto(recordTable1, wildcardFieldArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordTable1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordCreateTableAsStep2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordInsertSetStep3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord3SelectSelectStep27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordTable33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordInsertValuesStepN35);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.jooq.CreateTableAsStep<org.jooq.Record> recordCreateTableAsStep1 = org.jooq.impl.DSL.createGlobalTemporaryTable("");
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Param<org.jooq.CreateTableAsStep<org.jooq.Record>> recordCreateTableAsStepParam2 = org.jooq.impl.DSL.val(recordCreateTableAsStep1);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.CreateTableImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordCreateTableAsStep1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.minute(date0);
        org.jooq.AggregateFunction<java.lang.Integer> intAggregateFunction2 = org.jooq.impl.DSL.max(intField1);
        java.util.Date date3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = org.jooq.impl.DSL.minute(date3);
        org.jooq.AggregateFunction<java.lang.Integer> intAggregateFunction5 = org.jooq.impl.DSL.max(intField4);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField6 = org.jooq.impl.DSL.atan2(intField1, (org.jooq.Field<java.lang.Integer>) intAggregateFunction5);
        java.util.Date date7 = null;
        org.jooq.Field<java.lang.Integer> intField8 = org.jooq.impl.DSL.minute(date7);
        java.util.Date date9 = null;
        org.jooq.Field<java.lang.Integer> intField10 = org.jooq.impl.DSL.second(date9);
        org.jooq.Field<java.sql.Timestamp> timestampField11 = null;
        java.util.Date date12 = null;
        org.jooq.Field<java.lang.Integer> intField13 = org.jooq.impl.DSL.second(date12);
        java.util.Date date14 = null;
        org.jooq.Field<java.lang.Integer> intField15 = org.jooq.impl.DSL.second(date14);
        java.util.Date date16 = null;
        org.jooq.Field<java.lang.Integer> intField17 = org.jooq.impl.DSL.minute(date16);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_18 = org.jooq.impl.DSL.row(intField13, intField15, intField17);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField19 = org.jooq.impl.DSL.deg(intField13);
        org.jooq.DatePart datePart20 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField21 = org.jooq.impl.DSL.timestampAdd(timestampField11, intField13, datePart20);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord3SelectSelectStep22 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField8, (org.jooq.SelectField<java.lang.Integer>) intField10, (org.jooq.SelectField<java.lang.Integer>) intField13);
        org.jooq.Param<java.lang.Integer> intParam23 = org.jooq.impl.DSL.inline((java.lang.Object) bigDecimalField6, intField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intAggregateFunction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intAggregateFunction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRow3_18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord3SelectSelectStep22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intParam23);
    }
}

