import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        java.util.Date date2 = null;
        org.jooq.Field<java.lang.Integer> intField3 = org.jooq.impl.DSL.minute(date2);
        java.util.Date date4 = null;
        org.jooq.Field<java.lang.Integer> intField5 = org.jooq.impl.DSL.second(date4);
        org.jooq.Field<java.sql.Timestamp> timestampField6 = null;
        java.util.Date date7 = null;
        org.jooq.Field<java.lang.Integer> intField8 = org.jooq.impl.DSL.second(date7);
        java.util.Date date9 = null;
        org.jooq.Field<java.lang.Integer> intField10 = org.jooq.impl.DSL.second(date9);
        java.util.Date date11 = null;
        org.jooq.Field<java.lang.Integer> intField12 = org.jooq.impl.DSL.minute(date11);
        org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> intRow3_13 = org.jooq.impl.DSL.row(intField8, intField10, intField12);
        org.jooq.Field<java.math.BigDecimal> bigDecimalField14 = org.jooq.impl.DSL.deg(intField8);
        org.jooq.DatePart datePart15 = null;
        org.jooq.Field<java.sql.Timestamp> timestampField16 = org.jooq.impl.DSL.timestampAdd(timestampField6, intField8, datePart15);
        org.jooq.SelectSelectStep<org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer>> intRecord3SelectSelectStep17 = org.jooq.impl.DSL.select((org.jooq.SelectField<java.lang.Integer>) intField3, (org.jooq.SelectField<java.lang.Integer>) intField5, (org.jooq.SelectField<java.lang.Integer>) intField8);
        org.jooq.Field[] fieldArray19 = new org.jooq.Field[0];
        @SuppressWarnings("unchecked")
        org.jooq.Field<?>[] wildcardFieldArray20 = (org.jooq.Field<?>[]) fieldArray19;
        org.jooq.Field<java.lang.Integer> intField21 = org.jooq.impl.DSL.least(intField3, wildcardFieldArray20);
        org.jooq.GroupField groupField22 = org.jooq.impl.DSL.rollup(wildcardFieldArray20);
        org.jooq.QueryPart queryPart23 = org.jooq.impl.DSL.queryPart("", (java.lang.Object[]) wildcardFieldArray20);
        org.jooq.ResultQuery<org.jooq.Record> recordResultQuery24 = org.jooq.impl.DSL.resultQuery("hi!", (org.jooq.QueryPart[]) wildcardFieldArray20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on queryPart23 and timestampField16.", queryPart23.equals(timestampField16) == timestampField16.equals(queryPart23));
    }
}

