import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport0.innerFilter = query11;
        boolean boolean13 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        java.lang.String str12 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext14 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext14;
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
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query13);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        nestedInnerQueryParseSupport0.path = "";
        boolean boolean13 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport0.source;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        nestedInnerQueryParseSupport0.path = "hi!";
        nestedInnerQueryParseSupport0.queryParsed = true;
        nestedInnerQueryParseSupport0.queryParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.query.QueryParseContext queryParseContext3 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        java.lang.String str11 = nestedInnerQueryParseSupport0.getPath();
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
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport0.getInnerFilter();
        nestedInnerQueryParseSupport0.queryFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerQuery = query5;
        nestedInnerQueryParseSupport0.filterParsed = false;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper3;
        nestedInnerQueryParseSupport0.queryFound = true;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        nestedInnerQueryParseSupport0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "hi!";
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerFilter = query7;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
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
        nestedInnerQueryParseSupport0.filterParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport0.source = bytesReference12;
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
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.queryParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport0.parseContext;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterParsed;
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        java.lang.Class<?> wildcardClass13 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        boolean boolean14 = nestedInnerQueryParseSupport0.queryParsed;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        boolean boolean6 = nestedInnerQueryParseSupport0.filterParsed;
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
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
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.filterFound = true;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "";
        boolean boolean11 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.String str12 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound();
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
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryShardContext queryShardContext14 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext14;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter16);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerQuery = query5;
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = nestedInnerQueryParseSupport0.shardContext;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport0.childFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str5 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.innerQuery;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = query9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        boolean boolean14 = nestedInnerQueryParseSupport0.filterParsed;
        java.lang.Class<?> wildcardClass15 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        nestedInnerQueryParseSupport0.path = "hi!";
        org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query17);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter15;
        boolean boolean17 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter18 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter18;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        nestedInnerQueryParseSupport0.filterParsed = true;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerFilter = query6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext5);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        boolean boolean12 = nestedInnerQueryParseSupport0.queryFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.queryFound = true;
        boolean boolean14 = nestedInnerQueryParseSupport0.queryFound();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.getParentObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper11;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference13);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter2;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.innerFilter;
        nestedInnerQueryParseSupport0.path = "hi!";
        boolean boolean13 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.path = "hi!";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter16;
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
        org.junit.Assert.assertNull(query10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound();
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.innerFilter;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper10;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.path = "hi!";
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerFilter = query10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        nestedInnerQueryParseSupport0.queryParsed = true;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.getInnerQuery();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryShardContext queryShardContext9 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference8);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        nestedInnerQueryParseSupport0.path = "";
        boolean boolean15 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        boolean boolean16 = nestedInnerQueryParseSupport0.filterParsed;
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext4;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterFound = false;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str11 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
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
        nestedInnerQueryParseSupport0.queryFound = true;
        boolean boolean13 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference14);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport0.source = bytesReference8;
        nestedInnerQueryParseSupport0.filterParsed = false;
        boolean boolean12 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.queryFound = true;
        boolean boolean15 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound;
        nestedInnerQueryParseSupport0.filterFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport0.source = bytesReference8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = null;
        nestedInnerQueryParseSupport0.source = bytesReference14;
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
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerQuery = query5;
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = nestedInnerQueryParseSupport0.shardContext;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter10;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport0.source = bytesReference12;
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        boolean boolean13 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.query.QueryShardContext queryShardContext14 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext14;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport0.innerQuery = query17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter14;
        boolean boolean16 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper17;
        org.elasticsearch.index.query.QueryShardContext queryShardContext19 = nestedInnerQueryParseSupport0.shardContext;
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext19);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound;
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
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
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport0.parseContext;
        boolean boolean13 = nestedInnerQueryParseSupport0.queryFound();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext12;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
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
        boolean boolean10 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
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
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
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
        nestedInnerQueryParseSupport0.queryParsed = false;
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext11;
        org.elasticsearch.index.query.QueryShardContext queryShardContext13 = nestedInnerQueryParseSupport0.shardContext;
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
        org.junit.Assert.assertNull(queryShardContext13);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        java.lang.Class<?> wildcardClass10 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerFilter = query6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerQuery = query6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerQuery = query5;
        nestedInnerQueryParseSupport0.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerQuery = query10;
        boolean boolean12 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper14;
        nestedInnerQueryParseSupport0.filterParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = nestedInnerQueryParseSupport0.childFilter;
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
        org.junit.Assert.assertNull(bitDocIdSetFilter15);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper12;
        org.elasticsearch.index.query.QueryShardContext queryShardContext14 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext14;
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
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.childFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
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
        boolean boolean12 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
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
        nestedInnerQueryParseSupport0.filterParsed = false;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterFound;
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
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
        nestedInnerQueryParseSupport0.queryParsed = false;
        java.lang.Class<?> wildcardClass15 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter12;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean17 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport0.innerQuery = query13;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        java.lang.String str14 = nestedInnerQueryParseSupport0.path;
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
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.getInnerFilter();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.getPath();
        java.lang.String str11 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter14;
        nestedInnerQueryParseSupport0.filterParsed = true;
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
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper13;
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
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerQuery = query6;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport0.source = bytesReference8;
        nestedInnerQueryParseSupport0.queryFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.getInnerFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
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
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = null;
        nestedInnerQueryParseSupport0.source = bytesReference3;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport0.source = bytesReference7;
        java.lang.Class<?> wildcardClass9 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
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
        boolean boolean14 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport0.source = bytesReference8;
        nestedInnerQueryParseSupport0.filterParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerQuery = query5;
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = nestedInnerQueryParseSupport0.shardContext;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound();
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
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport0.filterParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
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
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        boolean boolean13 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerFilter = query6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.parentObjectMapper;
        java.lang.String str9 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        nestedInnerQueryParseSupport0.path = "";
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
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        nestedInnerQueryParseSupport0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
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
            nestedInnerQueryParseSupport0.setPath("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference4);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter15;
        boolean boolean17 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper18);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean15 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.parentFilter;
        nestedInnerQueryParseSupport0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter13;
        java.lang.String str15 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        boolean boolean12 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str13 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.path = "";
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.parentFilter;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = nestedInnerQueryParseSupport0.shardContext;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport0.childFilter;
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
        org.junit.Assert.assertNull(queryParseContext11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.queryParsed = true;
        java.lang.String str11 = nestedInnerQueryParseSupport0.getPath();
        java.lang.String str12 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.getInnerFilter();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query4);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter10;
        nestedInnerQueryParseSupport0.filterParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerQuery = query9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
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
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.filterFound = true;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.filterParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        nestedInnerQueryParseSupport0.queryParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = null;
        nestedInnerQueryParseSupport0.source = bytesReference3;
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
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
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
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
        org.elasticsearch.index.query.QueryParseContext queryParseContext16 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext16;
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = null;
        nestedInnerQueryParseSupport0.source = bytesReference18;
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
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport0.parseContext;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.path = "hi!";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter6;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
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
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound;
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
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper6;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerFilter = query6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference10);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
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
        boolean boolean12 = nestedInnerQueryParseSupport0.filterFound;
        java.lang.String str13 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.queryParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext7;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerFilter = query10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext9);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        boolean boolean10 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport0.source = bytesReference12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
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
        java.lang.Class<?> wildcardClass12 = nestedInnerQueryParseSupport0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        nestedInnerQueryParseSupport0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext15);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.getInnerFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.queryFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper14;
        org.elasticsearch.index.query.QueryParseContext queryParseContext16 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext16;
        java.lang.String str18 = nestedInnerQueryParseSupport0.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query19 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.filterFound;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerQuery;
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
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
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
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
        java.lang.String str12 = nestedInnerQueryParseSupport0.path;
        boolean boolean13 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport0.nestedObjectMapper;
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
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.query.QueryShardContext queryShardContext9 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext9;
        nestedInnerQueryParseSupport0.queryParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query12);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter7;
        nestedInnerQueryParseSupport0.queryParsed = true;
        nestedInnerQueryParseSupport0.queryFound = false;
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
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.innerQuery;
        nestedInnerQueryParseSupport0.queryParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query10);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport0.source = bytesReference11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
        java.lang.String str12 = nestedInnerQueryParseSupport0.getPath();
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
        org.junit.Assert.assertNull(queryParseContext11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.innerQuery;
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
        org.junit.Assert.assertNull(query9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference10);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        java.lang.Class<?> wildcardClass14 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext7;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryParsed = false;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        nestedInnerQueryParseSupport0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        nestedInnerQueryParseSupport0.filterParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter14;
        nestedInnerQueryParseSupport0.queryFound = true;
        nestedInnerQueryParseSupport0.path = "hi!";
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
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        boolean boolean13 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport0.innerFilter;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
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
        nestedInnerQueryParseSupport0.queryFound = true;
        boolean boolean13 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        boolean boolean15 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport0.childFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "hi!";
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean13 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str5 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
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
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
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
        boolean boolean14 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter15;
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter12;
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
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.path = "";
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport0.innerFilter = query11;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterFound;
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
        org.junit.Assert.assertNull(bitDocIdSetFilter4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
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
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str14 = nestedInnerQueryParseSupport0.path;
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
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.queryFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter8;
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query10);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper3;
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.filterParsed = false;
        boolean boolean14 = nestedInnerQueryParseSupport0.queryFound();
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
        org.junit.Assert.assertNull(queryParseContext11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper11;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport0.source = bytesReference7;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext12;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper3;
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterParsed = false;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.queryFound = true;
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
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
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
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport0.innerQuery = query14;
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = null;
        nestedInnerQueryParseSupport0.source = bytesReference3;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        java.lang.String str4 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
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
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
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
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = null;
        nestedInnerQueryParseSupport0.source = bytesReference13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext13);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.filterFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        nestedInnerQueryParseSupport0.queryFound = true;
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
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext7;
        nestedInnerQueryParseSupport0.filterFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        boolean boolean13 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper15;
        org.elasticsearch.index.query.QueryShardContext queryShardContext17 = nestedInnerQueryParseSupport0.shardContext;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext17);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.getInnerFilter();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.getInnerFilter();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean13 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport0.innerFilter = query14;
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
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext9;
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport0.innerFilter = query11;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext15 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        org.elasticsearch.index.query.QueryShardContext queryShardContext14 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query13);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.query.QueryShardContext queryShardContext18 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext18);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter8;
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerFilter = query10;
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
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
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
        org.elasticsearch.index.query.QueryShardContext queryShardContext11 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext11;
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = null;
        nestedInnerQueryParseSupport0.source = bytesReference14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext13);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query10);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.query.QueryShardContext queryShardContext3 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext3);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound();
        nestedInnerQueryParseSupport0.queryFound = true;
        nestedInnerQueryParseSupport0.filterParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.childFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
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
        java.lang.String str18 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.query.QueryParseContext queryParseContext19 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.Query query20 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query20);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = nestedInnerQueryParseSupport0.shardContext;
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
        org.junit.Assert.assertNull(queryShardContext6);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        nestedInnerQueryParseSupport0.queryParsed = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport0.source = bytesReference9;
        org.elasticsearch.index.query.QueryShardContext queryShardContext11 = nestedInnerQueryParseSupport0.shardContext;
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
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext11);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerFilter;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference6);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
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
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean12 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport0.source = bytesReference7;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        nestedInnerQueryParseSupport0.path = "hi!";
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
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.innerFilter;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.innerFilter;
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext12);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.filterParsed = true;
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper6;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        org.elasticsearch.index.query.QueryShardContext queryShardContext13 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = true;
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
        org.junit.Assert.assertNull(queryShardContext13);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerFilter = query9;
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
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerFilter = query6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.queryParsed = false;
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
        org.junit.Assert.assertNull(queryParseContext12);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport0.filterParsed;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
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
        boolean boolean13 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper17;
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query16);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        nestedInnerQueryParseSupport0.path = "";
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.path = "hi!";
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
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
        boolean boolean13 = nestedInnerQueryParseSupport0.filterFound;
        java.lang.String str14 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport0.innerFilter = query15;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
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
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter13;
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
        org.junit.Assert.assertNull(queryShardContext10);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        boolean boolean13 = nestedInnerQueryParseSupport0.filterFound;
        java.lang.String str14 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter15;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport0.source = bytesReference8;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.nestedObjectMapper;
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
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext6;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query8);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.queryFound = false;
        nestedInnerQueryParseSupport0.filterFound = true;
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
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
        org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport0.innerQuery;
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
        org.junit.Assert.assertNull(query17);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.path = "hi!";
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
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
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper3;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = null;
        nestedInnerQueryParseSupport0.source = bytesReference7;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport0.parentFilter;
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext11;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = nestedInnerQueryParseSupport0.source;
        java.lang.String str14 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryShardContext queryShardContext16 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext16);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        boolean boolean13 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport0.innerFilter = query11;
        boolean boolean13 = nestedInnerQueryParseSupport0.filterFound();
        boolean boolean14 = nestedInnerQueryParseSupport0.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter13;
        boolean boolean15 = nestedInnerQueryParseSupport0.queryFound;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
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
        java.lang.Class<?> wildcardClass11 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext10;
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
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
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
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext12;
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = null;
        nestedInnerQueryParseSupport0.source = bytesReference14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper11;
        boolean boolean13 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.query.QueryShardContext queryShardContext9 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext9;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport0.source = bytesReference11;
        java.lang.String str13 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
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
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.innerQuery;
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
        org.junit.Assert.assertNull(queryParseContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query13);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = nestedInnerQueryParseSupport0.source;
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
        org.junit.Assert.assertNull(bitDocIdSetFilter16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference17);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper3;
        nestedInnerQueryParseSupport0.queryFound = true;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound();
        nestedInnerQueryParseSupport0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.getInnerFilter();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query4);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
        boolean boolean12 = nestedInnerQueryParseSupport0.queryFound;
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        nestedInnerQueryParseSupport0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.filterFound = true;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "";
        boolean boolean11 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext12;
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query18 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport0.source = bytesReference8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerFilter = query9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
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
            nestedInnerQueryParseSupport0.setPathLevel();
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
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        nestedInnerQueryParseSupport0.queryParsed = true;
        boolean boolean14 = nestedInnerQueryParseSupport0.filterParsed;
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterFound = false;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }
}

