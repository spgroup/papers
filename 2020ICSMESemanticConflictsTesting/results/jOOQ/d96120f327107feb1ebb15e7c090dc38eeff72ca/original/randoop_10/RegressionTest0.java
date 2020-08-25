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
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
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
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
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
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.jooq.Field<java.sql.Date> dateField1 = org.jooq.impl.DSL.date("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateField1);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
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
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.jooq.Param<java.lang.Object> objParam1 = org.jooq.impl.DSL.param("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objParam1);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.md5("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
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
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
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
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
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
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
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
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
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
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.jooq.WindowSpecificationRowsAndStep windowSpecificationRowsAndStep0 = org.jooq.impl.DSL.rowsBetweenUnboundedFollowing();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowSpecificationRowsAndStep0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
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
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
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
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.jooq.ResultQuery<org.jooq.Record> recordResultQuery1 = org.jooq.impl.DSL.resultQuery("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(recordResultQuery1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
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
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
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
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.jooq.AlterTableStep alterTableStep1 = org.jooq.impl.DSL.alterTable("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(alterTableStep1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.log((java.lang.Number) 1.0f, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.jooq.Field<?> wildcardField2 = null;
        org.jooq.Field[] fieldArray4 = new org.jooq.Field[1];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray5 = (org.jooq.Field<?>[]) fieldArray4;
        wildcardFieldArray5[0] = wildcardField2;
        org.jooq.OrderedAggregateFunction<java.math.BigDecimal> bigDecimalOrderedAggregateFunction8 = org.jooq.impl.DSL.cumeDist(wildcardFieldArray5);
        org.jooq.Query query9 = org.jooq.impl.DSL.query("", (java.lang.Object[]) wildcardFieldArray5);
        org.jooq.QueryPart queryPart10 = org.jooq.impl.DSL.queryPart("", (java.lang.Object[]) wildcardFieldArray5);
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
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
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
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.jooq.Field<java.lang.Boolean> booleanField0 = org.jooq.impl.DSL.connectByIsLeaf();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(booleanField0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
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
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
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
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
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
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
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
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
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
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.jooq.WindowOverStep<java.math.BigDecimal> bigDecimalWindowOverStep0 = org.jooq.impl.DSL.percentRank();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalWindowOverStep0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.reverse("hi!");
        org.jooq.Field<java.lang.String> strField2 = org.jooq.impl.DSL.md5(strField1);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField4 = org.jooq.impl.DSL.atan((java.lang.Number) 1.0f);
        org.jooq.Field<java.lang.String> strField5 = org.jooq.impl.DSL.left(strField1, bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField5);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
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
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.sql.Date date0 = null;
        org.jooq.DatePart datePart2 = null;
        org.jooq.Field<java.sql.Date> dateField3 = org.jooq.impl.DSL.dateSub(date0, (java.lang.Number) 0L, datePart2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dateField3);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.util.Date date0 = null;
        org.jooq.Field<java.sql.Time> timeField1 = org.jooq.impl.DSL.time(date0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(timeField1);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.sql.Connection connection0 = null;
        org.jooq.SQLDialect sQLDialect1 = null;
        org.jooq.conf.Settings settings2 = null;
        org.jooq.DSLContext dSLContext3 = org.jooq.impl.DSL.using(connection0, sQLDialect1, settings2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dSLContext3);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.sql.Connection connection0 = null;
        org.jooq.conf.Settings settings1 = null;
        org.jooq.DSLContext dSLContext2 = org.jooq.impl.DSL.using(connection0, settings1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dSLContext2);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField0 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.sin(bigDecimalField0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.jooq.Condition condition0 = org.jooq.impl.DSL.falseCondition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(condition0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
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
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.atan2((java.lang.Number) 1.0f, (java.lang.Number) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
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
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
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
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
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
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
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
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField0 = org.jooq.impl.DSL.pi();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField0);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!" };
        org.jooq.WithAsStep withAsStep3 = org.jooq.impl.DSL.withRecursive("", strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(withAsStep3);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        java.lang.String str2 = org.jooq.impl.DSL.escape("", '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.log((java.lang.Number) 10L, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.tanh((java.lang.Number) 0L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField1);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.lower("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
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
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
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
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
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
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
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
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
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
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.jooq.Field<java.math.BigDecimal> bigDecimalField0 = null;
        org.jooq.Field<java.math.BigDecimal> bigDecimalField1 = org.jooq.impl.DSL.acos(bigDecimalField0);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField2 = org.jooq.impl.DSL.round(bigDecimalField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bigDecimalField2);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.jooq.Field<java.lang.String> strField1 = org.jooq.impl.DSL.rtrim("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strField1);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
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
        org.jooq.Field<java.math.BigDecimal> bigDecimalField75 = org.jooq.impl.DSL.sqrt(bigDecimalField31);
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
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jooq.CreateViewAsStep createViewAsStep2 = org.jooq.impl.DSL.createView("", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

