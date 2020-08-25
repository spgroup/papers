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
        java.sql.Connection connection0 = null;
        org.jooq.SQLDialect sQLDialect1 = null;
        org.jooq.DSLContext dSLContext2 = org.jooq.impl.DSL.using(connection0, sQLDialect1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dSLContext2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField0 = org.jooq.impl.DSL.e();
        org.jooq.DSLContext dSLContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Row7<org.jooq.Field<java.math.BigDecimal>, java.lang.CharSequence, java.lang.Object, java.io.Serializable, java.io.Serializable, org.jooq.DSLContext, java.lang.Object> bigDecimalFieldRow7_7 = org.jooq.impl.DSL.row(bigDecimalField0, (java.lang.CharSequence) "", (java.lang.Object) 100, (java.io.Serializable) 0.0d, (java.io.Serializable) '#', dSLContext5, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class java.lang.Character is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.jooq.Operator operator0 = null;
        org.jooq.Condition[] conditionArray1 = new org.jooq.Condition[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Condition condition2 = org.jooq.impl.DSL.condition(operator0, conditionArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The argument 'operator' must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(conditionArray1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField0 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction2 = org.jooq.impl.DSL.listAgg(bigDecimalField0, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField3 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.acos(bigDecimalField3);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction5 = org.jooq.impl.DSL.regrSXY(bigDecimalField0, bigDecimalField3);
        org.jooq.WindowBeforeOverStep[] windowBeforeOverStepArray7 = new org.jooq.WindowBeforeOverStep[1];
        @SuppressWarnings("unchecked")
        org.jooq.WindowBeforeOverStep<java.math.BigDecimal>[] bigDecimalWindowBeforeOverStepArray8 = (org.jooq.WindowBeforeOverStep<java.math.BigDecimal>[]) windowBeforeOverStepArray7;
        bigDecimalWindowBeforeOverStepArray8[0] = bigDecimalAggregateFunction5;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.QuantifiedSelect<org.jooq.Record1<org.jooq.WindowBeforeOverStep<java.math.BigDecimal>>> bigDecimalWindowBeforeOverStepRecord1QuantifiedSelect11 = org.jooq.impl.DSL.any(bigDecimalWindowBeforeOverStepArray8);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type interface org.jooq.WindowBeforeOverStep is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowBeforeOverStepArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalWindowBeforeOverStepArray8);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep1 = org.jooq.impl.DSL.rowsBetweenFollowing(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.generateSeries(intField0, intField1);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField3 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction6 = org.jooq.impl.DSL.listAgg(bigDecimalField4, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField7 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction10 = org.jooq.impl.DSL.listAgg(bigDecimalField8, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = org.jooq.impl.DSL.acos(bigDecimalField11);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction13 = org.jooq.impl.DSL.regrSXY(bigDecimalField8, bigDecimalField11);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction16 = org.jooq.impl.DSL.listAgg(bigDecimalField14, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField17 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_18 = org.jooq.impl.DSL.insertInto(intRecord1Table2, bigDecimalField3, bigDecimalField4, bigDecimalField7, bigDecimalField8, bigDecimalField14, bigDecimalField17);
        org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal> bigDecimalWindowIgnoreNullsStep20 = org.jooq.impl.DSL.lag(bigDecimalField3, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalWindowIgnoreNullsStep20);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.jooq.Row15[] row15Array1 = new org.jooq.Row15[0];
        @SuppressWarnings("unchecked")
        org.jooq.Row15<org.jooq.Table<org.jooq.Record1<java.lang.Integer>>, org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, java.lang.String, java.lang.Comparable<java.lang.String>, org.jooq.GroupField, org.jooq.InsertOnDuplicateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.Row, org.jooq.Query, org.jooq.QueryPart, java.io.Serializable, org.jooq.OrderedAggregateFunction<java.lang.String>, java.lang.Object>[] record1TableRow15Array2 = (org.jooq.Row15<org.jooq.Table<org.jooq.Record1<java.lang.Integer>>, org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, java.lang.String, java.lang.Comparable<java.lang.String>, org.jooq.GroupField, org.jooq.InsertOnDuplicateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.Row, org.jooq.Query, org.jooq.QueryPart, java.io.Serializable, org.jooq.OrderedAggregateFunction<java.lang.String>, java.lang.Object>[]) row15Array1;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record15<org.jooq.Table<org.jooq.Record1<java.lang.Integer>>, org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, java.lang.String, java.lang.Comparable<java.lang.String>, org.jooq.GroupField, org.jooq.InsertOnDuplicateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.Row, org.jooq.Query, org.jooq.QueryPart, java.io.Serializable, org.jooq.OrderedAggregateFunction<java.lang.String>, java.lang.Object>> record1TableRecord15Table3 = org.jooq.impl.DSL.values(record1TableRow15Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row15Array1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(record1TableRow15Array2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.jooq.Condition condition0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.AggregateFunction<java.lang.Boolean> booleanAggregateFunction1 = org.jooq.impl.DSL.every(condition0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table3 = org.jooq.impl.DSL.generateSeries(intField1, intField2);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField5 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction7 = org.jooq.impl.DSL.listAgg(bigDecimalField5, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField9 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction11 = org.jooq.impl.DSL.listAgg(bigDecimalField9, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = org.jooq.impl.DSL.acos(bigDecimalField12);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction14 = org.jooq.impl.DSL.regrSXY(bigDecimalField9, bigDecimalField12);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction17 = org.jooq.impl.DSL.listAgg(bigDecimalField15, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField18 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_19 = org.jooq.impl.DSL.insertInto(intRecord1Table3, bigDecimalField4, bigDecimalField5, bigDecimalField8, bigDecimalField9, bigDecimalField15, bigDecimalField18);
        org.jooq.Field<java.lang.Integer> intField20 = null;
        org.jooq.Field<java.lang.Integer> intField21 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table22 = org.jooq.impl.DSL.generateSeries(intField20, intField21);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField23 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField24 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction26 = org.jooq.impl.DSL.listAgg(bigDecimalField24, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField27 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField28 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction30 = org.jooq.impl.DSL.listAgg(bigDecimalField28, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField31 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField32 = org.jooq.impl.DSL.acos(bigDecimalField31);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction33 = org.jooq.impl.DSL.regrSXY(bigDecimalField28, bigDecimalField31);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField34 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction36 = org.jooq.impl.DSL.listAgg(bigDecimalField34, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField37 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_38 = org.jooq.impl.DSL.insertInto(intRecord1Table22, bigDecimalField23, bigDecimalField24, bigDecimalField27, bigDecimalField28, bigDecimalField34, bigDecimalField37);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.mid(strField0, bigDecimalField9, bigDecimalField34);
        org.jooq.Field<java.lang.Integer> intField40 = null;
        org.jooq.Field<java.lang.Integer> intField41 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table42 = org.jooq.impl.DSL.generateSeries(intField40, intField41);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField43 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField44 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction46 = org.jooq.impl.DSL.listAgg(bigDecimalField44, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField47 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField48 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction50 = org.jooq.impl.DSL.listAgg(bigDecimalField48, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField51 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField52 = org.jooq.impl.DSL.acos(bigDecimalField51);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction53 = org.jooq.impl.DSL.regrSXY(bigDecimalField48, bigDecimalField51);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField54 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction56 = org.jooq.impl.DSL.listAgg(bigDecimalField54, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField57 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_58 = org.jooq.impl.DSL.insertInto(intRecord1Table42, bigDecimalField43, bigDecimalField44, bigDecimalField47, bigDecimalField48, bigDecimalField54, bigDecimalField57);
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Field<java.lang.String> strField59 = org.jooq.impl.DSL.right(strField0, bigDecimalField48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_58);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.jooq.Row14[] row14Array1 = new org.jooq.Row14[0];
        @SuppressWarnings("unchecked")
        org.jooq.Row14<org.jooq.Attachable, org.jooq.Insert<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, org.jooq.QueryPart, org.jooq.OrderedAggregateFunction<java.lang.String>, org.jooq.InsertReturningStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, org.jooq.Field<java.math.BigDecimal>, org.jooq.GroupField, org.jooq.Insert<org.jooq.Record1<java.lang.Integer>>, org.jooq.Scope, java.lang.CharSequence, org.jooq.GroupField, org.jooq.SelectField<java.math.BigDecimal>>[] attachableRow14Array2 = (org.jooq.Row14<org.jooq.Attachable, org.jooq.Insert<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, org.jooq.QueryPart, org.jooq.OrderedAggregateFunction<java.lang.String>, org.jooq.InsertReturningStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, org.jooq.Field<java.math.BigDecimal>, org.jooq.GroupField, org.jooq.Insert<org.jooq.Record1<java.lang.Integer>>, org.jooq.Scope, java.lang.CharSequence, org.jooq.GroupField, org.jooq.SelectField<java.math.BigDecimal>>[]) row14Array1;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record14<org.jooq.Attachable, org.jooq.Insert<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, org.jooq.QueryPart, org.jooq.OrderedAggregateFunction<java.lang.String>, org.jooq.InsertReturningStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, org.jooq.Field<java.math.BigDecimal>, org.jooq.GroupField, org.jooq.Insert<org.jooq.Record1<java.lang.Integer>>, org.jooq.Scope, java.lang.CharSequence, org.jooq.GroupField, org.jooq.SelectField<java.math.BigDecimal>>> attachableRecord14Table3 = org.jooq.impl.DSL.values((org.jooq.Row14<org.jooq.Attachable, org.jooq.Insert<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, org.jooq.QueryPart, org.jooq.OrderedAggregateFunction<java.lang.String>, org.jooq.InsertReturningStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, org.jooq.Field<java.math.BigDecimal>, org.jooq.GroupField, org.jooq.Insert<org.jooq.Record1<java.lang.Integer>>, org.jooq.Scope, java.lang.CharSequence, org.jooq.GroupField, org.jooq.SelectField<java.math.BigDecimal>>[]) row14Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row14Array1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(attachableRow14Array2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.jooq.Row9[] row9Array1 = new org.jooq.Row9[0];
        @SuppressWarnings("unchecked")
        org.jooq.Row9<org.jooq.WindowSpecificationRowsAndStep, org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, org.jooq.Field<java.math.BigDecimal>, org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal>, org.jooq.AggregateFilterStep<java.math.BigDecimal>, org.jooq.Attachable, org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, java.lang.Object>[] windowSpecificationRowsAndStepRow9Array2 = (org.jooq.Row9<org.jooq.WindowSpecificationRowsAndStep, org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, org.jooq.Field<java.math.BigDecimal>, org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal>, org.jooq.AggregateFilterStep<java.math.BigDecimal>, org.jooq.Attachable, org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, java.lang.Object>[]) row9Array1;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record9<org.jooq.WindowSpecificationRowsAndStep, org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, org.jooq.Field<java.math.BigDecimal>, org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal>, org.jooq.AggregateFilterStep<java.math.BigDecimal>, org.jooq.Attachable, org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, java.lang.Object>> windowSpecificationRowsAndStepRecord9Table3 = org.jooq.impl.DSL.values(windowSpecificationRowsAndStepRow9Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row9Array1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStepRow9Array2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table3 = org.jooq.impl.DSL.generateSeries(intField1, intField2);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField5 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction7 = org.jooq.impl.DSL.listAgg(bigDecimalField5, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField9 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction11 = org.jooq.impl.DSL.listAgg(bigDecimalField9, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = org.jooq.impl.DSL.acos(bigDecimalField12);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction14 = org.jooq.impl.DSL.regrSXY(bigDecimalField9, bigDecimalField12);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction17 = org.jooq.impl.DSL.listAgg(bigDecimalField15, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField18 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_19 = org.jooq.impl.DSL.insertInto(intRecord1Table3, bigDecimalField4, bigDecimalField5, bigDecimalField8, bigDecimalField9, bigDecimalField15, bigDecimalField18);
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.repeat("", bigDecimalField18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField20);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.jooq.Row11<java.lang.Object, java.lang.Object, org.jooq.Attachable, org.jooq.Query, java.lang.Object, org.jooq.WindowBeforeOverStep<java.math.BigDecimal>, org.jooq.InsertReturningStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationFinalStep, org.jooq.Query, org.jooq.Table<org.jooq.Record1<java.lang.Integer>>, java.lang.CharSequence> objRow11_0 = null;
        org.jooq.Row11[] row11Array2 = new org.jooq.Row11[1];
        @SuppressWarnings("unchecked")
        org.jooq.Row11<java.lang.Object, java.lang.Object, org.jooq.Attachable, org.jooq.Query, java.lang.Object, org.jooq.WindowBeforeOverStep<java.math.BigDecimal>, org.jooq.InsertReturningStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationFinalStep, org.jooq.Query, org.jooq.Table<org.jooq.Record1<java.lang.Integer>>, java.lang.CharSequence>[] objRow11Array3 = (org.jooq.Row11<java.lang.Object, java.lang.Object, org.jooq.Attachable, org.jooq.Query, java.lang.Object, org.jooq.WindowBeforeOverStep<java.math.BigDecimal>, org.jooq.InsertReturningStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationFinalStep, org.jooq.Query, org.jooq.Table<org.jooq.Record1<java.lang.Integer>>, java.lang.CharSequence>[]) row11Array2;
        objRow11Array3[0] = objRow11_0;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record11<java.lang.Object, java.lang.Object, org.jooq.Attachable, org.jooq.Query, java.lang.Object, org.jooq.WindowBeforeOverStep<java.math.BigDecimal>, org.jooq.InsertReturningStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecificationFinalStep, org.jooq.Query, org.jooq.Table<org.jooq.Record1<java.lang.Integer>>, java.lang.CharSequence>> objRecord11Table6 = org.jooq.impl.DSL.values(objRow11Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row11Array2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objRow11Array3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.jooq.Field<java.sql.Date> dateField1 = org.jooq.impl.DSL.date("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateField1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.sql.Date date0 = null;
        java.sql.Date date1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = org.jooq.impl.DSL.dateDiff(date0, date1);
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table4 = org.jooq.impl.DSL.generateSeries(intField2, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.jooq.Field<java.lang.Boolean> booleanField0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Field<java.lang.Boolean> booleanField1 = org.jooq.impl.DSL.not(booleanField0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.jooq.Row14[] row14Array1 = new org.jooq.Row14[0];
        @SuppressWarnings("unchecked")
        org.jooq.Row14<org.jooq.CreateTableAsStep<org.jooq.Record>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.Insert<org.jooq.Record1<java.lang.Integer>>, org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, org.jooq.DSLContext, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, java.lang.String, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowOverStep<java.math.BigDecimal>, org.jooq.GroupField, java.lang.String, java.lang.Comparable<java.lang.String>, org.jooq.WindowBeforeOverStep<java.math.BigDecimal>>[] recordCreateTableAsStepRow14Array2 = (org.jooq.Row14<org.jooq.CreateTableAsStep<org.jooq.Record>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.Insert<org.jooq.Record1<java.lang.Integer>>, org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, org.jooq.DSLContext, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, java.lang.String, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowOverStep<java.math.BigDecimal>, org.jooq.GroupField, java.lang.String, java.lang.Comparable<java.lang.String>, org.jooq.WindowBeforeOverStep<java.math.BigDecimal>>[]) row14Array1;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record14<org.jooq.CreateTableAsStep<org.jooq.Record>, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, org.jooq.Insert<org.jooq.Record1<java.lang.Integer>>, org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, org.jooq.DSLContext, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, java.lang.String, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowOverStep<java.math.BigDecimal>, org.jooq.GroupField, java.lang.String, java.lang.Comparable<java.lang.String>, org.jooq.WindowBeforeOverStep<java.math.BigDecimal>>> recordCreateTableAsStepRecord14Table3 = org.jooq.impl.DSL.values(recordCreateTableAsStepRow14Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row14Array1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordCreateTableAsStepRow14Array2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.generateSeries(intField0, intField1);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField3 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction6 = org.jooq.impl.DSL.listAgg(bigDecimalField4, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField7 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction10 = org.jooq.impl.DSL.listAgg(bigDecimalField8, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = org.jooq.impl.DSL.acos(bigDecimalField11);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction13 = org.jooq.impl.DSL.regrSXY(bigDecimalField8, bigDecimalField11);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction16 = org.jooq.impl.DSL.listAgg(bigDecimalField14, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField17 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_18 = org.jooq.impl.DSL.insertInto(intRecord1Table2, bigDecimalField3, bigDecimalField4, bigDecimalField7, bigDecimalField8, bigDecimalField14, bigDecimalField17);
        org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal> bigDecimalWindowIgnoreNullsStep19 = org.jooq.impl.DSL.lag(bigDecimalField14);
        org.jooq.Field[] fieldArray21 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray22 = (org.jooq.Field<?>[]) fieldArray21;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField23 = org.jooq.impl.DSL.coalesce(bigDecimalField14, (org.jooq.Field<?>[]) fieldArray21);
        org.jooq.Field<java.lang.Integer> intField24 = org.jooq.impl.DSL.sign(bigDecimalField14);
        org.jooq.Field<java.lang.Integer> intField25 = null;
        org.jooq.Field<java.lang.Integer> intField26 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table27 = org.jooq.impl.DSL.generateSeries(intField25, intField26);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField28 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField29 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction31 = org.jooq.impl.DSL.listAgg(bigDecimalField29, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField32 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField33 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction35 = org.jooq.impl.DSL.listAgg(bigDecimalField33, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField36 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField37 = org.jooq.impl.DSL.acos(bigDecimalField36);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction38 = org.jooq.impl.DSL.regrSXY(bigDecimalField33, bigDecimalField36);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField39 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction41 = org.jooq.impl.DSL.listAgg(bigDecimalField39, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField42 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_43 = org.jooq.impl.DSL.insertInto(intRecord1Table27, bigDecimalField28, bigDecimalField29, bigDecimalField32, bigDecimalField33, bigDecimalField39, bigDecimalField42);
        org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal> bigDecimalWindowIgnoreNullsStep44 = org.jooq.impl.DSL.lag(bigDecimalField39);
        org.jooq.Field[] fieldArray46 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray47 = (org.jooq.Field<?>[]) fieldArray46;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField48 = org.jooq.impl.DSL.coalesce(bigDecimalField39, (org.jooq.Field<?>[]) fieldArray46);
        org.jooq.Field<java.lang.Integer> intField49 = org.jooq.impl.DSL.sign(bigDecimalField39);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction50 = org.jooq.impl.DSL.regrAvgY(bigDecimalField14, bigDecimalField39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalWindowIgnoreNullsStep19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalWindowIgnoreNullsStep44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction50);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField0 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction2 = org.jooq.impl.DSL.listAgg(bigDecimalField0, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField3 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.acos(bigDecimalField3);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction5 = org.jooq.impl.DSL.regrSXY(bigDecimalField0, bigDecimalField3);
        org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal> bigDecimalWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lead(bigDecimalField0);
        java.math.BigDecimal bigDecimal7 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.bitNand(bigDecimalField0, bigDecimal7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalWindowIgnoreNullsStep6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.jooq.WindowSpecificationFinalStep windowSpecificationFinalStep0 = org.jooq.impl.DSL.rowsUnboundedPreceding();
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.CaseValueStep<org.jooq.WindowSpecificationFinalStep> windowSpecificationFinalStepCaseValueStep1 = org.jooq.impl.DSL.choose(windowSpecificationFinalStep0);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.WindowSpecificationImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationFinalStep0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep0 = org.jooq.impl.DSL.rowsBetweenUnboundedFollowing();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.jooq.Name name0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Sequence<java.math.BigInteger> bigIntegerSequence1 = org.jooq.impl.DSL.sequence(name0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.jooq.ResultQuery<org.jooq.Record> recordResultQuery1 = org.jooq.impl.DSL.resultQuery("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordResultQuery1);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.math.BigDecimal bigDecimal0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table3 = org.jooq.impl.DSL.generateSeries(intField1, intField2);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField5 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction7 = org.jooq.impl.DSL.listAgg(bigDecimalField5, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField9 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction11 = org.jooq.impl.DSL.listAgg(bigDecimalField9, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = org.jooq.impl.DSL.acos(bigDecimalField12);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction14 = org.jooq.impl.DSL.regrSXY(bigDecimalField9, bigDecimalField12);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction17 = org.jooq.impl.DSL.listAgg(bigDecimalField15, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField18 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_19 = org.jooq.impl.DSL.insertInto(intRecord1Table3, bigDecimalField4, bigDecimalField5, bigDecimalField8, bigDecimalField9, bigDecimalField15, bigDecimalField18);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField20 = org.jooq.impl.DSL.isnull(bigDecimal0, bigDecimalField5);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction21 = org.jooq.impl.DSL.median(bigDecimalField20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction21);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.jooq.AlterTableStep alterTableStep1 = org.jooq.impl.DSL.alterTable("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(alterTableStep1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.log((java.lang.Number) 1.0f, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.jooq.Field<java.lang.Integer> intField2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table4 = org.jooq.impl.DSL.generateSeries(intField2, intField3);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField5 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField6 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction8 = org.jooq.impl.DSL.listAgg(bigDecimalField6, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField9 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField10 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction12 = org.jooq.impl.DSL.listAgg(bigDecimalField10, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = org.jooq.impl.DSL.acos(bigDecimalField13);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction15 = org.jooq.impl.DSL.regrSXY(bigDecimalField10, bigDecimalField13);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField16 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction18 = org.jooq.impl.DSL.listAgg(bigDecimalField16, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField19 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_20 = org.jooq.impl.DSL.insertInto(intRecord1Table4, bigDecimalField5, bigDecimalField6, bigDecimalField9, bigDecimalField10, bigDecimalField16, bigDecimalField19);
        org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal> bigDecimalWindowIgnoreNullsStep21 = org.jooq.impl.DSL.lag(bigDecimalField16);
        org.jooq.Field[] fieldArray23 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray24 = (org.jooq.Field<?>[]) fieldArray23;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField25 = org.jooq.impl.DSL.coalesce(bigDecimalField16, (org.jooq.Field<?>[]) fieldArray23);
        org.jooq.Field<java.lang.Integer> intField26 = org.jooq.impl.DSL.sign(bigDecimalField16);
        org.jooq.Field<java.lang.Integer> intField27 = null;
        org.jooq.Field<java.lang.Integer> intField28 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table29 = org.jooq.impl.DSL.generateSeries(intField27, intField28);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField30 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField31 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction33 = org.jooq.impl.DSL.listAgg(bigDecimalField31, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField34 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField35 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction37 = org.jooq.impl.DSL.listAgg(bigDecimalField35, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField38 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField39 = org.jooq.impl.DSL.acos(bigDecimalField38);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction40 = org.jooq.impl.DSL.regrSXY(bigDecimalField35, bigDecimalField38);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField41 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction43 = org.jooq.impl.DSL.listAgg(bigDecimalField41, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField44 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_45 = org.jooq.impl.DSL.insertInto(intRecord1Table29, bigDecimalField30, bigDecimalField31, bigDecimalField34, bigDecimalField35, bigDecimalField41, bigDecimalField44);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction46 = org.jooq.impl.DSL.regrR2(bigDecimalField16, bigDecimalField35);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField47 = org.jooq.impl.DSL.connectByRoot(bigDecimalField16);
        org.jooq.Field<java.sql.Timestamp> timestampField49 = org.jooq.impl.DSL.timestamp("");
        org.jooq.Field<java.sql.Timestamp> timestampField51 = org.jooq.impl.DSL.timestamp("");
        org.jooq.Field<java.lang.String> strField52 = null;
        org.jooq.Field<java.lang.Integer> intField53 = null;
        org.jooq.Field<java.lang.Integer> intField54 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table55 = org.jooq.impl.DSL.generateSeries(intField53, intField54);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField56 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField57 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction59 = org.jooq.impl.DSL.listAgg(bigDecimalField57, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField60 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField61 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction63 = org.jooq.impl.DSL.listAgg(bigDecimalField61, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField64 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField65 = org.jooq.impl.DSL.acos(bigDecimalField64);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction66 = org.jooq.impl.DSL.regrSXY(bigDecimalField61, bigDecimalField64);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField67 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction69 = org.jooq.impl.DSL.listAgg(bigDecimalField67, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField70 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_71 = org.jooq.impl.DSL.insertInto(intRecord1Table55, bigDecimalField56, bigDecimalField57, bigDecimalField60, bigDecimalField61, bigDecimalField67, bigDecimalField70);
        org.jooq.Field<java.lang.Integer> intField72 = null;
        org.jooq.Field<java.lang.Integer> intField73 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table74 = org.jooq.impl.DSL.generateSeries(intField72, intField73);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField75 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField76 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction78 = org.jooq.impl.DSL.listAgg(bigDecimalField76, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField79 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField80 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction82 = org.jooq.impl.DSL.listAgg(bigDecimalField80, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField83 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField84 = org.jooq.impl.DSL.acos(bigDecimalField83);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction85 = org.jooq.impl.DSL.regrSXY(bigDecimalField80, bigDecimalField83);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField86 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction88 = org.jooq.impl.DSL.listAgg(bigDecimalField86, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField89 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_90 = org.jooq.impl.DSL.insertInto(intRecord1Table74, bigDecimalField75, bigDecimalField76, bigDecimalField79, bigDecimalField80, bigDecimalField86, bigDecimalField89);
        org.jooq.Field<java.lang.String> strField91 = org.jooq.impl.DSL.mid(strField52, bigDecimalField61, bigDecimalField86);
        org.jooq.Field<java.sql.Timestamp> timestampField92 = org.jooq.impl.DSL.timestampAdd(timestampField51, bigDecimalField61);
        java.lang.Object[] objArray94 = new java.lang.Object[] { (byte) 10, bigDecimalField47, timestampField49, bigDecimalField61, (byte) -1 };
        org.jooq.ResultQuery<org.jooq.Record> recordResultQuery95 = org.jooq.impl.DSL.resultQuery("", objArray94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalWindowIgnoreNullsStep21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray94), "[10, connect_by_root e(), null, e(), -1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray94), "[10, connect_by_root e(), null, e(), -1]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordResultQuery95);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.jooq.Field<java.sql.Date> dateField0 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction3 = org.jooq.impl.DSL.listAgg(bigDecimalField1, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField5 = org.jooq.impl.DSL.acos(bigDecimalField4);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction6 = org.jooq.impl.DSL.regrSXY(bigDecimalField1, bigDecimalField4);
        org.jooq.Field<java.lang.Integer> intField7 = null;
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table9 = org.jooq.impl.DSL.generateSeries(intField7, intField8);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField10 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction13 = org.jooq.impl.DSL.listAgg(bigDecimalField11, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction17 = org.jooq.impl.DSL.listAgg(bigDecimalField15, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField18 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField19 = org.jooq.impl.DSL.acos(bigDecimalField18);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction20 = org.jooq.impl.DSL.regrSXY(bigDecimalField15, bigDecimalField18);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField21 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction23 = org.jooq.impl.DSL.listAgg(bigDecimalField21, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField24 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_25 = org.jooq.impl.DSL.insertInto(intRecord1Table9, bigDecimalField10, bigDecimalField11, bigDecimalField14, bigDecimalField15, bigDecimalField21, bigDecimalField24);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField26 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction28 = org.jooq.impl.DSL.listAgg(bigDecimalField26, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField29 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField30 = org.jooq.impl.DSL.acos(bigDecimalField29);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction31 = org.jooq.impl.DSL.regrSXY(bigDecimalField26, bigDecimalField29);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField32 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction34 = org.jooq.impl.DSL.listAgg(bigDecimalField32, "");
        org.jooq.Field<java.lang.String> strField35 = null;
        org.jooq.Field<java.lang.Integer> intField36 = null;
        org.jooq.Field<java.lang.Integer> intField37 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table38 = org.jooq.impl.DSL.generateSeries(intField36, intField37);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField39 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField40 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction42 = org.jooq.impl.DSL.listAgg(bigDecimalField40, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField43 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField44 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction46 = org.jooq.impl.DSL.listAgg(bigDecimalField44, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField47 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField48 = org.jooq.impl.DSL.acos(bigDecimalField47);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction49 = org.jooq.impl.DSL.regrSXY(bigDecimalField44, bigDecimalField47);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField50 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction52 = org.jooq.impl.DSL.listAgg(bigDecimalField50, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField53 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_54 = org.jooq.impl.DSL.insertInto(intRecord1Table38, bigDecimalField39, bigDecimalField40, bigDecimalField43, bigDecimalField44, bigDecimalField50, bigDecimalField53);
        org.jooq.Field<java.lang.Integer> intField55 = null;
        org.jooq.Field<java.lang.Integer> intField56 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table57 = org.jooq.impl.DSL.generateSeries(intField55, intField56);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField58 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField59 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction61 = org.jooq.impl.DSL.listAgg(bigDecimalField59, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField62 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField63 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction65 = org.jooq.impl.DSL.listAgg(bigDecimalField63, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField66 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField67 = org.jooq.impl.DSL.acos(bigDecimalField66);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction68 = org.jooq.impl.DSL.regrSXY(bigDecimalField63, bigDecimalField66);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField69 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction71 = org.jooq.impl.DSL.listAgg(bigDecimalField69, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField72 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_73 = org.jooq.impl.DSL.insertInto(intRecord1Table57, bigDecimalField58, bigDecimalField59, bigDecimalField62, bigDecimalField63, bigDecimalField69, bigDecimalField72);
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.mid(strField35, bigDecimalField44, bigDecimalField69);
        org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> bigDecimalRow5_75 = org.jooq.impl.DSL.row(bigDecimalField1, bigDecimalField21, bigDecimalField29, bigDecimalField32, bigDecimalField69);
        org.jooq.Field<java.sql.Date> dateField76 = org.jooq.impl.DSL.dateAdd(dateField0, bigDecimalField29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalRow5_75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateField76);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.jooq.WindowSpecificationFinalStep windowSpecificationFinalStep1 = org.jooq.impl.DSL.rowsFollowing((int) (short) -1);
        org.jooq.WindowSpecificationFinalStep windowSpecificationFinalStep2 = org.jooq.impl.DSL.rowsUnboundedPreceding();
        org.jooq.Field<?> wildcardField4 = null;
        org.jooq.Field[] fieldArray6 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray7 = (org.jooq.Field<?>[]) fieldArray6;
        wildcardFieldArray7[0] = wildcardField4;
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction10 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray7);
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Field<java.io.Serializable> serializableField11 = org.jooq.impl.DSL.decode((org.jooq.WindowSpecification) windowSpecificationFinalStep1, (org.jooq.WindowSpecification) windowSpecificationFinalStep2, (java.io.Serializable) 10.0f, (java.lang.Object[]) wildcardFieldArray7);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.WindowSpecificationImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationFinalStep1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationFinalStep2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.jooq.WindowSpecification windowSpecification0 = null;
        org.jooq.CreateTableAsStep<org.jooq.Record> recordCreateTableAsStep2 = org.jooq.impl.DSL.createTable("hi!");
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression3 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray5 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked")
        org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray6 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray5;
        wildcardCommonTableExpressionArray6[0] = wildcardCommonTableExpression3;
        org.jooq.WithStep withStep9 = org.jooq.impl.DSL.withRecursive(wildcardCommonTableExpressionArray6);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField10 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction12 = org.jooq.impl.DSL.listAgg(bigDecimalField10, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = org.jooq.impl.DSL.acos(bigDecimalField13);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction15 = org.jooq.impl.DSL.regrSXY(bigDecimalField10, bigDecimalField13);
        org.jooq.Field<java.lang.Integer> intField16 = null;
        org.jooq.Field<java.lang.Integer> intField17 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table18 = org.jooq.impl.DSL.generateSeries(intField16, intField17);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField19 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField20 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction22 = org.jooq.impl.DSL.listAgg(bigDecimalField20, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField23 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField24 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction26 = org.jooq.impl.DSL.listAgg(bigDecimalField24, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField27 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField28 = org.jooq.impl.DSL.acos(bigDecimalField27);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction29 = org.jooq.impl.DSL.regrSXY(bigDecimalField24, bigDecimalField27);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField30 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction32 = org.jooq.impl.DSL.listAgg(bigDecimalField30, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField33 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_34 = org.jooq.impl.DSL.insertInto(intRecord1Table18, bigDecimalField19, bigDecimalField20, bigDecimalField23, bigDecimalField24, bigDecimalField30, bigDecimalField33);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField35 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction37 = org.jooq.impl.DSL.listAgg(bigDecimalField35, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField38 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField39 = org.jooq.impl.DSL.acos(bigDecimalField38);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction40 = org.jooq.impl.DSL.regrSXY(bigDecimalField35, bigDecimalField38);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField41 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction43 = org.jooq.impl.DSL.listAgg(bigDecimalField41, "");
        org.jooq.Field<java.lang.String> strField44 = null;
        org.jooq.Field<java.lang.Integer> intField45 = null;
        org.jooq.Field<java.lang.Integer> intField46 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table47 = org.jooq.impl.DSL.generateSeries(intField45, intField46);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField48 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField49 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction51 = org.jooq.impl.DSL.listAgg(bigDecimalField49, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField52 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField53 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction55 = org.jooq.impl.DSL.listAgg(bigDecimalField53, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField56 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField57 = org.jooq.impl.DSL.acos(bigDecimalField56);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction58 = org.jooq.impl.DSL.regrSXY(bigDecimalField53, bigDecimalField56);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField59 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction61 = org.jooq.impl.DSL.listAgg(bigDecimalField59, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField62 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_63 = org.jooq.impl.DSL.insertInto(intRecord1Table47, bigDecimalField48, bigDecimalField49, bigDecimalField52, bigDecimalField53, bigDecimalField59, bigDecimalField62);
        org.jooq.Field<java.lang.Integer> intField64 = null;
        org.jooq.Field<java.lang.Integer> intField65 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table66 = org.jooq.impl.DSL.generateSeries(intField64, intField65);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField67 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField68 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction70 = org.jooq.impl.DSL.listAgg(bigDecimalField68, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField71 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField72 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction74 = org.jooq.impl.DSL.listAgg(bigDecimalField72, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField75 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField76 = org.jooq.impl.DSL.acos(bigDecimalField75);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction77 = org.jooq.impl.DSL.regrSXY(bigDecimalField72, bigDecimalField75);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField78 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction80 = org.jooq.impl.DSL.listAgg(bigDecimalField78, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField81 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_82 = org.jooq.impl.DSL.insertInto(intRecord1Table66, bigDecimalField67, bigDecimalField68, bigDecimalField71, bigDecimalField72, bigDecimalField78, bigDecimalField81);
        org.jooq.Field<java.lang.String> strField83 = org.jooq.impl.DSL.mid(strField44, bigDecimalField53, bigDecimalField78);
        org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> bigDecimalRow5_84 = org.jooq.impl.DSL.row(bigDecimalField10, bigDecimalField30, bigDecimalField38, bigDecimalField41, bigDecimalField78);
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep85 = org.jooq.impl.DSL.selectOne();
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep86 = org.jooq.impl.DSL.selectZero();
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Row6<org.jooq.WindowSpecification, org.jooq.CreateTableAsStep<org.jooq.Record>, java.lang.Object[], org.jooq.Row, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.FieldLike> windowSpecificationRow6_87 = org.jooq.impl.DSL.row(windowSpecification0, recordCreateTableAsStep2, (java.lang.Object[]) wildcardCommonTableExpressionArray6, (org.jooq.Row) bigDecimalRow5_84, (java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep85, (org.jooq.FieldLike) intRecord1SelectSelectStep86);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.CreateTableImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordCreateTableAsStep2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(commonTableExpressionArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(withStep9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalRow5_84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep86);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.jooq.Row21[] row21Array1 = new org.jooq.Row21[0];
        @SuppressWarnings("unchecked")
        org.jooq.Row21<java.io.Serializable, org.jooq.WindowSpecificationFinalStep, java.lang.Comparable<java.lang.String>, org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.InsertOnDuplicateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Scope, org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, java.lang.CharSequence, org.jooq.CaseValueStep<org.jooq.Field<java.math.BigDecimal>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFilterStep<java.math.BigDecimal>, java.lang.String, org.jooq.CaseValueStep<org.jooq.Field<java.math.BigDecimal>>>[] serializableRow21Array2 = (org.jooq.Row21<java.io.Serializable, org.jooq.WindowSpecificationFinalStep, java.lang.Comparable<java.lang.String>, org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.InsertOnDuplicateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Scope, org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, java.lang.CharSequence, org.jooq.CaseValueStep<org.jooq.Field<java.math.BigDecimal>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFilterStep<java.math.BigDecimal>, java.lang.String, org.jooq.CaseValueStep<org.jooq.Field<java.math.BigDecimal>>>[]) row21Array1;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record21<java.io.Serializable, org.jooq.WindowSpecificationFinalStep, java.lang.Comparable<java.lang.String>, org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectGroupByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.InsertOnDuplicateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String, org.jooq.CreateTableAsStep<org.jooq.Record>, org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Scope, org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, java.lang.CharSequence, org.jooq.CaseValueStep<org.jooq.Field<java.math.BigDecimal>>, org.jooq.SelectOrderByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFilterStep<java.math.BigDecimal>, java.lang.String, org.jooq.CaseValueStep<org.jooq.Field<java.math.BigDecimal>>>> serializableRecord21Table3 = org.jooq.impl.DSL.values(serializableRow21Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row21Array1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableRow21Array2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.jooq.WindowOverStep<java.math.BigDecimal> bigDecimalWindowOverStep0 = org.jooq.impl.DSL.percentRank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalWindowOverStep0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.generateSeries(intField0, intField1);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField3 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction6 = org.jooq.impl.DSL.listAgg(bigDecimalField4, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField7 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction10 = org.jooq.impl.DSL.listAgg(bigDecimalField8, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = org.jooq.impl.DSL.acos(bigDecimalField11);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction13 = org.jooq.impl.DSL.regrSXY(bigDecimalField8, bigDecimalField11);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction16 = org.jooq.impl.DSL.listAgg(bigDecimalField14, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField17 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_18 = org.jooq.impl.DSL.insertInto(intRecord1Table2, bigDecimalField3, bigDecimalField4, bigDecimalField7, bigDecimalField8, bigDecimalField14, bigDecimalField17);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction19 = org.jooq.impl.DSL.avgDistinct(bigDecimalField8);
        java.math.BigDecimal bigDecimal20 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField21 = org.jooq.impl.DSL.bitAnd((org.jooq.Field<java.math.BigDecimal>) bigDecimalAggregateFunction19, bigDecimal20);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction22 = org.jooq.impl.DSL.minDistinct(bigDecimalField21);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField24 = org.jooq.impl.DSL.log((org.jooq.Field<java.math.BigDecimal>) bigDecimalAggregateFunction22, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField24);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.sql.Date date0 = null;
        org.jooq.DatePart datePart2 = null;
        org.jooq.Field<java.sql.Date> dateField3 = org.jooq.impl.DSL.dateSub(date0, (java.lang.Number) 0L, datePart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateField3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.Date date0 = null;
        org.jooq.Field<java.sql.Time> timeField1 = org.jooq.impl.DSL.time(date0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeField1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.sql.Connection connection0 = null;
        org.jooq.SQLDialect sQLDialect1 = null;
        org.jooq.conf.Settings settings2 = null;
        org.jooq.DSLContext dSLContext3 = org.jooq.impl.DSL.using(connection0, sQLDialect1, settings2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dSLContext3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.sql.Connection connection0 = null;
        org.jooq.conf.Settings settings1 = null;
        org.jooq.DSLContext dSLContext2 = org.jooq.impl.DSL.using(connection0, settings1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dSLContext2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.jooq.Row21<org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.CharSequence, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Query, org.jooq.Field<java.math.BigDecimal>, org.jooq.Query, java.io.Serializable, org.jooq.WindowSpecificationRowsAndStep, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, org.jooq.Param<java.lang.Object>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFilterStep<java.math.BigDecimal>, org.jooq.Param<java.lang.Object>, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField<java.math.BigDecimal>> intRecord1SelectForUpdateStepRow21_0 = null;
        org.jooq.Row21[] row21Array2 = new org.jooq.Row21[1];
        @SuppressWarnings("unchecked")
        org.jooq.Row21<org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.CharSequence, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Query, org.jooq.Field<java.math.BigDecimal>, org.jooq.Query, java.io.Serializable, org.jooq.WindowSpecificationRowsAndStep, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, org.jooq.Param<java.lang.Object>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFilterStep<java.math.BigDecimal>, org.jooq.Param<java.lang.Object>, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField<java.math.BigDecimal>>[] record1SelectForUpdateStepRow21Array3 = (org.jooq.Row21<org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.CharSequence, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Query, org.jooq.Field<java.math.BigDecimal>, org.jooq.Query, java.io.Serializable, org.jooq.WindowSpecificationRowsAndStep, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, org.jooq.Param<java.lang.Object>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFilterStep<java.math.BigDecimal>, org.jooq.Param<java.lang.Object>, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField<java.math.BigDecimal>>[]) row21Array2;
        record1SelectForUpdateStepRow21Array3[0] = intRecord1SelectForUpdateStepRow21_0;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record21<org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.CharSequence, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Query, org.jooq.Field<java.math.BigDecimal>, org.jooq.Query, java.io.Serializable, org.jooq.WindowSpecificationRowsAndStep, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, org.jooq.Param<java.lang.Object>, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFilterStep<java.math.BigDecimal>, org.jooq.Param<java.lang.Object>, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectField<java.math.BigDecimal>>> record1SelectForUpdateStepRecord21Table6 = org.jooq.impl.DSL.values(record1SelectForUpdateStepRow21Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row21Array2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(record1SelectForUpdateStepRow21Array3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.atan2((java.lang.Number) 1.0f, (java.lang.Number) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.reverse("hi!");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.md5(strField1);
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.lower(strField1);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.substring(strField1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.generateSeries(intField0, intField1);
        org.jooq.DropViewFinalStep dropViewFinalStep3 = org.jooq.impl.DSL.dropViewIfExists(intRecord1Table2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dropViewFinalStep3);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.math.BigDecimal bigDecimal1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table4 = org.jooq.impl.DSL.generateSeries(intField2, intField3);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField5 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField6 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction8 = org.jooq.impl.DSL.listAgg(bigDecimalField6, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField9 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField10 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction12 = org.jooq.impl.DSL.listAgg(bigDecimalField10, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = org.jooq.impl.DSL.acos(bigDecimalField13);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction15 = org.jooq.impl.DSL.regrSXY(bigDecimalField10, bigDecimalField13);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField16 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction18 = org.jooq.impl.DSL.listAgg(bigDecimalField16, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField19 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_20 = org.jooq.impl.DSL.insertInto(intRecord1Table4, bigDecimalField5, bigDecimalField6, bigDecimalField9, bigDecimalField10, bigDecimalField16, bigDecimalField19);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField21 = org.jooq.impl.DSL.isnull(bigDecimal1, bigDecimalField6);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField22 = org.jooq.impl.DSL.power((java.lang.Number) (-1.0d), bigDecimalField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField22);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.reverse("hi!");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.md5(strField1);
        org.jooq.Field<java.lang.Integer> intField3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table5 = org.jooq.impl.DSL.generateSeries(intField3, intField4);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField6 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField7 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction9 = org.jooq.impl.DSL.listAgg(bigDecimalField7, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField10 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction13 = org.jooq.impl.DSL.listAgg(bigDecimalField11, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.acos(bigDecimalField14);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction16 = org.jooq.impl.DSL.regrSXY(bigDecimalField11, bigDecimalField14);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField17 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction19 = org.jooq.impl.DSL.listAgg(bigDecimalField17, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField20 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_21 = org.jooq.impl.DSL.insertInto(intRecord1Table5, bigDecimalField6, bigDecimalField7, bigDecimalField10, bigDecimalField11, bigDecimalField17, bigDecimalField20);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction22 = org.jooq.impl.DSL.avgDistinct(bigDecimalField11);
        java.math.BigDecimal bigDecimal23 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField24 = org.jooq.impl.DSL.bitAnd((org.jooq.Field<java.math.BigDecimal>) bigDecimalAggregateFunction22, bigDecimal23);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction25 = org.jooq.impl.DSL.minDistinct(bigDecimalField24);
        org.jooq.Field<java.lang.String> strField26 = org.jooq.impl.DSL.right(strField2, (org.jooq.Field<java.math.BigDecimal>) bigDecimalAggregateFunction25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField26);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        org.jooq.WithAsStep withAsStep3 = org.jooq.impl.DSL.withRecursive("", strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(withAsStep3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.String str2 = org.jooq.impl.DSL.escape("", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.tanh((java.lang.Number) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.lower("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction3 = org.jooq.impl.DSL.listAgg(bigDecimalField1, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField5 = org.jooq.impl.DSL.acos(bigDecimalField4);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction6 = org.jooq.impl.DSL.regrSXY(bigDecimalField1, bigDecimalField4);
        org.jooq.Field<java.lang.Integer> intField7 = null;
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table9 = org.jooq.impl.DSL.generateSeries(intField7, intField8);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField10 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction13 = org.jooq.impl.DSL.listAgg(bigDecimalField11, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction17 = org.jooq.impl.DSL.listAgg(bigDecimalField15, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField18 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField19 = org.jooq.impl.DSL.acos(bigDecimalField18);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction20 = org.jooq.impl.DSL.regrSXY(bigDecimalField15, bigDecimalField18);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField21 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction23 = org.jooq.impl.DSL.listAgg(bigDecimalField21, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField24 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_25 = org.jooq.impl.DSL.insertInto(intRecord1Table9, bigDecimalField10, bigDecimalField11, bigDecimalField14, bigDecimalField15, bigDecimalField21, bigDecimalField24);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField26 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction28 = org.jooq.impl.DSL.listAgg(bigDecimalField26, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField29 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField30 = org.jooq.impl.DSL.acos(bigDecimalField29);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction31 = org.jooq.impl.DSL.regrSXY(bigDecimalField26, bigDecimalField29);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField32 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction34 = org.jooq.impl.DSL.listAgg(bigDecimalField32, "");
        org.jooq.Field<java.lang.String> strField35 = null;
        org.jooq.Field<java.lang.Integer> intField36 = null;
        org.jooq.Field<java.lang.Integer> intField37 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table38 = org.jooq.impl.DSL.generateSeries(intField36, intField37);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField39 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField40 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction42 = org.jooq.impl.DSL.listAgg(bigDecimalField40, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField43 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField44 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction46 = org.jooq.impl.DSL.listAgg(bigDecimalField44, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField47 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField48 = org.jooq.impl.DSL.acos(bigDecimalField47);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction49 = org.jooq.impl.DSL.regrSXY(bigDecimalField44, bigDecimalField47);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField50 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction52 = org.jooq.impl.DSL.listAgg(bigDecimalField50, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField53 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_54 = org.jooq.impl.DSL.insertInto(intRecord1Table38, bigDecimalField39, bigDecimalField40, bigDecimalField43, bigDecimalField44, bigDecimalField50, bigDecimalField53);
        org.jooq.Field<java.lang.Integer> intField55 = null;
        org.jooq.Field<java.lang.Integer> intField56 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table57 = org.jooq.impl.DSL.generateSeries(intField55, intField56);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField58 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField59 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction61 = org.jooq.impl.DSL.listAgg(bigDecimalField59, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField62 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField63 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction65 = org.jooq.impl.DSL.listAgg(bigDecimalField63, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField66 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField67 = org.jooq.impl.DSL.acos(bigDecimalField66);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction68 = org.jooq.impl.DSL.regrSXY(bigDecimalField63, bigDecimalField66);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField69 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction71 = org.jooq.impl.DSL.listAgg(bigDecimalField69, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField72 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_73 = org.jooq.impl.DSL.insertInto(intRecord1Table57, bigDecimalField58, bigDecimalField59, bigDecimalField62, bigDecimalField63, bigDecimalField69, bigDecimalField72);
        org.jooq.Field<java.lang.String> strField74 = org.jooq.impl.DSL.mid(strField35, bigDecimalField44, bigDecimalField69);
        org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> bigDecimalRow5_75 = org.jooq.impl.DSL.row(bigDecimalField1, bigDecimalField21, bigDecimalField29, bigDecimalField32, bigDecimalField69);
        org.jooq.Field<java.lang.Integer> intField76 = null;
        org.jooq.Field<java.lang.Integer> intField77 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table78 = org.jooq.impl.DSL.generateSeries(intField76, intField77);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField79 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField80 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction82 = org.jooq.impl.DSL.listAgg(bigDecimalField80, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField83 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField84 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction86 = org.jooq.impl.DSL.listAgg(bigDecimalField84, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField87 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField88 = org.jooq.impl.DSL.acos(bigDecimalField87);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction89 = org.jooq.impl.DSL.regrSXY(bigDecimalField84, bigDecimalField87);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField90 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction92 = org.jooq.impl.DSL.listAgg(bigDecimalField90, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField93 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_94 = org.jooq.impl.DSL.insertInto(intRecord1Table78, bigDecimalField79, bigDecimalField80, bigDecimalField83, bigDecimalField84, bigDecimalField90, bigDecimalField93);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction95 = org.jooq.impl.DSL.avgDistinct(bigDecimalField84);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField96 = org.jooq.impl.DSL.power(bigDecimalField32, (org.jooq.Field<java.math.BigDecimal>) bigDecimalAggregateFunction95);
        org.jooq.Field<java.lang.String> strField97 = org.jooq.impl.DSL.repeat("hi!", bigDecimalField32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalRow5_75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField97);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField0 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction2 = org.jooq.impl.DSL.listAgg(bigDecimalField0, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField3 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.acos(bigDecimalField3);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction5 = org.jooq.impl.DSL.regrSXY(bigDecimalField0, bigDecimalField3);
        org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal> bigDecimalWindowIgnoreNullsStep6 = org.jooq.impl.DSL.lead(bigDecimalField0);
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<?> wildcardTable7 = org.jooq.impl.DSL.unnest(bigDecimalField0);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Converting arbitrary types into array tables is currently not supported");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalWindowIgnoreNullsStep6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table3 = org.jooq.impl.DSL.generateSeries(intField1, intField2);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField5 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction7 = org.jooq.impl.DSL.listAgg(bigDecimalField5, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField9 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction11 = org.jooq.impl.DSL.listAgg(bigDecimalField9, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = org.jooq.impl.DSL.acos(bigDecimalField12);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction14 = org.jooq.impl.DSL.regrSXY(bigDecimalField9, bigDecimalField12);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction17 = org.jooq.impl.DSL.listAgg(bigDecimalField15, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField18 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_19 = org.jooq.impl.DSL.insertInto(intRecord1Table3, bigDecimalField4, bigDecimalField5, bigDecimalField8, bigDecimalField9, bigDecimalField15, bigDecimalField18);
        org.jooq.Field<java.lang.Integer> intField20 = null;
        org.jooq.Field<java.lang.Integer> intField21 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table22 = org.jooq.impl.DSL.generateSeries(intField20, intField21);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField23 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField24 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction26 = org.jooq.impl.DSL.listAgg(bigDecimalField24, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField27 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField28 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction30 = org.jooq.impl.DSL.listAgg(bigDecimalField28, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField31 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField32 = org.jooq.impl.DSL.acos(bigDecimalField31);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction33 = org.jooq.impl.DSL.regrSXY(bigDecimalField28, bigDecimalField31);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField34 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction36 = org.jooq.impl.DSL.listAgg(bigDecimalField34, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField37 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_38 = org.jooq.impl.DSL.insertInto(intRecord1Table22, bigDecimalField23, bigDecimalField24, bigDecimalField27, bigDecimalField28, bigDecimalField34, bigDecimalField37);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.mid(strField0, bigDecimalField9, bigDecimalField34);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField40 = org.jooq.impl.DSL.sqrt(bigDecimalField34);
        org.jooq.Field<java.lang.Integer> intField41 = null;
        org.jooq.Field<java.lang.Integer> intField42 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table43 = org.jooq.impl.DSL.generateSeries(intField41, intField42);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField44 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField45 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction47 = org.jooq.impl.DSL.listAgg(bigDecimalField45, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField48 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField49 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction51 = org.jooq.impl.DSL.listAgg(bigDecimalField49, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField52 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField53 = org.jooq.impl.DSL.acos(bigDecimalField52);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction54 = org.jooq.impl.DSL.regrSXY(bigDecimalField49, bigDecimalField52);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField55 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction57 = org.jooq.impl.DSL.listAgg(bigDecimalField55, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField58 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_59 = org.jooq.impl.DSL.insertInto(intRecord1Table43, bigDecimalField44, bigDecimalField45, bigDecimalField48, bigDecimalField49, bigDecimalField55, bigDecimalField58);
        java.sql.Date date60 = null;
        java.sql.Date date61 = null;
        org.jooq.Field<java.lang.Integer> intField62 = org.jooq.impl.DSL.dateDiff(date60, date61);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField63 = org.jooq.impl.DSL.trunc(bigDecimalField48, intField62);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField64 = org.jooq.impl.DSL.trunc(bigDecimalField40, intField62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField64);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField0 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.acos(bigDecimalField0);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.round(bigDecimalField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.rtrim("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.CreateViewAsStep createViewAsStep2 = org.jooq.impl.DSL.createView("", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.ln((java.lang.Number) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.atan2((java.lang.Number) 100, bigDecimalField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.jooq.Field<?> wildcardField0 = null;
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        wildcardFieldArray3[0] = wildcardField0;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep6 = org.jooq.impl.DSL.orderBy(wildcardFieldArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table3 = org.jooq.impl.DSL.generateSeries(intField1, intField2);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField5 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction7 = org.jooq.impl.DSL.listAgg(bigDecimalField5, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField9 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction11 = org.jooq.impl.DSL.listAgg(bigDecimalField9, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = org.jooq.impl.DSL.acos(bigDecimalField12);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction14 = org.jooq.impl.DSL.regrSXY(bigDecimalField9, bigDecimalField12);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction17 = org.jooq.impl.DSL.listAgg(bigDecimalField15, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField18 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_19 = org.jooq.impl.DSL.insertInto(intRecord1Table3, bigDecimalField4, bigDecimalField5, bigDecimalField8, bigDecimalField9, bigDecimalField15, bigDecimalField18);
        org.jooq.Field<java.lang.Integer> intField20 = null;
        org.jooq.Field<java.lang.Integer> intField21 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table22 = org.jooq.impl.DSL.generateSeries(intField20, intField21);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField23 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField24 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction26 = org.jooq.impl.DSL.listAgg(bigDecimalField24, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField27 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField28 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction30 = org.jooq.impl.DSL.listAgg(bigDecimalField28, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField31 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField32 = org.jooq.impl.DSL.acos(bigDecimalField31);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction33 = org.jooq.impl.DSL.regrSXY(bigDecimalField28, bigDecimalField31);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField34 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction36 = org.jooq.impl.DSL.listAgg(bigDecimalField34, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField37 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_38 = org.jooq.impl.DSL.insertInto(intRecord1Table22, bigDecimalField23, bigDecimalField24, bigDecimalField27, bigDecimalField28, bigDecimalField34, bigDecimalField37);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.mid(strField0, bigDecimalField9, bigDecimalField34);
        org.jooq.Field<java.lang.String> strField40 = org.jooq.impl.DSL.rtrim(strField0);
        org.jooq.Field<java.lang.String> strField43 = org.jooq.impl.DSL.rpad(strField40, (int) (byte) 10, '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField43);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.generateSeries(intField0, intField1);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField3 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction6 = org.jooq.impl.DSL.listAgg(bigDecimalField4, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField7 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction10 = org.jooq.impl.DSL.listAgg(bigDecimalField8, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = org.jooq.impl.DSL.acos(bigDecimalField11);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction13 = org.jooq.impl.DSL.regrSXY(bigDecimalField8, bigDecimalField11);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction16 = org.jooq.impl.DSL.listAgg(bigDecimalField14, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField17 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_18 = org.jooq.impl.DSL.insertInto(intRecord1Table2, bigDecimalField3, bigDecimalField4, bigDecimalField7, bigDecimalField8, bigDecimalField14, bigDecimalField17);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction19 = org.jooq.impl.DSL.avgDistinct(bigDecimalField8);
        java.math.BigDecimal bigDecimal20 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField21 = org.jooq.impl.DSL.bitAnd((org.jooq.Field<java.math.BigDecimal>) bigDecimalAggregateFunction19, bigDecimal20);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction22 = org.jooq.impl.DSL.minDistinct(bigDecimalField21);
        java.math.BigDecimal bigDecimal23 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField24 = org.jooq.impl.DSL.bitOr(bigDecimalField21, bigDecimal23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField24);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField0 = org.jooq.impl.DSL.pi();
        org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal> bigDecimalWindowIgnoreNullsStep1 = org.jooq.impl.DSL.firstValue(bigDecimalField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalWindowIgnoreNullsStep1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.jooq.Keyword keyword1 = org.jooq.impl.DSL.keyword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyword1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.generateSeries(intField0, intField1);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField3 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction6 = org.jooq.impl.DSL.listAgg(bigDecimalField4, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField7 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction10 = org.jooq.impl.DSL.listAgg(bigDecimalField8, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = org.jooq.impl.DSL.acos(bigDecimalField11);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction13 = org.jooq.impl.DSL.regrSXY(bigDecimalField8, bigDecimalField11);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction16 = org.jooq.impl.DSL.listAgg(bigDecimalField14, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField17 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_18 = org.jooq.impl.DSL.insertInto(intRecord1Table2, bigDecimalField3, bigDecimalField4, bigDecimalField7, bigDecimalField8, bigDecimalField14, bigDecimalField17);
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Param<org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>> intRecord1InsertValuesStep6Param19 = org.jooq.impl.DSL.val(intRecord1InsertValuesStep6_18);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.InsertImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_18);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep0 = org.jooq.impl.DSL.rowsBetweenUnboundedPreceding();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.jooq.QueryPart queryPart1 = org.jooq.impl.DSL.queryPart("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(queryPart1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.reverse("hi!");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction4 = org.jooq.impl.DSL.listAgg(bigDecimalField2, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField5 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField6 = org.jooq.impl.DSL.acos(bigDecimalField5);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction7 = org.jooq.impl.DSL.regrSXY(bigDecimalField2, bigDecimalField5);
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Field<java.lang.Integer> intField9 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table10 = org.jooq.impl.DSL.generateSeries(intField8, intField9);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction14 = org.jooq.impl.DSL.listAgg(bigDecimalField12, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField16 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction18 = org.jooq.impl.DSL.listAgg(bigDecimalField16, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField19 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField20 = org.jooq.impl.DSL.acos(bigDecimalField19);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction21 = org.jooq.impl.DSL.regrSXY(bigDecimalField16, bigDecimalField19);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField22 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction24 = org.jooq.impl.DSL.listAgg(bigDecimalField22, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField25 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_26 = org.jooq.impl.DSL.insertInto(intRecord1Table10, bigDecimalField11, bigDecimalField12, bigDecimalField15, bigDecimalField16, bigDecimalField22, bigDecimalField25);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField27 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction29 = org.jooq.impl.DSL.listAgg(bigDecimalField27, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField30 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField31 = org.jooq.impl.DSL.acos(bigDecimalField30);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction32 = org.jooq.impl.DSL.regrSXY(bigDecimalField27, bigDecimalField30);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField33 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction35 = org.jooq.impl.DSL.listAgg(bigDecimalField33, "");
        org.jooq.Field<java.lang.String> strField36 = null;
        org.jooq.Field<java.lang.Integer> intField37 = null;
        org.jooq.Field<java.lang.Integer> intField38 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table39 = org.jooq.impl.DSL.generateSeries(intField37, intField38);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField40 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField41 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction43 = org.jooq.impl.DSL.listAgg(bigDecimalField41, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField44 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField45 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction47 = org.jooq.impl.DSL.listAgg(bigDecimalField45, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField48 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField49 = org.jooq.impl.DSL.acos(bigDecimalField48);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction50 = org.jooq.impl.DSL.regrSXY(bigDecimalField45, bigDecimalField48);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField51 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction53 = org.jooq.impl.DSL.listAgg(bigDecimalField51, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField54 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_55 = org.jooq.impl.DSL.insertInto(intRecord1Table39, bigDecimalField40, bigDecimalField41, bigDecimalField44, bigDecimalField45, bigDecimalField51, bigDecimalField54);
        org.jooq.Field<java.lang.Integer> intField56 = null;
        org.jooq.Field<java.lang.Integer> intField57 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table58 = org.jooq.impl.DSL.generateSeries(intField56, intField57);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField59 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField60 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction62 = org.jooq.impl.DSL.listAgg(bigDecimalField60, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField63 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField64 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction66 = org.jooq.impl.DSL.listAgg(bigDecimalField64, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField67 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField68 = org.jooq.impl.DSL.acos(bigDecimalField67);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction69 = org.jooq.impl.DSL.regrSXY(bigDecimalField64, bigDecimalField67);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField70 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction72 = org.jooq.impl.DSL.listAgg(bigDecimalField70, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField73 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_74 = org.jooq.impl.DSL.insertInto(intRecord1Table58, bigDecimalField59, bigDecimalField60, bigDecimalField63, bigDecimalField64, bigDecimalField70, bigDecimalField73);
        org.jooq.Field<java.lang.String> strField75 = org.jooq.impl.DSL.mid(strField36, bigDecimalField45, bigDecimalField70);
        org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> bigDecimalRow5_76 = org.jooq.impl.DSL.row(bigDecimalField2, bigDecimalField22, bigDecimalField30, bigDecimalField33, bigDecimalField70);
        java.math.BigDecimal bigDecimal77 = null;
        org.jooq.Field<java.lang.Integer> intField78 = null;
        org.jooq.Field<java.lang.Integer> intField79 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table80 = org.jooq.impl.DSL.generateSeries(intField78, intField79);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField81 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField82 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction84 = org.jooq.impl.DSL.listAgg(bigDecimalField82, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField85 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField86 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction88 = org.jooq.impl.DSL.listAgg(bigDecimalField86, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField89 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField90 = org.jooq.impl.DSL.acos(bigDecimalField89);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction91 = org.jooq.impl.DSL.regrSXY(bigDecimalField86, bigDecimalField89);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField92 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction94 = org.jooq.impl.DSL.listAgg(bigDecimalField92, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField95 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_96 = org.jooq.impl.DSL.insertInto(intRecord1Table80, bigDecimalField81, bigDecimalField82, bigDecimalField85, bigDecimalField86, bigDecimalField92, bigDecimalField95);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField97 = org.jooq.impl.DSL.isnull(bigDecimal77, bigDecimalField82);
        org.jooq.Field<java.lang.String> strField98 = org.jooq.impl.DSL.mid(strField1, bigDecimalField70, bigDecimalField82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalRow5_76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField98);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.jooq.Row18[] row18Array1 = new org.jooq.Row18[0];
        @SuppressWarnings("unchecked")
        org.jooq.Row18<java.lang.Object[], org.jooq.Keyword, java.lang.CharSequence, org.jooq.InsertReturningStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Comparable<java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecification, org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFunction<java.math.BigDecimal>, org.jooq.WindowBeforeOverStep<java.math.BigDecimal>, org.jooq.WithStep, org.jooq.QueryPart, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>>[] objArrayRow18Array2 = (org.jooq.Row18<java.lang.Object[], org.jooq.Keyword, java.lang.CharSequence, org.jooq.InsertReturningStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Comparable<java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecification, org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFunction<java.math.BigDecimal>, org.jooq.WindowBeforeOverStep<java.math.BigDecimal>, org.jooq.WithStep, org.jooq.QueryPart, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>>[]) row18Array1;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record18<java.lang.Object[], org.jooq.Keyword, java.lang.CharSequence, org.jooq.InsertReturningStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectWhereStep<org.jooq.Record1<java.lang.Integer>>, java.lang.Comparable<java.lang.String>, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowSpecification, org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AggregateFunction<java.math.BigDecimal>, org.jooq.WindowBeforeOverStep<java.math.BigDecimal>, org.jooq.WithStep, org.jooq.QueryPart, org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>>>> objArrayRecord18Table3 = org.jooq.impl.DSL.values(objArrayRow18Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row18Array1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArrayRow18Array2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.reverse("hi!");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.md5(strField1);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.atan((java.lang.Number) 1.0f);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.left(strField1, bigDecimalField4);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField6 = org.jooq.impl.DSL.round(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.math.BigDecimal bigDecimal0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table3 = org.jooq.impl.DSL.generateSeries(intField1, intField2);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField5 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction7 = org.jooq.impl.DSL.listAgg(bigDecimalField5, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField9 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction11 = org.jooq.impl.DSL.listAgg(bigDecimalField9, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = org.jooq.impl.DSL.acos(bigDecimalField12);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction14 = org.jooq.impl.DSL.regrSXY(bigDecimalField9, bigDecimalField12);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction17 = org.jooq.impl.DSL.listAgg(bigDecimalField15, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField18 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_19 = org.jooq.impl.DSL.insertInto(intRecord1Table3, bigDecimalField4, bigDecimalField5, bigDecimalField8, bigDecimalField9, bigDecimalField15, bigDecimalField18);
        org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal> bigDecimalWindowIgnoreNullsStep20 = org.jooq.impl.DSL.lag(bigDecimalField15);
        org.jooq.Field[] fieldArray22 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray23 = (org.jooq.Field<?>[]) fieldArray22;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField24 = org.jooq.impl.DSL.coalesce(bigDecimalField15, (org.jooq.Field<?>[]) fieldArray22);
        org.jooq.Field<java.lang.Integer> intField25 = org.jooq.impl.DSL.sign(bigDecimalField15);
        org.jooq.Field<java.lang.Integer> intField26 = null;
        org.jooq.Field<java.lang.Integer> intField27 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table28 = org.jooq.impl.DSL.generateSeries(intField26, intField27);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField29 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField30 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction32 = org.jooq.impl.DSL.listAgg(bigDecimalField30, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField33 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField34 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction36 = org.jooq.impl.DSL.listAgg(bigDecimalField34, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField37 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField38 = org.jooq.impl.DSL.acos(bigDecimalField37);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction39 = org.jooq.impl.DSL.regrSXY(bigDecimalField34, bigDecimalField37);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField40 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction42 = org.jooq.impl.DSL.listAgg(bigDecimalField40, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField43 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_44 = org.jooq.impl.DSL.insertInto(intRecord1Table28, bigDecimalField29, bigDecimalField30, bigDecimalField33, bigDecimalField34, bigDecimalField40, bigDecimalField43);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction45 = org.jooq.impl.DSL.regrR2(bigDecimalField15, bigDecimalField34);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField46 = org.jooq.impl.DSL.connectByRoot(bigDecimalField15);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField47 = org.jooq.impl.DSL.bitXor(bigDecimal0, bigDecimalField15);
        java.math.BigDecimal bigDecimal48 = null;
        org.jooq.Field<java.lang.Integer> intField49 = null;
        org.jooq.Field<java.lang.Integer> intField50 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table51 = org.jooq.impl.DSL.generateSeries(intField49, intField50);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField52 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField53 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction55 = org.jooq.impl.DSL.listAgg(bigDecimalField53, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField56 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField57 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction59 = org.jooq.impl.DSL.listAgg(bigDecimalField57, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField60 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField61 = org.jooq.impl.DSL.acos(bigDecimalField60);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction62 = org.jooq.impl.DSL.regrSXY(bigDecimalField57, bigDecimalField60);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField63 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction65 = org.jooq.impl.DSL.listAgg(bigDecimalField63, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField66 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_67 = org.jooq.impl.DSL.insertInto(intRecord1Table51, bigDecimalField52, bigDecimalField53, bigDecimalField56, bigDecimalField57, bigDecimalField63, bigDecimalField66);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField68 = org.jooq.impl.DSL.isnull(bigDecimal48, bigDecimalField53);
        java.math.BigDecimal bigDecimal69 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField70 = org.jooq.impl.DSL.bitOr(bigDecimalField53, bigDecimal69);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField71 = org.jooq.impl.DSL.bitNand(bigDecimalField15, bigDecimalField70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalWindowIgnoreNullsStep20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField71);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.jooq.Row8[] row8Array1 = new org.jooq.Row8[0];
        @SuppressWarnings("unchecked")
        org.jooq.Row8<org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, org.jooq.WindowSpecificationFinalStep, org.jooq.CommonTableExpression<?>[], org.jooq.AlterTableStep, java.lang.String[], org.jooq.WindowSpecificationFinalStep, org.jooq.InsertReturningStep<org.jooq.Record1<java.lang.Integer>>>[] record1SelectDistinctOnStepRow8Array2 = (org.jooq.Row8<org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, org.jooq.WindowSpecificationFinalStep, org.jooq.CommonTableExpression<?>[], org.jooq.AlterTableStep, java.lang.String[], org.jooq.WindowSpecificationFinalStep, org.jooq.InsertReturningStep<org.jooq.Record1<java.lang.Integer>>>[]) row8Array1;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record8<org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Attachable, org.jooq.WindowSpecificationFinalStep, org.jooq.CommonTableExpression<?>[], org.jooq.AlterTableStep, java.lang.String[], org.jooq.WindowSpecificationFinalStep, org.jooq.InsertReturningStep<org.jooq.Record1<java.lang.Integer>>>> record1SelectDistinctOnStepRecord8Table3 = org.jooq.impl.DSL.values(record1SelectDistinctOnStepRow8Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row8Array1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(record1SelectDistinctOnStepRow8Array2);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep1 = org.jooq.impl.DSL.rowsBetweenPreceding((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.jooq.Row1<org.jooq.WindowSpecificationRowsAndStep>[] windowSpecificationRowsAndStepRow1Array0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record1<org.jooq.WindowSpecificationRowsAndStep>> windowSpecificationRowsAndStepRecord1Table1 = org.jooq.impl.DSL.values(windowSpecificationRowsAndStepRow1Array0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.jooq.Field<java.lang.Integer> intField0 = org.jooq.impl.DSL.one();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep0 = org.jooq.impl.DSL.rowsBetweenCurrentRow();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.jooq.Field<java.sql.Timestamp> timestampField1 = org.jooq.impl.DSL.timestamp("");
        org.jooq.Field<java.lang.String> strField2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table5 = org.jooq.impl.DSL.generateSeries(intField3, intField4);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField6 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField7 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction9 = org.jooq.impl.DSL.listAgg(bigDecimalField7, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField10 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction13 = org.jooq.impl.DSL.listAgg(bigDecimalField11, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.acos(bigDecimalField14);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction16 = org.jooq.impl.DSL.regrSXY(bigDecimalField11, bigDecimalField14);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField17 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction19 = org.jooq.impl.DSL.listAgg(bigDecimalField17, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField20 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_21 = org.jooq.impl.DSL.insertInto(intRecord1Table5, bigDecimalField6, bigDecimalField7, bigDecimalField10, bigDecimalField11, bigDecimalField17, bigDecimalField20);
        org.jooq.Field<java.lang.Integer> intField22 = null;
        org.jooq.Field<java.lang.Integer> intField23 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table24 = org.jooq.impl.DSL.generateSeries(intField22, intField23);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField25 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField26 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction28 = org.jooq.impl.DSL.listAgg(bigDecimalField26, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField29 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField30 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction32 = org.jooq.impl.DSL.listAgg(bigDecimalField30, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField33 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField34 = org.jooq.impl.DSL.acos(bigDecimalField33);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction35 = org.jooq.impl.DSL.regrSXY(bigDecimalField30, bigDecimalField33);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField36 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction38 = org.jooq.impl.DSL.listAgg(bigDecimalField36, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField39 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_40 = org.jooq.impl.DSL.insertInto(intRecord1Table24, bigDecimalField25, bigDecimalField26, bigDecimalField29, bigDecimalField30, bigDecimalField36, bigDecimalField39);
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.mid(strField2, bigDecimalField11, bigDecimalField36);
        org.jooq.Field<java.sql.Timestamp> timestampField42 = org.jooq.impl.DSL.timestampAdd(timestampField1, bigDecimalField11);
        java.sql.Timestamp timestamp43 = null;
        org.jooq.Field<org.jooq.types.DayToSecond> dayToSecondField44 = org.jooq.impl.DSL.timestampDiff(timestampField1, timestamp43);
        org.jooq.DatePart datePart46 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField47 = org.jooq.impl.DSL.timestampAdd(timestampField1, (java.lang.Number) 10L, datePart46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dayToSecondField44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField47);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.jooq.Condition condition0 = org.jooq.impl.DSL.trueCondition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(condition0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.sign((java.lang.Number) 10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.jooq.SQLDialect sQLDialect0 = null;
        org.jooq.conf.Settings settings1 = null;
        org.jooq.DSLContext dSLContext2 = org.jooq.impl.DSL.using(sQLDialect0, settings1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dSLContext2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.jooq.Field<java.lang.Boolean> booleanField0 = org.jooq.impl.DSL.connectByIsLeaf();
        org.jooq.Condition condition1 = org.jooq.impl.DSL.condition(booleanField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(condition1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField0 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction2 = org.jooq.impl.DSL.listAgg(bigDecimalField0, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField3 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.acos(bigDecimalField3);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction5 = org.jooq.impl.DSL.regrSXY(bigDecimalField0, bigDecimalField3);
        org.jooq.GroupConcatOrderByStep groupConcatOrderByStep6 = org.jooq.impl.DSL.groupConcat((org.jooq.Field<java.math.BigDecimal>) bigDecimalAggregateFunction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(groupConcatOrderByStep6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep1 = org.jooq.impl.DSL.rowsBetweenPreceding((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField0 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.cos(bigDecimalField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.jooq.Field<java.sql.Date> dateField1 = org.jooq.impl.DSL.date("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateField1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.sql.Timestamp timestamp0 = null;
        java.math.BigDecimal bigDecimal1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table4 = org.jooq.impl.DSL.generateSeries(intField2, intField3);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField5 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField6 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction8 = org.jooq.impl.DSL.listAgg(bigDecimalField6, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField9 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField10 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction12 = org.jooq.impl.DSL.listAgg(bigDecimalField10, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = org.jooq.impl.DSL.acos(bigDecimalField13);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction15 = org.jooq.impl.DSL.regrSXY(bigDecimalField10, bigDecimalField13);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField16 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction18 = org.jooq.impl.DSL.listAgg(bigDecimalField16, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField19 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_20 = org.jooq.impl.DSL.insertInto(intRecord1Table4, bigDecimalField5, bigDecimalField6, bigDecimalField9, bigDecimalField10, bigDecimalField16, bigDecimalField19);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField21 = org.jooq.impl.DSL.isnull(bigDecimal1, bigDecimalField6);
        java.math.BigDecimal bigDecimal22 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField23 = org.jooq.impl.DSL.bitOr(bigDecimalField6, bigDecimal22);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction24 = org.jooq.impl.DSL.minDistinct(bigDecimalField6);
        org.jooq.DatePart datePart25 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField26 = org.jooq.impl.DSL.timestampAdd(timestamp0, (org.jooq.Field<java.math.BigDecimal>) bigDecimalAggregateFunction24, datePart25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField26);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.reverse("hi!");
        org.jooq.Param<java.io.Serializable> serializableParam2 = org.jooq.impl.DSL.inline((java.io.Serializable) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(serializableParam2);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.jooq.Row15[] row15Array1 = new org.jooq.Row15[0];
        @SuppressWarnings("unchecked")
        org.jooq.Row15<org.jooq.DSLContext, org.jooq.Condition, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, java.io.Serializable, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], org.jooq.CaseValueStep<org.jooq.Field<java.math.BigDecimal>>, java.io.Serializable, org.jooq.Field[], org.jooq.SortField[], org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep>[] dSLContextRow15Array2 = (org.jooq.Row15<org.jooq.DSLContext, org.jooq.Condition, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, java.io.Serializable, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], org.jooq.CaseValueStep<org.jooq.Field<java.math.BigDecimal>>, java.io.Serializable, org.jooq.Field[], org.jooq.SortField[], org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep>[]) row15Array1;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record15<org.jooq.DSLContext, org.jooq.Condition, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Select<org.jooq.Record1<java.lang.Integer>>, java.io.Serializable, org.jooq.SelectIntoStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.CommonTableExpression<?>[], org.jooq.CaseValueStep<org.jooq.Field<java.math.BigDecimal>>, java.io.Serializable, org.jooq.Field[], org.jooq.SortField[], org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep>> dSLContextRecord15Table3 = org.jooq.impl.DSL.values(dSLContextRow15Array2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row15Array1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dSLContextRow15Array2);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.repeat("", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.jooq.Field<java.lang.String> strField1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table4 = org.jooq.impl.DSL.generateSeries(intField2, intField3);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField5 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField6 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction8 = org.jooq.impl.DSL.listAgg(bigDecimalField6, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField9 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField10 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction12 = org.jooq.impl.DSL.listAgg(bigDecimalField10, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = org.jooq.impl.DSL.acos(bigDecimalField13);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction15 = org.jooq.impl.DSL.regrSXY(bigDecimalField10, bigDecimalField13);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField16 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction18 = org.jooq.impl.DSL.listAgg(bigDecimalField16, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField19 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_20 = org.jooq.impl.DSL.insertInto(intRecord1Table4, bigDecimalField5, bigDecimalField6, bigDecimalField9, bigDecimalField10, bigDecimalField16, bigDecimalField19);
        org.jooq.Field<java.lang.Integer> intField21 = null;
        org.jooq.Field<java.lang.Integer> intField22 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table23 = org.jooq.impl.DSL.generateSeries(intField21, intField22);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField24 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField25 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction27 = org.jooq.impl.DSL.listAgg(bigDecimalField25, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField28 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField29 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction31 = org.jooq.impl.DSL.listAgg(bigDecimalField29, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField32 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField33 = org.jooq.impl.DSL.acos(bigDecimalField32);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction34 = org.jooq.impl.DSL.regrSXY(bigDecimalField29, bigDecimalField32);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField35 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction37 = org.jooq.impl.DSL.listAgg(bigDecimalField35, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField38 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_39 = org.jooq.impl.DSL.insertInto(intRecord1Table23, bigDecimalField24, bigDecimalField25, bigDecimalField28, bigDecimalField29, bigDecimalField35, bigDecimalField38);
        org.jooq.Field<java.lang.String> strField40 = org.jooq.impl.DSL.mid(strField1, bigDecimalField10, bigDecimalField35);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField41 = org.jooq.impl.DSL.power((java.lang.Number) (short) 0, bigDecimalField35);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction42 = org.jooq.impl.DSL.sumDistinct(bigDecimalField35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction42);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.jooq.Field<?> wildcardField2 = null;
        org.jooq.Field[] fieldArray4 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray5 = (org.jooq.Field<?>[]) fieldArray4;
        wildcardFieldArray5[0] = wildcardField2;
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction8 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray5);
        org.jooq.Query query9 = org.jooq.impl.DSL.query("", (java.lang.Object[]) wildcardFieldArray5);
        org.jooq.QueryPart queryPart10 = org.jooq.impl.DSL.queryPart("", (java.lang.Object[]) wildcardFieldArray5);
        org.jooq.Field<java.lang.String> strField11 = org.jooq.impl.DSL.concat(wildcardFieldArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(query9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(queryPart10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.jooq.WindowOverStep<java.math.BigDecimal> bigDecimalWindowOverStep0 = org.jooq.impl.DSL.cumeDist();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalWindowOverStep0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField0 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction2 = org.jooq.impl.DSL.listAgg(bigDecimalField0, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField3 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.acos(bigDecimalField3);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction5 = org.jooq.impl.DSL.regrSXY(bigDecimalField0, bigDecimalField3);
        org.jooq.Field<java.lang.Integer> intField6 = null;
        org.jooq.Field<java.lang.Integer> intField7 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table8 = org.jooq.impl.DSL.generateSeries(intField6, intField7);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField9 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField10 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction12 = org.jooq.impl.DSL.listAgg(bigDecimalField10, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction16 = org.jooq.impl.DSL.listAgg(bigDecimalField14, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField17 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField18 = org.jooq.impl.DSL.acos(bigDecimalField17);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction19 = org.jooq.impl.DSL.regrSXY(bigDecimalField14, bigDecimalField17);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField20 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction22 = org.jooq.impl.DSL.listAgg(bigDecimalField20, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField23 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_24 = org.jooq.impl.DSL.insertInto(intRecord1Table8, bigDecimalField9, bigDecimalField10, bigDecimalField13, bigDecimalField14, bigDecimalField20, bigDecimalField23);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField25 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction27 = org.jooq.impl.DSL.listAgg(bigDecimalField25, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField28 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField29 = org.jooq.impl.DSL.acos(bigDecimalField28);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction30 = org.jooq.impl.DSL.regrSXY(bigDecimalField25, bigDecimalField28);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField31 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction33 = org.jooq.impl.DSL.listAgg(bigDecimalField31, "");
        org.jooq.Field<java.lang.String> strField34 = null;
        org.jooq.Field<java.lang.Integer> intField35 = null;
        org.jooq.Field<java.lang.Integer> intField36 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table37 = org.jooq.impl.DSL.generateSeries(intField35, intField36);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField38 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField39 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction41 = org.jooq.impl.DSL.listAgg(bigDecimalField39, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField42 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField43 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction45 = org.jooq.impl.DSL.listAgg(bigDecimalField43, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField46 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField47 = org.jooq.impl.DSL.acos(bigDecimalField46);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction48 = org.jooq.impl.DSL.regrSXY(bigDecimalField43, bigDecimalField46);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField49 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction51 = org.jooq.impl.DSL.listAgg(bigDecimalField49, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField52 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_53 = org.jooq.impl.DSL.insertInto(intRecord1Table37, bigDecimalField38, bigDecimalField39, bigDecimalField42, bigDecimalField43, bigDecimalField49, bigDecimalField52);
        org.jooq.Field<java.lang.Integer> intField54 = null;
        org.jooq.Field<java.lang.Integer> intField55 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table56 = org.jooq.impl.DSL.generateSeries(intField54, intField55);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField57 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField58 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction60 = org.jooq.impl.DSL.listAgg(bigDecimalField58, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField61 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField62 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction64 = org.jooq.impl.DSL.listAgg(bigDecimalField62, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField65 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField66 = org.jooq.impl.DSL.acos(bigDecimalField65);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction67 = org.jooq.impl.DSL.regrSXY(bigDecimalField62, bigDecimalField65);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField68 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction70 = org.jooq.impl.DSL.listAgg(bigDecimalField68, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField71 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_72 = org.jooq.impl.DSL.insertInto(intRecord1Table56, bigDecimalField57, bigDecimalField58, bigDecimalField61, bigDecimalField62, bigDecimalField68, bigDecimalField71);
        org.jooq.Field<java.lang.String> strField73 = org.jooq.impl.DSL.mid(strField34, bigDecimalField43, bigDecimalField68);
        org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> bigDecimalRow5_74 = org.jooq.impl.DSL.row(bigDecimalField0, bigDecimalField20, bigDecimalField28, bigDecimalField31, bigDecimalField68);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField75 = org.jooq.impl.DSL.sinh(bigDecimalField31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalRow5_74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField75);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.rad((java.lang.Number) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.sql.Date date0 = null;
        org.jooq.DatePart datePart1 = null;
        org.jooq.Field<java.sql.Date> dateField2 = org.jooq.impl.DSL.trunc(date0, datePart1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateField2);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.generateSeries(intField0, intField1);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField3 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction6 = org.jooq.impl.DSL.listAgg(bigDecimalField4, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField7 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction10 = org.jooq.impl.DSL.listAgg(bigDecimalField8, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = org.jooq.impl.DSL.acos(bigDecimalField11);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction13 = org.jooq.impl.DSL.regrSXY(bigDecimalField8, bigDecimalField11);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction16 = org.jooq.impl.DSL.listAgg(bigDecimalField14, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField17 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_18 = org.jooq.impl.DSL.insertInto(intRecord1Table2, bigDecimalField3, bigDecimalField4, bigDecimalField7, bigDecimalField8, bigDecimalField14, bigDecimalField17);
        org.jooq.TruncateIdentityStep<org.jooq.Record1<java.lang.Integer>> intRecord1TruncateIdentityStep19 = org.jooq.impl.DSL.truncate(intRecord1Table2);
        org.jooq.Param<java.lang.Object> objParam21 = org.jooq.impl.DSL.param("");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep22 = org.jooq.impl.DSL.selectOne();
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Row3<org.jooq.TruncateFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Param<java.lang.Object>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>> intRecord1TruncateFinalStepRow3_23 = org.jooq.impl.DSL.row((org.jooq.TruncateFinalStep<org.jooq.Record1<java.lang.Integer>>) intRecord1TruncateIdentityStep19, objParam21, (java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep22);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.TruncateImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1TruncateIdentityStep19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objParam21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep22);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.generateSeries(intField0, intField1);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField3 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction6 = org.jooq.impl.DSL.listAgg(bigDecimalField4, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField7 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction10 = org.jooq.impl.DSL.listAgg(bigDecimalField8, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = org.jooq.impl.DSL.acos(bigDecimalField11);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction13 = org.jooq.impl.DSL.regrSXY(bigDecimalField8, bigDecimalField11);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction16 = org.jooq.impl.DSL.listAgg(bigDecimalField14, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField17 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_18 = org.jooq.impl.DSL.insertInto(intRecord1Table2, bigDecimalField3, bigDecimalField4, bigDecimalField7, bigDecimalField8, bigDecimalField14, bigDecimalField17);
        java.sql.Date date19 = null;
        java.sql.Date date20 = null;
        org.jooq.Field<java.lang.Integer> intField21 = org.jooq.impl.DSL.dateDiff(date19, date20);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField22 = org.jooq.impl.DSL.trunc(bigDecimalField7, intField21);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField23 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction25 = org.jooq.impl.DSL.listAgg(bigDecimalField23, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField26 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField27 = org.jooq.impl.DSL.acos(bigDecimalField26);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction28 = org.jooq.impl.DSL.regrSXY(bigDecimalField23, bigDecimalField26);
        org.jooq.Field<java.lang.Integer> intField29 = null;
        org.jooq.Field<java.lang.Integer> intField30 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table31 = org.jooq.impl.DSL.generateSeries(intField29, intField30);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField32 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField33 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction35 = org.jooq.impl.DSL.listAgg(bigDecimalField33, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField36 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField37 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction39 = org.jooq.impl.DSL.listAgg(bigDecimalField37, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField40 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField41 = org.jooq.impl.DSL.acos(bigDecimalField40);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction42 = org.jooq.impl.DSL.regrSXY(bigDecimalField37, bigDecimalField40);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField43 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction45 = org.jooq.impl.DSL.listAgg(bigDecimalField43, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField46 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_47 = org.jooq.impl.DSL.insertInto(intRecord1Table31, bigDecimalField32, bigDecimalField33, bigDecimalField36, bigDecimalField37, bigDecimalField43, bigDecimalField46);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField48 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction50 = org.jooq.impl.DSL.listAgg(bigDecimalField48, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField51 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField52 = org.jooq.impl.DSL.acos(bigDecimalField51);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction53 = org.jooq.impl.DSL.regrSXY(bigDecimalField48, bigDecimalField51);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField54 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction56 = org.jooq.impl.DSL.listAgg(bigDecimalField54, "");
        org.jooq.Field<java.lang.String> strField57 = null;
        org.jooq.Field<java.lang.Integer> intField58 = null;
        org.jooq.Field<java.lang.Integer> intField59 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table60 = org.jooq.impl.DSL.generateSeries(intField58, intField59);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField61 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField62 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction64 = org.jooq.impl.DSL.listAgg(bigDecimalField62, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField65 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField66 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction68 = org.jooq.impl.DSL.listAgg(bigDecimalField66, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField69 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField70 = org.jooq.impl.DSL.acos(bigDecimalField69);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction71 = org.jooq.impl.DSL.regrSXY(bigDecimalField66, bigDecimalField69);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField72 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction74 = org.jooq.impl.DSL.listAgg(bigDecimalField72, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField75 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_76 = org.jooq.impl.DSL.insertInto(intRecord1Table60, bigDecimalField61, bigDecimalField62, bigDecimalField65, bigDecimalField66, bigDecimalField72, bigDecimalField75);
        org.jooq.Field<java.lang.Integer> intField77 = null;
        org.jooq.Field<java.lang.Integer> intField78 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table79 = org.jooq.impl.DSL.generateSeries(intField77, intField78);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField80 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField81 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction83 = org.jooq.impl.DSL.listAgg(bigDecimalField81, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField84 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField85 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction87 = org.jooq.impl.DSL.listAgg(bigDecimalField85, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField88 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField89 = org.jooq.impl.DSL.acos(bigDecimalField88);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction90 = org.jooq.impl.DSL.regrSXY(bigDecimalField85, bigDecimalField88);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField91 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction93 = org.jooq.impl.DSL.listAgg(bigDecimalField91, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField94 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_95 = org.jooq.impl.DSL.insertInto(intRecord1Table79, bigDecimalField80, bigDecimalField81, bigDecimalField84, bigDecimalField85, bigDecimalField91, bigDecimalField94);
        org.jooq.Field<java.lang.String> strField96 = org.jooq.impl.DSL.mid(strField57, bigDecimalField66, bigDecimalField91);
        org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> bigDecimalRow5_97 = org.jooq.impl.DSL.row(bigDecimalField23, bigDecimalField43, bigDecimalField51, bigDecimalField54, bigDecimalField91);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField98 = org.jooq.impl.DSL.sqrt(bigDecimalField54);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction99 = org.jooq.impl.DSL.regrSXX(bigDecimalField7, bigDecimalField98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction90);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField96);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalRow5_97);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField98);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction99);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.math.BigDecimal bigDecimal0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table3 = org.jooq.impl.DSL.generateSeries(intField1, intField2);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField5 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction7 = org.jooq.impl.DSL.listAgg(bigDecimalField5, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField9 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction11 = org.jooq.impl.DSL.listAgg(bigDecimalField9, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = org.jooq.impl.DSL.acos(bigDecimalField12);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction14 = org.jooq.impl.DSL.regrSXY(bigDecimalField9, bigDecimalField12);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction17 = org.jooq.impl.DSL.listAgg(bigDecimalField15, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField18 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_19 = org.jooq.impl.DSL.insertInto(intRecord1Table3, bigDecimalField4, bigDecimalField5, bigDecimalField8, bigDecimalField9, bigDecimalField15, bigDecimalField18);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField20 = org.jooq.impl.DSL.isnull(bigDecimal0, bigDecimalField5);
        java.math.BigDecimal bigDecimal21 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField22 = org.jooq.impl.DSL.bitOr(bigDecimalField5, bigDecimal21);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction23 = org.jooq.impl.DSL.varSamp(bigDecimalField22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction23);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.jooq.Row12<org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.InsertOnDuplicateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatSeparatorStep, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TruncateCascadeStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TruncateIdentityStep<org.jooq.Record1<java.lang.Integer>>, java.io.Serializable, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, java.lang.Object[]> intRecord1InsertFinalStepRow12_0 = null;
        org.jooq.Row12[] row12Array2 = new org.jooq.Row12[1];
        @SuppressWarnings("unchecked")
        org.jooq.Row12<org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.InsertOnDuplicateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatSeparatorStep, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TruncateCascadeStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TruncateIdentityStep<org.jooq.Record1<java.lang.Integer>>, java.io.Serializable, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, java.lang.Object[]>[] record1InsertFinalStepRow12Array3 = (org.jooq.Row12<org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.InsertOnDuplicateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatSeparatorStep, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TruncateCascadeStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TruncateIdentityStep<org.jooq.Record1<java.lang.Integer>>, java.io.Serializable, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, java.lang.Object[]>[]) row12Array2;
        record1InsertFinalStepRow12Array3[0] = intRecord1InsertFinalStepRow12_0;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record12<org.jooq.InsertFinalStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatOrderByStep, org.jooq.InsertOnDuplicateStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.GroupConcatSeparatorStep, org.jooq.SelectOptionStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TruncateCascadeStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TruncateIdentityStep<org.jooq.Record1<java.lang.Integer>>, java.io.Serializable, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, java.lang.Object[]>> record1InsertFinalStepRecord12Table6 = org.jooq.impl.DSL.values(record1InsertFinalStepRow12Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row12Array2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(record1InsertFinalStepRow12Array3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.jooq.Field<?> wildcardField1 = null;
        org.jooq.Field[] fieldArray3 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray4 = (org.jooq.Field<?>[]) fieldArray3;
        wildcardFieldArray4[0] = wildcardField1;
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction7 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray4);
        org.jooq.QueryPart queryPart8 = org.jooq.impl.DSL.queryPart("", (java.lang.Object[]) wildcardFieldArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(queryPart8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.jooq.WindowOverStep<java.lang.Integer> intWindowOverStep0 = org.jooq.impl.DSL.rowNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intWindowOverStep0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.jooq.Condition condition0 = org.jooq.impl.DSL.falseCondition();
        org.jooq.Field<java.lang.Boolean> booleanField1 = org.jooq.impl.DSL.field(condition0);
        org.jooq.AggregateFunction<java.lang.Boolean> booleanAggregateFunction2 = org.jooq.impl.DSL.every(booleanField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(condition0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanAggregateFunction2);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.lower("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.jooq.Field<java.lang.String> strField2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table5 = org.jooq.impl.DSL.generateSeries(intField3, intField4);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField6 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField7 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction9 = org.jooq.impl.DSL.listAgg(bigDecimalField7, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField10 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction13 = org.jooq.impl.DSL.listAgg(bigDecimalField11, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.acos(bigDecimalField14);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction16 = org.jooq.impl.DSL.regrSXY(bigDecimalField11, bigDecimalField14);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField17 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction19 = org.jooq.impl.DSL.listAgg(bigDecimalField17, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField20 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_21 = org.jooq.impl.DSL.insertInto(intRecord1Table5, bigDecimalField6, bigDecimalField7, bigDecimalField10, bigDecimalField11, bigDecimalField17, bigDecimalField20);
        org.jooq.Field<java.lang.Integer> intField22 = null;
        org.jooq.Field<java.lang.Integer> intField23 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table24 = org.jooq.impl.DSL.generateSeries(intField22, intField23);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField25 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField26 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction28 = org.jooq.impl.DSL.listAgg(bigDecimalField26, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField29 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField30 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction32 = org.jooq.impl.DSL.listAgg(bigDecimalField30, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField33 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField34 = org.jooq.impl.DSL.acos(bigDecimalField33);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction35 = org.jooq.impl.DSL.regrSXY(bigDecimalField30, bigDecimalField33);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField36 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction38 = org.jooq.impl.DSL.listAgg(bigDecimalField36, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField39 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_40 = org.jooq.impl.DSL.insertInto(intRecord1Table24, bigDecimalField25, bigDecimalField26, bigDecimalField29, bigDecimalField30, bigDecimalField36, bigDecimalField39);
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.mid(strField2, bigDecimalField11, bigDecimalField36);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField42 = org.jooq.impl.DSL.power((java.lang.Number) (short) 0, bigDecimalField36);
        org.jooq.Field<java.lang.String> strField43 = org.jooq.impl.DSL.right("hi!", bigDecimalField36);
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.rpad(strField43, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField45);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.math.BigDecimal bigDecimal0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table3 = org.jooq.impl.DSL.generateSeries(intField1, intField2);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField5 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction7 = org.jooq.impl.DSL.listAgg(bigDecimalField5, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField9 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction11 = org.jooq.impl.DSL.listAgg(bigDecimalField9, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = org.jooq.impl.DSL.acos(bigDecimalField12);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction14 = org.jooq.impl.DSL.regrSXY(bigDecimalField9, bigDecimalField12);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction17 = org.jooq.impl.DSL.listAgg(bigDecimalField15, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField18 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_19 = org.jooq.impl.DSL.insertInto(intRecord1Table3, bigDecimalField4, bigDecimalField5, bigDecimalField8, bigDecimalField9, bigDecimalField15, bigDecimalField18);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField20 = org.jooq.impl.DSL.isnull(bigDecimal0, bigDecimalField5);
        java.math.BigDecimal bigDecimal21 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField22 = org.jooq.impl.DSL.bitOr(bigDecimalField5, bigDecimal21);
        java.math.BigDecimal bigDecimal23 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField24 = org.jooq.impl.DSL.coalesce(bigDecimalField5, bigDecimal23);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction25 = org.jooq.impl.DSL.max(bigDecimalField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction25);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.jooq.Row1<java.lang.Comparable<java.lang.String>> strComparableRow1_0 = null;
        org.jooq.Row1[] row1Array2 = new org.jooq.Row1[1];
        @SuppressWarnings("unchecked")
        org.jooq.Row1<java.lang.Comparable<java.lang.String>>[] strComparableRow1Array3 = (org.jooq.Row1<java.lang.Comparable<java.lang.String>>[]) row1Array2;
        strComparableRow1Array3[0] = strComparableRow1_0;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record1<java.lang.Comparable<java.lang.String>>> strComparableRecord1Table6 = org.jooq.impl.DSL.values(strComparableRow1Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row1Array2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strComparableRow1Array3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.octetLength("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.jooq.Field<java.lang.String> strField2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table5 = org.jooq.impl.DSL.generateSeries(intField3, intField4);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField6 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField7 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction9 = org.jooq.impl.DSL.listAgg(bigDecimalField7, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField10 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction13 = org.jooq.impl.DSL.listAgg(bigDecimalField11, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.acos(bigDecimalField14);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction16 = org.jooq.impl.DSL.regrSXY(bigDecimalField11, bigDecimalField14);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField17 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction19 = org.jooq.impl.DSL.listAgg(bigDecimalField17, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField20 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_21 = org.jooq.impl.DSL.insertInto(intRecord1Table5, bigDecimalField6, bigDecimalField7, bigDecimalField10, bigDecimalField11, bigDecimalField17, bigDecimalField20);
        org.jooq.Field<java.lang.Integer> intField22 = null;
        org.jooq.Field<java.lang.Integer> intField23 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table24 = org.jooq.impl.DSL.generateSeries(intField22, intField23);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField25 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField26 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction28 = org.jooq.impl.DSL.listAgg(bigDecimalField26, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField29 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField30 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction32 = org.jooq.impl.DSL.listAgg(bigDecimalField30, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField33 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField34 = org.jooq.impl.DSL.acos(bigDecimalField33);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction35 = org.jooq.impl.DSL.regrSXY(bigDecimalField30, bigDecimalField33);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField36 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction38 = org.jooq.impl.DSL.listAgg(bigDecimalField36, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField39 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_40 = org.jooq.impl.DSL.insertInto(intRecord1Table24, bigDecimalField25, bigDecimalField26, bigDecimalField29, bigDecimalField30, bigDecimalField36, bigDecimalField39);
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.mid(strField2, bigDecimalField11, bigDecimalField36);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField42 = org.jooq.impl.DSL.power((java.lang.Number) (short) 0, bigDecimalField36);
        org.jooq.Field<java.lang.String> strField43 = org.jooq.impl.DSL.right("hi!", bigDecimalField36);
        org.jooq.Field<java.lang.String> strField45 = org.jooq.impl.DSL.escape(strField43, '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField45);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.generateSeries(intField0, intField1);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField3 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction6 = org.jooq.impl.DSL.listAgg(bigDecimalField4, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField7 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction10 = org.jooq.impl.DSL.listAgg(bigDecimalField8, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = org.jooq.impl.DSL.acos(bigDecimalField11);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction13 = org.jooq.impl.DSL.regrSXY(bigDecimalField8, bigDecimalField11);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction16 = org.jooq.impl.DSL.listAgg(bigDecimalField14, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField17 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_18 = org.jooq.impl.DSL.insertInto(intRecord1Table2, bigDecimalField3, bigDecimalField4, bigDecimalField7, bigDecimalField8, bigDecimalField14, bigDecimalField17);
        org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal> bigDecimalWindowIgnoreNullsStep19 = org.jooq.impl.DSL.lag(bigDecimalField14);
        org.jooq.Field[] fieldArray21 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray22 = (org.jooq.Field<?>[]) fieldArray21;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField23 = org.jooq.impl.DSL.coalesce(bigDecimalField14, (org.jooq.Field<?>[]) fieldArray21);
        org.jooq.Field<java.lang.Integer> intField24 = org.jooq.impl.DSL.sign(bigDecimalField14);
        org.jooq.Field<java.lang.Integer> intField25 = null;
        org.jooq.Field<java.lang.Integer> intField26 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table27 = org.jooq.impl.DSL.generateSeries(intField25, intField26);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField28 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField29 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction31 = org.jooq.impl.DSL.listAgg(bigDecimalField29, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField32 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField33 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction35 = org.jooq.impl.DSL.listAgg(bigDecimalField33, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField36 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField37 = org.jooq.impl.DSL.acos(bigDecimalField36);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction38 = org.jooq.impl.DSL.regrSXY(bigDecimalField33, bigDecimalField36);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField39 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction41 = org.jooq.impl.DSL.listAgg(bigDecimalField39, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField42 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_43 = org.jooq.impl.DSL.insertInto(intRecord1Table27, bigDecimalField28, bigDecimalField29, bigDecimalField32, bigDecimalField33, bigDecimalField39, bigDecimalField42);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction44 = org.jooq.impl.DSL.regrR2(bigDecimalField14, bigDecimalField33);
        java.math.BigDecimal bigDecimal45 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField46 = org.jooq.impl.DSL.bitAnd(bigDecimalField33, bigDecimal45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalWindowIgnoreNullsStep19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField46);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.jooq.Row12[] row12Array1 = new org.jooq.Row12[0];
        @SuppressWarnings("unchecked")
        org.jooq.Row12<org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.DropViewFinalStep, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String, org.jooq.GroupConcatOrderByStep, org.jooq.Keyword, org.jooq.WindowOverStep<java.math.BigDecimal>>[] record1SelectHavingStepRow12Array2 = (org.jooq.Row12<org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.DropViewFinalStep, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String, org.jooq.GroupConcatOrderByStep, org.jooq.Keyword, org.jooq.WindowOverStep<java.math.BigDecimal>>[]) row12Array1;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record12<org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.DropViewFinalStep, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String, org.jooq.GroupConcatOrderByStep, org.jooq.Keyword, org.jooq.WindowOverStep<java.math.BigDecimal>>> record1SelectHavingStepRecord12Table3 = org.jooq.impl.DSL.values((org.jooq.Row12<org.jooq.SelectHavingStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal>, org.jooq.WindowSpecificationRowsAndStep, org.jooq.SelectConnectByStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.WithAsStep, org.jooq.DropViewFinalStep, org.jooq.SelectWindowStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.SelectForUpdateStep<org.jooq.Record1<java.lang.Integer>>, java.lang.String, org.jooq.GroupConcatOrderByStep, org.jooq.Keyword, org.jooq.WindowOverStep<java.math.BigDecimal>>[]) row12Array1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row12Array1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(record1SelectHavingStepRow12Array2);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression0 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray2 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked")
        org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray3 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray2;
        wildcardCommonTableExpressionArray3[0] = wildcardCommonTableExpression0;
        org.jooq.WithStep withStep6 = org.jooq.impl.DSL.withRecursive(wildcardCommonTableExpressionArray3);
        org.jooq.WithStep withStep7 = org.jooq.impl.DSL.withRecursive(wildcardCommonTableExpressionArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(commonTableExpressionArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(withStep6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(withStep7);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.jooq.SortField[] sortFieldArray2 = new org.jooq.SortField[0];
        @SuppressWarnings("unchecked")
        org.jooq.SortField<?>[] wildcardSortFieldArray3 = (org.jooq.SortField<?>[]) sortFieldArray2;
        org.jooq.WindowSpecificationRowsStep windowSpecificationRowsStep4 = org.jooq.impl.DSL.orderBy((org.jooq.SortField<?>[]) sortFieldArray2);
        org.jooq.Table<org.jooq.Record> recordTable5 = org.jooq.impl.DSL.table("hi!", (org.jooq.QueryPart[]) sortFieldArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sortFieldArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardSortFieldArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationRowsStep4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordTable5);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.jooq.Field<java.sql.Timestamp> timestampField1 = org.jooq.impl.DSL.timestamp("");
        org.jooq.Field<java.lang.String> strField2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table5 = org.jooq.impl.DSL.generateSeries(intField3, intField4);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField6 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField7 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction9 = org.jooq.impl.DSL.listAgg(bigDecimalField7, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField10 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction13 = org.jooq.impl.DSL.listAgg(bigDecimalField11, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.acos(bigDecimalField14);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction16 = org.jooq.impl.DSL.regrSXY(bigDecimalField11, bigDecimalField14);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField17 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction19 = org.jooq.impl.DSL.listAgg(bigDecimalField17, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField20 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_21 = org.jooq.impl.DSL.insertInto(intRecord1Table5, bigDecimalField6, bigDecimalField7, bigDecimalField10, bigDecimalField11, bigDecimalField17, bigDecimalField20);
        org.jooq.Field<java.lang.Integer> intField22 = null;
        org.jooq.Field<java.lang.Integer> intField23 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table24 = org.jooq.impl.DSL.generateSeries(intField22, intField23);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField25 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField26 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction28 = org.jooq.impl.DSL.listAgg(bigDecimalField26, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField29 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField30 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction32 = org.jooq.impl.DSL.listAgg(bigDecimalField30, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField33 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField34 = org.jooq.impl.DSL.acos(bigDecimalField33);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction35 = org.jooq.impl.DSL.regrSXY(bigDecimalField30, bigDecimalField33);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField36 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction38 = org.jooq.impl.DSL.listAgg(bigDecimalField36, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField39 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_40 = org.jooq.impl.DSL.insertInto(intRecord1Table24, bigDecimalField25, bigDecimalField26, bigDecimalField29, bigDecimalField30, bigDecimalField36, bigDecimalField39);
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.mid(strField2, bigDecimalField11, bigDecimalField36);
        org.jooq.Field<java.sql.Timestamp> timestampField42 = org.jooq.impl.DSL.timestampAdd(timestampField1, bigDecimalField11);
        org.jooq.Field<java.lang.Integer> intField43 = null;
        org.jooq.Field<java.lang.Integer> intField44 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table45 = org.jooq.impl.DSL.generateSeries(intField43, intField44);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField46 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField47 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction49 = org.jooq.impl.DSL.listAgg(bigDecimalField47, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField50 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField51 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction53 = org.jooq.impl.DSL.listAgg(bigDecimalField51, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField54 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField55 = org.jooq.impl.DSL.acos(bigDecimalField54);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction56 = org.jooq.impl.DSL.regrSXY(bigDecimalField51, bigDecimalField54);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField57 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction59 = org.jooq.impl.DSL.listAgg(bigDecimalField57, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField60 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_61 = org.jooq.impl.DSL.insertInto(intRecord1Table45, bigDecimalField46, bigDecimalField47, bigDecimalField50, bigDecimalField51, bigDecimalField57, bigDecimalField60);
        org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal> bigDecimalWindowIgnoreNullsStep62 = org.jooq.impl.DSL.lag(bigDecimalField57);
        org.jooq.Field[] fieldArray64 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray65 = (org.jooq.Field<?>[]) fieldArray64;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField66 = org.jooq.impl.DSL.coalesce(bigDecimalField57, (org.jooq.Field<?>[]) fieldArray64);
        org.jooq.Field<java.lang.Integer> intField67 = org.jooq.impl.DSL.sign(bigDecimalField57);
        org.jooq.Field<java.lang.Integer> intField68 = null;
        org.jooq.Field<java.lang.Integer> intField69 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table70 = org.jooq.impl.DSL.generateSeries(intField68, intField69);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField71 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField72 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction74 = org.jooq.impl.DSL.listAgg(bigDecimalField72, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField75 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField76 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction78 = org.jooq.impl.DSL.listAgg(bigDecimalField76, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField79 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField80 = org.jooq.impl.DSL.acos(bigDecimalField79);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction81 = org.jooq.impl.DSL.regrSXY(bigDecimalField76, bigDecimalField79);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField82 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction84 = org.jooq.impl.DSL.listAgg(bigDecimalField82, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField85 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_86 = org.jooq.impl.DSL.insertInto(intRecord1Table70, bigDecimalField71, bigDecimalField72, bigDecimalField75, bigDecimalField76, bigDecimalField82, bigDecimalField85);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction87 = org.jooq.impl.DSL.regrR2(bigDecimalField57, bigDecimalField76);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField88 = org.jooq.impl.DSL.connectByRoot(bigDecimalField57);
        org.jooq.Field<java.sql.Timestamp> timestampField89 = org.jooq.impl.DSL.timestampAdd(timestampField1, bigDecimalField88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalWindowIgnoreNullsStep62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_86);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField89);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.jooq.Field<java.lang.String> strField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table3 = org.jooq.impl.DSL.generateSeries(intField1, intField2);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField5 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction7 = org.jooq.impl.DSL.listAgg(bigDecimalField5, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField9 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction11 = org.jooq.impl.DSL.listAgg(bigDecimalField9, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = org.jooq.impl.DSL.acos(bigDecimalField12);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction14 = org.jooq.impl.DSL.regrSXY(bigDecimalField9, bigDecimalField12);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction17 = org.jooq.impl.DSL.listAgg(bigDecimalField15, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField18 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_19 = org.jooq.impl.DSL.insertInto(intRecord1Table3, bigDecimalField4, bigDecimalField5, bigDecimalField8, bigDecimalField9, bigDecimalField15, bigDecimalField18);
        org.jooq.Field<java.lang.Integer> intField20 = null;
        org.jooq.Field<java.lang.Integer> intField21 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table22 = org.jooq.impl.DSL.generateSeries(intField20, intField21);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField23 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField24 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction26 = org.jooq.impl.DSL.listAgg(bigDecimalField24, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField27 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField28 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction30 = org.jooq.impl.DSL.listAgg(bigDecimalField28, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField31 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField32 = org.jooq.impl.DSL.acos(bigDecimalField31);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction33 = org.jooq.impl.DSL.regrSXY(bigDecimalField28, bigDecimalField31);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField34 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction36 = org.jooq.impl.DSL.listAgg(bigDecimalField34, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField37 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_38 = org.jooq.impl.DSL.insertInto(intRecord1Table22, bigDecimalField23, bigDecimalField24, bigDecimalField27, bigDecimalField28, bigDecimalField34, bigDecimalField37);
        org.jooq.Field<java.lang.String> strField39 = org.jooq.impl.DSL.mid(strField0, bigDecimalField9, bigDecimalField34);
        org.jooq.Field<java.lang.String> strField40 = org.jooq.impl.DSL.rtrim(strField0);
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.rpad(strField40, 10);
        org.jooq.Field<java.lang.Integer> intField43 = null;
        org.jooq.Field<java.lang.Integer> intField44 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table45 = org.jooq.impl.DSL.generateSeries(intField43, intField44);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField46 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField47 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction49 = org.jooq.impl.DSL.listAgg(bigDecimalField47, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField50 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField51 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction53 = org.jooq.impl.DSL.listAgg(bigDecimalField51, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField54 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField55 = org.jooq.impl.DSL.acos(bigDecimalField54);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction56 = org.jooq.impl.DSL.regrSXY(bigDecimalField51, bigDecimalField54);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField57 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction59 = org.jooq.impl.DSL.listAgg(bigDecimalField57, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField60 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_61 = org.jooq.impl.DSL.insertInto(intRecord1Table45, bigDecimalField46, bigDecimalField47, bigDecimalField50, bigDecimalField51, bigDecimalField57, bigDecimalField60);
        org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal> bigDecimalWindowIgnoreNullsStep62 = org.jooq.impl.DSL.lag(bigDecimalField57);
        org.jooq.Field[] fieldArray64 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray65 = (org.jooq.Field<?>[]) fieldArray64;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField66 = org.jooq.impl.DSL.coalesce(bigDecimalField57, (org.jooq.Field<?>[]) fieldArray64);
        org.jooq.Field<java.lang.String> strField67 = org.jooq.impl.DSL.lpad(strField40, bigDecimalField57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalWindowIgnoreNullsStep62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField67);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.acos((java.lang.Number) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField0 = org.jooq.impl.DSL.pi();
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction1 = org.jooq.impl.DSL.median(bigDecimalField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.math.BigDecimal bigDecimal0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table3 = org.jooq.impl.DSL.generateSeries(intField1, intField2);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField5 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction7 = org.jooq.impl.DSL.listAgg(bigDecimalField5, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField9 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction11 = org.jooq.impl.DSL.listAgg(bigDecimalField9, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = org.jooq.impl.DSL.acos(bigDecimalField12);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction14 = org.jooq.impl.DSL.regrSXY(bigDecimalField9, bigDecimalField12);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction17 = org.jooq.impl.DSL.listAgg(bigDecimalField15, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField18 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_19 = org.jooq.impl.DSL.insertInto(intRecord1Table3, bigDecimalField4, bigDecimalField5, bigDecimalField8, bigDecimalField9, bigDecimalField15, bigDecimalField18);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField20 = org.jooq.impl.DSL.isnull(bigDecimal0, bigDecimalField5);
        java.math.BigDecimal bigDecimal21 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField22 = org.jooq.impl.DSL.bitOr(bigDecimalField5, bigDecimal21);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField23 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction25 = org.jooq.impl.DSL.listAgg(bigDecimalField23, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField26 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField27 = org.jooq.impl.DSL.acos(bigDecimalField26);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction28 = org.jooq.impl.DSL.regrSXY(bigDecimalField23, bigDecimalField26);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField29 = org.jooq.impl.DSL.nvl(bigDecimalField22, bigDecimalField26);
        java.math.BigDecimal bigDecimal30 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField31 = org.jooq.impl.DSL.isnull(bigDecimalField26, bigDecimal30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField31);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.generateSeries(intField0, intField1);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField3 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction6 = org.jooq.impl.DSL.listAgg(bigDecimalField4, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField7 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction10 = org.jooq.impl.DSL.listAgg(bigDecimalField8, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = org.jooq.impl.DSL.acos(bigDecimalField11);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction13 = org.jooq.impl.DSL.regrSXY(bigDecimalField8, bigDecimalField11);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction16 = org.jooq.impl.DSL.listAgg(bigDecimalField14, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField17 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_18 = org.jooq.impl.DSL.insertInto(intRecord1Table2, bigDecimalField3, bigDecimalField4, bigDecimalField7, bigDecimalField8, bigDecimalField14, bigDecimalField17);
        org.jooq.Field<java.sql.Timestamp> timestampField20 = org.jooq.impl.DSL.timestamp("");
        org.jooq.Field<java.lang.String> strField21 = null;
        org.jooq.Field<java.lang.Integer> intField22 = null;
        org.jooq.Field<java.lang.Integer> intField23 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table24 = org.jooq.impl.DSL.generateSeries(intField22, intField23);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField25 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField26 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction28 = org.jooq.impl.DSL.listAgg(bigDecimalField26, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField29 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField30 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction32 = org.jooq.impl.DSL.listAgg(bigDecimalField30, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField33 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField34 = org.jooq.impl.DSL.acos(bigDecimalField33);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction35 = org.jooq.impl.DSL.regrSXY(bigDecimalField30, bigDecimalField33);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField36 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction38 = org.jooq.impl.DSL.listAgg(bigDecimalField36, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField39 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_40 = org.jooq.impl.DSL.insertInto(intRecord1Table24, bigDecimalField25, bigDecimalField26, bigDecimalField29, bigDecimalField30, bigDecimalField36, bigDecimalField39);
        org.jooq.Field<java.lang.Integer> intField41 = null;
        org.jooq.Field<java.lang.Integer> intField42 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table43 = org.jooq.impl.DSL.generateSeries(intField41, intField42);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField44 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField45 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction47 = org.jooq.impl.DSL.listAgg(bigDecimalField45, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField48 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField49 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction51 = org.jooq.impl.DSL.listAgg(bigDecimalField49, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField52 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField53 = org.jooq.impl.DSL.acos(bigDecimalField52);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction54 = org.jooq.impl.DSL.regrSXY(bigDecimalField49, bigDecimalField52);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField55 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction57 = org.jooq.impl.DSL.listAgg(bigDecimalField55, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField58 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_59 = org.jooq.impl.DSL.insertInto(intRecord1Table43, bigDecimalField44, bigDecimalField45, bigDecimalField48, bigDecimalField49, bigDecimalField55, bigDecimalField58);
        org.jooq.Field<java.lang.String> strField60 = org.jooq.impl.DSL.mid(strField21, bigDecimalField30, bigDecimalField55);
        org.jooq.Field<java.sql.Timestamp> timestampField61 = org.jooq.impl.DSL.timestampAdd(timestampField20, bigDecimalField30);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField62 = org.jooq.impl.DSL.bitXNor(bigDecimalField14, bigDecimalField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField62);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.Date date0 = null;
        org.jooq.DatePart datePart1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = org.jooq.impl.DSL.extract(date0, datePart1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField2);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField0 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.sin(bigDecimalField0);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.log((java.lang.Number) 10L, (int) (short) 10);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction5 = org.jooq.impl.DSL.regrAvgX(bigDecimalField0, bigDecimalField4);
        org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal> bigDecimalWindowIgnoreNullsStep6 = org.jooq.impl.DSL.firstValue((org.jooq.Field<java.math.BigDecimal>) bigDecimalAggregateFunction5);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField7 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction9 = org.jooq.impl.DSL.listAgg(bigDecimalField7, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField10 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = org.jooq.impl.DSL.acos(bigDecimalField10);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction12 = org.jooq.impl.DSL.regrSXY(bigDecimalField7, bigDecimalField10);
        org.jooq.Field<java.lang.Integer> intField13 = null;
        org.jooq.Field<java.lang.Integer> intField14 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table15 = org.jooq.impl.DSL.generateSeries(intField13, intField14);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField16 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField17 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction19 = org.jooq.impl.DSL.listAgg(bigDecimalField17, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField20 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField21 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction23 = org.jooq.impl.DSL.listAgg(bigDecimalField21, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField24 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField25 = org.jooq.impl.DSL.acos(bigDecimalField24);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction26 = org.jooq.impl.DSL.regrSXY(bigDecimalField21, bigDecimalField24);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField27 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction29 = org.jooq.impl.DSL.listAgg(bigDecimalField27, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField30 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_31 = org.jooq.impl.DSL.insertInto(intRecord1Table15, bigDecimalField16, bigDecimalField17, bigDecimalField20, bigDecimalField21, bigDecimalField27, bigDecimalField30);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField32 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction34 = org.jooq.impl.DSL.listAgg(bigDecimalField32, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField35 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField36 = org.jooq.impl.DSL.acos(bigDecimalField35);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction37 = org.jooq.impl.DSL.regrSXY(bigDecimalField32, bigDecimalField35);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField38 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction40 = org.jooq.impl.DSL.listAgg(bigDecimalField38, "");
        org.jooq.Field<java.lang.String> strField41 = null;
        org.jooq.Field<java.lang.Integer> intField42 = null;
        org.jooq.Field<java.lang.Integer> intField43 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table44 = org.jooq.impl.DSL.generateSeries(intField42, intField43);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField45 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField46 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction48 = org.jooq.impl.DSL.listAgg(bigDecimalField46, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField49 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField50 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction52 = org.jooq.impl.DSL.listAgg(bigDecimalField50, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField53 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField54 = org.jooq.impl.DSL.acos(bigDecimalField53);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction55 = org.jooq.impl.DSL.regrSXY(bigDecimalField50, bigDecimalField53);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField56 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction58 = org.jooq.impl.DSL.listAgg(bigDecimalField56, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField59 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_60 = org.jooq.impl.DSL.insertInto(intRecord1Table44, bigDecimalField45, bigDecimalField46, bigDecimalField49, bigDecimalField50, bigDecimalField56, bigDecimalField59);
        org.jooq.Field<java.lang.Integer> intField61 = null;
        org.jooq.Field<java.lang.Integer> intField62 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table63 = org.jooq.impl.DSL.generateSeries(intField61, intField62);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField64 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField65 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction67 = org.jooq.impl.DSL.listAgg(bigDecimalField65, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField68 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField69 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction71 = org.jooq.impl.DSL.listAgg(bigDecimalField69, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField72 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField73 = org.jooq.impl.DSL.acos(bigDecimalField72);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction74 = org.jooq.impl.DSL.regrSXY(bigDecimalField69, bigDecimalField72);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField75 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction77 = org.jooq.impl.DSL.listAgg(bigDecimalField75, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField78 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_79 = org.jooq.impl.DSL.insertInto(intRecord1Table63, bigDecimalField64, bigDecimalField65, bigDecimalField68, bigDecimalField69, bigDecimalField75, bigDecimalField78);
        org.jooq.Field<java.lang.String> strField80 = org.jooq.impl.DSL.mid(strField41, bigDecimalField50, bigDecimalField75);
        org.jooq.Row5<java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> bigDecimalRow5_81 = org.jooq.impl.DSL.row(bigDecimalField7, bigDecimalField27, bigDecimalField35, bigDecimalField38, bigDecimalField75);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField82 = org.jooq.impl.DSL.bitXor((org.jooq.Field<java.math.BigDecimal>) bigDecimalAggregateFunction5, bigDecimalField27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalWindowIgnoreNullsStep6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalRow5_81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField82);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.reverse("hi!");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.md5(strField1);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.atan((java.lang.Number) 1.0f);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.left(strField1, bigDecimalField4);
        java.math.BigDecimal bigDecimal6 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField7 = org.jooq.impl.DSL.nullif(bigDecimalField4, bigDecimal6);
        java.math.BigDecimal bigDecimal8 = null;
        org.jooq.Field<java.lang.Integer> intField9 = null;
        org.jooq.Field<java.lang.Integer> intField10 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table11 = org.jooq.impl.DSL.generateSeries(intField9, intField10);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction15 = org.jooq.impl.DSL.listAgg(bigDecimalField13, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField16 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField17 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction19 = org.jooq.impl.DSL.listAgg(bigDecimalField17, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField20 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField21 = org.jooq.impl.DSL.acos(bigDecimalField20);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction22 = org.jooq.impl.DSL.regrSXY(bigDecimalField17, bigDecimalField20);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField23 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction25 = org.jooq.impl.DSL.listAgg(bigDecimalField23, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField26 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_27 = org.jooq.impl.DSL.insertInto(intRecord1Table11, bigDecimalField12, bigDecimalField13, bigDecimalField16, bigDecimalField17, bigDecimalField23, bigDecimalField26);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField28 = org.jooq.impl.DSL.isnull(bigDecimal8, bigDecimalField13);
        java.math.BigDecimal bigDecimal29 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField30 = org.jooq.impl.DSL.bitOr(bigDecimalField13, bigDecimal29);
        java.math.BigDecimal bigDecimal31 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField32 = org.jooq.impl.DSL.coalesce(bigDecimalField13, bigDecimal31);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction33 = org.jooq.impl.DSL.regrAvgX(bigDecimalField7, bigDecimalField32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction33);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.jooq.Field<java.lang.Integer> intField0 = org.jooq.impl.DSL.level();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.year(date0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.jooq.Field<java.lang.Integer> intField1 = org.jooq.impl.DSL.sign((java.lang.Number) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.jooq.Field<?> wildcardField1 = null;
        org.jooq.Field[] fieldArray3 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray4 = (org.jooq.Field<?>[]) fieldArray3;
        wildcardFieldArray4[0] = wildcardField1;
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction7 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray4);
        org.jooq.Query query8 = org.jooq.impl.DSL.query("hi!", (org.jooq.QueryPart[]) wildcardFieldArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.WindowSpecificationOrderByStep windowSpecificationOrderByStep9 = org.jooq.impl.DSL.orderBy(wildcardFieldArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(query8);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table3 = org.jooq.impl.DSL.generateSeries(intField1, intField2);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField5 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction7 = org.jooq.impl.DSL.listAgg(bigDecimalField5, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField9 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction11 = org.jooq.impl.DSL.listAgg(bigDecimalField9, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = org.jooq.impl.DSL.acos(bigDecimalField12);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction14 = org.jooq.impl.DSL.regrSXY(bigDecimalField9, bigDecimalField12);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction17 = org.jooq.impl.DSL.listAgg(bigDecimalField15, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField18 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_19 = org.jooq.impl.DSL.insertInto(intRecord1Table3, bigDecimalField4, bigDecimalField5, bigDecimalField8, bigDecimalField9, bigDecimalField15, bigDecimalField18);
        org.jooq.Field<java.lang.String> strField20 = org.jooq.impl.DSL.repeat("hi!", bigDecimalField15);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction21 = org.jooq.impl.DSL.min(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction21);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectZero();
        org.jooq.SelectDistinctOnStep[] selectDistinctOnStepArray2 = new org.jooq.SelectDistinctOnStep[0];
        @SuppressWarnings("unchecked")
        org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>[] intRecord1SelectDistinctOnStepArray3 = (org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>[]) selectDistinctOnStepArray2;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Field<org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>> intRecord1SelectDistinctOnStepField4 = org.jooq.impl.DSL.greatest((org.jooq.SelectDistinctOnStep<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep0, intRecord1SelectDistinctOnStepArray3);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(selectDistinctOnStepArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1SelectDistinctOnStepArray3);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.jooq.SortField[] sortFieldArray1 = new org.jooq.SortField[0];
        @SuppressWarnings("unchecked")
        org.jooq.SortField<?>[] wildcardSortFieldArray2 = (org.jooq.SortField<?>[]) sortFieldArray1;
        org.jooq.WindowSpecificationRowsStep windowSpecificationRowsStep3 = org.jooq.impl.DSL.orderBy((org.jooq.SortField<?>[]) sortFieldArray1);
        org.jooq.SortField[] sortFieldArray5 = new org.jooq.SortField[0];
        @SuppressWarnings("unchecked")
        org.jooq.SortField<?>[] wildcardSortFieldArray6 = (org.jooq.SortField<?>[]) sortFieldArray5;
        org.jooq.WindowSpecificationRowsStep windowSpecificationRowsStep7 = org.jooq.impl.DSL.orderBy((org.jooq.SortField<?>[]) sortFieldArray5);
        org.jooq.SortField[] sortFieldArray9 = new org.jooq.SortField[0];
        @SuppressWarnings("unchecked")
        org.jooq.SortField<?>[] wildcardSortFieldArray10 = (org.jooq.SortField<?>[]) sortFieldArray9;
        org.jooq.WindowSpecificationRowsStep windowSpecificationRowsStep11 = org.jooq.impl.DSL.orderBy((org.jooq.SortField<?>[]) sortFieldArray9);
        org.jooq.SortField[] sortFieldArray13 = new org.jooq.SortField[0];
        @SuppressWarnings("unchecked")
        org.jooq.SortField<?>[] wildcardSortFieldArray14 = (org.jooq.SortField<?>[]) sortFieldArray13;
        org.jooq.WindowSpecificationRowsStep windowSpecificationRowsStep15 = org.jooq.impl.DSL.orderBy((org.jooq.SortField<?>[]) sortFieldArray13);
        org.jooq.SortField[] sortFieldArray17 = new org.jooq.SortField[0];
        @SuppressWarnings("unchecked")
        org.jooq.SortField<?>[] wildcardSortFieldArray18 = (org.jooq.SortField<?>[]) sortFieldArray17;
        org.jooq.WindowSpecificationRowsStep windowSpecificationRowsStep19 = org.jooq.impl.DSL.orderBy((org.jooq.SortField<?>[]) sortFieldArray17);
        org.jooq.SortField[] sortFieldArray21 = new org.jooq.SortField[0];
        @SuppressWarnings("unchecked")
        org.jooq.SortField<?>[] wildcardSortFieldArray22 = (org.jooq.SortField<?>[]) sortFieldArray21;
        org.jooq.WindowSpecificationRowsStep windowSpecificationRowsStep23 = org.jooq.impl.DSL.orderBy((org.jooq.SortField<?>[]) sortFieldArray21);
        org.jooq.WindowSpecificationRowsStep[] windowSpecificationRowsStepArray24 = new org.jooq.WindowSpecificationRowsStep[] { windowSpecificationRowsStep3, windowSpecificationRowsStep7, windowSpecificationRowsStep11, windowSpecificationRowsStep15, windowSpecificationRowsStep19, windowSpecificationRowsStep23 };
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.QuantifiedSelect<org.jooq.Record1<org.jooq.WindowSpecificationRowsStep>> windowSpecificationRowsStepRecord1QuantifiedSelect25 = org.jooq.impl.DSL.any(windowSpecificationRowsStepArray24);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type interface org.jooq.WindowSpecificationRowsStep is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sortFieldArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardSortFieldArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationRowsStep3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sortFieldArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardSortFieldArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationRowsStep7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sortFieldArray9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardSortFieldArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationRowsStep11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sortFieldArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardSortFieldArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationRowsStep15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sortFieldArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardSortFieldArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationRowsStep19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(sortFieldArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardSortFieldArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationRowsStep23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationRowsStepArray24);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.jooq.Field<?> wildcardField2 = null;
        org.jooq.Field[] fieldArray4 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray5 = (org.jooq.Field<?>[]) fieldArray4;
        wildcardFieldArray5[0] = wildcardField2;
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction8 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray5);
        org.jooq.Query query9 = org.jooq.impl.DSL.query("", (java.lang.Object[]) wildcardFieldArray5);
        org.jooq.QueryPart queryPart10 = org.jooq.impl.DSL.queryPart("", (java.lang.Object[]) wildcardFieldArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.SelectSelectStep<org.jooq.Record> recordSelectSelectStep11 = org.jooq.impl.DSL.selectDistinct((org.jooq.SelectField<?>[]) wildcardFieldArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(query9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(queryPart10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.jooq.Row13<org.jooq.AggregateFunction<java.math.BigDecimal>, org.jooq.GroupField, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal>, java.lang.Object[], org.jooq.WindowOverStep<java.math.BigDecimal>, org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal>, java.lang.Comparable<java.lang.String>, org.jooq.QueryPart, org.jooq.Field[], org.jooq.WithStep, org.jooq.WindowOverStep<java.math.BigDecimal>> bigDecimalAggregateFunctionRow13_0 = null;
        org.jooq.Row13[] row13Array2 = new org.jooq.Row13[1];
        @SuppressWarnings("unchecked")
        org.jooq.Row13<org.jooq.AggregateFunction<java.math.BigDecimal>, org.jooq.GroupField, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal>, java.lang.Object[], org.jooq.WindowOverStep<java.math.BigDecimal>, org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal>, java.lang.Comparable<java.lang.String>, org.jooq.QueryPart, org.jooq.Field[], org.jooq.WithStep, org.jooq.WindowOverStep<java.math.BigDecimal>>[] bigDecimalAggregateFunctionRow13Array3 = (org.jooq.Row13<org.jooq.AggregateFunction<java.math.BigDecimal>, org.jooq.GroupField, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal>, java.lang.Object[], org.jooq.WindowOverStep<java.math.BigDecimal>, org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal>, java.lang.Comparable<java.lang.String>, org.jooq.QueryPart, org.jooq.Field[], org.jooq.WithStep, org.jooq.WindowOverStep<java.math.BigDecimal>>[]) row13Array2;
        bigDecimalAggregateFunctionRow13Array3[0] = bigDecimalAggregateFunctionRow13_0;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record13<org.jooq.AggregateFunction<java.math.BigDecimal>, org.jooq.GroupField, org.jooq.SelectFromStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>, org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal>, java.lang.Object[], org.jooq.WindowOverStep<java.math.BigDecimal>, org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal>, java.lang.Comparable<java.lang.String>, org.jooq.QueryPart, org.jooq.Field[], org.jooq.WithStep, org.jooq.WindowOverStep<java.math.BigDecimal>>> bigDecimalAggregateFunctionRecord13Table6 = org.jooq.impl.DSL.values(bigDecimalAggregateFunctionRow13Array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(row13Array2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunctionRow13Array3);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.jooq.Condition condition0 = org.jooq.impl.DSL.trueCondition();
        org.jooq.Condition[] conditionArray1 = new org.jooq.Condition[] { condition0 };
        org.jooq.Condition condition2 = org.jooq.impl.DSL.and(conditionArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(condition0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(conditionArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(condition2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.power((java.lang.Number) (short) 1, (java.lang.Number) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.generateSeries(intField0, intField1);
        org.jooq.Field<?> wildcardField3 = null;
        org.jooq.Field[] fieldArray5 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray6 = (org.jooq.Field<?>[]) fieldArray5;
        wildcardFieldArray6[0] = wildcardField3;
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction9 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray6);
        org.jooq.CreateViewAsStep createViewAsStep10 = org.jooq.impl.DSL.createView(intRecord1Table2, wildcardFieldArray6);
        org.jooq.DropTableStep dropTableStep11 = org.jooq.impl.DSL.dropTable(intRecord1Table2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(createViewAsStep10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dropTableStep11);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.math.BigDecimal bigDecimal0 = null;
        org.jooq.Field<java.lang.String> strField2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table5 = org.jooq.impl.DSL.generateSeries(intField3, intField4);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField6 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField7 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction9 = org.jooq.impl.DSL.listAgg(bigDecimalField7, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField10 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction13 = org.jooq.impl.DSL.listAgg(bigDecimalField11, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.acos(bigDecimalField14);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction16 = org.jooq.impl.DSL.regrSXY(bigDecimalField11, bigDecimalField14);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField17 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction19 = org.jooq.impl.DSL.listAgg(bigDecimalField17, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField20 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_21 = org.jooq.impl.DSL.insertInto(intRecord1Table5, bigDecimalField6, bigDecimalField7, bigDecimalField10, bigDecimalField11, bigDecimalField17, bigDecimalField20);
        org.jooq.Field<java.lang.Integer> intField22 = null;
        org.jooq.Field<java.lang.Integer> intField23 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table24 = org.jooq.impl.DSL.generateSeries(intField22, intField23);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField25 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField26 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction28 = org.jooq.impl.DSL.listAgg(bigDecimalField26, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField29 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField30 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction32 = org.jooq.impl.DSL.listAgg(bigDecimalField30, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField33 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField34 = org.jooq.impl.DSL.acos(bigDecimalField33);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction35 = org.jooq.impl.DSL.regrSXY(bigDecimalField30, bigDecimalField33);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField36 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction38 = org.jooq.impl.DSL.listAgg(bigDecimalField36, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField39 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_40 = org.jooq.impl.DSL.insertInto(intRecord1Table24, bigDecimalField25, bigDecimalField26, bigDecimalField29, bigDecimalField30, bigDecimalField36, bigDecimalField39);
        org.jooq.Field<java.lang.String> strField41 = org.jooq.impl.DSL.mid(strField2, bigDecimalField11, bigDecimalField36);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField42 = org.jooq.impl.DSL.power((java.lang.Number) (short) 0, bigDecimalField36);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField43 = org.jooq.impl.DSL.shl(bigDecimal0, bigDecimalField42);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField44 = org.jooq.impl.DSL.cos(bigDecimalField43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField44);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.math.BigDecimal bigDecimal0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table3 = org.jooq.impl.DSL.generateSeries(intField1, intField2);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField5 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction7 = org.jooq.impl.DSL.listAgg(bigDecimalField5, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField9 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction11 = org.jooq.impl.DSL.listAgg(bigDecimalField9, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = org.jooq.impl.DSL.acos(bigDecimalField12);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction14 = org.jooq.impl.DSL.regrSXY(bigDecimalField9, bigDecimalField12);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction17 = org.jooq.impl.DSL.listAgg(bigDecimalField15, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField18 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_19 = org.jooq.impl.DSL.insertInto(intRecord1Table3, bigDecimalField4, bigDecimalField5, bigDecimalField8, bigDecimalField9, bigDecimalField15, bigDecimalField18);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField20 = org.jooq.impl.DSL.bitNand(bigDecimal0, bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField20);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.md5("hi!");
        org.jooq.Field<java.lang.String> strField3 = org.jooq.impl.DSL.escape(strField1, '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField3);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.jooq.Row11<org.jooq.InsertReturningStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.TruncateCascadeStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, org.jooq.CaseValueStep<org.jooq.Field<java.math.BigDecimal>>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.OrderedAggregateFunction<java.lang.String>, org.jooq.GroupField, org.jooq.FieldLike, org.jooq.FieldLike, org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>>[] record1InsertReturningStepRow11Array0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Table<org.jooq.Record11<org.jooq.InsertReturningStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.AlterTableStep, org.jooq.TruncateCascadeStep<org.jooq.Record1<java.lang.Integer>>, org.jooq.Row, org.jooq.CaseValueStep<org.jooq.Field<java.math.BigDecimal>>, java.lang.Iterable<org.jooq.Record1<java.lang.Integer>>, org.jooq.OrderedAggregateFunction<java.lang.String>, org.jooq.GroupField, org.jooq.FieldLike, org.jooq.FieldLike, org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal>>> record1InsertReturningStepRecord11Table1 = org.jooq.impl.DSL.values(record1InsertReturningStepRow11Array0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot create a VALUES() constructor with an empty set of rows");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.math.BigDecimal bigDecimal1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table4 = org.jooq.impl.DSL.generateSeries(intField2, intField3);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField5 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField6 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction8 = org.jooq.impl.DSL.listAgg(bigDecimalField6, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField9 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField10 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction12 = org.jooq.impl.DSL.listAgg(bigDecimalField10, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = org.jooq.impl.DSL.acos(bigDecimalField13);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction15 = org.jooq.impl.DSL.regrSXY(bigDecimalField10, bigDecimalField13);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField16 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction18 = org.jooq.impl.DSL.listAgg(bigDecimalField16, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField19 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_20 = org.jooq.impl.DSL.insertInto(intRecord1Table4, bigDecimalField5, bigDecimalField6, bigDecimalField9, bigDecimalField10, bigDecimalField16, bigDecimalField19);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField21 = org.jooq.impl.DSL.isnull(bigDecimal1, bigDecimalField6);
        java.math.BigDecimal bigDecimal22 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField23 = org.jooq.impl.DSL.bitOr(bigDecimalField6, bigDecimal22);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField24 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction26 = org.jooq.impl.DSL.listAgg(bigDecimalField24, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField27 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField28 = org.jooq.impl.DSL.acos(bigDecimalField27);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction29 = org.jooq.impl.DSL.regrSXY(bigDecimalField24, bigDecimalField27);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField30 = org.jooq.impl.DSL.nvl(bigDecimalField23, bigDecimalField27);
        org.jooq.Field<java.lang.String> strField31 = org.jooq.impl.DSL.repeat("hi!", bigDecimalField27);
        org.jooq.Field<java.lang.String> strField33 = org.jooq.impl.DSL.repeat(strField31, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField33);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField0 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.sin(bigDecimalField0);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.log((java.lang.Number) 10L, (int) (short) 10);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction5 = org.jooq.impl.DSL.regrAvgX(bigDecimalField0, bigDecimalField4);
        java.math.BigDecimal bigDecimal6 = null;
        org.jooq.Field<java.lang.Integer> intField7 = null;
        org.jooq.Field<java.lang.Integer> intField8 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table9 = org.jooq.impl.DSL.generateSeries(intField7, intField8);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField10 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction13 = org.jooq.impl.DSL.listAgg(bigDecimalField11, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction17 = org.jooq.impl.DSL.listAgg(bigDecimalField15, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField18 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField19 = org.jooq.impl.DSL.acos(bigDecimalField18);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction20 = org.jooq.impl.DSL.regrSXY(bigDecimalField15, bigDecimalField18);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField21 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction23 = org.jooq.impl.DSL.listAgg(bigDecimalField21, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField24 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_25 = org.jooq.impl.DSL.insertInto(intRecord1Table9, bigDecimalField10, bigDecimalField11, bigDecimalField14, bigDecimalField15, bigDecimalField21, bigDecimalField24);
        org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal> bigDecimalWindowIgnoreNullsStep26 = org.jooq.impl.DSL.lag(bigDecimalField21);
        org.jooq.Field[] fieldArray28 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray29 = (org.jooq.Field<?>[]) fieldArray28;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField30 = org.jooq.impl.DSL.coalesce(bigDecimalField21, (org.jooq.Field<?>[]) fieldArray28);
        org.jooq.Field<java.lang.Integer> intField31 = org.jooq.impl.DSL.sign(bigDecimalField21);
        org.jooq.Field<java.lang.Integer> intField32 = null;
        org.jooq.Field<java.lang.Integer> intField33 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table34 = org.jooq.impl.DSL.generateSeries(intField32, intField33);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField35 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField36 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction38 = org.jooq.impl.DSL.listAgg(bigDecimalField36, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField39 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField40 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction42 = org.jooq.impl.DSL.listAgg(bigDecimalField40, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField43 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField44 = org.jooq.impl.DSL.acos(bigDecimalField43);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction45 = org.jooq.impl.DSL.regrSXY(bigDecimalField40, bigDecimalField43);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField46 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction48 = org.jooq.impl.DSL.listAgg(bigDecimalField46, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField49 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_50 = org.jooq.impl.DSL.insertInto(intRecord1Table34, bigDecimalField35, bigDecimalField36, bigDecimalField39, bigDecimalField40, bigDecimalField46, bigDecimalField49);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction51 = org.jooq.impl.DSL.regrR2(bigDecimalField21, bigDecimalField40);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField52 = org.jooq.impl.DSL.connectByRoot(bigDecimalField21);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField53 = org.jooq.impl.DSL.bitXor(bigDecimal6, bigDecimalField21);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction54 = org.jooq.impl.DSL.regrR2(bigDecimalField0, bigDecimalField21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalWindowIgnoreNullsStep26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intField31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction54);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.repeat("", bigDecimalField1);
        org.jooq.Field<java.lang.Integer> intField3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table5 = org.jooq.impl.DSL.generateSeries(intField3, intField4);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField6 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField7 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction9 = org.jooq.impl.DSL.listAgg(bigDecimalField7, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField10 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction13 = org.jooq.impl.DSL.listAgg(bigDecimalField11, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.acos(bigDecimalField14);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction16 = org.jooq.impl.DSL.regrSXY(bigDecimalField11, bigDecimalField14);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField17 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction19 = org.jooq.impl.DSL.listAgg(bigDecimalField17, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField20 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_21 = org.jooq.impl.DSL.insertInto(intRecord1Table5, bigDecimalField6, bigDecimalField7, bigDecimalField10, bigDecimalField11, bigDecimalField17, bigDecimalField20);
        org.jooq.WindowIgnoreNullsStep<java.math.BigDecimal> bigDecimalWindowIgnoreNullsStep22 = org.jooq.impl.DSL.lag(bigDecimalField17);
        org.jooq.Field[] fieldArray24 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray25 = (org.jooq.Field<?>[]) fieldArray24;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField26 = org.jooq.impl.DSL.coalesce(bigDecimalField17, (org.jooq.Field<?>[]) fieldArray24);
        org.jooq.Field<java.lang.String> strField27 = org.jooq.impl.DSL.lpad(strField2, bigDecimalField26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalWindowIgnoreNullsStep22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField27);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.jooq.DropSequenceFinalStep dropSequenceFinalStep1 = org.jooq.impl.DSL.dropSequence("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dropSequenceFinalStep1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep1 = org.jooq.impl.DSL.selectZero();
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.table((org.jooq.Select<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep1);
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.Param<org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>> intRecord1TableLikeParam3 = org.jooq.impl.DSL.param("", (org.jooq.TableLike<org.jooq.Record1<java.lang.Integer>>) intRecord1SelectSelectStep1);
            org.junit.Assert.fail("Expected exception of type org.jooq.exception.SQLDialectNotSupportedException; message: Type class org.jooq.impl.SelectImpl is not supported in dialect DEFAULT");
        } catch (org.jooq.exception.SQLDialectNotSupportedException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table2);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.sql.Date date0 = null;
        org.jooq.DatePart datePart2 = null;
        org.jooq.Field<java.sql.Date> dateField3 = org.jooq.impl.DSL.dateSub(date0, (java.lang.Number) (byte) -1, datePart2);
        java.math.BigDecimal bigDecimal4 = null;
        org.jooq.Field<java.lang.Integer> intField5 = null;
        org.jooq.Field<java.lang.Integer> intField6 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table7 = org.jooq.impl.DSL.generateSeries(intField5, intField6);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField9 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction11 = org.jooq.impl.DSL.listAgg(bigDecimalField9, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction15 = org.jooq.impl.DSL.listAgg(bigDecimalField13, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField16 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField17 = org.jooq.impl.DSL.acos(bigDecimalField16);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction18 = org.jooq.impl.DSL.regrSXY(bigDecimalField13, bigDecimalField16);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField19 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction21 = org.jooq.impl.DSL.listAgg(bigDecimalField19, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField22 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_23 = org.jooq.impl.DSL.insertInto(intRecord1Table7, bigDecimalField8, bigDecimalField9, bigDecimalField12, bigDecimalField13, bigDecimalField19, bigDecimalField22);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField24 = org.jooq.impl.DSL.isnull(bigDecimal4, bigDecimalField9);
        java.math.BigDecimal bigDecimal25 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField26 = org.jooq.impl.DSL.bitOr(bigDecimalField9, bigDecimal25);
        org.jooq.Field<java.sql.Date> dateField27 = org.jooq.impl.DSL.dateAdd(dateField3, bigDecimalField26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateField27);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.math.BigDecimal bigDecimal1 = null;
        org.jooq.Field<java.lang.String> strField3 = null;
        org.jooq.Field<java.lang.Integer> intField4 = null;
        org.jooq.Field<java.lang.Integer> intField5 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table6 = org.jooq.impl.DSL.generateSeries(intField4, intField5);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField7 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction10 = org.jooq.impl.DSL.listAgg(bigDecimalField8, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction14 = org.jooq.impl.DSL.listAgg(bigDecimalField12, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField16 = org.jooq.impl.DSL.acos(bigDecimalField15);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction17 = org.jooq.impl.DSL.regrSXY(bigDecimalField12, bigDecimalField15);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField18 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction20 = org.jooq.impl.DSL.listAgg(bigDecimalField18, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField21 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_22 = org.jooq.impl.DSL.insertInto(intRecord1Table6, bigDecimalField7, bigDecimalField8, bigDecimalField11, bigDecimalField12, bigDecimalField18, bigDecimalField21);
        org.jooq.Field<java.lang.Integer> intField23 = null;
        org.jooq.Field<java.lang.Integer> intField24 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table25 = org.jooq.impl.DSL.generateSeries(intField23, intField24);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField26 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField27 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction29 = org.jooq.impl.DSL.listAgg(bigDecimalField27, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField30 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField31 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction33 = org.jooq.impl.DSL.listAgg(bigDecimalField31, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField34 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField35 = org.jooq.impl.DSL.acos(bigDecimalField34);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction36 = org.jooq.impl.DSL.regrSXY(bigDecimalField31, bigDecimalField34);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField37 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction39 = org.jooq.impl.DSL.listAgg(bigDecimalField37, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField40 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_41 = org.jooq.impl.DSL.insertInto(intRecord1Table25, bigDecimalField26, bigDecimalField27, bigDecimalField30, bigDecimalField31, bigDecimalField37, bigDecimalField40);
        org.jooq.Field<java.lang.String> strField42 = org.jooq.impl.DSL.mid(strField3, bigDecimalField12, bigDecimalField37);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField43 = org.jooq.impl.DSL.power((java.lang.Number) (short) 0, bigDecimalField37);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField44 = org.jooq.impl.DSL.shl(bigDecimal1, bigDecimalField43);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField45 = org.jooq.impl.DSL.atan2((java.lang.Number) (-1), bigDecimalField43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField45);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.jooq.Configuration configuration0 = null;
        org.jooq.DSLContext dSLContext1 = org.jooq.impl.DSL.using(configuration0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dSLContext1);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.generateSeries(intField0, intField1);
        org.jooq.Field<?> wildcardField3 = null;
        org.jooq.Field[] fieldArray5 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray6 = (org.jooq.Field<?>[]) fieldArray5;
        wildcardFieldArray6[0] = wildcardField3;
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction9 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray6);
        org.jooq.CreateViewAsStep createViewAsStep10 = org.jooq.impl.DSL.createView(intRecord1Table2, wildcardFieldArray6);
        org.jooq.RowN rowN11 = org.jooq.impl.DSL.row(wildcardFieldArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(createViewAsStep10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rowN11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.sql.Date date0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Field<java.lang.Integer> intField2 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table3 = org.jooq.impl.DSL.generateSeries(intField1, intField2);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField5 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction7 = org.jooq.impl.DSL.listAgg(bigDecimalField5, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField9 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction11 = org.jooq.impl.DSL.listAgg(bigDecimalField9, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField13 = org.jooq.impl.DSL.acos(bigDecimalField12);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction14 = org.jooq.impl.DSL.regrSXY(bigDecimalField9, bigDecimalField12);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField15 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction17 = org.jooq.impl.DSL.listAgg(bigDecimalField15, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField18 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_19 = org.jooq.impl.DSL.insertInto(intRecord1Table3, bigDecimalField4, bigDecimalField5, bigDecimalField8, bigDecimalField9, bigDecimalField15, bigDecimalField18);
        org.jooq.DatePart datePart20 = null;
        org.jooq.Field<java.sql.Date> dateField21 = org.jooq.impl.DSL.dateSub(date0, bigDecimalField5, datePart20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateField21);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.jooq.Field<java.lang.Integer> intField0 = null;
        org.jooq.Field<java.lang.Integer> intField1 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table2 = org.jooq.impl.DSL.generateSeries(intField0, intField1);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField3 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction6 = org.jooq.impl.DSL.listAgg(bigDecimalField4, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField7 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField8 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction10 = org.jooq.impl.DSL.listAgg(bigDecimalField8, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField11 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField12 = org.jooq.impl.DSL.acos(bigDecimalField11);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction13 = org.jooq.impl.DSL.regrSXY(bigDecimalField8, bigDecimalField11);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction16 = org.jooq.impl.DSL.listAgg(bigDecimalField14, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField17 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_18 = org.jooq.impl.DSL.insertInto(intRecord1Table2, bigDecimalField3, bigDecimalField4, bigDecimalField7, bigDecimalField8, bigDecimalField14, bigDecimalField17);
        java.sql.Date date19 = null;
        java.math.BigDecimal bigDecimal20 = null;
        org.jooq.Field<java.lang.Integer> intField21 = null;
        org.jooq.Field<java.lang.Integer> intField22 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table23 = org.jooq.impl.DSL.generateSeries(intField21, intField22);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField24 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField25 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction27 = org.jooq.impl.DSL.listAgg(bigDecimalField25, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField28 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField29 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction31 = org.jooq.impl.DSL.listAgg(bigDecimalField29, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField32 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField33 = org.jooq.impl.DSL.acos(bigDecimalField32);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction34 = org.jooq.impl.DSL.regrSXY(bigDecimalField29, bigDecimalField32);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField35 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction37 = org.jooq.impl.DSL.listAgg(bigDecimalField35, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField38 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_39 = org.jooq.impl.DSL.insertInto(intRecord1Table23, bigDecimalField24, bigDecimalField25, bigDecimalField28, bigDecimalField29, bigDecimalField35, bigDecimalField38);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField40 = org.jooq.impl.DSL.isnull(bigDecimal20, bigDecimalField25);
        java.math.BigDecimal bigDecimal41 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField42 = org.jooq.impl.DSL.bitOr(bigDecimalField25, bigDecimal41);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction43 = org.jooq.impl.DSL.minDistinct(bigDecimalField25);
        org.jooq.DatePart datePart44 = null;
        org.jooq.Field<java.sql.Date> dateField45 = org.jooq.impl.DSL.dateSub(date19, (org.jooq.Field<java.math.BigDecimal>) bigDecimalAggregateFunction43, datePart44);
        org.jooq.Param<java.math.BigDecimal> bigDecimalParam46 = org.jooq.impl.DSL.value((java.lang.Object) bigDecimalField3, (org.jooq.Field<java.math.BigDecimal>) bigDecimalAggregateFunction43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1Table23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateField45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalParam46);
    }
}

