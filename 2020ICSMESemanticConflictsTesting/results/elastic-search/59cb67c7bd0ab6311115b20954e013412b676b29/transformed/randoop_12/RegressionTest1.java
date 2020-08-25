import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.getInnerFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext7;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.queryFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext8);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext12;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterFound = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        nestedInnerQueryParseSupport0.queryParsed = true;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerFilter = query10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerQuery = query12;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport0.innerFilter = query11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryFound = false;
        java.lang.String str15 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterFound;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport0.queryFound;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport0.innerFilter;
        java.lang.String str16 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.query.QueryShardContext queryShardContext17 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext17);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference3);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.filterFound = true;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "hi!";
        java.lang.String str10 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerFilter;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterFound = false;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerFilter;
        nestedInnerQueryParseSupport0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper9;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.query.QueryShardContext queryShardContext13 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext13);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str5 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport0.source;
        java.lang.String str11 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query8);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper4;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter11;
        nestedInnerQueryParseSupport0.path = "";
        boolean boolean15 = nestedInnerQueryParseSupport0.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext8);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerQuery = query5;
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext7);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.filterParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.filterParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound;
        nestedInnerQueryParseSupport0.filterParsed = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper3;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound;
        java.lang.Class<?> wildcardClass11 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.filterFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.path = "";
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerFilter = query9;
        nestedInnerQueryParseSupport0.filterParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference13);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerQuery = query9;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport0.innerQuery = query13;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter15);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.path = "hi!";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.parentFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        nestedInnerQueryParseSupport0.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerFilter = query12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter11;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query3 = null;
        nestedInnerQueryParseSupport0.innerQuery = query3;
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext5);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext10;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        nestedInnerQueryParseSupport0.path = "hi!";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.childFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound();
        nestedInnerQueryParseSupport0.queryFound = true;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper10;
        java.lang.String str12 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query13);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport0.source;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport0.innerQuery = query11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference10);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerQuery = query5;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper11;
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport0.innerQuery = query13;
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport0.innerFilter = query15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.query.QueryShardContext queryShardContext11 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext11;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryParsed = false;
        java.lang.String str9 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport0.source = bytesReference12;
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterFound = true;
        nestedInnerQueryParseSupport0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport0.source = bytesReference10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper12;
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport0.innerFilter = query14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper8;
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound;
        nestedInnerQueryParseSupport0.filterParsed = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        nestedInnerQueryParseSupport0.queryFound = true;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.Class<?> wildcardClass12 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter11;
        nestedInnerQueryParseSupport0.path = "";
        boolean boolean15 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext16 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext16);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryParsed;
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport0.source;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.filterParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper10;
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport0.parseContext;
        boolean boolean13 = nestedInnerQueryParseSupport0.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport0.source = bytesReference8;
        nestedInnerQueryParseSupport0.queryParsed = true;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        nestedInnerQueryParseSupport0.queryParsed = false;
        java.lang.String str12 = nestedInnerQueryParseSupport0.path;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext6;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext6;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport0.source = bytesReference9;
        nestedInnerQueryParseSupport0.filterParsed = true;
        java.lang.Class<?> wildcardClass13 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.filterParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference12);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        nestedInnerQueryParseSupport0.path = "";
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport0.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext14);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerFilter;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.path = "hi!";
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport0.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport0.source = bytesReference11;
        nestedInnerQueryParseSupport0.queryParsed = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext15 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext15);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport0.source;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerFilter = query9;
        org.elasticsearch.index.query.QueryShardContext queryShardContext11 = nestedInnerQueryParseSupport0.shardContext;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext11);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.query.QueryShardContext queryShardContext11 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext11;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        org.elasticsearch.index.query.QueryShardContext queryShardContext15 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.filterFound = false;
        java.lang.String str9 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterFound;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        nestedInnerQueryParseSupport0.filterFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = true;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.getInnerQuery();
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.getInnerQuery();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query13);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport0.getInnerFilter();
        nestedInnerQueryParseSupport0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.query.QueryParseContext queryParseContext3 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport0.source = bytesReference8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext3);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query3 = null;
        nestedInnerQueryParseSupport0.innerQuery = query3;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport0.source = bytesReference11;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.queryFound = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport0.source = bytesReference12;
        boolean boolean14 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = nestedInnerQueryParseSupport0.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter15);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport0.innerQuery = query15;
        boolean boolean17 = nestedInnerQueryParseSupport0.queryFound;
        java.lang.Class<?> wildcardClass18 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = nestedInnerQueryParseSupport0.parentFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter4);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        java.lang.String str11 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference13);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext8);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter11;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerQuery = query5;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        nestedInnerQueryParseSupport0.filterFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        java.lang.String str12 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean11 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerFilter = query12;
        nestedInnerQueryParseSupport0.filterParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        nestedInnerQueryParseSupport0.filterParsed = false;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerFilter = query12;
        boolean boolean14 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext15 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext15);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerFilter = query10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper12;
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper9;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext10;
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str13 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        java.lang.String str12 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport0.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = query15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport0.source = bytesReference7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerFilter = query10;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport0.source = bytesReference12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.filterFound;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport0.source = bytesReference12;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerFilter = query6;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext8);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerQuery = query9;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.queryParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper9;
        org.elasticsearch.index.query.QueryShardContext queryShardContext11 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport0.childFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.query.QueryShardContext queryShardContext13 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query3 = null;
        nestedInnerQueryParseSupport0.innerQuery = query3;
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.path = "";
        boolean boolean7 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str9 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerQuery = query12;
        java.lang.String str14 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean10 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerFilter;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.path = "hi!";
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport0.source = bytesReference15;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query10);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean12 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport0.source = bytesReference2;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        nestedInnerQueryParseSupport0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterFound;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.query.QueryShardContext queryShardContext13 = nestedInnerQueryParseSupport0.shardContext;
        boolean boolean14 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext15 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext15);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        nestedInnerQueryParseSupport0.queryFound = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter11;
        boolean boolean13 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = nestedInnerQueryParseSupport0.shardContext;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext4);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext5;
        nestedInnerQueryParseSupport0.filterParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        nestedInnerQueryParseSupport0.path = "";
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter9;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport0.source = bytesReference11;
        boolean boolean13 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = false;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerQuery = query12;
        nestedInnerQueryParseSupport0.queryFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        nestedInnerQueryParseSupport0.path = "hi!";
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport0.innerFilter = query13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport0.source = bytesReference8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerQuery = query5;
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = nestedInnerQueryParseSupport0.shardContext;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport0.source = bytesReference12;
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = null;
        nestedInnerQueryParseSupport0.source = bytesReference14;
        boolean boolean16 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.parentFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str13 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = null;
        nestedInnerQueryParseSupport0.source = bytesReference14;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport0.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper6;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        nestedInnerQueryParseSupport0.queryFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.filterFound = true;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerFilter;
        java.lang.Class<?> wildcardClass12 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport0.filterParsed;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerFilter = query9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str5 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = nestedInnerQueryParseSupport0.shardContext;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext8);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = nestedInnerQueryParseSupport0.parentFilter;
        nestedInnerQueryParseSupport0.path = "hi!";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryParsed;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext5;
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext7;
        org.elasticsearch.index.query.QueryShardContext queryShardContext9 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerQuery = query5;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper8;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext10;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        nestedInnerQueryParseSupport0.path = "";
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport0.innerQuery = query15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport0.innerQuery = query11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext4;
        nestedInnerQueryParseSupport0.queryFound = false;
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter9;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        nestedInnerQueryParseSupport0.path = "";
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.getInnerFilter();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query5);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter11;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference10);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        nestedInnerQueryParseSupport0.queryFound = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str5 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport0.childFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport0.source;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound();
        java.lang.String str12 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.query.QueryShardContext queryShardContext13 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext13);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        boolean boolean7 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query10);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter9;
        nestedInnerQueryParseSupport0.queryFound = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean11 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerFilter = query12;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.innerFilter;
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerQuery = query6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.parentFilter;
        nestedInnerQueryParseSupport0.queryFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.filterFound = true;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport0.innerQuery = query11;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterParsed;
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        nestedInnerQueryParseSupport0.path = "";
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport0.source = bytesReference10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper12;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.filterFound = true;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport0.source = bytesReference10;
        nestedInnerQueryParseSupport0.path = "hi!";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        boolean boolean15 = nestedInnerQueryParseSupport0.filterParsed;
        java.lang.String str16 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference3);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query8);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterFound;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound;
        boolean boolean12 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.query.QueryShardContext queryShardContext13 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerQuery;
        nestedInnerQueryParseSupport0.filterParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerFilter = query10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        nestedInnerQueryParseSupport0.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        java.lang.String str12 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean13 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport0.parseContext;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
        java.lang.String str11 = nestedInnerQueryParseSupport0.path;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext3 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext3;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.queryParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter9;
        org.elasticsearch.index.query.QueryShardContext queryShardContext11 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext11;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.query.QueryParseContext queryParseContext16 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext16);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        nestedInnerQueryParseSupport0.filterParsed = false;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerFilter = query12;
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext14;
        org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport0.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query16);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        nestedInnerQueryParseSupport0.queryFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext4;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.query.QueryShardContext queryShardContext9 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext9);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext7;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        boolean boolean15 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query13);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerFilter = query10;
        nestedInnerQueryParseSupport0.filterParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerFilter;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.path = "hi!";
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = null;
        nestedInnerQueryParseSupport0.source = bytesReference16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        nestedInnerQueryParseSupport0.path = "";
        java.lang.String str12 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean13 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerFilter = query12;
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport0.innerFilter = query14;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.parentFilter;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference10);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str11 = nestedInnerQueryParseSupport0.path;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerFilter = query9;
        org.elasticsearch.index.query.QueryShardContext queryShardContext11 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport0.source = bytesReference7;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter9;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerFilter = query10;
        java.lang.Class<?> wildcardClass12 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter9;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport0.source = bytesReference11;
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext13;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        java.lang.Class<?> wildcardClass11 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference6);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        nestedInnerQueryParseSupport0.path = "";
        nestedInnerQueryParseSupport0.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter16);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter11;
        nestedInnerQueryParseSupport0.path = "";
        boolean boolean15 = nestedInnerQueryParseSupport0.queryParsed;
        boolean boolean16 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport0.innerQuery = query11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.path = "hi!";
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter6;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterFound;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport0.filterFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.path = "hi!";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper9;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport0.filterParsed;
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterParsed;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterParsed;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound();
        boolean boolean12 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        nestedInnerQueryParseSupport0.filterFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str11 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryFound = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport0.source = bytesReference8;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport0.source;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerFilter = query9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterParsed;
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean13 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext14 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext14);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport0.source;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext5);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.innerQuery;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        nestedInnerQueryParseSupport0.filterParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext12;
        nestedInnerQueryParseSupport0.queryParsed = true;
        nestedInnerQueryParseSupport0.filterParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        nestedInnerQueryParseSupport0.filterFound = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.String str4 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext7;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerFilter = query9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.filterFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        java.lang.String str9 = nestedInnerQueryParseSupport0.path;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        org.elasticsearch.index.query.QueryParseContext queryParseContext15 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = null;
        nestedInnerQueryParseSupport0.source = bytesReference16;
        boolean boolean18 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = null;
        nestedInnerQueryParseSupport0.source = bytesReference19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerQuery;
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterParsed;
        java.lang.String str13 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        nestedInnerQueryParseSupport0.filterFound = true;
        boolean boolean17 = nestedInnerQueryParseSupport0.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.path = "";
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext10;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter12;
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = null;
        nestedInnerQueryParseSupport0.source = bytesReference14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = true;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.getInnerQuery();
        boolean boolean13 = nestedInnerQueryParseSupport0.filterFound();
        boolean boolean14 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str5 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext8);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport0.innerQuery = query15;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.path = "hi!";
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport0.source = bytesReference9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter11;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerQuery = query9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter13;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        nestedInnerQueryParseSupport0.queryParsed = true;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.getInnerQuery();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = queryParseContext7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter9;
        java.lang.String str11 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterFound();
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        nestedInnerQueryParseSupport0.filterParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = nestedInnerQueryParseSupport0.source;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference7);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport0.source = bytesReference7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.query.QueryParseContext queryParseContext3 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterFound();
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport0.source = bytesReference11;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter2;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerQuery = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query8);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = nestedInnerQueryParseSupport0.shardContext;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport0.source = bytesReference7;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter13;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper10;
        java.lang.String str12 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean15 = nestedInnerQueryParseSupport0.filterParsed;
        java.lang.String str16 = nestedInnerQueryParseSupport0.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = true;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.getInnerQuery();
        boolean boolean13 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport0.parseContext;
        boolean boolean15 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryFound = true;
        nestedInnerQueryParseSupport0.queryParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport0.filterParsed;
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper10;
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = false;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext13;
        org.elasticsearch.index.query.QueryParseContext queryParseContext15 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.filterParsed = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext15);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.queryFound = true;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext6;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        nestedInnerQueryParseSupport0.path = "";
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext5;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.innerQuery;
        nestedInnerQueryParseSupport0.filterParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query8);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext4);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.parentFilter;
        nestedInnerQueryParseSupport0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str5 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.path = "";
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        nestedInnerQueryParseSupport0.queryParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        boolean boolean13 = nestedInnerQueryParseSupport0.queryParsed;
        boolean boolean14 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport0.source = bytesReference9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference2 = null;
        nestedInnerQueryParseSupport0.source = bytesReference2;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query3 = null;
        nestedInnerQueryParseSupport0.innerQuery = query3;
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext5);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        nestedInnerQueryParseSupport0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport0.innerQuery = query15;
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport0.innerFilter = query17;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper19 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper19;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterParsed;
        boolean boolean12 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.queryParsed = true;
        nestedInnerQueryParseSupport0.queryFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport0.source;
        java.lang.String str11 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter12;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport0.source;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.filterFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query8);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.queryFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.path = "hi!";
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext15 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext15);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str11 = nestedInnerQueryParseSupport0.path;
        java.lang.String str12 = nestedInnerQueryParseSupport0.path;
        boolean boolean13 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        nestedInnerQueryParseSupport0.path = "";
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext15 = nestedInnerQueryParseSupport0.parseContext;
        boolean boolean16 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str13 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.query.QueryShardContext queryShardContext14 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext14);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport0.source = bytesReference8;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport0.source = bytesReference7;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper3;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport0.source = bytesReference7;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport0.parentFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerQuery = query6;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str13 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean15 = nestedInnerQueryParseSupport0.queryParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.innerQuery;
        nestedInnerQueryParseSupport0.path = "hi!";
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference15);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.path = "hi!";
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport0.source = bytesReference9;
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport0.innerFilter = query11;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        nestedInnerQueryParseSupport0.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        nestedInnerQueryParseSupport0.queryFound = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport0.innerQuery = query15;
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport0.innerFilter = query17;
        org.elasticsearch.index.query.QueryShardContext queryShardContext19 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.query.QueryParseContext queryParseContext20 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext20);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport0.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext8);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.parentFilter;
        nestedInnerQueryParseSupport0.queryFound = true;
        boolean boolean13 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext7;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerFilter = query10;
        nestedInnerQueryParseSupport0.filterFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport0.innerQuery = query15;
        java.lang.String str17 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = null;
        nestedInnerQueryParseSupport0.source = bytesReference18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter9;
        java.lang.String str11 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.queryParsed = true;
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport0.getInnerQuery();
        java.lang.Class<?> wildcardClass15 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport0.source;
        java.lang.String str13 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport0.source = bytesReference10;
        nestedInnerQueryParseSupport0.path = "hi!";
        boolean boolean14 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.query.QueryParseContext queryParseContext3 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter6;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport0.innerQuery = query11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        nestedInnerQueryParseSupport0.queryParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        java.lang.String str4 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter9;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport0.source = bytesReference11;
        java.lang.String str13 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        nestedInnerQueryParseSupport0.queryParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerQuery = query12;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerFilter;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.path = "hi!";
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = null;
        nestedInnerQueryParseSupport0.source = bytesReference15;
        org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport0.getInnerFilter();
        org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query18);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter12;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter14;
        nestedInnerQueryParseSupport0.queryParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference11);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext5);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.query.QueryParseContext queryParseContext3 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterFound = false;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerFilter;
        nestedInnerQueryParseSupport0.queryFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str5 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext13);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = true;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.getInnerQuery();
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.getInnerQuery();
        java.lang.String str14 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        nestedInnerQueryParseSupport0.filterParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        nestedInnerQueryParseSupport0.filterFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter13;
        nestedInnerQueryParseSupport0.filterParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerFilter = query10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper12;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.query.QueryParseContext queryParseContext3 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport0.source;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.filterParsed = false;
        nestedInnerQueryParseSupport0.queryParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport0.source = bytesReference9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport0.innerQuery = query11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.innerFilter;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerQuery = query12;
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        org.elasticsearch.index.query.QueryParseContext queryParseContext15 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = null;
        nestedInnerQueryParseSupport0.source = bytesReference16;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper11;
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = nestedInnerQueryParseSupport0.source;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference14);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext7;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.query.QueryShardContext queryShardContext11 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext11;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        boolean boolean15 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper8;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerFilter = query10;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter12;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext12;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerQuery = query6;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport0.source = bytesReference9;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext11;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerQuery = query9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.innerFilter;
        boolean boolean14 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper3;
        nestedInnerQueryParseSupport0.queryFound = true;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        nestedInnerQueryParseSupport0.queryParsed = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.Class<?> wildcardClass12 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean11 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper12;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper14;
        java.lang.Class<?> wildcardClass16 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerQuery = query5;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        nestedInnerQueryParseSupport0.queryParsed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper4;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext8);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.queryParsed = false;
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext8);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = true;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference8);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter9;
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext9 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterParsed;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport0.source = bytesReference10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerQuery = query9;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.queryParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext8);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper10;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper11;
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query13);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerFilter = query6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport0.source = bytesReference8;
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext7;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryFound = true;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str12 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterFound = false;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str13 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query8);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport0.source;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.queryParsed = true;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerFilter = query12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        nestedInnerQueryParseSupport0.queryParsed = false;
        java.lang.String str12 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper3;
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterParsed = false;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        nestedInnerQueryParseSupport0.path = "hi!";
        nestedInnerQueryParseSupport0.queryParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        boolean boolean15 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerFilter = query10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
    }
}

