import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        boolean boolean12 = nestedInnerQueryParseSupport0.filterFound;
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        boolean boolean14 = nestedInnerQueryParseSupport0.filterParsed;
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
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext6;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query8);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper12;
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
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerQuery = query6;
        nestedInnerQueryParseSupport0.queryFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerFilter = query7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        nestedInnerQueryParseSupport0.queryFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference13);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.getInnerFilter();
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
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        nestedInnerQueryParseSupport0.queryParsed = true;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.innerQuery;
        nestedInnerQueryParseSupport0.filterParsed = false;
        java.lang.String str15 = nestedInnerQueryParseSupport0.path;
        boolean boolean16 = nestedInnerQueryParseSupport0.filterFound();
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
        org.junit.Assert.assertNull(query12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.innerQuery;
        nestedInnerQueryParseSupport0.queryParsed = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = null;
        nestedInnerQueryParseSupport0.source = bytesReference3;
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        nestedInnerQueryParseSupport0.queryFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport0.source = bytesReference11;
        nestedInnerQueryParseSupport0.filterFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerQuery;
        nestedInnerQueryParseSupport0.path = "hi!";
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference10);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.queryParsed = true;
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.getInnerQuery();
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerQuery = query12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerQuery = query5;
        nestedInnerQueryParseSupport0.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport0.parentFilter;
        java.lang.String str10 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean11 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport0.parentFilter;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.getInnerFilter();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.getInnerFilter();
        nestedInnerQueryParseSupport0.filterParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query5);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryParseContext queryParseContext6 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.queryParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext6);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        boolean boolean15 = nestedInnerQueryParseSupport0.filterFound;
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
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        org.elasticsearch.index.query.QueryShardContext queryShardContext14 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext14);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = true;
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        boolean boolean13 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean14 = nestedInnerQueryParseSupport0.filterFound();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.parentFilter;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        boolean boolean12 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = nestedInnerQueryParseSupport0.parseContext;
        boolean boolean14 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = null;
        nestedInnerQueryParseSupport0.source = bytesReference3;
        nestedInnerQueryParseSupport0.filterFound = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport0.source;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.childFilter;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.filter();
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
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
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
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.queryFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        nestedInnerQueryParseSupport0.queryParsed = true;
        boolean boolean18 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerQuery = query12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        org.junit.Assert.assertNull(queryShardContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound;
        nestedInnerQueryParseSupport0.queryFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter16);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        nestedInnerQueryParseSupport0.queryParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        nestedInnerQueryParseSupport0.path = "";
        nestedInnerQueryParseSupport0.filterParsed = true;
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
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        nestedInnerQueryParseSupport0.filterParsed = true;
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
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerQuery = query6;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        boolean boolean15 = nestedInnerQueryParseSupport0.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport0.getInnerFilter();
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
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        nestedInnerQueryParseSupport0.queryParsed = true;
        org.apache.lucene.search.Query query15 = null;
        nestedInnerQueryParseSupport0.innerFilter = query15;
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
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str5 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerQuery = query5;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.getInnerFilter();
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
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.innerFilter;
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
        org.junit.Assert.assertNull(query13);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        java.lang.Class<?> wildcardClass13 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport0.source = bytesReference10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference8);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean7 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference8);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport0.source = bytesReference11;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport0.getInnerFilter();
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
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.parentFilter;
        nestedInnerQueryParseSupport0.queryParsed = false;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        nestedInnerQueryParseSupport0.path = "";
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
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerQuery;
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
        org.junit.Assert.assertNull(query6);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
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
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str5 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.parentObjectMapper;
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
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.parentObjectMapper;
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
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        nestedInnerQueryParseSupport0.filterParsed = false;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter13;
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
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.parentFilter;
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
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        java.lang.String str11 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        boolean boolean10 = nestedInnerQueryParseSupport0.queryParsed;
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        nestedInnerQueryParseSupport0.path = "";
        boolean boolean6 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerQuery = query9;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        nestedInnerQueryParseSupport0.queryParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        nestedInnerQueryParseSupport0.queryParsed = true;
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
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        java.lang.String str15 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference6);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        nestedInnerQueryParseSupport0.filterParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        java.lang.String str13 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport0.parentFilter;
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
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper13;
        org.elasticsearch.index.query.QueryParseContext queryParseContext15 = nestedInnerQueryParseSupport0.parseContext;
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
        org.junit.Assert.assertNull(queryParseContext15);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        org.elasticsearch.index.query.QueryShardContext queryShardContext9 = nestedInnerQueryParseSupport0.shardContext;
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
        org.junit.Assert.assertNull(queryShardContext9);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        nestedInnerQueryParseSupport0.queryParsed = true;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.innerQuery;
        java.lang.String str13 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport0.source = bytesReference8;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext12;
        boolean boolean14 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter11;
        java.lang.Class<?> wildcardClass13 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerQuery = query6;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        nestedInnerQueryParseSupport0.queryFound = false;
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
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        nestedInnerQueryParseSupport0.filterParsed = false;
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
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
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
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        nestedInnerQueryParseSupport0.filterParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext5;
        java.lang.Class<?> wildcardClass7 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        nestedInnerQueryParseSupport0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        nestedInnerQueryParseSupport0.queryParsed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query20 = nestedInnerQueryParseSupport0.getInnerQuery();
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
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.queryFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        boolean boolean12 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext12;
        org.apache.lucene.search.Query query14 = null;
        nestedInnerQueryParseSupport0.innerFilter = query14;
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext9 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext9;
        java.lang.String str11 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query3 = null;
        nestedInnerQueryParseSupport0.innerQuery = query3;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        nestedInnerQueryParseSupport0.filterFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        nestedInnerQueryParseSupport0.filterFound = false;
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
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
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
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference16);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        org.elasticsearch.index.query.QueryShardContext queryShardContext9 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext9;
        java.lang.Class<?> wildcardClass11 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
            nestedInnerQueryParseSupport0.query();
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
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.parentObjectMapper;
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
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport0.parseContext;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.query.QueryParseContext queryParseContext3 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext3);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
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
        nestedInnerQueryParseSupport0.queryParsed = true;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport0.getInnerQuery();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
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
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        boolean boolean12 = nestedInnerQueryParseSupport0.queryFound();
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
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport0.innerQuery = query13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerQuery = query12;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = null;
        nestedInnerQueryParseSupport0.source = bytesReference16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerFilter = query7;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext5;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        org.elasticsearch.index.query.QueryParseContext queryParseContext16 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext16;
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
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        boolean boolean12 = nestedInnerQueryParseSupport0.filterFound();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport0.source = bytesReference12;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper14;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
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
        java.lang.String str17 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound;
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        java.lang.String str16 = nestedInnerQueryParseSupport0.getPath();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerFilter = query6;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper10;
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
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter2;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerQuery = query4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference6);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        java.lang.String str11 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext11 = nestedInnerQueryParseSupport0.shardContext;
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
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext11);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterFound = false;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport0.innerQuery = query13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        nestedInnerQueryParseSupport0.queryFound = true;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext14;
        java.lang.Class<?> wildcardClass16 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper12;
        nestedInnerQueryParseSupport0.filterFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.queryFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper12;
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
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.getInnerQuery();
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
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        nestedInnerQueryParseSupport0.filterFound = true;
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
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerFilter = query6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext15);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext4;
        nestedInnerQueryParseSupport0.queryFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        boolean boolean10 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference12);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        nestedInnerQueryParseSupport0.queryParsed = true;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean12 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        java.lang.String str8 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerQuery = query6;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = nestedInnerQueryParseSupport0.shardContext;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext8);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.innerQuery;
        nestedInnerQueryParseSupport0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext4);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        nestedInnerQueryParseSupport0.path = "";
        java.lang.Class<?> wildcardClass13 = nestedInnerQueryParseSupport0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper11;
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
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        boolean boolean14 = nestedInnerQueryParseSupport0.filterParsed;
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
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound;
        nestedInnerQueryParseSupport0.filterParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.path = "";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.queryFound = false;
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
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport0.parentObjectMapper;
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
        org.junit.Assert.assertNull(objectMapper16);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
        nestedInnerQueryParseSupport0.queryFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryParsed;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        nestedInnerQueryParseSupport0.filterFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        nestedInnerQueryParseSupport0.queryFound = true;
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
        org.junit.Assert.assertNull(bytesReference3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext4);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.filterParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        nestedInnerQueryParseSupport0.queryFound = false;
        nestedInnerQueryParseSupport0.queryParsed = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport0.source = bytesReference12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        nestedInnerQueryParseSupport0.queryFound = true;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.path = "";
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport0.source = bytesReference10;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.path = "";
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
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
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        nestedInnerQueryParseSupport0.queryFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext11);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport0.source = bytesReference9;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext13);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter12;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper14;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        nestedInnerQueryParseSupport0.filterParsed = true;
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
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerQuery = query6;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerFilter = query9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound();
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext9);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
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
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        java.lang.String str17 = nestedInnerQueryParseSupport0.path;
        java.lang.String str18 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter2;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter6;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        org.elasticsearch.index.query.QueryShardContext queryShardContext11 = nestedInnerQueryParseSupport0.shardContext;
        boolean boolean12 = nestedInnerQueryParseSupport0.queryParsed;
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport0.innerQuery = query13;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport0.innerQuery = query13;
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
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean7 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper12;
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
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference4);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext12;
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
        org.junit.Assert.assertNull(query10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext11);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter12);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext8);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        org.apache.lucene.search.Query query16 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter17 = nestedInnerQueryParseSupport0.childFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter17);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        java.lang.String str5 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext7;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper9;
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        org.elasticsearch.index.query.QueryShardContext queryShardContext11 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext11);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        org.elasticsearch.index.query.QueryParseContext queryParseContext12 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.query.QueryParseContext queryParseContext3 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext3);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        boolean boolean12 = nestedInnerQueryParseSupport0.queryFound;
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        java.lang.String str14 = nestedInnerQueryParseSupport0.getPath();
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
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerFilter = query12;
        boolean boolean14 = nestedInnerQueryParseSupport0.queryParsed;
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        java.lang.String str6 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.filterParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference6);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        org.elasticsearch.index.query.QueryShardContext queryShardContext13 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext13;
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
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        nestedInnerQueryParseSupport0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        org.apache.lucene.search.Query query3 = null;
        nestedInnerQueryParseSupport0.innerQuery = query3;
        org.elasticsearch.index.query.QueryParseContext queryParseContext5 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean11 = nestedInnerQueryParseSupport0.filterFound();
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
        org.junit.Assert.assertNull(query10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport0.innerFilter;
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
        org.junit.Assert.assertNull(objectMapper14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query15);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport0.source;
        java.lang.String str9 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerFilter = query6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport0.source = bytesReference9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerQuery = query6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        org.elasticsearch.index.query.QueryParseContext queryParseContext11 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext11;
        nestedInnerQueryParseSupport0.queryParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext14);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.filterFound = true;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("hi!");
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
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper4;
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
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.query();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper4;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference7 = nestedInnerQueryParseSupport0.source;
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerFilter = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
            org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport0.getInnerQuery();
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
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        nestedInnerQueryParseSupport0.filterFound = true;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound;
        nestedInnerQueryParseSupport0.queryParsed = true;
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
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper15;
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
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerQuery = query6;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper11;
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
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        org.elasticsearch.index.query.QueryShardContext queryShardContext11 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterParsed = true;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext11);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        nestedInnerQueryParseSupport0.path = "hi!";
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper15;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference14);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        java.lang.String str11 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.getInnerFilter();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext6);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterFound = true;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport0.source = bytesReference12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.getInnerFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        nestedInnerQueryParseSupport0.filterFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query4);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper7;
        org.elasticsearch.index.query.QueryShardContext queryShardContext9 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.queryFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query8 = null;
        nestedInnerQueryParseSupport0.innerQuery = query8;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = nestedInnerQueryParseSupport0.source;
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
        org.junit.Assert.assertNull(bytesReference12);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        org.apache.lucene.search.Query query16 = null;
        nestedInnerQueryParseSupport0.innerQuery = query16;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper18 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        boolean boolean19 = nestedInnerQueryParseSupport0.queryParsed;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
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
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
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
        boolean boolean14 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport0.parentObjectMapper;
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper16 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper17 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = nestedInnerQueryParseSupport0.source;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference18);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
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
        java.lang.String str12 = nestedInnerQueryParseSupport0.path;
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
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport0.source;
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter15);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
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
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext17 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext17;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        org.elasticsearch.index.query.QueryParseContext queryParseContext16 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext16;
        boolean boolean18 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper19 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper19);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext12;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport0.nestedObjectMapper;
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        nestedInnerQueryParseSupport0.filterFound = false;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
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
        org.junit.Assert.assertNull(queryParseContext10);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
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
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean12 = nestedInnerQueryParseSupport0.filterParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext9 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext9;
        java.lang.String str11 = nestedInnerQueryParseSupport0.getPath();
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
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        nestedInnerQueryParseSupport0.filterParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = nestedInnerQueryParseSupport0.source;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.getInnerFilter();
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
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
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
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.parentObjectMapper;
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
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.parentFilter;
        java.lang.String str11 = nestedInnerQueryParseSupport0.path;
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = null;
        nestedInnerQueryParseSupport0.source = bytesReference12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.getInnerFilter();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerQuery = query6;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = null;
        nestedInnerQueryParseSupport0.source = bytesReference10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerQuery = query6;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.query.QueryShardContext queryShardContext9 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        boolean boolean18 = nestedInnerQueryParseSupport0.queryFound;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str5 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("hi!");
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
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.getInnerFilter();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.getInnerFilter();
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.childFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper10 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter11;
        boolean boolean13 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query15 = nestedInnerQueryParseSupport0.getInnerFilter();
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
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
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
        org.apache.lucene.search.Query query13 = null;
        nestedInnerQueryParseSupport0.innerFilter = query13;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.path = "hi!";
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        org.apache.lucene.search.Query query11 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerQuery = query12;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter16;
        nestedInnerQueryParseSupport0.queryParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.filterParsed = true;
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter13 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter13;
        boolean boolean15 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query16 = null;
        nestedInnerQueryParseSupport0.innerQuery = query16;
        boolean boolean18 = nestedInnerQueryParseSupport0.filterFound;
        org.apache.lucene.search.Query query19 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper20 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper20;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query19);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        nestedInnerQueryParseSupport0.path = "";
        nestedInnerQueryParseSupport0.filterFound = false;
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
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = null;
        nestedInnerQueryParseSupport0.source = bytesReference3;
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext7;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper9 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext5 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext8;
        nestedInnerQueryParseSupport0.queryFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        boolean boolean13 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper6;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper13;
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        nestedInnerQueryParseSupport0.queryParsed = true;
        java.lang.String str8 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter12;
        org.elasticsearch.index.query.QueryParseContext queryParseContext14 = nestedInnerQueryParseSupport0.parseContext;
        nestedInnerQueryParseSupport0.queryParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext14);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        org.apache.lucene.search.Query query8 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query8);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper15;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport0.getInnerQuery();
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
        org.junit.Assert.assertNull(objectMapper11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query12);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper12;
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
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound();
        nestedInnerQueryParseSupport0.filterFound = true;
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext7;
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        org.elasticsearch.index.query.QueryShardContext queryShardContext10 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper11;
        nestedInnerQueryParseSupport0.queryParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.childFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper7;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.queryFound = false;
        java.lang.String str9 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter4;
        org.apache.lucene.search.Query query6 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterParsed;
        java.lang.Class<?> wildcardClass8 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        nestedInnerQueryParseSupport0.path = "hi!";
        java.lang.String str17 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.getInnerFilter();
        org.apache.lucene.search.Query query5 = nestedInnerQueryParseSupport0.innerQuery;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport0.getParentObjectMapper();
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
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        org.apache.lucene.search.Query query11 = null;
        nestedInnerQueryParseSupport0.innerFilter = query11;
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
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
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
            org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.getInnerFilter();
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
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
        nestedInnerQueryParseSupport0.path = "hi!";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        org.elasticsearch.index.query.QueryShardContext queryShardContext9 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.path = "";
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper12 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext9);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        java.lang.String str14 = nestedInnerQueryParseSupport0.path;
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
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        nestedInnerQueryParseSupport0.filterFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper5;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str5 = nestedInnerQueryParseSupport0.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter2 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.nestedObjectMapper;
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
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        org.apache.lucene.search.Query query17 = null;
        nestedInnerQueryParseSupport0.innerQuery = query17;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.setPath("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
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
        org.elasticsearch.index.query.QueryShardContext queryShardContext11 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerFilter = query12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext11);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.parentFilter;
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
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext4;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport0.source = bytesReference8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter14;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter13);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.query.QueryParseContext queryParseContext3 = nestedInnerQueryParseSupport0.parseContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper4;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext3);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper13;
        nestedInnerQueryParseSupport0.filterParsed = true;
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
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = nestedInnerQueryParseSupport0.source;
        boolean boolean15 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport0.getParentObjectMapper();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str5 = nestedInnerQueryParseSupport0.getPath();
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
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
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        nestedInnerQueryParseSupport0.path = "hi!";
        org.apache.lucene.search.Query query16 = null;
        nestedInnerQueryParseSupport0.innerFilter = query16;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter7);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
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
        org.junit.Assert.assertNull(bitDocIdSetFilter4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
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
        boolean boolean11 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean12 = nestedInnerQueryParseSupport0.queryFound;
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext7 = nestedInnerQueryParseSupport0.parseContext;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter9 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter9;
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
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query2 = null;
        nestedInnerQueryParseSupport0.innerQuery = query2;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext4;
        org.elasticsearch.index.query.QueryShardContext queryShardContext6 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext8);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.query.QueryParseContext queryParseContext2 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext2;
        boolean boolean4 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext7);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper13;
        boolean boolean15 = nestedInnerQueryParseSupport0.queryFound();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = nestedInnerQueryParseSupport0.childFilter;
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
        org.junit.Assert.assertNull(objectMapper9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query17);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
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
        java.lang.String str14 = nestedInnerQueryParseSupport0.path;
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
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        org.elasticsearch.index.query.QueryParseContext queryParseContext10 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext10;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext7);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query10);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = nestedInnerQueryParseSupport0.source;
        nestedInnerQueryParseSupport0.path = "";
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
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport0.innerQuery;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext8);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.query.QueryParseContext queryParseContext3 = nestedInnerQueryParseSupport0.parseContext;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        org.elasticsearch.common.bytes.BytesReference bytesReference6 = null;
        nestedInnerQueryParseSupport0.source = bytesReference6;
        nestedInnerQueryParseSupport0.path = "";
        boolean boolean10 = nestedInnerQueryParseSupport0.filterFound();
        java.lang.String str11 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
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
        boolean boolean11 = nestedInnerQueryParseSupport0.filterParsed;
        nestedInnerQueryParseSupport0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = nestedInnerQueryParseSupport0.childFilter;
        nestedInnerQueryParseSupport0.queryFound = true;
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
        org.junit.Assert.assertNull(bitDocIdSetFilter16);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
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
        org.junit.Assert.assertNull(objectMapper4);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        java.lang.String str10 = nestedInnerQueryParseSupport0.path;
        nestedInnerQueryParseSupport0.filterFound = true;
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
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper6 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper6;
        boolean boolean8 = nestedInnerQueryParseSupport0.filterFound();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        org.apache.lucene.search.Query query17 = nestedInnerQueryParseSupport0.innerFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query17);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.query.QueryParseContext queryParseContext9 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext9;
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean2 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference3 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.query.QueryShardContext queryShardContext4 = nestedInnerQueryParseSupport0.shardContext;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerQuery = query6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        org.elasticsearch.index.query.QueryShardContext queryShardContext14 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext14;
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
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean7 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport0.parseContext;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterParsed;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
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
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter18 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query19 = nestedInnerQueryParseSupport0.innerQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = null;
        nestedInnerQueryParseSupport0.source = bytesReference20;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query19);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        boolean boolean12 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryParseContext queryParseContext13 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext13;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter15 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter15);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        java.lang.Class<?> wildcardClass13 = nestedInnerQueryParseSupport0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound;
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
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
        boolean boolean12 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean13 = nestedInnerQueryParseSupport0.filterParsed;
        java.lang.Class<?> wildcardClass14 = nestedInnerQueryParseSupport0.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter3 = nestedInnerQueryParseSupport0.childFilter;
        org.apache.lucene.search.Query query4 = null;
        nestedInnerQueryParseSupport0.innerFilter = query4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        nestedInnerQueryParseSupport0.queryFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = null;
        nestedInnerQueryParseSupport0.source = bytesReference5;
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = nestedInnerQueryParseSupport0.source;
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter11 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter11);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = null;
        nestedInnerQueryParseSupport0.source = bytesReference8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
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
        org.elasticsearch.index.query.QueryShardContext queryShardContext13 = nestedInnerQueryParseSupport0.shardContext;
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
        org.junit.Assert.assertNull(queryShardContext13);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        org.elasticsearch.index.query.QueryShardContext queryShardContext9 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext9;
        nestedInnerQueryParseSupport0.queryFound = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter12;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        nestedInnerQueryParseSupport0.queryFound = false;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = nestedInnerQueryParseSupport0.source;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = null;
        nestedInnerQueryParseSupport0.parentObjectMapper = objectMapper5;
        nestedInnerQueryParseSupport0.filterFound = false;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext2 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext2;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter4 = nestedInnerQueryParseSupport0.parentFilter;
        boolean boolean5 = nestedInnerQueryParseSupport0.filterParsed;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        org.apache.lucene.search.Query query12 = null;
        nestedInnerQueryParseSupport0.innerQuery = query12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.filterFound();
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterFound = false;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
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
        org.junit.Assert.assertNull(query7);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.apache.lucene.search.Query query4 = nestedInnerQueryParseSupport0.getInnerFilter();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter7 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter7;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.query.QueryShardContext queryShardContext11 = nestedInnerQueryParseSupport0.shardContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext11);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerFilter = query10;
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query13 = nestedInnerQueryParseSupport0.getInnerQuery();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.apache.lucene.search.Query query3 = nestedInnerQueryParseSupport0.innerQuery;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str5 = nestedInnerQueryParseSupport0.getPath();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
        org.apache.lucene.search.Query query7 = null;
        nestedInnerQueryParseSupport0.innerQuery = query7;
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = null;
        nestedInnerQueryParseSupport0.source = bytesReference9;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter12 = null;
        nestedInnerQueryParseSupport0.childFilter = bitDocIdSetFilter12;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        boolean boolean13 = nestedInnerQueryParseSupport0.queryParsed;
        boolean boolean14 = nestedInnerQueryParseSupport0.queryFound;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query10 = nestedInnerQueryParseSupport0.getInnerQuery();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        java.lang.String str12 = nestedInnerQueryParseSupport0.path;
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
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.apache.lucene.search.Query query5 = null;
        nestedInnerQueryParseSupport0.innerFilter = query5;
        boolean boolean7 = nestedInnerQueryParseSupport0.filterFound;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        boolean boolean3 = nestedInnerQueryParseSupport0.filterParsed;
        boolean boolean4 = nestedInnerQueryParseSupport0.queryParsed;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper5 = nestedInnerQueryParseSupport0.parentObjectMapper;
        org.apache.lucene.search.Query query6 = null;
        nestedInnerQueryParseSupport0.innerQuery = query6;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper5);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        nestedInnerQueryParseSupport0.queryParsed = true;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        java.lang.String str15 = nestedInnerQueryParseSupport0.getPath();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
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
        nestedInnerQueryParseSupport0.path = "";
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
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        java.lang.String str7 = nestedInnerQueryParseSupport0.path;
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
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        boolean boolean1 = nestedInnerQueryParseSupport0.queryParsed;
        nestedInnerQueryParseSupport0.filterParsed = true;
        org.elasticsearch.index.query.QueryParseContext queryParseContext4 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext4;
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = null;
        nestedInnerQueryParseSupport0.shardContext = queryShardContext8;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
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
        nestedInnerQueryParseSupport0.queryParsed = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper10);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        org.apache.lucene.search.Query query10 = null;
        nestedInnerQueryParseSupport0.innerFilter = query10;
        org.elasticsearch.index.query.QueryShardContext queryShardContext12 = nestedInnerQueryParseSupport0.shardContext;
        nestedInnerQueryParseSupport0.queryFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper15 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper15);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        org.elasticsearch.index.query.QueryParseContext queryParseContext16 = nestedInnerQueryParseSupport0.parseContext;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext16);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        boolean boolean3 = nestedInnerQueryParseSupport0.queryFound();
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = null;
        nestedInnerQueryParseSupport0.source = bytesReference4;
        boolean boolean6 = nestedInnerQueryParseSupport0.queryFound();
        java.lang.String str7 = nestedInnerQueryParseSupport0.getPath();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        org.apache.lucene.search.Query query9 = nestedInnerQueryParseSupport0.innerFilter;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter10 = nestedInnerQueryParseSupport0.childFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter10);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        org.junit.Assert.assertNull(str12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
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
        nestedInnerQueryParseSupport0.queryParsed = true;
        boolean boolean18 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.Query query19 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query19);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
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
        org.apache.lucene.search.Query query12 = nestedInnerQueryParseSupport0.innerQuery;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query12);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
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
        boolean boolean10 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean11 = nestedInnerQueryParseSupport0.queryParsed;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter16 = nestedInnerQueryParseSupport0.childFilter;
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
        org.junit.Assert.assertNull(bitDocIdSetFilter16);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = null;
        nestedInnerQueryParseSupport0.nestedObjectMapper = objectMapper3;
        org.elasticsearch.common.bytes.BytesReference bytesReference5 = nestedInnerQueryParseSupport0.source;
        java.lang.String str6 = nestedInnerQueryParseSupport0.path;
        org.apache.lucene.search.Query query7 = nestedInnerQueryParseSupport0.innerFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext8 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.Query query9 = null;
        nestedInnerQueryParseSupport0.innerFilter = query9;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper11 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper11);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
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
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = null;
        nestedInnerQueryParseSupport0.source = bytesReference11;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bytesReference10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter1 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter1;
        nestedInnerQueryParseSupport0.queryFound = true;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter5 = null;
        nestedInnerQueryParseSupport0.parentFilter = bitDocIdSetFilter5;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.parentObjectMapper;
        boolean boolean8 = nestedInnerQueryParseSupport0.queryFound;
        nestedInnerQueryParseSupport0.path = "hi!";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper14 = nestedInnerQueryParseSupport0.parentObjectMapper;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper14);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
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
        nestedInnerQueryParseSupport0.queryFound = false;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext9);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        java.lang.String str3 = nestedInnerQueryParseSupport0.path;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper4 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        nestedInnerQueryParseSupport0.queryFound = false;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.elasticsearch.index.query.QueryParseContext queryParseContext8 = nestedInnerQueryParseSupport0.parseContext;
        // The following exception was thrown during execution in test generation
        try {
            nestedInnerQueryParseSupport0.resetPathLevel();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryParseContext8);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper13 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter14 = nestedInnerQueryParseSupport0.parentFilter;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter14);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.parentObjectMapper;
        nestedInnerQueryParseSupport0.queryParsed = false;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.childFilter;
        org.elasticsearch.index.query.QueryShardContext queryShardContext7 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter8 = nestedInnerQueryParseSupport0.childFilter;
        boolean boolean9 = nestedInnerQueryParseSupport0.queryFound();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(objectMapper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(queryShardContext7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(bitDocIdSetFilter8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
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
        org.elasticsearch.index.query.QueryShardContext queryShardContext13 = nestedInnerQueryParseSupport0.shardContext;
        org.apache.lucene.search.Query query14 = nestedInnerQueryParseSupport0.innerQuery;
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
        org.junit.Assert.assertNull(queryShardContext13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(query14);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        org.elasticsearch.index.query.support.NestedInnerQueryParseSupport nestedInnerQueryParseSupport0 = new org.elasticsearch.index.query.support.NestedInnerQueryParseSupport();
        org.elasticsearch.index.query.QueryParseContext queryParseContext1 = null;
        nestedInnerQueryParseSupport0.parseContext = queryParseContext1;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper3 = nestedInnerQueryParseSupport0.getParentObjectMapper();
        boolean boolean4 = nestedInnerQueryParseSupport0.queryFound();
        boolean boolean5 = nestedInnerQueryParseSupport0.queryFound;
        org.apache.lucene.search.join.BitDocIdSetFilter bitDocIdSetFilter6 = nestedInnerQueryParseSupport0.parentFilter;
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper7 = nestedInnerQueryParseSupport0.getNestedObjectMapper();
        org.elasticsearch.index.mapper.object.ObjectMapper objectMapper8 = nestedInnerQueryParseSupport0.nestedObjectMapper;
        boolean boolean9 = nestedInnerQueryParseSupport0.filterFound();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
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
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
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
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
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
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
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
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
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
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
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
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
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
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
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
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
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
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
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
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
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
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
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
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
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
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
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
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
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
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
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
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
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
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
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
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
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
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
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
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
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
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
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
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
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
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
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
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
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
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
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
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
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
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
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
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
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
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
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
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
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
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
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
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
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
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
}

