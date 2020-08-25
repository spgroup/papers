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
        java.sql.Connection connection0 = null;
        org.jooq.SQLDialect sQLDialect1 = null;
        org.jooq.DSLContext dSLContext2 = org.jooq.impl.DSL.using(connection0, sQLDialect1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dSLContext2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
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
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep1 = org.jooq.impl.DSL.rowsBetweenFollowing(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
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
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
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
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
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
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.jooq.Field<java.sql.Timestamp> timestampField1 = org.jooq.impl.DSL.timestamp("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timestampField1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
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
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
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
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
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
        org.jooq.Field<java.lang.Integer> intField75 = null;
        org.jooq.Field<java.lang.Integer> intField76 = null;
        org.jooq.Table<org.jooq.Record1<java.lang.Integer>> intRecord1Table77 = org.jooq.impl.DSL.generateSeries(intField75, intField76);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField78 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField79 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction81 = org.jooq.impl.DSL.listAgg(bigDecimalField79, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField82 = org.jooq.impl.DSL.e();
        org.jooq.Field<java.math.BigDecimal> bigDecimalField83 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction85 = org.jooq.impl.DSL.listAgg(bigDecimalField83, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField86 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField87 = org.jooq.impl.DSL.acos(bigDecimalField86);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction88 = org.jooq.impl.DSL.regrSXY(bigDecimalField83, bigDecimalField86);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField89 = org.jooq.impl.DSL.e();
        org.jooq.OrderedAggregateFunction<java.lang.String> strOrderedAggregateFunction91 = org.jooq.impl.DSL.listAgg(bigDecimalField89, "");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField92 = null;
        org.jooq.InsertValuesStep6<org.jooq.Record1<java.lang.Integer>, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal> intRecord1InsertValuesStep6_93 = org.jooq.impl.DSL.insertInto(intRecord1Table77, bigDecimalField78, bigDecimalField79, bigDecimalField82, bigDecimalField83, bigDecimalField89, bigDecimalField92);
        org.jooq.AggregateFunction<java.math.BigDecimal> bigDecimalAggregateFunction94 = org.jooq.impl.DSL.avgDistinct(bigDecimalField83);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField95 = org.jooq.impl.DSL.power(bigDecimalField31, (org.jooq.Field<java.math.BigDecimal>) bigDecimalAggregateFunction94);
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
        org.junit.Assert.assertNotNull(intRecord1Table77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction85);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField87);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction88);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField89);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strOrderedAggregateFunction91);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1InsertValuesStep6_93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalAggregateFunction94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField95);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
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
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.jooq.Field<?> wildcardField0 = null;
        org.jooq.Field[] fieldArray2 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray3 = (org.jooq.Field<?>[]) fieldArray2;
        wildcardFieldArray3[0] = wildcardField0;
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction6 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(fieldArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardFieldArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalOrderedAggregateFunction6);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.jooq.Field<java.sql.Date> dateField1 = org.jooq.impl.DSL.date("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateField1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.jooq.CreateTableAsStep<org.jooq.Record> recordCreateTableAsStep1 = org.jooq.impl.DSL.createTable("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordCreateTableAsStep1);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
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
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.jooq.CommonTableExpression<?> wildcardCommonTableExpression0 = null;
        org.jooq.CommonTableExpression[] commonTableExpressionArray2 = new org.jooq.CommonTableExpression[1];
        @SuppressWarnings("unchecked")
        org.jooq.CommonTableExpression<?>[] wildcardCommonTableExpressionArray3 = (org.jooq.CommonTableExpression<?>[]) commonTableExpressionArray2;
        wildcardCommonTableExpressionArray3[0] = wildcardCommonTableExpression0;
        org.jooq.WithStep withStep6 = org.jooq.impl.DSL.withRecursive(wildcardCommonTableExpressionArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(commonTableExpressionArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardCommonTableExpressionArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(withStep6);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
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
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.atan((java.lang.Number) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
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
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
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
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.jooq.Param<java.lang.Object> objParam1 = org.jooq.impl.DSL.param("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objParam1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.md5("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
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
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
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
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
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
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
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
        org.jooq.Field<java.math.BigDecimal> bigDecimalField45 = org.jooq.impl.DSL.connectByRoot(bigDecimalField14);
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
        org.junit.Assert.assertNotNull(bigDecimalField45);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
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
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.jooq.SelectSelectStep<org.jooq.Record1<java.lang.Integer>> intRecord1SelectSelectStep0 = org.jooq.impl.DSL.selectOne();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intRecord1SelectSelectStep0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
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
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
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
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep0 = org.jooq.impl.DSL.rowsBetweenUnboundedFollowing();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep0);
    }
}

